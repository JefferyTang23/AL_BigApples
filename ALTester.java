/*****************************************************
Big Apples (Weichen Liu + Blueface, Jeffery Tang + Mathias, Lior + Toothless)
APCS
L02 -- Well Al B. Sorted
2021-12-10
time spent:  0.5 hours
 *****************************************************/
import java.util.ArrayList;

public class ALTester {
  public static int[] arrayRandInts(int size) {
    int[] randInts = new int[size];
    for (int x = 0 ; x < size ; x += 1) {
      randInts[x] = (int)(Math.random() * 10);
    }
    return randInts;
    }

  public static void main (String[] args) {

  }
}
