package hello;

/**
 * Simple World entity.
 */
public class World
{

  private final int id;
  private final int randomNumber;
  
  public World(int id, int randomNumber)
  {
    this.id = id;
    this.randomNumber = randomNumber;
  }
  
  public int getId()
  {
    return this.id;
  }
  
  public int getRandomNumber()
  {
    return this.randomNumber;
  }      
  
}
