import java.util.HashMap;

public class Roman_Integer {
    static int Roman(String str){
        HashMap<Character,Integer> map= new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int result=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(i>0 && map.get(ch)>map.get(str.charAt(i-1)))
                result=result+ map.get(ch)-2*map.get(str.charAt(i-1));
            else
                result=result+map.get(ch);
        }
return result;
    }
    public static void main(String[] args) {
        String str="MCM";
        int result=Roman(str);
        System.out.println(result);
    }
}
