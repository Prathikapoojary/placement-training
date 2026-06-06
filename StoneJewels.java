import java.util.HashSet;
import java.util.Set;

public class StoneJewels 
{

    public static int findCount(String jw,String st)
    {
        Set<Character>jset=new HashSet<>();
        for(char each:jw.toCharArray()) jset.add(each);
        int count=0;
        for(char each:st.toCharArray())
            {

            if(jset.contains(each))count++;

            }
        return count;

    }
    public static void main(String[] args) 
    {
       // String jewels="z", stones="ZZ";
       String jewels="aA", stones="aAAbbbb";
        System.out.println(findCount(jewels, stones));
    }
    
}
