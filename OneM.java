package com.company;
import java.lang.*;
 class Node {
    Node pNext;
    Node pPrev;
    double data;

    Node(double d) {
        data = d;
    }


 }

public class OneM {

        Node Top;
        private int size=0;



        void AddFirst(double d) {
            Node new_Node = new Node(d);
            new_Node.pNext = Top;
            new_Node.pPrev = null;
            if (Top != null){
                Top.pPrev = new_Node;
            }
            size++;
            Top =new_Node;
        }

         int Size(){
            return size;
        }

        void printlist(Node n) {
            Node last = null;
            while (n != null) {
                size++;
                System.out.print(n.data + " ");
                last = n;
                n = n.pNext;
            }

        }

    void printIndex(Node n,int index) {
        Node last = null;
        int size1=0;
        while (index != size1) {
            size1++;
            if(index == size1) {
                System.out.println(n.data);
            }
            last = n;
            n = n.pNext;
        }
    }

    double returnIndex(Node n,int index) {
            Node last = null;
            int size1=-1;
            while (index != size1) {
                size1++;
                if(index == size1) {
                    return n.data;
                }
                last = n;
                n = n.pNext;
            }
            return  n.data;

        }

    void additionAndSubtraction(OneM a,OneM b,int operation){
        if(operation == 1){
            OneM r3 = new OneM();

             for(int i = 0;i<a.Size();i++) {
                    r3.AddFirst(a.returnIndex(a.Top, i) + b.returnIndex(b.Top, i));
                 }
            r3.printlist(r3.Top);
        }else {
            OneM r3 = new OneM();

            for(int i = 0;i<a.Size();i++) {
                r3.AddFirst(a.returnIndex(a.Top, i) - b.returnIndex(b.Top, i));
            }
            r3.printlist(r3.Top);
        }
    }

    void scalarMultiplicationOfVectors(OneM a,OneM b ) {

            OneM r3 = new OneM();

            for (int i = 0; i < a.Size(); i++) {
                r3.AddFirst(a.returnIndex(a.Top, i) * b.returnIndex(b.Top, i));
            }

            r3.AddFirst(a.returnIndex(r3.Top, 0) + b.returnIndex(r3.Top, 1)+ b.returnIndex(r3.Top, 2));
            r3.printIndex(r3.Top, 1);
    }

    void vectorLength(OneM a){

        OneM r3 = new OneM();

        for (int i = 0; i < a.Size(); i++) {
            r3.AddFirst( Math.pow((a.returnIndex(a.Top,i)),(2)));
        }
        r3.AddFirst(Math.sqrt( a.returnIndex(r3.Top, 0) + a.returnIndex(r3.Top, 1)+ a.returnIndex(r3.Top, 2)));
        r3.printIndex(r3.Top, 1);
    }

 }




