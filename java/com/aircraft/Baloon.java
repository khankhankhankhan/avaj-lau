package com.aircraft;

import com.aircraft.*;
import com.weather.*;

public class Baloon extends Aircraft implements Flyable
{
  private WeatherTower weatherTower = null;

  Baloon(String name, Coordinates coordinates)
  {
    super(name, coordinates);
  }
  public void updateConditions()
  {
    String sw = weatherTower.getWeather(coordinates);
    int longitude = coordinates.getLongitude();
    int latitude = coordinates.getLatitude();
    int height = coordinates.getHeight();
    if (sw.equals("SUN"))
    {
      longitude += 2;
      height += 4;
      if (height > 100)
        height = 100;
      coordinates = new Coordinates(longitude, latitude, height);
      System.out.println("Baloon#" + this.name + "(" + this.id + "): AHH ITS A BEAUTIFUL DAY!");
    }
    else if (sw.equals("RAIN"))
    {
      height -= 5;
      coordinates = new Coordinates(longitude, latitude, height);
      System.out.println("Baloon#" + this.name + "(" + this.id + "): TURN ON THE WINDSHIELD WIPERS!");
    }
    else if (sw.equals("FOG"))
    {
      height -= 3;
      coordinates = new Coordinates(longitude, latitude, height);
      System.out.println("Baloon#" + this.name + "(" + this.id + "): ITS GETTING FOGGY IM SCARED!");
    }
    else if (sw.equals("SNOW"))
    {
      height -= 15;
      System.out.println("Baloon#" + this.name + "(" + this.id + "): THE WEATHERTOWER ISN'T RESPONDING!");
      coordinates = new Coordinates(longitude, latitude, height);
    }
    if (height <= 0);
    {
      weatherTower.unregister(this);
      System.out.println("Baloon#" + this.name + "(" + this.id + ") landing.");
      return;
    }

  }
  public void registerTower(WeatherTower weatherTower)
  {
    this.weatherTower = weatherTower;
    System.out.println("Tower says: Baloon#" + this.name + "(" + this.id + ")" + " registered to weather tower.");
    this.weatherTower.register(this);
  }
}
