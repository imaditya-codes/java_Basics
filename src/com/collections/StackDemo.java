package com.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class StackDemo {
   public static void main(String[] args) {
//       Stack<Integer> stack=new Stack<>();
//       stack.push(1);
//       stack.push(2);
//       stack.push(3);
//       System.out.println(stack);
//       Integer removedElement=stack.pop();
//       System.out.println(removedElement);
//       System.out.println(stack);
//       System.out.println(stack.peek());
//       System.out.println(stack);
//       System.out.println(stack.isEmpty());
//       System.out.println(stack.size());

       //implementing stack using linked list
//       LinkedList<Integer> linkedList=new LinkedList<>();
//       linkedList.addLast(1);  //equivalent to stack.push
//       linkedList.addLast(2);
//       linkedList.addLast(3);
//       linkedList.addLast(4);
//       linkedList.addLast(5);
//       System.out.println(linkedList);
//       linkedList.getLast();      //equivalent to stack.peek
//       linkedList.removeLast();   //equivalent to stack.pop
//       System.out.println(linkedList);
//       linkedList.size();
//       linkedList.isEmpty();

       //implementing stack using arraylist
       ArrayList<Integer> list=new ArrayList<>();
       list.add(1);
       list.add(2);
       list.add(3);
       System.out.println(list);
       list.get(list.size()-1);
       list.remove(list.size()-1);
       System.out.println(list);
    }
}
