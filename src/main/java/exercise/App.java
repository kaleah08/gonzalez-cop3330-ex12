package exercise;

/*UCF COP3330 Fall 2021 Assignment 1 Solution
Copyright 2021 Kaleah Gonzalez */

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        String firstString = input.next();
        double principal = Double.parseDouble(firstString);

        System.out.print("Enter the rate of interest: ");
        String secondString = input.next();
        double rate = Double.parseDouble(secondString);

        System.out.print("Enter the number of years: ");
        String thirdString = input.next();
        double years = Double.parseDouble(thirdString);

        double investment = principal *(1 + (rate/100) * years);
        investment = (double)Math.round(investment * 100d) / 100d;

        System.out.println("After " + String.format("%.0f",years) + " years at " + rate + "%, the investment will be worth $" + investment);
        
    }
}
