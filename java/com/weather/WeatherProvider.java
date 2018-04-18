package com.weather;

import com.aircraft.*;
import com.weather.*;
public class WeatherProvider
{
  private static WeatherProvider weatherProvider = new WeatherProvider();
  private static String[] weather = {"RAIN", "FOG", "SUN", "SNOW"};

  private WeatherProvider()
  {

  }

  public static WeatherProvider getProvider()
  {
    if (weatherProvider == null) {
      weatherProvider = new WeatherProvider();
    }
    return weatherProvider;
  }

  public String getCurrentWeather(Coordinates coordinates)
  {
      int rand_int = (coordinates.getLongitude() +
              coordinates.getLatitude() + coordinates.getHeight()) % 4;
/*      Random rand = new Random();
      int rand_int = 0;
      rand_ind = rand.nextInt(4);*/
      return weather[rand_int];
  }
}
