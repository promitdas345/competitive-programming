import java.io.*;
import java.util.*;
class Babelfish {
    
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashMap<String, String> dict = new HashMap<>();
        String  ln;

        while(!(ln = br.readLine()).isEmpty()){
            String []  p = ln.split(" ");


            String english = p[0];
            String foreign = p[1];

            dict.put(foreign, english);
        }

        while((ln = br.readLine()) != null){
            if((dict.containsKey(ln))){
                sb.append(dict.get(ln));
            }
            else{
                sb.append("eh");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
