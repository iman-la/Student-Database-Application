package com.company;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;

    private static int id = 1000;

    //constructor: prompt users

    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter student first name: ");
        this.firstName = in.nextLine();


        System.out.println("enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println("1-Freshmen\n2 - for Sophmore\n3 - Junior\n4 - Senior\nenter student class level: ");
        this.gradeYear = in.nextInt();
        setStudentId();
    }

    //Generate an id

    public void setStudentId() {
        id++;
        this.studentId = gradeYear + " " + id;


    }


    //enroll in courses
    public void enroll() {

        do {
            System.out.println("enter a course to enroll(Q to quit): ");
            Scanner scanner = new Scanner(System.in);
            String course = scanner.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n   " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {

                break;
            }
        } while (1 != 0);
    }


    //view balance
    public void viewBalance() {
        System.out.println("your balance is: $" + tuitionBalance);
    }

    //pay Tuition
    public void payTuition() {
        viewBalance();
        System.out.println("Enter your payment");
        Scanner scanner = new Scanner(System.in);
        int payment = scanner.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("thanks for pay!" + payment);
        viewBalance();
    }

    //show status
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\ngrade Level: " + gradeYear + "\nStudent ID: " + studentId + "\n Courses Enrolled: " + courses + "\nBalance: $ " + tuitionBalance;
    }

}
