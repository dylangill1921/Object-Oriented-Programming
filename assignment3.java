package week8;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class assignment3 {

    private static class datamembers {

        // Properties
        private int vacId;
        private String vacN;
        private float vacC;
        private int vacU;
        private Date vacD;

        // Default constructor
        public datamembers() {
            vacId = 0;
            vacN = "";
            vacC = 0.0f;
            vacU = 0;
            vacD = new Date();
        }

        // Parameterized constructor
        public datamembers(int id, String name, float cost, int units, Date expiry) {
            vacId = id;
            vacN = name;
            vacC = cost;
            vacU = units;
            vacD = expiry;
        }

        // Set and Get the properties
        public void setVacId(int id) {
            this.vacId = id;
        }

        public int getVacId() {
            return this.vacId;
        }

        public void setVacN(String name) {
            this.vacN = name;
        }

        public String getVacN() {
            return this.vacN;
        }

        public void setVacC(float cost) {
            vacC = cost;
        }

        public float getVacC() {
            return this.vacC;
        }

        public void setVacU(int units) {
            vacU = units;
        }

        public int getVacU() {
            return this.vacU;
        }

        public void setVacD(Date expiry) {
            vacD = expiry;
        }

        public Date getVacD() {
            return this.vacD;
        }

        // Function to display the output
        public void Output(boolean x) {
            if (x == true) {
                System.out.printf("%-3d| %-21s| %-9.2f| %-8d| %s%n", vacId, vacN, vacC, vacU, vacD.toString(),
                        "No special instructions");
            } else {
                System.out.println("SKU: " + vacId);
                System.out.println("Vaccine Name: " + vacN);
                System.out.println("Unit Cost: " + vacC);
                System.out.println("Quantity on hand: " + vacU);
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String formattedExpiryDate = dateFormat.format(vacD);
                System.out.println("Expiry Date: " + formattedExpiryDate);
                System.out.println("Special Instructions: No special instructions");
            }
        }
    }

    public static void main(String[] args) {

        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Creating a list to store vaccine information
        ArrayList<datamembers> vaccines = new ArrayList<>();
        
        // Pre vaccine information
        vaccines.add(new datamembers(1, "Morpho", 87, 100, new Date()));
        vaccines.add(new datamembers(2, "Heso", 65, 250, new Date()));

        // Give the user a prompt to input the information
        System.out.println("\nEnter details for a new Vaccine:");
        System.out.println("Enter Vaccine Id: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Name of Vaccine: ");
        String name = scanner.nextLine();

        System.out.println("Enter the Cost of Vaccine: ");
        float cost = scanner.nextFloat();

        scanner.nextLine();

        System.out.println("Enter Quantity on Hand: ");
        int units = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter Expiry Date (YYYY-MM-DD): ");
        String expiryDateInput = scanner.nextLine();

        // Parse the input string into a Date object found this online so I'm using it found on stack overflow for the date
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date expiryDate = null;
        try {
        	expiryDate = dateFormat.parse(expiryDateInput);
        } catch (ParseException e) {
         System.out.println("!ERROR! Please enter the date in YYYY-MM-DD format.");
        }

        // Create a new vaccine instance with user input
        datamembers newVac = new datamembers(id, name, cost, units, expiryDate);

        // Add the new vaccine to the list
       
        
        // Display new vaccine
        System.out.println("\nDetails for the new vaccine:");
        newVac.Output(true);
        
        
        
        // Close scanner
        scanner.close();
    }
}
