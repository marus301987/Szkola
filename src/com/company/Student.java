package com.company;

public class Student {

    static int index = 0;

    public Student(String imie, String szkola) {

            int id = ++index;

            System.out.println("Imię : " + imie);
            System.out.println("Szkoła : " + szkola);
            System.out.println("Id studenta to : " + id);
    }

}
