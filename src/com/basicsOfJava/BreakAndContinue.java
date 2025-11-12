package com.basicsOfJava;

public class BreakAndContinue {
    public static void main(String[] args) {
        // Break using loops
//        for (int i=0;i<5;i++){
//            System.out.print(i );
//            System.out.println("Java is best language");
//            if (i==2){
//                System.out.println("Ending the loop");
//                break; // Break statement is used to exit the loop irrespective of whether the condition is true or false
                         // when a break is encountered inside a loop the control is sent outside the loop
//            }
//        }


        int i = 0;
        while (i < 5) {
            System.out.print(i);
            System.out.println("Java is best language");
            if (i == 2) {
                System.out.println("Ending the loop");
                break;
            }
            i++;
        }
            System.out.println("Loops ends here");
        }
    }

        // Continue statement using loops
//        for (int i = 0; i < 5; i++) {  // similar for while and do while loop continue statement will work
//            if (i == 2) {
//                System.out.println("Ending the loop");
//                continue; // Continue statement is used to immediately move to the next iteration of the loop.The control  is taken to the next iteration thus skipping everything below continue statement
//            }
//            System.out.print(i);
//            System.out.println("Java is best language");
//        }
//    }
//}

//CONCLUSION--> Break statement completely exit the loop
//              Continue statement skips the particular iteration of the loop



