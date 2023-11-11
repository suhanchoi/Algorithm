package skeleton;

import java.util.*;

public class QUEUE {


        Queue<Integer> q = new LinkedList<>();

        q.add();

        q.peek(); // 프론트값 반환

        q.remove();
        q.poll();

        q.clear();

        q.isEmpty();



        Queue<Node> queue=new LinkedList<>();
        queue.add(new Node(1,2,3));
        Node node= queue.poll();

        PriorityQueue<Integer> pq = PriorityQueue<Integer>(); // 최소힙
        PriorityQueue<Integer> pq = PriorityQueue<Integer>(Collections.reverseOrder()); // 최대힙

        pq.add(3);

        pq.remove();

        pq.peek(); // root값 추출

        PriorityQueue<PQNode> pq1 = new PriorityQueue<>(PQNode::compareTo);
        pq1.add(new PQNode(1,2));
        pq1.add(new PQNode(1,1));
        pq1.add(new PQNode(2,3));
        pq1.add(new PQNode(2,1));

        while(!pq1.isEmpty()){
            PQNode pqnode = pq1.peek();
            System.out.println(pqnode.y+" "+pqnode.x);
            pq1.remove();
        }





}

class Node {
    int y;
    int x;
    int dist;

    Node(int y,int x,int dist){
        this.y=y;
        this.x=x;
        this.dist=dist;
    }
}

class PQNode{
    int y;
    int x;

    PQNode(int y,int x){
        this.y=y;
        this.x=x;
    }

    // 비교 함수 만들어야함!!
    public int compareTo(PQNode p) {
        if(this.y < p.x) {
            return -1; // 오름차순
        }
        else if(this.y == p.y) {
            if(this.x < p.x) {
                return -1;
            }
        }
        return 1;
    }
}
