import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {


        int[] dataPoints = new int[100];

        Random random = new Random();
        for (int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = random.nextInt(100) + 1;
        }


        System.out.println("Randomly initialized dataPoints array:");
        for (int i = 0; i < dataPoints.length; i++)
        {
            System.out.print(dataPoints[i] + " ");
        }



        System.out.println("DataPoints values: ");
        for (int i = 0; i < dataPoints.length; i++)
        {
            System.out.printf("%d", dataPoints[i]);
            if (i < dataPoints.length - 1)
            {
                System.out.print(" | ");
            }
        }

        int sum = 0;
        for (int i = 0; i < dataPoints.length; i++)
        {
            sum += dataPoints[i];
        }


        double average = (double) sum / dataPoints.length;


        System.out.println("Calculating sum and average of the dataPoints array:");
        System.out.printf("The sum of the random array dataPoints is: %d%n", sum);
        System.out.printf("The average of the random array dataPoints is: %.2f%n", average);

        Scanner in = new Scanner(System.in);
        int userInput = SafeInput.getRangedInt(in,"Please enter an integer between 1 and 100: ", 1, 100);
        System.out.println("You entered: " + userInput);


        int count = 0;
        for (int i = 0; i < dataPoints.length; i++)
        {
            if (dataPoints[i] == userInput)
            {
                count++;
            }
        }


        System.out.printf("The value %d was found %d times in the dataPoints array.%n", userInput, count);


        int userValue = SafeInput.getRangedInt(in,"Enter an integer between 1 and 100: ", 1, 100);


        int foundIndex = -1;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue) {
                foundIndex = i;
                break;
            }
        }


        if (foundIndex != -1) {
            System.out.printf("The value %d was found at array index %d.%n", userValue, foundIndex);
        } else {
            System.out.printf("The value %d was not found in the dataPoints array.%n", userValue);
        }


        int min = dataPoints[0];
        int max = dataPoints[0];


        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }
            if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
        }


        System.out.printf("The minimum value in the dataPoints array is: %d%n", min);
        System.out.printf("The maximum value in the dataPoints array is: %d%n", max);

        double[] values = {23.5, 45.2, 12.8, 67.4, 89.9};


        double mainAverage = getAverage(values);


        System.out.printf("The average of the array is: %.2f%n", mainAverage);
    }

    public static double getAverage(double[] values) {
        double sum = 0.0;
        for (double value : values) {
            sum += value;
        }
        return sum / values.length;
    }
}