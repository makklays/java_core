
// class Robot 

class Robot implements Runnable 
{
  private String title;
  
  public Robot(Sting title)
  {
    this.title = title;
  }
  
  public void run() 
  {
    System.out.println("I'm robot " + this.title);
  }
}

// use Tread 

public static void main(String[] args) 
{
  Print robot1 = new Robot("Verder");
  Tread myThread1 = new Tread(robot1);
  myThread1.start();

  Print robot11 = new Robot("Wally");
  Tread myThread11 = new Tread(robot11);
  myThread11.sleep(500);
  myThread11.start();
}

.
