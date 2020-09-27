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
      System.out.println("Enter the latitue of the starting location: ");
      startLat = scanner.nextDouble();

      System.out.println("Enter the longitude of the startinig location: ");
      startLong = Scanner.nextDouble();

      System.out.println("Enter the latitude of the ending location: ");
      endLat = scanner.nextDouble();

      System.out.println("Enter the longitidue of the ending location: ");
      endLong = scanner.nextDouble();



      
    }
}