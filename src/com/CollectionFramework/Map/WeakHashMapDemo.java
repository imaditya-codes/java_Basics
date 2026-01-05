package com.CollectionFramework.Map;

import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) {
        WeakHashMap<String,Image> imageCache = new WeakHashMap<>();
        imageCache.put(new String("img1"),new Image("img1.jpg"));
        imageCache.put(new String("img2"),new Image("img2.jpg"));
        System.out.println(imageCache);
        System.gc();
        simulateApplicationRunning();
        System.out.println("after GC: "+imageCache);

    }
    public static void simulateApplicationRunning(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Image{

    private String name;

    public Image(String name){
        this.name=name;
    }


    @Override
    public String toString() {
        return name;
    }
}
