package bridgelabz.LinkedListOperations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class LinkedListTest 
{
	LinkedList linkedList; 
    /**
     * Rigorous Test :-)
     */
	
	@Before
	public void init() {
		linkedList = new LinkedList();
	}
	
	
    @Test
    public void addElementsAtFirstTest_Correct(){
    	linkedList.addNodeAtFirst(70);
    	linkedList.addNodeAtFirst(30);
    	linkedList.addNodeAtFirst(56);
        assertEquals(3, linkedList.getSize());
        assertEquals(56, linkedList.returnFirst());
    }
    
    @Test
    public void addElementsAtFirstTest_InCorrect(){
    	linkedList.addNodeAtFirst(70);
    	linkedList.addNodeAtFirst(30);
    	linkedList.addNodeAtFirst(56);
        assertEquals(3, linkedList.getSize());
        assertNotEquals(70, linkedList.returnFirst());
    }
    
    @Test
    public void addElementsAtLastTest_Correct(){
    	linkedList.addNodeAtLast(56);
    	linkedList.addNodeAtLast(30);
    	linkedList.addNodeAtLast(70);
        assertEquals(3, linkedList.getSize());
        assertEquals(56, linkedList.returnFirst());
    }
    
    @Test
    public void addElementsAtLastTest_InCorrect(){
    	linkedList.addNodeAtLast(56);
    	linkedList.addNodeAtLast(30);
    	linkedList.addNodeAtLast(70);
        assertEquals(3, linkedList.getSize());
        assertNotEquals(70, linkedList.returnFirst());
    }
    
    @Test
    public void addElementsAtIndexTest_Correct(){
    	linkedList.addNodeAtLast(56);
    	linkedList.addNodeAtLast(70);
//    	for adding element in between index taken as 1
    	linkedList.addNodeAtIndex(30,1);
        assertEquals(3, linkedList.getSize());
        assertEquals(56, linkedList.returnFirst());
    }
    
    @Test
    public void addElementsAtIndexTest_InCorrect(){
    	linkedList.addNodeAtLast(56);
    	linkedList.addNodeAtLast(70);
//    	for adding element in between index taken as 1
    	linkedList.addNodeAtIndex(30,1);
        assertEquals(3, linkedList.getSize());
        assertNotEquals(30, linkedList.returnFirst());
    }
    
    @Test
    public void deleteFirstNodeTest_Correct(){
    	linkedList.addNodeAtLast(56);
    	linkedList.addNodeAtLast(70);
//    	for adding element in between index taken as 1
    	linkedList.addNodeAtIndex(30,1);
    	linkedList.pop();
        assertEquals(2, linkedList.getSize());
        assertEquals(30, linkedList.returnFirst());
    }
    
    @Test
    public void deleteFirstNodeTest_InCorrect(){
    	linkedList.addNodeAtLast(56);
    	linkedList.addNodeAtLast(70);
//    	for adding element in between index taken as 1
    	linkedList.addNodeAtIndex(30,1);
    	linkedList.pop();
        assertNotEquals(56, linkedList.returnFirst());
    }
    
    @Test
    public void deleteLastNodeTest_Correct(){
    	linkedList.addNodeAtLast(56);
    	linkedList.addNodeAtLast(70);
//    	for adding element in between index taken as 1
    	linkedList.addNodeAtIndex(30,1);
    	linkedList.popLast();
        assertEquals(2, linkedList.getSize());
        assertEquals(56, linkedList.returnFirst());
    }
    
    @Test
    public void deleteLastNodeTest_InCorrect(){
    	linkedList.addNodeAtLast(56);
    	linkedList.addNodeAtLast(70);
//    	for adding element in between index taken as 1
    	linkedList.addNodeAtIndex(30,1);
    	linkedList.popLast();
        assertEquals(2, linkedList.getSize());
        assertNotEquals(30, linkedList.returnFirst());
    }
    
    @Test
    public void searchNodeTest_Correct(){
    	linkedList.addNodeAtLast(56);
    	linkedList.addNodeAtLast(70);
//    	for adding element in between index taken as 1
    	linkedList.addNodeAtIndex(30,1);
    	linkedList.popLast();
        assertEquals(2, linkedList.getSize());
        assertTrue("The value is not present in list", linkedList.search(30));
    }
    
    @Test
    public void searchNodeTest_InCorrect(){
    	linkedList.addNodeAtLast(56);
    	linkedList.addNodeAtLast(70);
//    	for adding element in between index taken as 1
    	linkedList.addNodeAtIndex(30,1);
    	linkedList.popLast();
        assertEquals(2, linkedList.getSize());
        assertFalse("The value is present inside list", linkedList.search(70));
    }
    
    @Test
    public void addNodeAfterTest_Correct(){
    	linkedList.addNodeAtLast(56);
    	linkedList.addNodeAtLast(70);
//    	for adding element in between index taken as 1
    	linkedList.addNodeAtIndex(30,1);
    	linkedList.addNodeAfter(40, 30);
    	linkedList.popLast();
        assertEquals(3, linkedList.getSize());
        assertEquals(56, linkedList.returnFirst());
    }
    
    @Test
    public void addNodeAfterTest_InCorrect(){
    	linkedList.addNodeAtLast(56);
    	linkedList.addNodeAtLast(70);
//    	for adding element in between index taken as 1
    	linkedList.addNodeAtIndex(30,1);
    	linkedList.addNodeAfter(40, 30);
    	linkedList.popLast();
        assertEquals(3, linkedList.getSize());
        assertNotEquals(40, linkedList.returnFirst());
    }
    
    @Test
    public void deleteSpecificNodeTest_InCorrect(){
    	linkedList.addNodeAtLast(56);
    	linkedList.addNodeAtLast(70);
//    	for adding element in between index taken as 1
    	linkedList.addNodeAtIndex(30,1);
    	linkedList.addNodeAfter(40, 30);
    	linkedList.popSpecific(30);
        assertEquals(3, linkedList.getSize());
        assertTrue( linkedList.search(40));
    }
    
    @Test
    public void deleteSpecificNodeTest_Correct(){
    	linkedList.addNodeAtLast(56);
    	linkedList.addNodeAtLast(70);
//    	for adding element in between index taken as 1
    	linkedList.addNodeAtIndex(30,1);
    	linkedList.addNodeAfter(40, 30);
    	linkedList.popSpecific(40);
        assertEquals(3, linkedList.getSize());
        assertFalse( linkedList.search(40));
    }
    
    @Test
    public void sortedListCreationTest_Correct(){
    	SortedLinkedList linkedList = new SortedLinkedList();
        linkedList.addSortedNode(56);
        linkedList.addSortedNode(70);
        linkedList.addSortedNode(30);
        linkedList.addSortedNode(40);
    	linkedList.popSpecific(40);
        assertEquals(3, linkedList.getSize());
        assertEquals(30, linkedList.returnFirst());
    }
    
    @Test
    public void sortedListCreationTest_InCorrect(){
    	SortedLinkedList linkedList = new SortedLinkedList();
        linkedList.addSortedNode(56);
        linkedList.addSortedNode(70);
        linkedList.addSortedNode(30);
        linkedList.addSortedNode(40);
    	linkedList.popSpecific(40);
        assertEquals(3, linkedList.getSize());
        assertNotEquals(56,linkedList.returnFirst());
    }
}
