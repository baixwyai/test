package com.demo.test;

import com.demo.test.java8.Apple;
import com.demo.test.utils.JSONUtils;
import net.minidev.json.JSONUtil;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author chenwd
 * @date 2020-9-24 14:41
 */
public class SimpleTest {

    @Test
    public void test3() throws IOException {
        List<Apple> appleList = new ArrayList<>();
     /*   Apple apple = new Apple();
        apple.setWeight(1);
        apple.setName("苹果");
        appleList.add(apple);

        apple = new Apple();
        apple.setWeight(1);
        apple.setName("梨子");
        appleList.add(apple);

        apple = new Apple();
        apple.setWeight(11);
        apple.setName("苹果");
        appleList.add(apple);*/

        List<String> names = appleList.stream().map(Apple::getName).distinct().collect(Collectors.toList());
        System.out.println(JSONUtils.objectToString(names));
    }

    @Test
    public void test21() throws IOException {
        try (FileInputStream inputStream = new FileInputStream("G:\\mxxx\\说明.txt")){
            byte[] bytes = new byte[10240];
            inputStream.read(bytes);
            System.out.println(new String(bytes,"GBK"));
        }
    }

    @Test
    public void test2() throws IOException {
        FileInputStream inputStream = new FileInputStream("G:\\mxxx\\说明.txt");
        byte[] bytes = new byte[10240];
        inputStream.read(bytes);
        System.out.println(new String(bytes,"GBK"));

//        inputStream.close();

        FileInputStream inputStream1 = new FileInputStream("G:\\mxxx\\说明.txt");
        byte[] bytes1 = new byte[10240];
        inputStream.read(bytes1);
        System.out.println(new String(bytes,"GBK"));

        inputStream1.close();
    }


    @Test
    public void test1(){
        File[] files = new File(".").listFiles(File::isHidden);
        for(File file : files){
            System.out.println(file.getName());
        }

    }
}
