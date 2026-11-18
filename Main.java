import java.util.Scanner;

public class Main
{
  static int counter = 1;
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Let's Play: Tower of Hanoi, created by French mathematician Édouard Lucas in 1883.\n\nHow many disks are you transferring between the rods?");
    int disks = scan.nextInt();
    Main.tower(disks, "A", "B", "C");
  }
  public static void tower(int n, String start, String temp, String end)
  {
    if (n == 0)
    {
      return;
    }
    if (n == 1)
    {
      System.out.println(counter + "Move " + start + " to " + end);
      counter++;
    }
    else
    {
      Main.tower(n - 1, start, end, temp);
      System.out.println(counter + "Move " + start + " to " + end);
      counter++;
      Main.tower(n - 1, temp, start, end);
    }
  }
}
