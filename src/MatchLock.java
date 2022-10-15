import java.util.HashMap;

public class MatchLock {
    public static void main(String[] args) {
        char nuts[] = { '@', '#', '$', '%', '^', '&' };
        char bolts[] = { '$', '%', '&', '^', '@', '#' };
        int n=nuts.length;
        findmatch(nuts,bolts,n);
    }
    static void findmatch(char lock[], char key[],int n){
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<n;i++){
            map.put(lock[i],i);
        }
        for(int i=0;i<n;i++){
            if(map.containsKey(key[i]))
                lock[i]=key[i];
        }
        System.out.println("Matched values:");
        for (int i=0;i<n;i++){
            System.out.print(lock[i]+" ");
        }
        System.out.println();
        for (int i=0;i<n;i++){
            System.out.print(key[i]+" ");
        }

    }
}
