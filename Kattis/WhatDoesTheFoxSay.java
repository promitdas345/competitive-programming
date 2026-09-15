//import java.util.*;
//
//public class fox{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
//        int t = Integer.parseInt(sc.nextLine());
//        StringBuilder result = new StringBuilder();
//        while(t-- > 0){
//            String[] recording = sc.nextLine().split(" ");
//
//            Set<String> knownSounds = new HashSet<>();
//
//            String line;
//
//            while(!(line=sc.nextLine()).equals("what does the fox say?")){
//                String[] parts = line.split(" ");
//                String sound = parts[2];
//                knownSounds.add(sound);
//
//            }
//
//
//            for(String word: recording){
//                if(!knownSounds.contains(word)){
//                    if(!result.isEmpty()){ result.append(" ");}
//                    result.append(word);
//                }
//            }
//
//
//        }
//
//        System.out.println(result);
//    }
//}