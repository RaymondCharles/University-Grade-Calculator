/* ***************************************
  University Grade Calculator

  @author    Raymond Mario Charles
  @StudentID 230133019
  @date      7 November 2023
  @version   1

    A program that asks the user how many of a particular grade (A, B, C etc.) a student achieved
    and works the grade they are consistently achieving and the overall grade they gained.
   ****************************************/

import java. util. Scanner;

public class Main
{
    public static void main(String[] args)
    {
        different_grades();

        return;
    }

    // A method to input strings
    public static String inputString(String message)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);

        return scanner.nextLine();
    }

    // A method to input numbers
    public static int inputNumber(String message)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);

        return Integer.parseInt(scanner.nextLine());
    }

    // A method used to store the number and type of grade that a student can achieve
    public static void different_grades()
    {
        final int no_grades_achieve = 7;
        final String [] list_of_Grades = {"A+", "A", "B", "C", "D", "F", "G"};
        int[] x = new int[list_of_Grades.length];
        int [] y = new int[list_of_Grades.length];

        for (int i=0; i < list_of_Grades.length; i++)
        {
            x[i] = inputNumber("Enter the number of " + list_of_Grades[i] + " grades: ");
            y[i] = x[i];
            if (i > 0)
            {
                y[i] += y[i - 1];
            }

        }

        String finalGrade = "";
        if (y[0] == 8) {
            finalGrade = "A*";
        } else if (y[0] >= 7 && y[1] == 8) {
            finalGrade = "A++";
        } else if (y[0] >= 6 && y[1] == 8) {
            finalGrade = "A+";
        } else if (y[1] >= 6 && y[2] == 8) {
            finalGrade = "A";
        } else if (y[2] >= 6 && y[3] == 8) {
            finalGrade = "B";
        } else if (y[3] >= 6 && y[4] == 8) {
            finalGrade = "C";
        } else if (y[4] >= 6 && y[5] == 8) {
            finalGrade = "D";
        } else if (y[4] >= 6 && y[6] == 8) {
            finalGrade = "F";
        } else if (y[6] == 8) {
            finalGrade = "G";
        } else {
            finalGrade = "Q";
        }

        System.out.println("You consistently gained a " + finalGrade + " grade or better.");
        System.out.println("Therefore you gained a " + finalGrade + " grade overall.");



        return;
    } // END different_grades


}