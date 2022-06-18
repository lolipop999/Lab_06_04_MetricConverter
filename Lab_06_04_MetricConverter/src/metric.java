import java.util.Scanner;

public class metric {
    public static void main(String[] args) {
        int meters = 0;
        double miles = 0;
        double feet = 0;
        double inches = 0;
        String trash = "";
        boolean notInteger = true;

        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Input an integer length in meters: ");

            if (in.hasNextInt())
            {
                meters = in.nextInt();
                in.nextLine();

                // test if input is negative

                if (meters < 0)
                {
                    System.out.println("You cannot have negative length.");
                    notInteger = true;
                }
                else
                {
                    notInteger = false;
                }
            }

            // test is input is not int
            else
            {
                trash = in.nextLine();
                System.out.println("Please input an integer: " + trash);
                notInteger = true;
            }
        }
        while (notInteger);

        miles = meters/1609;
        feet = meters/3.281;
        inches = meters * 39.37;

        System.out.printf("%-10s%-15d\n", "Meters:", meters);
        System.out.printf("%-10s%-15.1f\n", "Miles:", miles);
        System.out.printf("%-10s%-15.3f\n", "Feet:", feet);
        System.out.printf("%-10s%-15.2f\n", "Inches:", inches);




    }
}
