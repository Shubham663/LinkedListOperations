package bridgelabz.LinkedListOperations;

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
        linkedList.addNodeAtLast(30);
        linkedList.addNodeAtLast(70);
        linkedList.printList();
    }
}
