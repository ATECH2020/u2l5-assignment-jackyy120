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
      double distanceFrom;

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

      //two geoLocation objects
      GeoLocation geo = new GeoLocation(startLat, startLong);
      GeoLocation other = new GeoLocation(endLat, endLong);

      //distance between two locations
      System.out.print("The distance is "+ geo.distanceFrom(other) +" miles.");
      
    }
}