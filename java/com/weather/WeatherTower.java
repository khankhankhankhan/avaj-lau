package com.weather;

import com.aircraft.*;
import com.weather.*;
public class WeatherTower extends Tower
{
  public static String getWeather(Coordinates coordinates)
  {
    return WeatherProvider.getProvider().getCurrentWeather(coordinates);
  }

  void changeWeather()
  {
    this.conditionsChanged();
  }
}
