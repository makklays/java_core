
interface 'Collection'
 
List  - ArrayList - add(value), add(index, value), remove(index), contains(value), clear(), size() - есть индексы 
      - LinkedList 
      - Vector 
      - Stack 
Set   - HashSet   add(value), remove(value), contains(value), clear(), size() - нет индексов у Set 
      - TreeSet 
      - LinkedHashSet 
Map   - HashMap - put(ТКлюч key, ТЗначення value), get(ТКлюч key), containsKey(ТКлюч key), containsValue(ТЗначення value), remove(ТКлюч key), clear(), size(), Set<ТКлюч> keySet(), Collection<ТЗначення> values(), Set<Map.Entry<TКлюч, TЗначення>> entrySet() - есть индексы 
      - TreeMap
      - HashTable 
Queue - PriorityQueue - 
      - ArrayDequе 

//   
ArrayList o HashMap 

  add(int index, Cat element) - anadir nuevo 
  set(int index, Cat element) - insertar en index anterior 

List<User> user = new List<User>();
HashSet<Тип> ім'я = new HashSet<Тип>();
HashMap<TКлюч, TЗначення> ім'я = new HashMap<TКлюч, TЗначення>();
String[] arr = new String[3];
arr[0] = "USD";
arr[1] = "EUR";
arr[2] = "AUD";

//----------------------
// Ejemplo para Banco 
//----------------------

ArrayList<String> orders1 = new ArrayList<String>();
orders1.add("USD 10");
orders1.add("EUR 100");
orders1.add(0, "USD 100");
String myOrder = orders1.get(0);
orders1.set(0, myOrder + "!");
for (String order : orders1) {
  System.out.println(order);
}

HashSet<String> currencyCodes = new HashSet<String>(); 
currencyCodes.add("USD");
currencyCodes.add("EUR");
currencyCodes.add("AUD");
Iterator<String> it = currencyCodes.iterator();
while (it.hasNext()) {
  String curr = it.next();
  if (curr.equals("AUD")) {
    it.remove();
  }
}

HashMap<String, Integer> orders = new HashMap<String, Integer>();
orders.put("USD", 100);
orders.put("EUR", 100);
orders.put("AUD", 100);
for (String key : orders.keySet()) {
//for (String value : orders.values()) {
  Integer amount = orders.get(key); 
  System.out.println(key + " --> " + amount);
}




//
