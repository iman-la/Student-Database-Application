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
        System.out.println("Enter Student First Name: ");
        this.firstName = in.nextLine();


        System.out.println("Enter Student Last Name: ");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshmen\n2 - for Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
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
            System.out.println("Enter A Course To Enroll(Q to Quit): ");
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
        System.out.println("Your Balance Is: $" + tuitionBalance);
    }

    //pay Tuition
    public void payTuition() {
        viewBalance();
        System.out.println("Enter Your Payment");
        Scanner scanner = new Scanner(System.in);
        int payment = scanner.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thanks For Pay!" + payment);
        viewBalance();
    }

    //show status
    public String toString() {
        return "Name: " + firstName + "\nFamily: " + lastName + "\nGrade Level: " + gradeYear + "\nStudent ID: " + studentId + "\nCourses Enrolled: " + courses + "\nBalance: $ " + tuitionBalance;
    }

}
