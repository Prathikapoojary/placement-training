import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import javax.naming.LinkException;

public class DemoList {
    public static void main(String[] args) {
        LinkedList buffer =new LinkedList();
        buffer.add("Hello");
        buffer.add(12);
         buffer.add(13);
          buffer.add('r');
          Queue<String>store= new PriorityQueue<>((a,b)->b.compareTo(a));
          store.offer("Spring Boot");
           store.offer("djsong");
           System.out.println(store);
           Iterator it=buffer.iterator();
           while(it.hasNext())
            System.out.println(it.next());
    }
    

        
    
}
