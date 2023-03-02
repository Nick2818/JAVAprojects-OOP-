import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class CustomIntegerArrayListTest {

	@Test
	void testGetArrayList() {
		
		//create a new empty CustomIntegerArrayList
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(0, 5);
		arr1.add(1, 5);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(0, 5);
		lst1.add(1, 5);
		assertEquals(lst1, arr1.getArrayList());

		ArrayList<Integer> arr4Elements = new ArrayList<Integer>();
		arr4Elements.add(100);
		arr4Elements.add(200);
		arr4Elements.add(500);
		
		//create a new CustomIntegerArrayList with the elements in the given ArrayList
		CustomIntegerArrayList arr4 = new CustomIntegerArrayList(arr4Elements);

		ArrayList<Integer> lst4 = new ArrayList<Integer>();
		lst4.add(100);
		lst4.add(200);
		lst4.add(500);

		assertEquals(lst4, arr4.getArrayList());
		
		// TODO write at least 3 additional test cases 

        assertNotEquals(lst1, arr4.getArrayList());

        ArrayList<Integer> lst5 = new ArrayList<Integer>();
		lst5.add(100);
		lst5.add(200);
		lst5.add(500);
        lst5.add(600);

        assertNotEquals(lst5, arr4.getArrayList());

        ArrayList<Integer> arr3Elements = new ArrayList<Integer>();
		arr3Elements.add(10);
		arr3Elements.add(20);
		arr3Elements.add(50);
		
		//create a new CustomIntegerArrayList with the elements in the given ArrayList
		CustomIntegerArrayList arr3 = new CustomIntegerArrayList(arr3Elements);

		ArrayList<Integer> lst3 = new ArrayList<Integer>();
		lst3.add(10);
		lst3.add(20);
		lst3.add(50);

		assertEquals(lst3, arr3.getArrayList());
	}

	@Test
	void testGet() {
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(0, 5);
		arr1.add(1, 5);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(0, 5);
		lst1.add(1, 5);

		assertEquals((int) lst1.get(0), (int) arr1.get(0));
		assertEquals((int) lst1.get(1), (int) arr1.get(1));
		assertEquals((int) lst1.get(2), (int) arr1.get(2));

		// TODO write at least 3 additional test cases 

        CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
		arr2.add(2);
		arr2.add(0, 8);
		arr2.add(1, 8);
		
		ArrayList<Integer> lst2 = new ArrayList<Integer>();
		lst2.add(2);
		lst2.add(0, 8);
		lst2.add(1, 8);

		assertEquals((int) lst2.get(0), (int) arr2.get(0));
		assertEquals((int) lst2.get(1), (int) arr2.get(1));
		assertEquals((int) lst2.get(2), (int) arr2.get(2));
	}

	@Test
	void testAddInt() {
		
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(3);
		lst1.add(4);

		assertEquals((int) lst1.get(0), (int) arr1.get(0));
		assertEquals((int) lst1.get(1), (int) arr1.get(1));
		assertEquals((int) lst1.get(2), (int) arr1.get(2));

		// TODO write at least 3 additional test cases 

        CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
		arr2.add(23);
		arr2.add(35);
		arr2.add(41);
		
		ArrayList<Integer> lst2 = new ArrayList<Integer>();
		lst2.add(23);
		lst2.add(35);
		lst2.add(41);

		assertEquals((int) lst2.get(0), (int) arr2.get(0));
		assertEquals((int) lst2.get(1), (int) arr2.get(1));
		assertEquals((int) lst2.get(2), (int) arr2.get(2));
	}

	@Test
	void testAddIntInt() {
		
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(0, 2);
		arr1.add(0, 3);
		arr1.add(0, 4);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(0, 2);
		lst1.add(0, 3);
		lst1.add(0, 4);

		assertEquals((int) lst1.get(0), (int) arr1.get(0));
		assertEquals((int) lst1.get(1), (int) arr1.get(1));
		assertEquals((int) lst1.get(2), (int) arr1.get(2));

		// TODO write at least 3 additional test cases 	

        CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
		arr2.add(0, 5);
		arr2.add(0, 37);
		arr2.add(0, 42);
		
		ArrayList<Integer> lst2 = new ArrayList<Integer>();
		lst2.add(0, 5);
		lst2.add(0, 37);
		lst2.add(0, 42);

		assertEquals((int) lst2.get(0), (int) arr2.get(0));
		assertEquals((int) lst2.get(1), (int) arr2.get(1));
		assertEquals((int) lst2.get(2), (int) arr2.get(2));
	}

	@Test
	void testRemoveInt() {

		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(0, 2);
		arr1.add(0, 3);
		arr1.add(0, 4);
		arr1.remove(0);
		arr1.remove(1);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(0, 2);
		lst1.add(0, 3);
		lst1.add(0, 4);
		lst1.remove(0);
		lst1.remove(1);
		
		assertEquals((int) lst1.get(0), (int) arr1.get(0));

		// TODO write at least 3 additional test cases 


        CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
		arr2.add(0, 7);
		arr2.add(0, 8);
		arr2.add(0, 9);
		arr2.remove(0);
		arr2.remove(1);
		
		ArrayList<Integer> lst2 = new ArrayList<Integer>();
		lst2.add(0, 7);
		lst2.add(0, 8);
		lst2.add(0, 9);
		lst2.remove(0);
		lst2.remove(1);
		
		assertEquals((int) lst2.get(0), (int) arr2.get(0));

        CustomIntegerArrayList arr3 = new CustomIntegerArrayList();
		arr3.add(0, 71);
		arr3.add(0, 82);
		arr3.add(0, 93);
		arr3.remove(0);
		arr3.remove(1);
		
		ArrayList<Integer> lst3 = new ArrayList<Integer>();
		lst3.add(0, 71);
		lst3.add(0, 82);
		lst3.add(0, 93);
		lst3.remove(0);
		lst3.remove(1);
		
		assertEquals((int) lst3.get(0), (int) arr3.get(0));

         CustomIntegerArrayList arr4 = new CustomIntegerArrayList();
		arr4.add(0, 715);
		arr4.add(0, 825);
		arr4.add(0, 935);
		arr4.remove(0);
		arr4.remove(1);
		
		ArrayList<Integer> lst4 = new ArrayList<Integer>();
		lst4.add(0, 715);
		lst4.add(0, 825);
		lst4.add(0, 935);
		lst4.remove(0);
		lst4.remove(1);
		
		assertEquals((int) lst4.get(0), (int) arr4.get(0));

	}

	@Test
	void testRemoveIntInt() {

		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(0, 2);
		arr1.add(0, 3);
		arr1.add(0, 3);
		arr1.add(0, 3);
		arr1.add(0, 3);
		arr1.add(0, 4);
		arr1.remove(3, 3);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(0, 2);
		lst1.add(0, 3);
		lst1.add(0, 4);

		assertEquals(lst1, arr1.getArrayList());

		// TODO write at least 3 additional test cases 

        CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
		arr2.add(0, 21);
		arr2.add(0, 31);
		arr2.add(0, 31);
		arr2.add(0, 31);
		arr2.add(0, 31);
		arr2.add(0, 44);
		arr2.remove(3, 31);
		
		ArrayList<Integer> lst2 = new ArrayList<Integer>();
		lst2.add(0, 21);
		lst2.add(0, 31);
        //lst2.add(0, 31);
		lst2.add(0, 44);

		assertEquals(lst2, arr2.getArrayList());

        CustomIntegerArrayList arr3 = new CustomIntegerArrayList();
		arr3.add(0, 22);
		arr3.add(0, 32);
		arr3.add(0, 32);
		arr3.add(0, 32);
		arr3.add(0, 32);
		arr3.add(0, 42);
		arr3.remove(3, 32);
		
		ArrayList<Integer> lst3 = new ArrayList<Integer>();
		lst3.add(0, 22);
		lst3.add(0, 32);
		lst3.add(0, 42);

		assertEquals(lst3, arr3.getArrayList());

        CustomIntegerArrayList arr4 = new CustomIntegerArrayList();
		arr4.add(0, 25);
		arr4.add(0, 35);
		arr4.add(0, 35);
		arr4.add(0, 35);
		arr4.add(0, 35);
		arr4.add(0, 47);
		arr4.remove(3, 35);
		
		ArrayList<Integer> lst4 = new ArrayList<Integer>();
		lst4.add(0, 25);
		lst4.add(0, 35);
		lst4.add(0, 47);

		assertEquals(lst4, arr4.getArrayList());

	}


	@Test
	void testSpliceIntInt() {

		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		arr1.add(5);
		arr1.add(6);
		arr1.splice(3, 2);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(3);
		lst1.add(4);

		assertEquals((int) lst1.get(0), (int) arr1.get(0));
		assertEquals((int) lst1.get(1), (int) arr1.get(1));
		assertEquals((int) lst1.get(2), (int) arr1.get(2));

		// TODO write at least 3 additional test cases 

        CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
		arr2.add(22);
		arr2.add(32);
		arr2.add(42);
		arr2.add(52);
		arr2.add(62);
		arr2.splice(3, 2);
		
		ArrayList<Integer> lst2 = new ArrayList<Integer>();
		lst2.add(22);
		lst2.add(32);
		lst2.add(42);

		assertEquals((int) lst2.get(0), (int) arr2.get(0));
		assertEquals((int) lst2.get(1), (int) arr2.get(1));
		assertEquals((int) lst2.get(2), (int) arr2.get(2));
	}

	@Test
	void testSpliceIntIntIntArray() {
		
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		arr1.add(5);
		arr1.add(6);
		arr1.splice(3, 1, new int[] { 4, 5 });
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(3);
		lst1.add(4);
		lst1.add(4);
		lst1.add(5);
		lst1.add(6);
		
		assertEquals(lst1, arr1.getArrayList());

		// TODO write at least 3 additional test cases 

        ArrayList<Integer> lst2 = new ArrayList<Integer>();
		lst2.add(2);
		lst2.add(3);
		lst2.add(4);
		lst2.add(4);
		lst2.add(5);
		lst2.add(6);
        lst2.add(7);

        assertNotEquals(lst2, arr1.getArrayList());

        ArrayList<Integer> lst3 = new ArrayList<Integer>();
		lst3.add(2);
		lst3.add(3);
		lst3.add(4);
		lst3.add(4);
		lst3.add(5);
		lst3.add(6);
        lst3.add(7);
        lst3.add(7777);

        assertNotEquals(lst2, arr1.getArrayList());

        ArrayList<Integer> lst4 = new ArrayList<Integer>();
		lst4.add(2);
		lst4.add(3);
		lst4.add(4);
		lst4.add(4);
		lst4.add(5);
		lst4.add(6);
        lst4.add(7);
        lst4.add(777);
        lst4.add(7777);

        assertNotEquals(lst4, arr1.getArrayList());
	}

}