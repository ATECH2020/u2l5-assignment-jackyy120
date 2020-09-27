import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
      //declare variables
        double taxRate; 
        int numBoards;
        int numWindows;
        double lumberCost = 8;
        double windowCost = 11;

        Scanner scanner = new Scanner(System.in);
        
        //prompt user and initialize vars
        System.out.println("Enter the sales tax rate: ");
        taxRate = scanner.nextDouble();

        System.out.println("How many boards do you need?");
        numBoards = scanner.nextInt();

        System.out.println("How many windows do you need?");
        numWindows = scanner.nextInt();

        //build new construction
        Construction builder = new Construction(lumberCost, windowCost, taxRate);
        
        //finding the total
        double total = builder.lumberCost(numBoards) + builder.windowCost(numWindows); 
        System.out.println("Total: "+ total);

        //finding the grandTotal
        System.out.print("Grand Total: " + builder.grandTotal(total));
    }
}
