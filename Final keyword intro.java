package com.company;
public class Student {
    String name;
    final int rollNo;
 /*    we simply cant write the upper two lines
      we ve to intialize them */

    {
//        This is a normal initialize block

        rollNo = 4;

    }
    public Student( ) {
//        This is a constructor to initialize

        name ="Harry";
    }
    public static void main(String[] args) {
        String breed = "Rekha hippo";
        System.out.println(breed);
    }
}
