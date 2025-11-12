package com.oops;


//interface Bicycle{
//    int a=45;
//    void speedUp(int increment);
//    void brake(int decrement);
//}
//
//interface GearingSystem{
//    void gear(int gear);
//
//}
//



//////we can also write if we want to inherit something from some class . we can write as class Avoncycle extends cycle implements bicycle,Gearing system
//
//class AvonCycle implements Bicycle,GearingSystem{ //Multiple inheritance is allowed in interface i.e a class can be created using multiple interfaces
//    void blowHorn(){  //Normal methods can also be used here
//        System.out.println("blowing horn now!");
//    }
//    @Override
//    public void speedUp(int increment) { //The overridden method from interface must be declared public inside the class
//            System.out.println("The speed of bicycle is increased by "+increment);
//    }
//    @Override
//    public void brake(int decrement) {
//            System.out.println("The speed of bicycle is decreased by "+decrement);
//    }
//
//    @Override
//    public void gear(int gear) {
//        System.out.println("shifting to gear: "+gear);
//    }
//}
//public class InterfaceInJava {
//    public static void main(String[] args) {
//        AvonCycle b=new AvonCycle();
//        b.brake(23);
//        b.speedUp(45);
//        b.gear(3);
//        b.blowHorn();
//        System.out.println(b.a);
//    }
//}
//.........................................................................................................................
//.........................................................................................................................
//Another example

//interface Camera{
//    void takeSnap();
//    void recordVideo();
//    private void greet(){  //Cannot be used directly by classes but if we put in default then this will work
//        System.out.println("Good morning!");
//    }
//    default void recordIn4k(){   //we can implement methods in java by using default keyword
//        greet(); //if the private methods  are put in default methods then they can be accessed easily.
//        System.out.println("Recording in 4k!");
//    }
//}
//
//interface Wifi{
//    String[] getNetworks();
//    void connectNetwork(String network);
//}
//
//class CellPhone{
//    void callNumbers( int phonenumber){
//        System.out.println("Calling "+phonenumber);
//    }
//    void pickCall(){
//        System.out.println("Connecting to the number!");
//    }
//}
//
//class SmartPhone extends CellPhone implements Camera,Wifi{
////    public void recordIn4k(){
////        System.out.println("Recording a large video in 4k"); // if we overrides default method then this will run on object calling
////    }
//    @Override
//    public void takeSnap() {
//        System.out.println("Taking a snap!");
//    }
//    @Override
//    public void recordVideo() {
//        System.out.println("Recording a video!");
//    }
//    @Override
//    public String[] getNetworks() {
//        System.out.println("Getting list of networks!");
//        String [] networkList={"aditya" , "realme" , "vivo5g"};
//        return networkList;
//    }
//    @Override
//    public void connectNetwork(String network) {
//        System.out.println("connecting to network "+network);
//    }
//}
//public class InterfaceInJava{
//    public static void main(String[] args) {
//        SmartPhone vivo= new SmartPhone();
//        String[] nw=vivo.getNetworks();
//        for(String item:nw){
//            System.out.println(item);
//        }
//        vivo.connectNetwork("aditya");
//        vivo.callNumbers(78569149);
//        vivo.recordIn4k();
//        // vivo.greet();   //throws error if we want to access directly
//    }
//}

//example 3
interface PaymentGateway{
    public void pay(double amount);
    public void refund(double amount);
}

abstract class Transaction{
    protected String transactionId;
    public Transaction(String transactionId){
        System.out.println("transaction constructor called!");
        this.transactionId=transactionId;

    }

    public void showTransactionId(){
        System.out.println("Transaction Id: "+transactionId);
    }
    public abstract boolean validateTransaction();
}

class UpiPayment extends Transaction implements PaymentGateway{

    private String upiId;
    public UpiPayment(String transactionId,String upiId ){
        super(transactionId);
        this.upiId=upiId;
    }
    public boolean validateTransaction(){
        System.out.println("validating upi ID: "+upiId);
        return upiId.contains("@");
    }
    public void pay(double amount){
        System.out.println("paying rupees "+amount+" via UPI: "+upiId);
    }
    public void refund(double amount){
        System.out.println("Refunding rupees "+amount+" to UPI: "+upiId);
    }
}

class CardPayment extends Transaction implements PaymentGateway{

    private String cardNumber;
    public CardPayment(String transactionId,String  cardNumber ){
        super(transactionId);
        this. cardNumber= cardNumber;
    }
    public boolean validateTransaction(){
        System.out.println("validating card number: "+ cardNumber);
        System.out.println("validating card number: "+cardNumber);
        return cardNumber.length()==16;
    }
    public void pay(double amount){
        System.out.println("paying rupees "+amount+" to card: "+ cardNumber);
    }
    public void refund(double amount){
        System.out.println("Refunding rupees "+amount+" to card: "+ cardNumber);
    }
}
public class InterfaceInJava {
    public static void main(String[] args) {
        UpiPayment upi= new UpiPayment("TXN001","aditya@upi");
        System.out.println(".................UPI transaction..............");
        upi.showTransactionId();
        if(upi.validateTransaction()){
            upi.pay(500000);
            upi.refund(89000);
        }
        else{
            System.out.println("UPI validation failed!");
        }
        CardPayment card=new CardPayment("TXN002","1298685473669890");
        System.out.println(".................Card transaction..............");
        card.showTransactionId();
        if(card.validateTransaction()){
            card.pay(1000000);
            card.refund(546000);
        }
        else{
            System.out.println("card validation failed!");
        }

    }
}

//Example 4

