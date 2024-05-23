/**
 * Author: Alexander Kuziv 
 * Date: 23.05.2024
 * Description: Example of Input-Ooutput :-)
 **/

class IOMyRealization {
  
  // 
  public static void main(String[] args) throws Exception 
  {
    FilaInputStream inputStream = new FileInputStream("C://data.txt");
    long sum = 0;

    while (inputStream.available() > 0) { 
      int data = inputStream.read();
      sum += data;
    }
    inputStream.close();

    System.out.println(sum);
  }

  //
  public static void main2(String[] args) throws Exception 
  {
    FileInputStream inputStream = new FileInputStream("C://data.txt");
    FileOutputStream outputStream = new FileOutputStream("C://result.txt");

    while (inputStream.available() > 0) {
      long data = inputStream.read();
      outputStream.write(data);
    }

    inputStream.close();
    outputStream.close();
  } 
}

