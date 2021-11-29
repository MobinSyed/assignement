package com.javatest;

//imports

import java.util.Scanner;

public class Main {
    //Class

    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {


        //Variables to be set
	double LengthInchUser, LengthFeet, InchTotal, CmOutput;
    final double CentimeterPerInch = 2.55;


    //System Input from User
    System.out.println("Enter total length in feet then inches: Total Feet:  ");
    LengthFeet = console.nextDouble();
    System.out.println("Enter total length in feet then inches: Total Inches:  ");
    LengthInchUser = console.nextDouble();

    //Calculation
        InchTotal = (LengthFeet * 12) + LengthInchUser;
        CmOutput = InchTotal * CentimeterPerInch;

    //System Output to show User
    System.out.println("The numbers you entered are " + (int)LengthFeet + " for feet and "
    + (int)LengthInchUser + " for inches ");
    System.out.println("The Total number of inches= " + (int)InchTotal);
    System.out.println();
    System.out.println("The number of Centimeters= " + CmOutput );
    System.out.println("Press any key to continue ...");

    }
}
