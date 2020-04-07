package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //how many users we want to add
        System.out.println("Enter numb of student: ");

        Scanner scanner=new Scanner(System.in);
        int numbStudent=scanner.nextInt();
        Student[] students=new Student[numbStudent];


        //create a number of student

        for (int n = 0; n < numbStudent; n++) {
            students[n]=new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].toString());

        }


    }
}
