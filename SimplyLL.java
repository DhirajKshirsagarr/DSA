import java.util.Scanner;

public class SimplyLL {
    public static class LL {
        public int data;
        public LL nextNode = null;

        public LL(int data) {
            this.data = data;
        }
    }

    public static LL insert(LL start, LL node) {
        if (start == null) {
            return node;
        }
        LL temp = start;
        while (temp.nextNode != null) {
            temp = temp.nextNode;
        }
        temp.nextNode = node;
        return start;
    }

    public static LL insertAtBegninig(LL start, LL node) {
        if (start == null) {
            return node;
        }
        node.nextNode = start;
        return node;
    }

    public static LL delete(LL start) {
        LL node1 = start;
        if (node1.nextNode == null) {

            return null;
        }
        while (node1.nextNode.nextNode != null) {
            node1 = node1.nextNode;
        }
        node1.nextNode = null;
        return start;
    }
    public static LL deleteFromStart(LL start) {
        LL node1 = start;
        if (node1.nextNode == null) {

            return null;
        }
        LL temp=start;
        start=start.nextNode;
        temp.nextNode = null;
        return start;
    }

    public static void display(LL start) {
        LL temp = start;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.nextNode;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        boolean itarate = true;
        Scanner sc = new Scanner(System.in);
        LL start = null;

        while (itarate) {
            System.out.println("1.for insert at end\n2. for delete from end\n3.for display\n4. for add at start\n5. for delete from bigning\n6.for exit");
            int choise = sc.nextInt();
            switch (choise) {
                case 1:
                    System.out.println("enter data of node :");
                    int data = sc.nextInt();
                    LL node = new LL(data);
                    start = insert(start, node);
                    break;
                case 2:
                    start = delete(start);
                    break;
                case 3:
                    display(start);
                    break;
                case 4:
                    System.out.println("enter data of node :");
                    data = sc.nextInt();
                    node = new LL(data);
                    start = insertAtBegninig(start, node);
                    break;
                case 51:
                    start=deleteFromStart(start);
                    break;
                case 6:
                    itarate = false;
                    break;
                default:
                    break;
            }
        }
        sc.close();
    }
}