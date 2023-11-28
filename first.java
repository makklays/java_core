//import javax.
  
/**
 * Woodoo на Анастасии 
 **/
public class Woodoo()
{
  // 
}


public class Terminator()
{
  // propiedades 
  private String model;
  private int year = 2023;
  private float weight = 88.5;
  private double criptoPrice = 123.0000000123;
  private String gender;  
  
  // constructor 1
  public Terminator Terminator(String name)
  {
    this.model = name;
  }

  // constructor 2
  public Terminator Terminator(String name, int year)
  {
    this.model = name;
    this.year = year;
  }

  // los metodos

  public void getInfo()
  {
    System.out.print('Tu ves el Terminator, su model es ' + model + '. Su año es ' + year + '. ');
    if (!empty(gender) && gender == 'man') {
      System.out.print('Tiene gender: man.');
    } else {
      System.out.print('Tiene gender: woman.');
    }
  }

  public void getModel(String name)
  {
    System.out.print('Eso es model ' + model);
  }
}
  
