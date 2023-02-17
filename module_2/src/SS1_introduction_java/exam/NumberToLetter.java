package SS1_introduction_java.exam;

import java.util.Scanner;

public class NumberToLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = sc.nextInt();
        int hundreds = number / 100;
        int temp = number % 100;
        int tens = temp / 10;
        int ones = number % 10;

        if (number < 10 && number >= 0) {
            switch (number) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        } else if (number >= 10 && number < 20) {
            switch (ones) {
                case 0:
                    System.out.println("Ten");
                    break;
                case 1:
                    System.out.println("Eleven");
                    break;
                case 2:
                    System.out.println("Twelve");
                    break;
                case 3:
                    System.out.println("Thirteen");
                    break;
                case 4:
                    System.out.println("Fourteen");
                    break;
                case 5:
                    System.out.println("Fifteen");
                    break;
                case 6:
                    System.out.println("Sixteen");
                    break;
                case 7:
                    System.out.println("Seventeen");
                    break;
                case 8:
                    System.out.println("Eighteen");
                    break;
                case 9:
                    System.out.println("Nineteen");
                    break;
            }
        } else if (number >= 20 && number <= 999) {
            switch (hundreds){
                case 0:
                    break;
                case 1:
                    System.out.print("one hundred");
                    break;
                case 2:
                    System.out.print("two hundred");
                    break;
                case 3:
                    System.out.print("three hundred");
                    break;
                case 4:
                    System.out.print("four hundred");
                    break;
                case 5:
                    System.out.print("five hundred");
                    break;
                case 6:
                    System.out.print("six hundred");
                    break;
                case 7:
                    System.out.print("seven hundred");
                    break;
                case 8:
                    System.out.print("eight hundred");
                    break;
                case 9:
                    System.out.print("nine hundred");
                    break;
            }
            switch (tens) {
                case 1:
                    switch (temp % 10) {
                        case 1:
                            System.out.println(" eleven");
                            break;
                        case 2:
                            System.out.println(" twelve");
                            break;
                        case 3:
                            System.out.println(" thirteen");
                            break;
                        case 4:
                            System.out.println(" fourteen");
                            break;
                        case 5:
                            System.out.println(" fifteen");
                            break;
                        case 6:
                            System.out.println(" sixteen");
                            break;
                        case 7:
                            System.out.println(" seventeen");
                            break;
                        case 8:
                            System.out.println(" eighteen");
                            break;
                        case 9:
                            System.out.println(" nineteen");
                            break;
                    }
                    break;
                case 2:
                    System.out.print(" twenty");
                    break;
                case 3:
                    System.out.print(" thirty");
                    break;
                case 4:
                    System.out.print(" fourty");
                    break;
                case 5:
                    System.out.print(" fifty");
                    break;
                case 6:
                    System.out.print(" sixty");
                    break;
                case 7:
                    System.out.print(" seventy");
                    break;
                case 8:
                    System.out.print(" eighty");
                    break;
                case 9:
                    System.out.print(" ninety");
                    break;
            }
            switch (ones) {
                case 1:
                    System.out.println(" one");
                    break;
                case 2:
                    System.out.println(" two");
                    break;
                case 3:
                    System.out.println(" three");
                    break;
                case 4:
                    System.out.println(" four");
                    break;
                case 5:
                    System.out.println(" five");
                    break;
                case 6:
                    System.out.println(" six");
                    break;
                case 7:
                    System.out.println(" seven");
                    break;
                case 8:
                    System.out.println(" eight");
                    break;
                case 9:
                    System.out.println(" nine");
                    break;
            }
        }
    }
}