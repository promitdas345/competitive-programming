import java.util.*;

public class CountingStars{
    static int[] rd = { -1, 1, 0, 0};
    static int[] cd = { 0,0, -1, 1};
    public static void bfs(char[][] grid, int i, int j, int r, int c){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i, j});
        grid[i][j] = '#';

        while(!q.isEmpty()){
            int[] cur = q.poll();

            for( int k =0; k < 4; k++){
                int newR = cur[0] + rd[k];
                int newC = cur[1] + cd[k];
                if(newR >= 0 && newR < r && newC >= 0 && newC < c){
                    if(grid[newR][newC] == '-'){
                        q.add(new int[] {newR, newC});
                        grid[newR][newC] = '#';

                    }
                }
            }

        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int count = 0;
        while(sc.hasNextInt()){
            int r = sc.nextInt();
            int c = sc.nextInt();
            count ++;
            char[][] grid = new char[r][c];

            for(int i = 0; i<r;i++){

                String l = sc.next();
                grid[i] = l.toCharArray();

            }

            int stars = 0;
            for(int i = 0; i < r;i++){
                for(int j = 0; j < c; j++){
                    if(grid[i][j] == '-'){
                        stars++;
                        bfs(grid, i, j, r, c);
                    }
                }
            }

            System.out.println("Case "+ count+": "+stars );

        }

    }
}