import java.util.Scanner;
import java.util.Random;
public class MatrixFightingCode
{
  public static Scanner input = new Scanner(System.in);
  public static Random random = new Random();
  public static void main(String[] args)
  {
    do
    {
      String winner = combat();
      displayWinner(winner);
      System.out.println("Game over");
      System.out.println();
      System.out.println("Play again (y/n)");
      String again = keyboard.nextString();
    }while (again.equals("y"));
    
    input.close();
  }
}
