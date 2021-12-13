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

public class OrderedArrayList {

  private ArrayList<Integer> _data;

  public OrderedArrayList() {
    _data = new ArrayList<Integer>();
  }

  public String toString() { // returns the list in String form
    return _data.toString();
  }

  public int size() { // returns the size of the list
    return _data.size();
  }

  public Integer get(int index) { // returns the element at the specified index
    return _data.get(index);
  }

  public Integer remove(int index) { // removes element from list at specific index
    return _data.remove(index);
  }

  public void addLinear(Integer newVal) { // an add method that always keeps the list sorted
    for( int i = 0; i < _data.size(); i++ ) {
  	    if ( newVal.compareTo( _data.get(i) ) < 0 ) {
  	  	_data.add( i, newVal );
  	  	return;
  	    }
    	}
    	_data.add( newVal );
  }

}
