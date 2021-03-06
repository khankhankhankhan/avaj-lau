public class Aircraft
{
  protected long id;
  protected String name;
  protected Coordinates coordinates = null;
  private long idCounter = 0L;

  Aircraft (String name, Coordinates coordinates)
  {
    this.name = name;
    this.coordinates = coordinates;
    this.id = this.nextId();
  }

  private long nextId()
  {
      idCounter++;
      return idCounter;
  }
}
