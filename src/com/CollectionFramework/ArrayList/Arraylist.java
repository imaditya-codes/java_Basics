package com.CollectionFramework.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Arraylist {
   public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
//       System.out.println(list);
//       list.remove(2);
//       System.out.println(list);
//       list.add(2,30);
//       System.out.println(list);
//       list.set(1,40);
//       System.out.println(list);
//       System.out.println(list.get(1));
//       System.out.println(list.size());
//       System.out.println(list.contains(30));
//       System.out.println(list.indexOf(30));

       //different methods of creating arraylist
       //1.type Arrays.asList("Monday", "Tuesday") then alt+enter
       List<String> list1 = Arrays.asList("Monday", "Tuesday");
       //list1.add(1,"Wednesday");  //it throws exception as we  cant add only set as it is resizable
       list1.set(1,"Wednesday"); //it is valid
       System.out.println(list1);


       String [] fruits={"Mango","Pineapple","Cherry"}; //create a string first
       //2.type Arrays.asList(fruits) and then press alt+enter
       List<String> list2 = Arrays.asList(fruits);  //we have to  write List<>
       System.out.println(list2);
       //it can be made modifiable by creating a new arrraylist
       List<String> list3=new ArrayList<>(list2);
       list3.add("Banana");
       System.out.println(list3);


       //3.using list.of = write List.of(1,2,3) then press alt+enter
       List<Integer> integers = List.of(1, 2, 3 ); //but it is unmodifiable as we cant set here
       System.out.println(integers);

       List<Integer> integers1 =new ArrayList<>();
       integers1.add(1);
       integers1.add(2);
       integers1.add(3);
      // integers1.addAll(integers);  //adds at the last
       integers1.addAll(2,integers); //adds at the particular index
       System.out.println(integers1);

       //converting list to array
       String[] array = list3.toArray(new String[0]);
       for(String s: array)
           System.out.println(s);

       //sorting list in java and null here is the comparator
       list3.sort(null);
       System.out.println(list3);
   }
}
