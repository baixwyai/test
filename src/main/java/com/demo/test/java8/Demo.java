package com.demo.test.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author chenwd
 * @date 2020-9-17 16:02
 */
public class Demo {

    public static void main(String[] args) {

        List<Apple> apples = new ArrayList<>();
        Apple apple = new Apple();
        apple.setWeight(69);
        apples.add(apple);

        apple = new Apple();
        apple.setWeight(48);
        apples.add(apple);

     /*   Collections.sort(apples, new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });
*/
     apples.sort(Comparator.comparing(Apple::getWeight));
     for(Apple a : apples){
            System.out.println(a.getWeight());
        }

        try {
            byte[] rData = new byte[1024];
            System.in.read(rData);
            System.out.println("read:" + new String(rData));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
