
Если нужно отсортировать коллекцию, то применяйте метод Collections.sort().
  
// Collections.sort(…)
List<ObjectName> list = new ArrayList<ObjectName>();
Collections.sort(list, new Comparator<ObjectName>() {
	public int compare(ObjectName o1, ObjectName o2) {
		return o1.toString().compareTo(o2.toString());
	}
});

Если требуется отсортировать массив, используйте метод Arrays.sort().

// Arrays.sort(…)
ObjectName[] arr = new ObjectName[10];
Arrays.sort(arr, new Comparator<ObjectName>() {
	public int compare(ObjectName o1, ObjectName o2) {
		return o1.toString().compareTo(o2.toString());
	}
});

Метод sort() очень удобен, когда коллекция или массив уже заполнены значениями.

Если нужно отсортировать список (List) или множество (Set), используйте структуру TreeSet для сортировки.

// TreeSet
Set<ObjectName> sortedSet = new TreeSet<ObjectName>(new Comparator<ObjectName>() {
	public int compare(ObjectName o1, ObjectName o2) {
		return o1.toString().compareTo(o2.toString());
	}
});
sortedSet.addAll(unsortedSet);

Если вам требуется отсортировать словарь (Map), используйте структуру TreeMap для сортировки. TreeMap сортируется по ключу (key).

// TreeMap – использующий String ключи и компаратор (Comparator) CASE_INSENSITIVE_ORDER,
// упорядочивающий строки (String) методом compareToIgnoreCase
Map<String, Integer> sortedMap = new TreeMap<String, Integer>(String.CASE_INSENSITIVE_ORDER);
sortedMap.putAll(unsortedMap);


//TreeMap – общий случай, компаратор указывается вручную
Map<ObjectName, String> sortedMap = new TreeMap<ObjectName, String>(new Comparator<ObjectName>() {
	public int compare(ObjectName o1, ObjectName o2) {
		return o1.toString().compareTo(o2.toString());
	}
});
sortedMap.putAll(unsortedMap);

Вышеописанный подход очень полезен в тех случаях, если вам нужно проводить большое количество операций поиска элементов в коллекции. 
Самосортирующиеся структуры данных имеют эффективность O(log(n)), что лучше, чем O(n). Это означает, что при удвоении количества данных 
в коллекции время поиска не удваивается, а увеличивается на постоянную величину (прим. перев.)

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//добавляем возможность сравнивать об'єкты User
public class User  implements Comparable <User> {

    private String name;
    private Integer age;
    private String email;

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    @Override
    //реализуем метод compareTo интерфейса Comparable
    public int compareTo(User o) {

    	//используем метод compareTo из класса String для сравнения имен
        int result = this.name.compareTo(o.name);

	//если имена одинаковые -  сравниваем возраст,
	//используя метод compareTo из класса Integer

        if (result == 0) {
            result = this.age.compareTo(o.age);
        }
        return result;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
     }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
