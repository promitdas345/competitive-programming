import java.util.*;
class ExactChange{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int c150 = 0;
        int c30 = 0;
        int c15 = 0;
        int c5 = 0;
        int c1 = 0;
        if (N >= 150){

            c150 = N/150;
            N %= 150;
        }
        if(N >= 30){
            c30 = N/30;
            N%=30;
        }
        if(N >= 15){
            c15 = N/15;
            N%=15;
        }
        if(N >= 5){
            c5 = N/5;
            N%=5;
        }
        if(N>=1){
            c1 = N/1;
            
        }
        System.out.println(c1 +" "+  c5 + " "+ c15 + " "+ c30 + " "+ c150);
        sc.close();

    }
}