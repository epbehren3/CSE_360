/*Simple List Test:
 * Author: Evan Behrendt
 * Class ID:149
 * Assignment 1
 * 
 *  This script was created to test the methods created in the Simple list test.
 *
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cse360assign2.SimpleList;

public class SimpleListTest {//Basic test to make sure the list compiles correctly.

	@Test
	void testSimpleList() {
		SimpleList myList = new SimpleList();
		myList.add(6);
		myList.add(7);
		myList.add(8);
		assertNotNull(myList);

	}

	@Test
	void TEST_ADD_REMOVE_TOSTRING() {//Tests the functionality of add, remove, and toString. toString is also used in
		//other test in this file
		SimpleList myList = new SimpleList();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5);
		myList.add(6);
		myList.add(7);
		myList.add(8);
		myList.add(9);
		myList.add(10);
		myList.add(27);
		myList.remove(4);
		myList.remove(2);
		myList.remove(27);
		String myString1 = myList.toString();
		System.out.println("myString (ADD_SUB_REM): " + myString1);
	}

	@Test
	void testCount_APPEND_FIRST_SIZE() {//Tests the count function with a 9 total units. 
		SimpleList myList = new SimpleList();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5);
		myList.add(6);
		myList.add(7);
		myList.add(8);
		myList.add(9);
		myList.add(10);
		myList.add(25);
		myList.add(10);
		myList.append(23);
		int temp = myList.count();
		int myString1=myList.size();
		int myString2 = myList.first();
		assertEquals(13, temp);
		assertEquals(23, myString2);
		assertEquals(2, myString1);

	}

	@Test
	void testSearch() {//Tests the functionality of a search method. 
		SimpleList myList = new SimpleList();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5);
		myList.add(6);
		myList.add(7);
		myList.add(8);
		myList.add(9);
		myList.add(10);
		int temp = myList.search(4);
		assertEquals(6, temp);
	}

	@Test
	void testOutOfBounds() {//Tests for theoretical overload.
		SimpleList myList = new SimpleList();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5);
		myList.add(6);
		myList.add(7);
		myList.add(8);
		myList.add(9);
		myList.add(10);
		myList.add(27);
		myList.append(17);
		
		String myString1 = myList.toString();
		assertEquals("27 10 9 8 7 6 5 4 3 2 1 17", myString1);
		
	}
}
