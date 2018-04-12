public class WeatherProvider
{
  private WeatherProvider weatherProvider = new WeatherProvider();
  private String[] weather = {"RAIN", "FOG", "SUN", "SNOW"};

  private WeatherProvider()
  {

  }

  public static WeatherProvider getProvider()
  {
      return WeatherProvider.weatherProvider;
  }

  public string getCurrentWeather(Coordinates coordinates)
  {
      Random rand = new Random();
      int rand_int = 0;
      rand_ind = rand.nextInt(4);
      return weather[rand_int];
  }
}
