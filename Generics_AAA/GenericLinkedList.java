/**
* author: Abdifatah Abdi
* This class takes an argument of type T that is a generic data type.
* and based on that argument it creates a class that will create a GenericLinkedList of passed data type
*/

package Generics_AAA;


public class GenericLinkedList <T>{

		private GenericNode head; //node to represent the head of the list
		private GenericNode tail; //node to represent the tail (end) of the list
		private int length; //variable to keep track of the number of elements in the list
		
		/**
		 * The constructor for this object initializes the list such that
		 * it is empty (no head or tail) node.
		 */
		public GenericLinkedList()
		{
			head=null;
			length=0;
			tail=head;
		}//end empty-argument constructor
		
		/**
		 * Method to see if there are any elements in the list.
		 * @return boolean true/false
		 */
		public boolean isEmpty()
		{
			if (head==null) { 
				return true;
				}
			else 
				return false;
		}//end isEmpty
		
		/**
		 * This method returns the head node of the list from which
		 * you can traverse the entire by following node links.
		 * @return
		 */
		public GenericNode getList(){
			return head;
		}//end getList
		
		/**
		 * This method adds a new node to the list. It first checks to see
		 * if the list is empty. If so, it sets the head and the tail nodes
		 * to the node passed in. If the list is not empty it places the node
		 * at the end of the list and updates the pointers in the tail. This
		 * implementation does not support adding entries to the middle
		 * of the list.
		 * @param <T>
		 * @param aNode
		 */
		 public void addNode(GenericNode<T> aNode) {
		        if (isEmpty()) {
		            head = aNode;
		            tail = head;
		            return;
		        }
			tail.setNextNode(aNode);
			tail=tail.getNextNode();
			tail.setNextNode(null);
			length++;
			
		}//end addNode

}//End class
