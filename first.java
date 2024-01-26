package 'ATB-Terminator';

import java.util.Scanner;
  
/**
 * Woodoo на Анастасии 
 **/
public class Woodoo
{
  // 
}

public class Ejemplo
{
  public void Lists() 
  {
    // List - 1,2,3, ...
    // Set - without duble
    // Map - 'one', 'two', 'three', ...

    // --- List ---
    ArrayList <Float> numbers = new ArrayList <> (1);
    LinkedList <String> names = new LinkedList <> ();
  
    ArrayList <int> numbers = new ArrayList <> ();
    numbers.addFirst(1);
    numbers.addFirst(2);
    System.out.print(numbers.size());
    
    numbers.clear();
    numbers.add(1);
    numbers.remove(0);
    numbers.addLast(5);
    System.out.print(numbers.getLast());

    // --- Set ---

    // --- Map ---
    // key and value 
    HashMap <Integer, String> passportIdAndName = new HashMap<> ();
    passportIdAndName.put(121212, "John Connor Primero");
    passportIdAndName.put(234512, "Jane Busca Travolta");
    passportIdAndName.put(425487, "Sara Connor Primera");

    // get Jane
    String janeName = passportIdAndName.get(234512);
    System.out.println(janeName);

    // all names
    passportIdAndName.remove(425487);
    System.out.println(passportIdAndName);

    // serch key or value
    System.out.println( passportIdAndName.constainsKey(425487) );
    System.out.println( passportIdAndName.constainsValue("John Connor Primero") );
  }

  public void Switcher(int x)
  {
    switch(x) {
      case '3':
        System.out.print('Tres');
        break;
      case '7':
        System.out.print('Siete');
        break;
      default:
        System.out.print('Otro');
        break;
    }
  }
  
  public void Lists_for()
  {
    int x = 10;
    while (x <= 20) {
      System.out.println(x*x);
      x++;
    }
  }
  
  public void min_in_array()
  {
    int[] x = {-2, 12, 3, 1, -3, -4, 5}
    Arrays.sort(x);
    int min = 0;
    min = x[0];
  }
  
  public void min_val()
  {
    int[] x= new int[] { -1, -3, -12, 2, 5 }
    int min = 0;
    for (int i=0; i < x.length; i++) {
      if (x[i] < min)
        min = x[i];
      i++;
    }
  }
}

public class Ejemplo2 extends Ejemplo
{
  //    
}

public class Terminator
{
  // propiedades 
  private String model;
  private int year = 2023;
  private float weight = 88.5;
  private Double criptoPrice = 123.0000000123;
  private String gender = 'man';  
  
  // constructor 1
  public Terminator Terminator(String name)
  {
    this.model = name;
  }

  // constructor 2 
  Terminator Terminator(String name, int year)
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
    if (!empty(label)) {
      System.out.print('Y tiene label: ' + label + '. ');
    }
  }

  public void getModel()
  {
    System.out.print('Eso es model ' + model);
  }

  public getCriptoPrice()
  {
    System.out.print('Este terminator cuesta ' + criptoPrice + '. ');
  }

  public void setLabel()
  {
    System.out.print('Indica un label para Terminator (string):');
    Scanner scanner_model = new Scanner(System.in);
    String val = scanner_model.nextString();
    this.label = label;
    
    System.out.print('El Terminator ' + model + ' se estableció label ' + val + '. ');
  }

  public void setCriptoPrice(Double price)
  {
    this.criptoPrice = price;
  }
}

Terminator termik_nata = Terminator('Natasha');
termik_nata.getCriptoPrice(); 
// 123.0000000123 USDT
termik_nata.setLabel(); 
// Indica un label para Terminator (string): minus
// El Terminator Natasha se estableció label minus.

Terminator termit = Terminator('Termit-T1', '2023');
termit.getInfo();
termit.getModel();
termit.setCriptoPrice(1.1);
