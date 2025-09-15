// NAME : Michael Xendzov
// GROUP : APCS - A 6th Hour
// PROBLEM ID : 2.8 Distance Formula
// PROBLEM DESCRIPTION : Prompt the user for coordinate points
// : and display the distance
// LAST MODIFIED DATE : September 11th 2025
// SOURCES I USED : Java Book
// PEOPLE I HELPED : Conner Chan, Adam Sagin, Shuler Wiegerink
// PEOPLE WHO HELPED ME : Conner Chan, Adam Sagin, Shuler Wiegerink
import java.util.Scanner;
public class DistanceCalc
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
// signature
        System.out.print("Michael Xendzov\nAPCS-A\n2.8 Distance Formula Program\n\n");
// prompt the user for number of runs
                System.out.print("Enter the number of runs: ");
        int NumRuns = sc.nextInt();
        sc.nextLine();
// set delimiter which splits on commas, parentheses, and spaces
        sc.useDelimiter("[(),\\s]+");
// loop for the number of runs
        for (int i = 1; i <= NumRuns; i++)
        {
            System.out.print("\nInput the numbers in (x,y) ");
// give each number a corresponding variable
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
// calculate distance between the points and output it
            double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 -
                    y1, 2));
            System.out.printf("\nThe distance between the two points is " +
                    distance);
        }
        sc.close();
    }
}