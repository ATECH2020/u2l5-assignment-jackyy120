import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
       
      //declare vars
      double startLat;
      double startLong;
      double endLat;
      double endLong;

      Scanner scanner = new Scanner(System.in);
      //initialize vars
      System.out.print("Enter the latitude of the starting location: ");
      startLat = scanner.nextDouble();

      System.out.print("Enter the longitude of the starting location: ");
      startLong = scanner.nextDouble();

      System.out.print("Enter the latitude of the ending location: ");
      endLat = scanner.nextDouble();

      System.out.print("Enter the longitude of the ending location: ");
      endLong = scanner.nextDouble();

      //distance between two locations
      SYstem.out.print("The distance is "+  +" miles.");
      
    }
}