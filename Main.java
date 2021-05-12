package com.company;
import java.lang.*;
import java.util.*;
import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {

	OneM r = new OneM();
        r.AddFirst(-1);
        r.AddFirst(2);
        r.AddFirst(3);

	OneM r1 = new OneM();
        r1.AddFirst(-2);
        r1.AddFirst(1);
        r1.AddFirst(-1);

    OneM r2 = new OneM();
    r2.additionAndSubtraction(r,r1,1);



    }

}

