import java.util.Scanner;

public class Problem2
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter values:");
    
    Integer x = scan.nextInt();
    Integer y = scan.nextInt();

    Double avg = (double)(x + y) / 2;
    System.out.println("Average of " + x + " and " + y + " is " + avg);
  }
}
