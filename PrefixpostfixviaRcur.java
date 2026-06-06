public class PrefixpostfixviaRcur  {
    public static void pre(int[] og, int[] prefix, int index) {
        if (index == 0) {
            prefix[0] = og[0];
            return;
        }
        pre(og, prefix, index - 1);
        prefix[index]=prefix[index-1]+og[index];
    }
    public static void post(int[] og, int[] postfix, int index) {
        if (index == og.length - 1) {
            postfix[index] = og[index];
            return;
        }
        post(og, postfix, index + 1);
        postfix[index]=postfix[index+1]+og[index];
    }

    public static void main(String[] args) {
        int[] og = { 23,12,98,45,1845,12,98 };
        int[] prefix = new int[og.length];
        int[] postfix = new int[og.length];
        pre(og, prefix, og.length - 1);
        post(og, postfix, 0);
        for (int i : prefix)
            // System.out.println("prefix");
            System.out.print(i + " ");
        System.out.println("prefix");
        for (int i : postfix)
            // System.out.println("postfix");
            System.out.print(i + " ");
        System.out.println("postfix");
    }
}