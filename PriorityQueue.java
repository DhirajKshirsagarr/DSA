import java.util.Scanner;

public class PriorityQueue {
    static class pElements {
        private int priority;
        private int data;
        

        public pElements(int priority, int data) {
            this.data = data;
            this.priority = priority;
        }

    }

    static class myPQ {
        private int currntSize=0;
        private pElements[] queue;
        

        public myPQ(int size) {
            queue = new pElements[size];
        }

        public void display() {
            for (int i = 0; i < currntSize; i++) {
                System.out.print("p= "+queue[i].priority + " d= " + queue[i].data+" -- ");
            }
            System.out.println();
        }

        public void insert(int pri,int item) {
            int i;

            if (currntSize == queue.length) {
                System.out.println("Queue is OverFlow");
                return;
            }
            for (i = currntSize - 1; i >= 0; i--) {
                if (queue[i].priority > pri) {
                    queue[i + 1] = queue[i];
                }else{
                    break;
                }
            }

            queue[i + 1]=new pElements(pri, item);
            currntSize=currntSize+1;
        }

        public void delete(){
            if(currntSize==0){
                System.out.println("Queue is empty");
                return;
            }
            for(int i=0;i<currntSize-1;i++){
                queue[i]=queue[i+1];
            }
            queue[currntSize-1]=null;
            currntSize=currntSize-1;
        }

    }

    public static void main(String[] args) {
        myPQ que = new myPQ(5);
        Scanner sc = new Scanner(System.in);

        boolean iterate = true;
        while (iterate) {
            System.out.println("*****************************************************");
            System.out.println("1. for insert\n2. for delete\n3. for display\n4. for exit");
            int choise = sc.nextInt();
            switch (choise) {
                case 1:
                    
                    System.out.println("enter priority");
                    int pri = sc.nextInt();
                    System.out.println("enter data");
                    int item = sc.nextInt();
                    que.insert(pri,item);
                    break;
                case 2:
                    que.delete();
                    break;
                case 3:
                    que.display();
                    break;    
                case 4:
                    iterate=false;
                    break;
            }
        }
        sc.close();
    }
}
