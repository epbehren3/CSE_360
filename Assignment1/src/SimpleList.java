

public class SimpleList {
	// Initialize Public Variables
	int[] myArray;
	int count;

//Constructor for Simple list, creates array, and sets the count
	SimpleList() {
		myArray = new int[10];
		count = 0;
	}

//Adds and index to the beginning of the array and then updates the array and adjusts the count
	public void add(int myInt) {// Element is the information within the array that we are searching for.
		int[] newArray = new int[10];
		if (count == 10) {// If statement checks for array size
			newArray[0] = myInt;
			for (int iterate = 1; iterate < 10; iterate++) {// This is not a magic number.
				// It is stated in the assignment that the array size cannot exceed 10
				newArray[iterate] = myArray[iterate - 1];
			} // For Loop finds the new array and adds the newly created array to it
			for (int iterate = 0; iterate < 10; iterate++) {
				myArray[iterate] = newArray[iterate];
			}
		} else {// Adds like a normal array.
			for (int index = count - 1; index >= 0; index--) {
				myArray[index + 1] = myArray[index];
			}
			myArray[0] = myInt;
			count++;
		}

	}

//Removes the array, shifts arrays down and adjusts the count
	public void remove(int myInt) {// Element is the information within the array that we are searching for.
		int[] newArray = new int[10];
		newArray[0] = myInt;
		// int count =0;
		int myIndex = search(myInt);
		for (int iterate = 0; iterate < myIndex; iterate++) {//Finds the first part of the array
			newArray[iterate] = myArray[iterate];
		}
		for (int iterate = myIndex + 1; iterate < count; iterate++) {//Loads the second part of the array
			newArray[iterate - 1] = myArray[iterate];
		}
		for (int iterate = 0; iterate < count; iterate++) {//Connects the two arrays
			myArray[iterate] = newArray[iterate];
		}
		count--;

	}

//Returns the count 
	public int count() {
		return count;
	}

//Prints the contents of the array
	public String toString() {
		String myString = "";

		for (int index = 0; index < count - 1; index++) {
			myString += myArray[index] + " ";
		}
		myString += myArray[count - 1];
		return myString;// Returns a string containing the contents of the array.

	}

//Searches for a specific Index of the array
	public int search(int element) {// Element is the information within the array that we are searching for.
		int parameter = -1;
		for (int index = 0; index < count; index++) {
			if (myArray[index] == element) {
				parameter = index;
			}

		}
		return parameter;// Returns the index of the array that was found when searched.
	}

}