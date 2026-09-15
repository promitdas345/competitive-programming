import java.util.*;

public class Grid{

    // helper class to store row, column, and distance
    static class State{
        int r, c, dist;
        State(int r, int c, int dist){
            this.r = r;
            this.c = c;
            this.dist = dist;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int [][]  grid = new int[n][m];
        for(int i=0; i<n; i++){
            String l = sc.next();
            for (int j = 0; j<m;j++){
                grid[i][j] = l.charAt(j) - '0';
            }
        }


        //Initializing necessary things for bfs.
        Queue<State> q = new LinkedList<>();

        boolean[][] visited = new boolean[n][m];

        //2. Add the starting point
        q.add(new State(0,0,0));

        visited[0][0] = true;

        // defining the actions
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while(!q.isEmpty()){

            State cur = q.poll();
            //checking if we reached the goal
            if(cur.r == n - 1 && cur.c == m - 1){
                System.out.println(cur.dist);
                return;
            }

            int k = grid[cur.r][cur.c];

            for(int i = 0; i < 4; i++){

                int nr = cur.r + (dr[i]*k);
                int nc = cur.c + (dc[i]*k);

                if(nr < 0 || nr > n - 1 || nc < 0 || nc > m - 1 || visited[nr][nc]){
                    continue;
                }

                //add the legal moves to the openlist for expansion
                // and mark them as true in the closed list
                q.add(new State(nr,nc,cur.dist+ 1));
                visited[nr][nc] = true;

            }

        }
        System.out.println("-1");



    }


}