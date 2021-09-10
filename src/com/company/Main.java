package com.company;

public class Main {

    public static void main(String[] args)
    {

        // ex. 3

//        boolean a = false;
//        int n = 1;
//
//
//        while (!a)
//        {
//            if (n % 378 == 0 && n % 6381 == 0)
//                a = true;
//
//            else
//                n++;
//        }
//
//        System.out.println (n);



        // ex. 4

        int num = 29, anyOtherNumber = 2;
        boolean nonprime = false;

        while (anyOtherNumber <= num / anyOtherNumber)
        {
            if (num % anyOtherNumber == 0) // condition for nonprime number
            {
                nonprime = true;
                break;
            }

            ++anyOtherNumber;
        }

        if (!nonprime)
            System.out.println (num + " is a prime number.");
        else
            System.out.println (num + " is not a prime number.");

    }
}
