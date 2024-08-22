
// Tread 

class Print implements Runnable 
{
  public void run() 
  {
    System.out.println("Printing...");
  }
}

// use Tread 

public static void main(String[] args) 
{
  Print print = new Print();
  
  Tread myThread1 = new Tread(print);
  myThread1.start();

  Tread myThread2 = new Tread(print);
  myThread2.start();
}

.
