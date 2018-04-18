package com.aircraft;

import com.aircraft.*;
import com.weather.*;

public class AircraftFactory
{
  public static Flyable newAircraft(String type, String name, int longitude, int latitude, int height)
  {
    Coordinates coordinates = new Coordinates(longitude, latitude, height);
  //  Flyable flyable = ne;
    if (type.equals("Helicopter"))
      return new Helicopter(name, coordinates);
    else if (type.equals("JetPlane"))
      return new JetPlane(name, coordinates);
    else if (type.equals("Baloon"))
      return new Baloon(name, coordinates);
    return null;
  }
}
