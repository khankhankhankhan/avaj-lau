public class Tower
{
  private List<Flyable> observers = new arrayList<Flyable>();

  public void register(Flyable flyable)
  {
      if (observers.content(flyable))
        return ;
      observers.add(flyable);
  }

  public void unregister(Flyable flyable)
  {
      if (observers.content(flyable))
        observers.remove(flyable);
  }

  protected void conditionsChanged()
  {
    for(Flyable flyable : observers)
    {
      flayable.updateConditions();
    }
  }

}
