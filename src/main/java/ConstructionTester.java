import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
      //declare variables
        double taxRate; 
        int numBoards;
        int numWindows;

        Scanner scanner = new Scanner(System.in);
        Construction myConstruction = new Construction(8.0,11.0,taxRate);

        //prompt user and initialize vars
        System.out.println("Enter the sales tax rate: ");
        taxRate = scanner.nextDouble();

        System.out.println("How many boards do you need?");
        numBoards = scanner.nextInt();

        System.out.println("How many windows do you need?");
        numWindows = scanner.nextInt();

        //finding the total
        double total = (numBoards * 8) + (numWindows * 11); 
        System.out.println("Total: "+total);

        //finding the grandTotal
        System.out.print("Grand Total: ");
    }
}
