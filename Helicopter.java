public class Helicopter extends Aircraft implements Flyable
{
  private WeatherTower weatherTower = null;

  Helicopter(string name, Coordinates coordinates)
  {
    super(name, coordinates);
  }
  public void updateConditions()
  {
    String switch = weatherTower.getWeather(this.coordinates);
    if (switch.equals("SUN"))

  }
  public void registerTower(WeatherTower weatherTower)
  {
    this.weatherTower = weatherTower;
    this.weatherTower.register(this);
  }

}
