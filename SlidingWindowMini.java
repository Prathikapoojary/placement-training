import java.util.Hashtable;
import java.util.List;

public class SlidingWindowMini {
    public static List<String>window(String [] c,String[] r){
        Hashtable<String,Integer>rTab=new Hashtable<>();
         Hashtable<String,Integer>cTab=new Hashtable<>();
        int mStart=0,start=0,end=0,mLen=Integer.MAX_VALUE;
        int count=0;
        for(String each:r)
            rtab.put(each,rtab.getOrDefault(each,0 )+1);
        while(end<c.length) {
            cTab.put(c[end],ctab.getOrDefault(c[end],0)-1);
            
        }
    }
    public static void main(String[] args) {
        String [] cur={"b","s","a","c","f"};
        String [] req ={"s","j"};
        String[] result= window(cur, req);
        System.out.println();
    }
    
}
