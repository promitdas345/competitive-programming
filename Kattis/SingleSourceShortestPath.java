import java.util.*;
class Node{
    int id;
    int distance;

    public Node(int id, int distance){
        this.id = id;
        this.distance = distance;
    }
}


public class Single{

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int q = sc.nextInt();
            int s = sc.nextInt();

            if ( n==0 && m==0 && q==0 && s==0){
                break;
            }

            //using a adjacency list for the graph
            List<Node>[] adj = new ArrayList[n];
            for(int i = 0; i < n; i++){
                adj[i] = new ArrayList<>();
            }

            //Reading the inputs
            for(int i = 0; i < m; i++){
                int u = sc.nextInt();
                int v = sc.nextInt();
                int w = sc.nextInt();
                adj[u].add(new Node(v,w));
            }
            int[] dis = new int[n];
            Arrays.fill(dis, Integer.MAX_VALUE);
            dis[s] = 0;

            PriorityQueue<Node> pq = new PriorityQueue<>((a,b) -> Integer.compare(a.distance, b.distance) );
            pq.add(new Node(s, 0));

            while(!pq.isEmpty()){
                //getting the shortest unvisited node
                Node cur = pq.poll();

                if(cur.distance > dis[cur.id]) continue;
                for (Node edge: adj[cur.id]){
                    int newDis = cur.distance + edge.distance;
                    if(newDis < dis[edge.id]){
                        dis[edge.id] = newDis;
                        pq.add(new Node(edge.id, newDis));
                    }

            }
        }


            for( int i = 0; i < q; i++){

                int t = sc.nextInt();
                if(dis[t] == Integer.MAX_VALUE){
                    System.out.println("Impossible");
                }else{
                    System.out.println(dis[t]);
                }
            }
            System.out.println();

    }
    }
}