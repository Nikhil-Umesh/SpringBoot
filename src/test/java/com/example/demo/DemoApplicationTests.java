package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
interface test {
    double getValue();
}

interface StringFunc {
    String func(String n);
}

class MyStringOps {
    static String strReverse(String str) {
        String result = "";
        int i;
        for (i=str.length()-1;i>=0;i--)
            result+=str.charAt(i);
        return result;
    }
}

public class DemoApplicationTests {
    static String stringop(StringFunc sf,String S){
        return sf.func(S);
    }

    @Test
    public void test(){
        String inStr="Lambdas add power to Java";
        String outStr;
        outStr = stringop(MyStringOps::strReverse,inStr);
        System.out.println("Orignial string:"+inStr);
        System.out.println("String reversed:"+outStr);
    }

    @Test
    public void contextLoads() {
        test mytest;
        mytest = () -> 123.45;
        Integer i = 10;
        System.out.println(mytest.getValue());
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.forEach(s -> {
            System.out.println(s);
        });
    }

}
