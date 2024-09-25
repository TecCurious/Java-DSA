public class CircularQueueUsingArray {

    static class Queue{
       static int arr[];
       static int size;
       static  int rear;
       static  int front;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        // is full 
        public static boolean isFull(){
            return front == (rear+1)%size;
        }

        // add
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            if(rear ==-1 && front ==-1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }


        // remove
        public static int remove(){
            if(rear == -1){
                System.out.println("Queue is empty");
                return -1;
            }
            int top = arr[front];
            if(rear == front){
                rear = front = -1;
            } else{
                front = (front+1)%size;
            }
            
            return top;
            
        }

        // peek
        public static int peek(){
            if(rear == -1){
                return -1;
            }

            return arr[front];
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);

        q.remove();

        q.add(4);

        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
