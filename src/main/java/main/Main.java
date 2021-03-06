package main;
import java.util.*;

// Note that classes are always capitalize
public class Main {
    public static void main(String[] args) {
        int x, y, z;
        String[] fruits;
        int classSize[]; // there are many ways to declare an array
        boolean[] brokenLights;


        String[] names = {"John", "Mary", "Joseph"};

        System.out.println("Hello World");
        // recall that arrays are zero-indexed
        System.out.println(names[2]);
        System.out.println(names.length);


        // polymorphic declaration
        // we are allowed to declare one type as another
        // we do this to hide implementation details (abstraction)
        // we do this also to allow the variable type to be flexible
        // everything in the diamond is generic
        // generics are types that we define for a given class
        // generics are what we define lists to be composed of
        List<Integer> integerList = new ArrayList<>();
        List<String> stringList = new Stack<>();
        List<Character> characterList = new Vector<>();


        integerList.add(4);
        integerList.add(3);
        integerList.add(2);
        integerList.add(6);

        System.out.println(integerList);

        System.out.println(integerList.get(1));
        integerList.remove(1);
        System.out.println(integerList);
        System.out.println(integerList.get(1));


        // if words are italic that means that the code is capitilazed
        // collections is a utility class
        // we don't make instances of those classes
        // the methods will be static
        // we simply refer to their methods
        Collections.reverse(integerList);
        System.out.println(integerList);

        System.out.println(integerList.contains(4));

        integerList.clear();
        System.out.println(integerList);

        String myString = "Hello there friends!";
        System.out.println(myString.charAt(4));
        String str[] = myString.split("");
        List<String> stringArrayList;
        stringArrayList = Arrays.asList(str);

        System.out.println(stringArrayList);
        stringArrayList.toArray();
        Arrays.toString(str);

        //ArrayList of strings
        List<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Grape");


        Object[] fruitArray =  fruitList.toArray();
        String fruitString = Arrays.toString(fruitArray);

        System.out.println(Arrays.toString(fruitArray)
                .replace("[", "")
                .replace("]", ""));

        HashMap<String, Integer> persons = new HashMap<>();
        persons.put("Mary", 21);
        persons.put("Tim", 44);
        persons.put("Dan", 67);

        System.out.println(persons);
        System.out.println(persons.get("Tim"));

        // this is an enhanced for loop
        // aslo known as a for-in loop
        for (String fruit : fruitList) {
            System.out.println(fruit);
        }
        fruitList.forEach( fruit ->
                System.out.println(fruit)
        );
        fruitList.forEach(System.out::println);
    }
}