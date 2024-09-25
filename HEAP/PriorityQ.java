
import java.util.*;
import java.util.PriorityQueue;



public class PriorityQ {
    // prioriy queue of a objects

static  class Student implements Comparable<Student> { 
    String name;
    int rank;

    public Student (String name , int rank){
        this.name = name;
        this.rank = rank;
    }

    @Override
    public int compareTo(Student s2){
        return this.rank - s2.rank;
    }
}
    public static void main(String[] args) {
        // for reverse the logic we can use Comparator.reverseOrder();
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());//reverse the logic of comatareTo() function

        pq.add(new Student("A", 3));
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 8));
        pq.add(new Student("D", 1));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name+ "->" + pq.peek().rank);
            pq.remove();
        }
    }
}