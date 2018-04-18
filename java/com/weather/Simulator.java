package com.weather;

import com.aircraft.*;
import com.weather.*;
import java.io.*;
import java.lang.*;
import java.util.*;

public class Simulator
{
  private static WeatherTower weatherTower;
  //private static List<Flyable> flyables = new ArrayList<Flyable>();
  private static List<Flyable> flyables = new ArrayList<Flyable>();

  public static void main(String[] args)
  {
    weatherTower = new WeatherTower();
    try {
      BufferedReader reader = new BufferedReader(new FileReader(args[0]));
      String line = reader.readLine();
      if (line != null) {
        int simulations = Integer.parseInt(line);
        if (simulations < 0) {
          System.out.println("Invalid simulations count " + simulations);
          System.exit(1);
        }
        while ((line = reader.readLine()) != null) {
          String[] tmp = line.split(" ");
          Flyable flyable = AircraftFactory.newAircraft(tmp[0], tmp[1],
                            Integer.parseInt(tmp[2]), Integer.parseInt(tmp[3]),
                            Integer.parseInt(tmp[4]));
          if (flyable != null)
            flyables.add(flyable);
        }

        for (Flyable flyable : flyables) {
          flyable.registerTower(weatherTower);
        }

        for (int i = 1; i <= simulations; i++) {
          weatherTower.changeWeather();
        }
      }
    } catch (FileNotFoundException e) {
      System.out.println("Couldn't find file " + args[0]);
    } catch (IOException e) {
      System.out.println("There was an error while reading the file " + args[0]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Specify simulation file");
    } catch (NullPointerException e) {
      System.out.println("value is null");
    } catch (NumberFormatException e) {
      System.out.println("not a valid number entered in file");
    } finally {
      //WriteFile.getWriteFile().close();
    }

  }
}
