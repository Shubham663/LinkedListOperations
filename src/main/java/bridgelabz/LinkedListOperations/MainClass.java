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
//        for Adding 30 in between specify index as 1 on runtime
        System.out.println("Enter the index in [0," + (linkedList.getSize()) +"] at which you want to add element");
		Scanner sc = new Scanner(System.in);
		int val = sc .nextInt();
		sc.nextLine();
        linkedList.addNodeAtIndex(30,val);
        linkedList.printList();
        linkedList.popLast();
        System.out.print("After deleting from last ");
        linkedList.printList();
    }
}
