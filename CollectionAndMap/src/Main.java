import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Non generic declaration
        //List list_obj = new ArrayList() --> this non-generic types are deprecated after java 5

        //Generic declaration with diamond operator-->Generic declarations are more secure when it comes to type security
        //List <String> list_obj_2 = new ArrayList<'After java 7 we don't need to write the data type within diamond operator'>()

        //Creating an instance from anonymous class
        GenericTestClass<Integer> object_1 = new GenericTestClass<Integer>() {
            @Override
            Integer multiply(Integer number1, Integer number2) {
                return number1 * number2;
            }
        };
        Integer result = object_1.multiply(15, 20);
        System.out.println(result);

        //Creating an instance from GenericTestClass2
        GenericClassTest2<Integer, String> genericClassTest2_obj = new GenericClassTest2<>(1995, "Max");

        //Calling the methods to print the items
        genericClassTest2_obj.printItems();

        //Using iterator() method
        ArrayList<Integer> object_2 = new ArrayList<>();
        object_2.add(1);
        object_2.add(2);
        object_2.add(3);
        object_2.add(4);
        object_2.add(5);
        Iterator<Integer> i = object_2.iterator();
        while (i.hasNext()) {
            System.out.println("The element is: " + i.next());
        }

        //Main Collection Methods
        //add()
        //addAll()
        //clear()
        //contains()
        //containsAll()
        //equals()
        //hashCode()
        //isEmpty()
        //iterator
        //remove()
        //removeAll()
        //retainAll()
        //size()
        //toArray()
        //toArray()

        //Using addAll() method
        ArrayList<Integer> object_3 = new ArrayList<>();

        //Adding the all elements from object_2 to object_3
        System.out.println(object_3.addAll(object_2));
        System.out.println(object_3);

        //Using clear() method
        object_3.clear();
        System.out.println(object_3);

        //Using contains method
        boolean contains1 = object_2.contains(2);
        System.out.println(contains1);

        //Using HashSet
        //In Hashset there mustn't be a copied element
        //There is no order
        //Declaration of HashSet
        HashSet<String> hashSet_obj_1 = new HashSet<>();

        //Adding elements
        hashSet_obj_1.add("Max");
        hashSet_obj_1.add("George");
        hashSet_obj_1.add("David");

        //Using iterator
        Iterator<String> iterator_2 = hashSet_obj_1.iterator();
        while (iterator_2.hasNext()) {
            //All the elements printed out with no order
            System.out.println(iterator_2.next());
        }

        //Using the add() method to check duplicated element
        boolean add = hashSet_obj_1.add("Max");
        //Since the element already exist it will return false value
        System.out.println(add);

        //USing LinkedHashSet
        //There is order
        //There mustn't be copied element
        //Declaration of LinkedHashSet
        LinkedHashSet<String> linkedHashSet_obj_1 = new LinkedHashSet<>();

        //Adding  elements
        linkedHashSet_obj_1.add("Max");
        linkedHashSet_obj_1.add("George");
        linkedHashSet_obj_1.add("David");

        //Using iterator
        Iterator<String> iterator_3 = linkedHashSet_obj_1.iterator();
        while (iterator_3.hasNext()) {
            //Printing out the element within entry order
            System.out.println("The element is: " + iterator_3.next());
        }

        //TreeSet Usage
        //There is data-type check
        //The entries are in order from smaller to greater
        //Declaration of TreeSet
        TreeSet<Integer> treeSet_obj_1 = new TreeSet<>();

        //Adding the elements
        treeSet_obj_1.add(2024);
        treeSet_obj_1.add(2023);
        treeSet_obj_1.add(2022);

        //Calling the iterator
        Iterator<Integer> iterator_4 = treeSet_obj_1.iterator();
        while (iterator_4.hasNext()) {
            //The elements will be printed out from smaller to greater
            System.out.println(iterator_4.next());
        }

        //The unique methods of TreeSet
        //first()
        //last()
        //headSet()
        //subSet()
        //tailSet()

        //Using the methods above
        TreeSet<Integer> treeSet_obj_2 = new TreeSet<>();

        //Adding the elements
        treeSet_obj_2.add(1);
        treeSet_obj_2.add(4);
        treeSet_obj_2.add(17);
        treeSet_obj_2.add(13);
        treeSet_obj_2.add(19);

        //Printing operations
        System.out.println("The elements of treeSet_obj_2");
        System.out.println(treeSet_obj_2);

        //Applying the first() method-->The first element is printed out (1)
        System.out.println(treeSet_obj_2.first());

        //Applying the last() method-->The last element is printed out (19)
        System.out.println(treeSet_obj_2.last());

        //Applying headSet() method-->The elements smaller than 17 are printed out (1,4,13)
        System.out.println("The elements smaller than 17");
        System.out.println(treeSet_obj_2.headSet(17));

        //Applying subSet() method-->The elements between 1(included) to 19 (1,4,13,17)
        System.out.println("The elements between 1 to 19");
        System.out.println(treeSet_obj_2.subSet(1, 19));

        //Applying tailSet() method-->The elements equal and greater than 13 (13,17,19)
        System.out.println("The elements greater and equal than 13");
        System.out.println(treeSet_obj_2.tailSet(13));

        //ArrayList Usage
        //Object type ArrayList declaration
        List<?> arrayList_obj_1 = new ArrayList<>();

        //Specific data type ArrayList declaration
        ArrayList<String> arrayList_obj_2 = new ArrayList<>();

        //Adding elements to the ArrayList
        arrayList_obj_2.add("Violet");
        arrayList_obj_2.add("Rose");
        arrayList_obj_2.add("Lilly");

        //Printing out the all elements from the ArrayList
        System.out.println(arrayList_obj_2);

        //Getting an element from the list using index number
        System.out.println(arrayList_obj_2.get(2));

        //Removing an element from the list using index number
        System.out.println(arrayList_obj_2.remove(1));
        System.out.println(arrayList_obj_2);


        //Creating a new ArrayList
        List<String> arrayList_obj_3 = new ArrayList<>();
        arrayList_obj_3.add("Max");
        arrayList_obj_3.add("Thunder");

        //Adding a list into another list using addAll() method
        arrayList_obj_3.addAll(arrayList_obj_2);

        //Printing out the new arrayList_obj_3
        System.out.println(arrayList_obj_3);

        //Using remove() method for ArrayList
        System.out.println(arrayList_obj_3.remove(2));
        System.out.println(arrayList_obj_3);

        //Using clear() method to clear the all elements from the List
        arrayList_obj_3.clear();
        System.out.println(arrayList_obj_3);

        //Using ListIterator
        ListIterator<String> listIterator_1 = arrayList_obj_2.listIterator();

        //Setting the while loop from head to tail
        while (listIterator_1.hasNext()) {
            System.out.println(listIterator_1.next());
        }

        //Setting the while loop from tail to head
        while (listIterator_1.hasPrevious()) {
            System.out.println(listIterator_1.previous());
        }

        //Reading elements using for-each loop instead LisIterator
        for (String flowers : arrayList_obj_2) {
            System.out.println(flowers);
        }

        //Declaring an Object type ArrayList
        ArrayList<Object> arrayList_obj_4 = new ArrayList<>();

        //Adding elements
        arrayList_obj_4.add(1);
        arrayList_obj_4.add(2);
        arrayList_obj_4.add(3);
        arrayList_obj_4.add("Element in String type");

        //Using ListIterator
        ListIterator<Object> listIterator_2 = arrayList_obj_4.listIterator();

        //Setting the while loop
        while (listIterator_2.hasNext()) {
            //Indicating the element number using nextIndex() method
            System.out.print(listIterator_2.nextIndex() + " numbered element: ");
            System.out.println(listIterator_2.next());
        }


        //Declaring another ArrayList
        List<String> arrayList_obj_5 = new ArrayList<>();

        //Adding an element
        arrayList_obj_5.add("Max");

        //Changing the value using set() method
        arrayList_obj_5.set(0, "Thunder");

        //Printing out the element using get() method
        System.out.println(arrayList_obj_5.get(0));

        //Declaring another ArrayList
        ArrayList<String> arrayList_obj_6 = new ArrayList<>();

        //Adding the elements into the array
        arrayList_obj_6.add("C");
        arrayList_obj_6.add("B");
        arrayList_obj_6.add("F");
        arrayList_obj_6.add("A");

        //Sorting the array from smaller to greater from Collections
        Collections.sort(arrayList_obj_6);
        System.out.println(arrayList_obj_6);

        //Sorting the array in reverse version
        Collections.reverse(arrayList_obj_6);
        System.out.println(arrayList_obj_6);

        //Sorting the array with compareTo method
        arrayList_obj_6.sort(String::compareTo);
        System.out.println(arrayList_obj_6);

        //Sorting overriding the compare method
        arrayList_obj_6.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        //Using ArrayList for instances of a Person Class
        Person person_1 = new Person("Max", "Thunder", 29);
        Person person_2 = new Person("David", "Brown", 34);
        ArrayList<Person> arrayList_obj_7 = new ArrayList<>();

        //Adding the object person into ArrayList
        arrayList_obj_7.add(person_1);
        arrayList_obj_7.add(person_2);

        //Sorting the objects using lambda expressions
        arrayList_obj_7.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));

        //Printing out the objects
        System.out.println(arrayList_obj_7);

        //Using LinkedList
        //Declaration of LinkedList
        LinkedList<Integer> linkedList_obj_1 = new LinkedList<>();

        //Adding elements into List
        linkedList_obj_1.add(1);
        linkedList_obj_1.add(2);
        linkedList_obj_1.add(3);
        linkedList_obj_1.add(4);

        //using addFirst() method
        linkedList_obj_1.addFirst(0);

        //Using addLast() method
        linkedList_obj_1.addLast(5);

        //Printing out the all elements in the list
        System.out.println(linkedList_obj_1);

        //Getting the first element in the list
        System.out.println(linkedList_obj_1.getFirst());

        //Getting the last element in the list
        System.out.println(linkedList_obj_1.getLast());

        //LinkedList presented as queue --> First In, First Out
        //Declaring object type LinkedList
        LinkedList<Object> linkedList_obj_2 = new LinkedList<>();

        //Adding the first element
        linkedList_obj_2.addFirst("First element");

        //Adding middle elements
        linkedList_obj_2.add("Middle element");

        //Adding the last element
        linkedList_obj_2.addLast("Last element");

        //Printing out the list
        System.out.println(linkedList_obj_2);

        //Removing the first element
        linkedList_obj_2.removeFirst();
        System.out.println(linkedList_obj_2);

        //Stack is the opposite of queue which means --> First In, Last Out

        //Usage of vector List
        //Declaring 2 integer fır vector capacity and growing amount after the capacity
        final int capacity_vector_1 = 3;
        final int growing_size_vector_1 = 4;

        //Declaring the vector
        Vector<Integer> vector_obj_1 = new Vector<>(capacity_vector_1, growing_size_vector_1);

        //Adding elements in vector list
        vector_obj_1.add(10);
        vector_obj_1.add(15);
        vector_obj_1.add(20);


        //Printing out the capacity of the vector
        System.out.println("The capacity of the vector " + vector_obj_1.capacity());

        //Printing out the first element of the vector
        System.out.println("The first element of the vector " + vector_obj_1.firstElement());

        //Printing out the last element of the vector
        System.out.println("The last element of the vector " + vector_obj_1.lastElement());

        //Adding one more element in vector list to grow the capacity
        vector_obj_1.add(22);

        //Printing out the new capacity of the vector
        System.out.println("The new capacity of the vector " + vector_obj_1.capacity());

        //Declaration of Queue-->Elements in Queue cannot be accessed with the index number and connected with LinkedList
        Queue<Integer> queue_obj_1 = new LinkedList<>();

        //Adding elements in Queue
        queue_obj_1.add(15);
        queue_obj_1.add(20);
        queue_obj_1.add(33);

        //Using offer method to add elements, if adding process is unsuccessful it return false value
        queue_obj_1.offer(70);

        //Setting the while loop
        while (!queue_obj_1.isEmpty()) {
            //Using the peek() method to get the element in the head
            System.out.println("The element in the head of the queue " + queue_obj_1.peek());

            //Using the poll() method to remove and get the element in the head
            System.out.println("Removing and getting the element in the head of queue " + queue_obj_1.poll());
        }

        /*The methods of Map Interface-->It is not connected to Collection Interface and there is no duplicated key values
          but elements can be duplicated*/
        //clear()
        //containsKey()
        //containsValue()
        //entrySet()
        //get()
        //isEmpty()
        //keySet()
        //put()
        //putAll()
        //remove()
        //size()
        //values()

        //Usage and declaration of HashMap --> Data in HashMap has no order, there is initial capacity and load factor.
        //As default initial capacity is 16 and load factor is 0.75f
        HashMap<Integer, String> hashMap_obj_1 = new HashMap<>(10, 0.75f);

        //Adding the elements
        hashMap_obj_1.put(1, "one");
        hashMap_obj_1.put(2, "two");
        hashMap_obj_1.put(3, "three");
        hashMap_obj_1.put(4, "four");
        hashMap_obj_1.put(5, "five");

        //Using entrySet() method to set the elements with keys into Set list, and using keySet() to set the keys in Set list

        Set elements = hashMap_obj_1.entrySet();
        Set keys = hashMap_obj_1.keySet();

        //Declaring the iterator to read elements with keys
        Iterator iterator_5 = elements.iterator();
        Iterator iterator_6 = keys.iterator();
        while (iterator_5.hasNext()) {
            System.out.println("The elements of hashMap_obj_1 is: " + iterator_5.next());
        }

        //Using while loop to read the keys
        while (iterator_6.hasNext()) {
            System.out.println("The keys of hashMap_obj_1 is: " + iterator_6.next());
        }

        //Not** HashMap doesn't have duplicated elements

        //Using and declaration LinkedHashMap
        LinkedHashMap<Character, Integer> linkedHashMap_obj_1 = new LinkedHashMap<>();

        //Setting for loop to set the keys and values
        for (int j = 65; j < 90; j++) {
            //Casting Integer values into character
            linkedHashMap_obj_1.put((char) j, j);
        }
        //Printing out the entries
        Set entries = linkedHashMap_obj_1.entrySet();
        System.out.println(entries);

        //Methods in TreeMap
        //ceilingEntry()-->gives equal or greater key and values than the key entry
        //ceilingKey()-->gives equal or greater keys than the entered keys
        //descendingKeySet()-->gives keys in descending order
        //firstEnrty()-->gives first matched key and value
        //floorEntry()-->gives equal or smaller key and values than the entry
        //floorKey()-->gives equal or smaller keys than the entered key
        //headMap()-->gives the the values smaller values and the keys than the entered key and given key is not included

        //Declaration of TreeMap
        TreeMap<Integer, String> treeMap_obj_1 = new TreeMap<>();

        //Adding the elements
        treeMap_obj_1.put(1, "one");
        treeMap_obj_1.put(2, "two");
        treeMap_obj_1.put(4, "four");
        treeMap_obj_1.put(5, "five");

        //Printing out the all values and keys
        System.out.println(treeMap_obj_1);

        //Using ceilingEntry() method
        System.out.println(treeMap_obj_1.ceilingEntry(3));

        //Using decendingKeySet() method
        System.out.println(treeMap_obj_1.descendingKeySet());

        //Using floorEntry() method
        System.out.println(treeMap_obj_1.floorEntry(10));

        //Using headMap() method
        System.out.println(treeMap_obj_1.headMap(2));

        //Immutable structures--> Before Java 9
        List<String> arrayList_obj_8 = new ArrayList<>();
        arrayList_obj_8.add("Mercedes");
        arrayList_obj_8.add("BMW");
        arrayList_obj_8.add("Volvo");
        arrayList_obj_8 = Collections.unmodifiableList(arrayList_obj_8);
        System.out.println(arrayList_obj_8);

        //Immutable structures-->After Java 9
        //Immutable Map
        Map<String, Integer> map_obj_1 = Map.of("key 1", 1, "key 2", 2);
        System.out.println(map_obj_1);

        //Immutable List
        List<String> array_list_9 = List.of("Mercedes", "BMW", "Volvo");
        System.out.println(array_list_9);

        //Immutable Set
        Set<String> set_list_1 = Set.of("Max", "Thunder", "Bjorn");
        System.out.println(set_list_1);

        //WildCard-->Gives flexibility to generics when it comes to hierarchy between classes
        //Example below
        //Creating a class named 'LivingCreatures'
        //Creating another class named 'Human' that extends 'LivingCreatures'
        //Normally we can create an instance from the both class and we can initialize the object from super class to the child class

       /* LivingCreatures livingCreatures_obj_1 = new LivingCreatures();
        Human human_obj_1 = new Human();
        livingCreatures_obj_1 = human_obj_1;*/

        //However we cannot do this in Generics so we use WildCard--> inside diamond operator we place '?'
        //Upper bounded way below
        ArrayList<? extends LivingCreatures> livingCreatures_obj_list_1 = new ArrayList<>();
        ArrayList<Human> humans_obj_1 = new ArrayList<>();

        //Adding Elements
        humans_obj_1.add(new Human("Max", "Thunder", 29));

        //initializing super extended class list to the list from the sub class
        livingCreatures_obj_list_1 = humans_obj_1;

        //Printing out the list of the super class
        System.out.println(livingCreatures_obj_list_1);

        //Another example below
        //Example 2
        ArrayList<Integer> arrayList_obj_10 = new ArrayList<>();
        arrayList_obj_10.add(10);
        arrayList_obj_10.add(15);
        arrayList_obj_10.add(20);
        //Calling the static addition() method;
        System.out.println(addition(arrayList_obj_10));

        ArrayList<Double> arrayList_obj_11 = new ArrayList<>();
        arrayList_obj_11.add(12.5);
        arrayList_obj_11.add(13.6);
        arrayList_obj_11.add(14.5);

        //Calling the static addition() method
        System.out.println(addition(arrayList_obj_11));

        //Example of lower bound
        //Example 1 lower bound
        //Declaring Integer type Array List
        ArrayList<Integer> arrayList_obj_12 = new ArrayList<>();

        //Adding the elements
        arrayList_obj_12.add(23);
        arrayList_obj_12.add(34);
        arrayList_obj_12.add(56);

        //Calling the static addition2() method
        System.out.println(addition2(arrayList_obj_12));

        //Declaring Number type Array List
        ArrayList<Number> arrayList_obj_13 = new ArrayList<>();

        //Adding the elements
        arrayList_obj_13.add(28);
        arrayList_obj_13.add(54);
        arrayList_obj_13.add(63);

        //Calling the static addition2() method
        System.out.println(addition2(arrayList_obj_13));

        //Unbounded Wild Card
        //Example 1
        List<Integer> integerList = Arrays.asList(7,5,6);
        List<Double> doubleList = Arrays.asList(4.3,5.6,7.8);
        List<String> stringList = Arrays.asList("Max", "Ada","Gizmo");

        //Calling the display() method
        display(integerList);
        display(doubleList);
        display(stringList);
    }
    //Declaring a static method related to Example 2 in Wild Card 'Upper Bound'.
    private static double addition(List<? extends Number> numberList) {
        double result = 0.0;
        System.out.println("The addition result is");
        for (Number additionList : numberList) {
            result +=additionList.doubleValue();
        }
        return result;
    }

    //Declaring a static method related to Example 1 in Wild Card 'Lower Bound'.
    private static int addition2(List<? super Integer> numberList2){
        System.out.println("The addition result is");
        int result = 0;
        for (Object additionList2: numberList2){
            result += Integer.parseInt(additionList2.toString());
        }
        return result;
    }

    //Declaring a static method related to Example 1 in WildCard 'Unbounded Wildcard'.
    private static void display(List<?> displayList){
        System.out.println("The elements are below");
        System.out.println(displayList);
    }
}