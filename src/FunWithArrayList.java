/*
 * Try the following exercises:
 * 1. Write a Java program to create a new array list to hold colors.
 *    Add at least 3 colors (string) to the array list and print out all its values.
 * 2. Using the array list created above, print out the value at index 1.
 * 3. Using the array list above, prompt the user for one new color, and add that
 *    color to the array list.
 * 4. Using the array list, continue prompting the user for colors until
 *    they type in "Q" or "q" to quit. Each time the user enters a color,
 *    add that to the array list.
 *    Print out the list at the end.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FunWithArrayList {

    public static void main(String[] args){

        ArrayList<String> colorAL = new ArrayList<String>();

        colorAL.add("red");
        colorAL.add("white");
        colorAL.add("blue");

        // print out the value of the array at index 1
        System.out.println("1st item of the array is " + colorAL.get(1));

        // get a color from the user
        Scanner keyboard = new Scanner(System.in);
        boolean flag = true;
        String newColor;

        do {
            System.out.println("Enter a color ('Q' or 'q' to quit):");
            newColor = keyboard.nextLine();

            if (newColor.compareToIgnoreCase("Q") != 0)
                colorAL.add(newColor);
            else
                flag = false;

        } while (flag);

        // print out the content of the array
        System.out.println("\nColors are:");
        for (String tmp : colorAL)
            System.out.println(tmp);

    }
}
