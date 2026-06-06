import java.util.logging.Logger;
import java.util.Scanner;
public class Demologs {

    public static void main(String[] args) {
        Logger logge2
         = Logger.getLogger(Demologs.class.getName());
        String[]recruiters={"Google","Microsoft","Amazon","Meta","DLithe","Cognizant"};
        int Day=0;
        System.out.println("enter the dat to get company name");
        Scanner scanner = new Scanner(System.in);
        Day = scanner.nextInt();
        Day--;


        //KYC kyc = KYC.getKyc();
        //kyc.name="prathap";kyc.contact=1234567890;
       // KYC kyc2 = KYC.getKyc();
     //   kyc2.name="john";kyc2.contact=0987654321;
        
    }
    
}
//single ton pattern
class KYC{
    String name;long contact;
    private static KYC kyc= new KYC();
    public static KYC getKyc(){
        return kyc;
    }
    private KYC(){}
}