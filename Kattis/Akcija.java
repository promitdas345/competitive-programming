import java.util.*;

public class Akjica{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer [] prices = new Integer[N];
        for(int i = 0; i<N;i++){
            prices[i] = sc.nextInt();
        }
        Arrays.sort(prices, Collections.reverseOrder());
        int sum = 0;
        for(int i = 0; i<N; i++){
            if(((i+1)%3) == 0){
                continue;
            }
            else{
                sum += prices[i];
            }
        }
        System.out.println(sum);
    }


}