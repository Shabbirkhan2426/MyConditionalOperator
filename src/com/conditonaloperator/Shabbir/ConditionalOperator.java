package com.conditonaloperator.Shabbir;

public class ConditionalOperator {

    public static void main (String []args){

        americanGrade();
    }

    public static void americanGrade(){

        int points = 100;


        if (points < 59) {
                System.out.println("My grade is F");
                System.out.println("My points are  " + points);

            } else if (points >= 59 && points <= 69) {
                System.out.println("My grade is D");
                System.out.println("My points are  " + points);

            } else if (points >= 69 && points <= 79) {
                System.out.println("My grade is C");
                System.out.println("My points are  " + points);

            } else if (points >= 79 && points <= 89) {
                System.out.println("My grade is B");
                System.out.println("My points are  " + points);

            } else if (points >= 89 && points <= 93) {
                System.out.println("My grade is A-");
                System.out.println("My points are  " + points);

            } else if (points >= 93 && points <= 96) {
                System.out.println("My grade is A");
                System.out.println("My points are  " + points);

            } else if (points >= 96 && points <= 100) {
                System.out.println("My grade is A+ ");
                System.out.println("My points are " + points);

            }

        }

    }






