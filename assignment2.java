/* Filename: assignmennt2
 * Name: Dylan Gill
 * User-name: dylangill1921
 * Date: February 13, 2024
 * Description: This program will allow you to get the lowest/highest day out of all the days
 * and calculate the average temperature for each day.
 * 
 * 
 */
package week6;

import java.util.Scanner;

public class assignment2 {
	public static void main(String[] args) {
		// Create a scanner object for user input
		Scanner scanner = new Scanner(System.in);
		
		// Initialize variables and lists
		int days;
		// Array to store low temperatures
		double[] lowTemp = new double[365];
		// Array to store high temperatures
		double[] highTemp = new double[365];
		// Day with the lowest temperature
		int lowDay = 0;
		// Day with the highest Temperature
		int highDay = 0;
		// Lowest temperature recorded
		double lowest = (int) -45.0;
		// Highest temperature recorded
		double highest = (int) 45.0;
		// Overall average temperature in the amount of days
		double ovrAvg = 0;
		
		// Get user input for the number of days
		System.out.print("Enter the number of days: ");
		while (true) {
			try {
				// Read the number of days from user input
				days = scanner.nextInt();
				// Check if input is between 1 and 365
				if (days < 1 || days > 365) {
					// Display error message for invalid input
					System.out.println("!ERROR! Please enter a number between 1 and 365.");
				} else {
					// Exit loop if input is valid
					break;
				}
			} catch (Exception e) {
				// Display error message if the input was not a number
				System.out.println("!ERROR! Please enter a number.");
				// Clear the input buffer
				scanner.nextLine(); 
			}
		}
		
		// Loop through each day to input temperatures
		for (int i = 0; i < days; i++) {
			// Prompt the user for the low temperature of the day
			System.out.print("\nEnter the low tempature of day " + (i + 1) + ": ");
			while (true) {
				try {
					// Read low temperature from user input
					lowTemp[i] = scanner.nextInt();
					// Check if input is between -45.0 to 45.0
					if (lowTemp[i] < -45.0 || lowTemp[i] > 45.0) {
						// Display error message for Invalid input
						System.out.println("!ERROR! Please enter a number between -45.0 and 45.0.");
					} else {
						// Exit the loop if input is valid
						break;
					}
				} catch (Exception e) {
					// Display error message if the input was not a number
					System.out.println("!ERROR! Please enter in a number.");
					// Clear the input buffer
					scanner.nextLine();
				}
			}
			
			// Prompt the user for the high temperature for the day
			System.out.print("Enter the high tempature of day " + (i + 1) + ": ");
			while (true) {
				try {
					// Read high temperature from user input
					highTemp[i] = scanner.nextInt();
					// Check if input is between -45.0 to 45.0
					if (highTemp[i] < -45.0 || highTemp[i] > 45.0) {
						// Display error message for Invalid input
						System.out.println("!ERROR! Please enter a number between -450 and 450.");
					} else {
						// Exit the loop if input is valid
						break;
					}
				} catch (Exception e) {
					// Display error message if the input was not a number
					System.out.println("!ERROR! Please enter in a number.");
					// Clear the input buffer
					scanner.nextLine();
				}
			}
			
			// Calculate the daily average temperature
			double dayAvg = (lowTemp[i] + highTemp[i]) / 2;
			// Display the average temperature
			System.out.printf("\nThe average tempature of day %d is %.2f\n", (i + 1), dayAvg);
			
			// Check if current daily average temperature is lower than the lowest recorded
			if (dayAvg < lowest) {
				// Update the lowest temperature
				lowest = dayAvg;
				// Update day with the lowest temperature
				lowDay = i + 1;
			}
			
			// Check if current daily average temperature is higher than the highest recorded
			if (dayAvg > highest) {
				// Update highest temperature
				highest = dayAvg;
				// Update day with the highest temperature
				highDay = i + 1;
			}
			
			// Add the daily average temperatures for overall average
				ovrAvg += dayAvg;
		}
		// Check if valid data was entered
		if (days > 0) {
			// Calculate overall average temperature
			ovrAvg /= days;
			// Display overall temperature
			System.out.printf("The overall average tempature is %.2f\n" + ovrAvg);
			// Display day with the lowest temperature
			System.out.println("The day with the lowest tempature is day " + lowDay);
			// Display lowest temperature
			System.out.printf("The lowest tempature is %.2f\n" + lowest);
			// Display day with the highest temperature
			System.out.println("The day with the highest tempature is day " + highDay);
			// Display highest temperature 
			System.out.printf("The highest tempature is %.2f\n" + highest);
		} else {
			// Display error message if no valid data was entered
			System.out.println("!ERROR! Please enter valid data.");
		}	
		
		// Close the Scanner
		scanner.close();
	}
}