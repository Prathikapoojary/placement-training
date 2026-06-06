import java.util.Deque;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;

public class LruCache {
    private int size;
    private Deque<Integer> dq=new LinkedList<>();
    private Hashtable<Integer,Integer> tab=new Hashtable<>();
    public LruCache(int cap){this.size=cap;}
    public void put(int key,int value){
        if(tab.contains(dq)){
            dq.remove(key);
            tab.put(key,value);
            dq.offerFirst(key);
            System.out.println(tab);
            return ;
        }
        if(dq.size())
    }
    
    
}
