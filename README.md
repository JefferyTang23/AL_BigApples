# AL_BigApples
* Big Apples: Weichen Liu + Blueface, Jeffery Tang + Mathias, Lior Polischouk + Toothless

## ALTester
* The constructor creates an ArrayList populated with 23 Integers. The toString method is run on the ArrayList to check if the list is sorted or not. isSorted() returns true if list is sorted and false if it is not sorted.
* An object of class OrderedArrayList is also created. Integers are either added or removed from the instance variable that contains the array list in the object to check for functionality.

## OrderedArrayList
* Constructor: creates new ArrayList<Integer> object _data
* toString(): returns the list in String form using the default toString() method from ArrayList
* size(): returns the size of the list using default size() method from ArrayList
* get(): returns the element at the specified index using default get() method from ArrayList
* remove(): removes element from list at specific index using default remove() method from ArrayList
* addLinear(): adds inputted element to the list depending on its value. If the inputted element has a smaller value than the element on the list, then the inputted value is added to the index of that element on the list. If the inputted element has a value greater than all of the elements on the list, it is simply added to the end of the list. A for-loop is used to compare the value of the inputted element to the elements on the list. Ex. if inputted value is 2 and the list is [0,1], the 2 would go after the 1.
