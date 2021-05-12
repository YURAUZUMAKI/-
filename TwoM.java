package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class TwoM {
    public static void main(String[] args) {
       ArrayList<Integer> f = new ArrayList<>();
           f.add(3);
                f.add(4);
           f.add(3);
                f.add(4);
        ArrayList<Integer> f1 = new ArrayList<>();
            f1.add(3);
                f1.add(4);
            f1.add(3);
                f1.add(4);
        for(int i = 0;i<f.size();i++) {
            System.out.println(f1.get(i));
        }


    }

}
