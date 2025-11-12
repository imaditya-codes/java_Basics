package com.collections;
import java.util.*;

public class VectorDemo {
    public static void main(String[] args) throws InterruptedException {
        Vector<String> v=new Vector<>();

//        //Adding elements to the vector
//        v.add("Cherry"); //add at the end
//        v.add("Blueberry");
//        v.add("Pineapple");
//        v.add("Mango");
//        v.add(1,"Orange"); //add elements at the  required index
//        System.out.println(v);
//        System.out.print("after adding collection fruits: ");
//        List<String> fruits= Arrays.asList("apple", "banana", "grapes"); //creating the collection
//       // v.addAll(fruits);//add list at the last
//        v.addAll(2,fruits); //add  collection at specified index
//        System.out.println(v);

//       // accessing elements
//        System.out.println(v.get(2));
//        System.out.println(v.elementAt(4));
//        System.out.println(v.firstElement());
//        System.out.println(v.lastElement());
//        System.out.println(v.indexOf("Pineapple"));
//
//        //updating elements
//        v.set(3,"Litchi");
//        //v.setSize(10); //changes the size of the vector
//        System.out.println(v);

//       // removing elements
//        v.remove(2);
//        v.remove("Litchi");
//        v.removeAll(fruits);
//       // v.clear();
//        System.out.println(v);

        //Searching elements
//        System.out.println(v.contains("apple"));
//        System.out.println(v.indexOf("Cherry"));
//        System.out.println(v.capacity());
//        v.trimToSize();  //reduces  capacity to current size
//        System.out.println(v.size());
//        System.out.println(v.isEmpty());
//       Object[] arr= v.toArray();
//        System.out.println(Arrays.toString(arr));
//        System.out.println(v.clone());

        //how it is thread safe
        ArrayList<Integer> list= new ArrayList<>();
        Thread t1= new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                list.add(i);
            }
        });

        Thread t2= new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                list.add(i);
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("final array size: "+list.size());  // output is not 2000 but less than it

        Vector<Integer> vector= new Vector<>();
        Thread t3= new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                vector.add(i);
            }
        });

        Thread t4= new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                vector.add(i);
            }
        });
        t3.start();
        t4.start();
        t3.join();
        t4.join();

        System.out.println("final vector size: "+vector.size());  //output is 2000 because vector is synchronized and only one thread is accessed at a time
    }
}
