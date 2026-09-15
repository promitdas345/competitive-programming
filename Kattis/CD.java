import java.util.*;
import java.io.*;

public class CD {
    public static void main(String[] args)throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        if (n==0 && m==0){
            break;
        }
        int [] jack = new int[n];
        int [] jill = new int[m];
        for (int i = 0; i <n; i++){
            jack[i] = Integer.parseInt(br.readLine());
        }
        int jP = 0;
        int count  = 0;
        for (int i = 0; i < m; i ++){
            jill[i] = Integer.parseInt(br.readLine());

            while((jP < n) && (jack[jP] < jill[i])){
                jP++;
            }
            if(jP < n && jack[jP] == jill[i]){
                count++;
            }
        }
        System.out.println(count);
    }
    }
}
