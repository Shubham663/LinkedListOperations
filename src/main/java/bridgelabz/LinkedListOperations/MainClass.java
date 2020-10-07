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
        SortedLinkedList linkedList = new SortedLinkedList();
        linkedList.addSortedNode(56);
        linkedList.addSortedNode(70);
        linkedList.addSortedNode(30);
        linkedList.addSortedNode(40);
        linkedList.printList();
        linkedList.popSpecific(40);
        System.out.print("After deleting data 40 ");
        linkedList.printList();
    }
}
