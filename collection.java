
# Collection  

Collection collection = new ArrayList<>();
collection.add("gana");
collection.add("bata");

System.out.println( collection.size() );

Collection collection2 = new ArrayList<>();
collection2.add("termik");
collection2.add("condome");
collection2.addAll( collection );

System.out.println( collection2.contains("gana") );

collection2.clear();

System.out.println( collection2.isEmpty() );

# ArrayList 

ArrayList food_util = new ArrayList<>();
food_util.add("Брокколи");
food_util.add("Шпинат");
food_util.add("Цветная капуста");
food_util.add("Огурцы");
food_util.add("Баклажаны");
food_util.add("Оливковое масло");
food_util.add("Миндаль");
food_util.add("Кешью");
food_util.add("Лесные орехи");
food_util.add("Фисташки");
food_util.add("Рыба");
food_util.add("Индейка");
food_util.add("Куриная грудка");
food_util.add("Тофу");
food_util.add("Корица");
food_util.add("Оливковое масло");

System.out.println( food_util.size() );
System.out.println( food_util.get(0) );

food_util.set(0, "Брокколи 2");
food_util.remove(1);

Syste.out.println( food_util.contains("Брокколи 3") ); // false 

# LinkedList 

LinkedList animals = new LinkedList<>();
animals.add("Cat");
animals.addFirst("Dog 1");
animals.addLast("Dog 2");

System.out.println(animals.getFirst());
System.out.println(animals.getLast());

animals.removeFirst();
animals.removeLast();

System.out.println( animals.getFirst() );

