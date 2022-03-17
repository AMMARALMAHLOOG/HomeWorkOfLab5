import java.lang.reflect.Method;

/**
 * Created by hp on 16-Feb-22.
 */

public class SinglyLinkedList<E> {
    private Node<E>head= null;
    private Node<E>tail= null;
    private int size;

    public int size(){
        Node<E>count=head;
        int counter=0;
        while (count!=null){
           counter++;
           count=count.getNext();
        }
        return counter;}

    public boolean isEmpty(){return size==0;}
    public E first(){
           if (isEmpty())return null;
           else return head.getData();
    }
    public E last(){
        if (isEmpty())return null;
        else return tail.getData();
    }
    public void addFirst(E e)
    {
       head = new Node<E>(e,head);
           if (size==0)
               tail=head;
        size++;
    }
public void addLast(E e){
      Node<E> newst = new Node<E>(e,null);
    if (isEmpty())
        head = tail;
       else
           tail.Next=newst;
           tail=newst;
    size++;
}

public E removeFirst(){
        if (isEmpty())return null;
            E remove=head.getData();
            head=head.getNext();
          if (size==0)
              tail=null;
          size--;
         return remove;
    }

    public static class Node<E>{
            E data;
            Node<E> Next;

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node<E> getNext() {
            return Next;
        }

        public void setNext(Node<E> next) {
            Next = next;
        }

        public Node(E data, Node<E> next) {
            this.data = data;
            Next = next;
        }
    }
//Method of Q1

    public void search(E e) {
        Node<E> d = head;
        while (d.getNext()!=null&d.getData()!=e) {
            d=d.getNext();
        }
        if (d.getData()==e)
        System.out.println("Found");
        else
            System.out.println("Not Found");

    }

    //Method of Q2

    void rotate(int k)
    {
        if (k == 0)
            return;
        Node current = head;
        int count = 1;
        while (count < k && current != null)
        {
            current = current.getNext();
            count++;
        }
        if (current == null)
            return;
        Node kthNode = current;
        while (current.getNext() != null)
            current = current.getNext();
        current.setNext(head);
        head = kthNode.getNext();
        kthNode.setNext(null);
    }





    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }

}
