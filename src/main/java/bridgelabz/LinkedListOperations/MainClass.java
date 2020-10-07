package bridgelabz.LinkedListOperations;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class MainClass 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Linked List Operations!" );
        LinkedList linkedList = new LinkedList();
        linkedList.addNodeAtLast(56);
        linkedList.addNodeAtLast(70);
//    	for adding element in between index taken as 1
        linkedList.addNodeAtIndex(30, 1);
        linkedList.addNodeAfter(40, 30);
        linkedList.printList();
        linkedList.popLast();
        System.out.print("After deleting from last ");
        linkedList.printList();
    }
}
