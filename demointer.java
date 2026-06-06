interface FeedRemote{
    String[][]feedbacks=new String[5][];
    void createFeedback(int id,String comments);
    void readFeedback(int id);
    void deleteFeedback(int id);
}
class FeedBackService implements FeedRemote{
    @Override
    public void createFeedback(int id, String comments) {
        //feedbacks[id][0]=comments;
        for(int i=0;i<feedbacks.length;i++){
            if(feedbacks[i][0]==null||feedbacks[i][0]==""){
             feedbacks[i][0]=comments;
             System.out.println("Feedback noted"); return;
            
            
            }
            System.out.println("Buffer is full can't add your feedback");

        }
        
    }

    @Override
    public void readFeedback(int id) {
       // System.out.println(feedbacks[id][0]);
         if(id<0||id>=feedbacks.length)
                System.out.println("invalid feedback");
          else
                System.out.println(feedbacks[id][0]);
        
    }

    @Override
    public void deleteFeedback(int id) {
        //feedbacks[id][0]="";
        

        
    }
}
public class demointer {
    public static void main(String[] args) {
        FeedBackService service=new FeedBackService();
        service.createFeedback(0, "good");
        service.createFeedback(1, "bad");
        service.createFeedback(2, "average");
        service.createFeedback(3, "excellent");
        service.createFeedback(4, "poor");
        service.createFeedback(5, "nice");
        service.readFeedback(2);
        service.deleteFeedback(2);
        service.readFeedback(2);
    }
}
