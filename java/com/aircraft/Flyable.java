package com.aircraft;

import  com.aircraft.*;
import  com.weather.*;

public interface Flyable
{
  public void updateConditions();
  public void registerTower(WeatherTower WeatherTower);
}
