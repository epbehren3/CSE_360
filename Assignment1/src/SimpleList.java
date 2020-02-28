/*Simple List:
 * Author: Evan Behrendt
 * Class ID:149
 * Assignment 1
 * 
 *This Class is made to make an array, and add, remove, and find information about it such as the toString, 
 *length, Array count, and Specific elements in the array. 
 *
 */

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
		if (count == myArray.length) {// If statement checks for array size
			int newSize = (int) (myArray.length * 1.5);// Multiplies the length of the array by 1.5 and then stores it
			int[] newArray = new int[newSize];// Puts the new variable to create a new array.
			for (int iterator = 0; iterator < count; iterator++) {
				newArray[iterator] = myArray[iterator];
			}
			myArray = newArray;
			for (int index = count - 1; index >= 0; index--) {
				myArray[index + 1] = myArray[index];
			}
			myArray[0] = myInt;
			count++;
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
		int[] newArray = new int[myArray.length];
		// newArray[0] = myInt;
		// int count =0;
		int myIndex = search(myInt);
		for (int iterate = 0; iterate < myIndex; iterate++) {// Finds the first part of the array
			newArray[iterate] = myArray[iterate];
		}
		for (int iterate = myIndex + 1; iterate < count; iterate++) {// Loads the second part of the array
			newArray[iterate - 1] = myArray[iterate];
		}
		for (int iterate = 0; iterate < count; iterate++) {// Connects the two arrays
			myArray[iterate] = newArray[iterate];
		}
		count--;
		if (myArray.length - count > (int) (myArray.length / 4)) {
			int[] smallArray = new int[(int) (myArray.length * .75)];
			for (int index = 0; index < count; index++) {
				smallArray[index] = myArray[index];
			}
			myArray = smallArray;
		}

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

	public void append(int myInt) {// appends element to the end of the array.
		int[] newArray;
		if (count == myArray.length) {
			int newSize = (int) (myArray.length * 1.5);// Multiplies the length of the array by 1.5 and then stores it
			newArray = new int[newSize];// Puts the new variable to create a new array.
			for (int iterator = 0; iterator < count; iterator++) {// Iterates through the code
				newArray[iterator] = myArray[iterator];
				newArray[count] = myInt;// New int
				myArray = newArray;

			}
		} else {
			myArray[count] = myInt;
		}
		count++;

	}

	public int first() {// Returns the first element in the array
		return myArray[count - 1];// Returns the last element in the array
	}

	public int size() {
		int counter = 0;// Sets the counter
		for (int index = count; index < myArray.length; index++) {// Sets the count to 0 and returns the size of the
																	// array
			counter++;
		}
		return counter;// Retursn the counter
	}

}