class Node {
  protected int data;
  protected Node link;

  /*  Constructor  */
  public Node() {
    data = 0;
    link = null;
  }

  /*  Constructor  */
  public Node(int d, Node n) {
    data = d;
    link = n;
  }

  /*  Function to set link to next Node  */
  public void setLink(Node n) {
    link = n;
  }

  /*  Function to set data to current Node  */
  public void setData(int d) {
    data = d;
  }

  /*  Function to get link to next node  */
  public Node getLink() {
    return link;
  }

  /*  Function to get data from current Node  */
  public int getData() {
    return data;
  }
}

/* Class singlyLinkedList */
class linkedList {
  protected Node start;
  protected Node end;
  public int size;

  /*  Constructor  */
  public linkedList() {
    start = null;
    end = null;
    size = 0;
  }

  /*  Function to check if list is empty  */
  public boolean isEmpty() {
    return start == null;
  }

  /* Function to count the size */
  public int countSize() {
    if (start == null)
      return 0;
    return recursiveCount(start, 1);
  }

  /* Function to recursively check the next node */
  protected int recursiveCount(Node node, int count) {
    Node nextNode = node.getLink();
    if (nextNode == null)
      return count;
    count++;
    return recursiveCount(nextNode, count);
  };

  /*  Function to get size of list  */
  public int getSize() {
    return size;
  }

  /*  Function to insert an element at begining  */
  public void insertAtStart(int val) {
    Node nptr = new Node(val, null);
    size++;
    if (start == null) {
      start = nptr;
      end = start;
    } else {
      nptr.setLink(start);
      start = nptr;
    }
  }

  /*  Function to insert an element at end  */
  public void insertAtEnd(int val) {
    Node nptr = new Node(val, null);
    size++;
    if (start == null) {
      start = nptr;
      end = start;
    } else {
      end.setLink(nptr);
      end = nptr;
    }
  }

  /*  Function to print elements  */
  public void display() {
    System.out.print("\nSingly Linked List: ");
    if (size == 0) {
      System.out.print("empty\n");
      return;
    }
    if (start.getLink() == null) {
      System.out.println(start.getData());
      return;
    }
    Node ptr = start;
    System.out.print(start.getData() + "->");
    ptr = start.getLink();
    while (ptr.getLink() != null) {
      System.out.print(ptr.getData() + "->");
      ptr = ptr.getLink();
    }
    System.out.print(ptr.getData() + "\n");
  }

  private void recursiveReverseList(Node previousNode, Node currentNode, Node nextNode) {
    if(nexNode == null) start = currentNode;
    else {
      currentNode.setLink(previousNode);
      Node nextnextNode = nextNode.getLink();
      recursiveReverseList(currentNode, nextnextNode, nextnextNode);
    }
  }

  public void reverseList(){
    if(start != null) {
      end = start;
      nextNode = start.getLink();
      previousNode = null;
      recursiveReverseList(null, start, nextNode);
    }
  }
}

public class SinglyLinkedList {

  // generate a singly linked list filled with number of 1-10;
  static linkedList generateList(int size) {
    linkedList list = new linkedList();
    for (int i = 0; i < size; i++) {
      list.insertAtEnd((int) (Math.random() * 10 + 1));
    }
    return list;
  }

  public static void main(String[] args) {
    linkedList list = generateList(1);
    list.display();
    System.out.println("\nThe size of the list is: " + list.countSize());
    list.reverseList();
    list.display();    
  }
}