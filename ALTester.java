/*****************************************************
Big Apples (Weichen Liu + Blueface, Jeffery Tang + Mathias, Lior + Toothless)
APCS
L02 -- Well Al B. Sorted
2021-12-10
time spent:  1.0 hours

DISCO:
- It is helpful to override the toString method to print the array list because it helps us tell if it is sorted or not.
- We did not need to change the remove method because it does not make the list not sorted.

QCC:
- How else can we manipulate a list?

 *****************************************************/
import java.util.ArrayList;

public class ALTester {
  public ArrayList<Integer> kolf;

  public String toString() { // Returns the list as a String
    return kolf.toString();
  }

  public ALTester() { // Creates the list
    kolf = new ArrayList<Integer>(23);
    for (int counter = 0; counter < 23; counter++){
      kolf.add((int)(Math.random() * 50));
    }
  }

  public boolean isSorted() { // Checks if the list is sorted or not
    for (int i = 0; i < kolf.size(); i++) {
      if ((kolf.get(i).compareTo(kolf.get(i+1))) > 0){
        return false;
      }
    }
    return true;
  }

  public static void main (String[] args) {
    System.out.println("\nPOPULATING AN ARRAY LIST:");
    ALTester jeff = new ALTester();
    System.out.println(jeff.toString()); // Prints the randomly populated array list
    System.out.println("CHECKING IF THAT ARRAY LIST IS SORTED:");
    System.out.println(jeff.isSorted()); // Should print false most of the time


    System.out.println("\nTESTING OrderedArrayList:");
    OrderedArrayList hwuan = new OrderedArrayList();
    System.out.println("TESTING addLinear() from OrderedArrayList:");
    hwuan.addLinear(5);
    hwuan.addLinear(6);
    hwuan.addLinear(1);
    hwuan.addLinear(23);
    System.out.println(hwuan.toString()); // Should print [1, 5, 6, 23]
    System.out.println("TESTING get() from OrderedArrayList:");
    System.out.println(hwuan.get(2)); // Should print 6
    System.out.println("TESTING remove() from OrderedArrayList:");
    hwuan.remove(2);
    System.out.println(hwuan.toString()); // Should print [1, 5, 23]

    OrderedArrayList Franz = new OrderedArrayList();
    // testing linear search
    for( int i = 0; i < 15; i++ )
      Franz.addLinear( (int)( 50 * Math.random() ) );
    System.out.println("Populating another OrderedArrayList with random integers:");
    System.out.println( Franz );
    }

}
