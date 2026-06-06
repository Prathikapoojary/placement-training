import java.util.Arrays;

class OpenCart{
    String[]order={"Dell lap","sony ssd","hp mouse","lenovo monitor"};
    public void view(){
        System.out.println(Arrays.toString(order));
    }
}
class Amazon extends OpenCart{
    public void view(){
       //if()
}
}

public class demoDynamic {
    public static void main(String[] args) {
        OpenCart amazon=new Amazon();
        amazon.view();
        amazon.view();
    }
    
}
