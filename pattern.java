

public class pattern {

    public static void floyds(String name){
    
        int size=name.length();
        for(int row=0;row<size;row++){
            for(int space=size-row-1;space>=0;space--)
                System.out.print(" ");
            for(int col=0; col<=row; col++){
                System.out.print(name.charAt(col));
            }
            System.out.println();
        }
        }
    

    public static void main(String[] args) {
        floyds( "prath");
    }
    
}
