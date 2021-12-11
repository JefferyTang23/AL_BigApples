/*****************************************************
Big Apples (Weichen Liu + Blueface, Jeffery Tang + Mathias, Lior + Toothless)
APCS
L02 -- Well Al B. Sorted
2021-12-10
time spent:  0.5 hours

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
    ALTester jeff = new ALTester(); 
    System.out.println(jeff.toString());
    System.out.println(jeff.isSorted());
    
    OrderedArrayList hwuan = new OrderedArrayList();
    hwuan.add(5); 
    hwuan.add(6);
    hwuan.add(1);
    hwuan.add(23);
    hwuan.remove(2);
    System.out.println(hwuan.toString());
    
    }

}
