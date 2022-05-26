import java.util.HashMap;
import java.util.Map;

public class SortedeString {
    public static String frequencyStringCounter(String str){
        StringBuilder sb=new StringBuilder();
        Map<Character, Integer> charCountMap=new HashMap<>();
        int len=str.length();
        


        //Traverse The String
        for(int i=0;i<len;i++){
            char ch = str.charAt(i);
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0)+1);
        }



        //Sort Map By using Frequency Count
        charCountMap.entrySet().stream().sorted(Map.Entry.<Character,Integer> comparingByValue().reversed()).forEach(Record->{
            Character  key=Record.getKey();
            int value=Record.getValue();

            for(int i=0;i<value;i++){
                sb.append(key);
            }
        });
        return sb.toString();
    }
    public static void main(String[] args) {
        String str= "tttyyyuuurrr";
        System.out.println(frequencyStringCounter(str));
    }
    
}
