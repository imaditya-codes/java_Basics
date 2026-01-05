package com.CollectionFramework.Stack;
import java.util.*;

public class StackDemoInJava {
    static void main(String[] args) {
                // 1. Create Stack
                Stack<Integer> stack = new Stack<>();
                // 2. push() → add element to top
                stack.push(10);
                stack.push(20);


        stack.push(30);
                System.out.println("After push: " + stack);

                // 3. peek() → see top element (does NOT remove)
                System.out.println("Peek: " + stack.peek());
                System.out.println("After peek: " + stack);

                // 4. pop() → remove & return top element
                System.out.println("Pop: " + stack.pop());
                System.out.println("After pop: " + stack);

                // 5. empty() → check if stack is empty
                System.out.println("Is empty? " + stack.empty());

                // 6. search() → position from top (1-based index)
                // returns -1 if not found
                System.out.println("Search 10: " + stack.search(10));
                System.out.println("Search 100: " + stack.search(100));

                // ===== Methods inherited from Vector =====

                // 7. size()
                System.out.println("Size: " + stack.size());

                // 8. get(index)
                System.out.println("Element at index 0: " + stack.get(0));

                // 9. set(index, element)
                stack.set(0, 99);
                System.out.println("After set: " + stack);

                // 10. contains()
                System.out.println("Contains 20? " + stack.contains(20));

                // 11. remove(index)
                stack.remove(1);
                System.out.println("After remove index 1: " + stack);

                // 12. clear()
                stack.clear();
                System.out.println("After clear: " + stack);

                // 13. empty() after clear
                System.out.println("Is empty now? " + stack.empty());
            }
        }
