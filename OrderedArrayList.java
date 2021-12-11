/*****************************************************
Big Apples (Weichen Liu + Blueface, Jeffery Tang + Mathias, Lior + Toothless)
APCS
L02 -- Well Al B. Sorted
2021-12-10
time spent:  0.5 hours
 *****************************************************/

import java.util.ArrayList;

public class OrderedArrayList {
  
  private ArrayList<Integer> _data; 
  
  public OrderedArrayList() {
    _data = new ArrayList<Integer>(); 
  }
  
  public String toString() {
    return _data.toString(); 
  }
  
  public int size() {
    return _data.size(); 
  }
  
  public Integer get(int index) {
    return _data.get(index); 
  }
  
  public Integer remove(int index) {
    return _data.remove(index); 
  }
  
  public void add(Integer newVal) {
    for( int i = 0; i < _data.size(); i++ ) {
  	    if ( newVal.compareTo( _data.get(i) ) < 0 ) { 
  	  	_data.add( i, newVal );
  	  	return; 
  	    }
    	}
    	_data.add( newVal ); 
  }
  
}
