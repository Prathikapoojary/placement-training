import java.util.Stack;

public class histogram {
    public static int maxArea(int[]chart){
        int mArea=Integer.MIN_VALUE,temp=0;
        Stack<Integer>stk=new Stack<>();
        for(int i=0;i<chart.length;i++){
            int cValue=(i==chart.length)?0:chart[i];
            while(!stk.isEmpty() && cValue<chart[stk.peek()]){
                int height=chart[stk.pop()];
                int width=stk.isEmpty()?i:i-stk.peek()-1;
                mArea=Math.max(mArea, height*width);
            }
            stk.push(i);
        }
        return mArea;
    }
    public static void main(String[] args) {
        int[] chart ={2,1,5,6,2,3};
        System.out.println(maxArea(chart));
    }
}
