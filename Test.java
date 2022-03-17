import java.util.Scanner;

/**
 * Created by hp on 16-Feb-22.
 */
public class Test {
    public static void main(String[] args) {
          SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        Scanner in = new Scanner(System.in);

            list.addFirst(10);
            list.addFirst(20);
            list.addFirst(30);
            list.addFirst(40);

//Answer of Q1


        System.out.println("Enter element that you search");
            list.search(in.nextInt());

//Answer of Q2


           list.rotate(1);
        System.out.println("list elements after rotate ");
            list.printList();
        System.out.println("\nsize is ");
        System.out.println(list.size());





    }
}
