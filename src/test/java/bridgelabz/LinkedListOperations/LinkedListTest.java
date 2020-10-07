package bridgelabz.LinkedListOperations;

import static org.junit.Assert.assertEquals;
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
    public void addElementsAtFirst_Correct(){
    	linkedList.addNodeAtFirst(70);
    	linkedList.addNodeAtFirst(30);
    	linkedList.addNodeAtFirst(56);
        assertEquals(3, linkedList.getSize());
        assertEquals(56, linkedList.returnFirst());
    }
    
    @Test
    public void addElementsAtFirst_InCorrect(){
    	linkedList.addNodeAtFirst(70);
    	linkedList.addNodeAtFirst(30);
    	linkedList.addNodeAtFirst(56);
        assertEquals(3, linkedList.getSize());
        assertNotEquals(70, linkedList.returnFirst());
    }
    
    @Test
    public void addElementsAtLast_Correct(){
    	linkedList.addNodeAtLast(56);
    	linkedList.addNodeAtLast(30);
    	linkedList.addNodeAtLast(70);
        assertEquals(3, linkedList.getSize());
        assertEquals(56, linkedList.returnFirst());
    }
    
    @Test
    public void addElementsAtLast_InCorrect(){
    	linkedList.addNodeAtLast(56);
    	linkedList.addNodeAtLast(30);
    	linkedList.addNodeAtLast(70);
        assertEquals(3, linkedList.getSize());
        assertNotEquals(70, linkedList.returnFirst());
    }
    
    @Test
    public void addElementsAtIndex_Correct(){
    	linkedList.addNodeAtLast(56);
    	linkedList.addNodeAtLast(70);
//    	for adding element in between please specify index as 1 in runtime
    	linkedList.addNodeAtIndex(30);
        assertEquals(3, linkedList.getSize());
        assertEquals(56, linkedList.returnFirst());
    }
    
    @Test
    public void addElementsAtIndex_InCorrect(){
    	linkedList.addNodeAtLast(56);
    	linkedList.addNodeAtLast(70);
//    	for adding element in at front please specify index as 0 in runtime
    	linkedList.addNodeAtIndex(30);
        assertEquals(3, linkedList.getSize());
        assertNotEquals(56, linkedList.returnFirst());
    }
}
