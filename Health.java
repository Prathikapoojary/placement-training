package day3;

class patient{
    private String name;
   private  int age;
    private String Gender;
   private  double weight,hegiht,bmi;
   public String getName() {
    return name;
   }
   public void setName(String name) {
    this.name = name;
   }
   public int getAge() {
    return age;
   }
   public void setAge(int age) {
    this.age = age;
   }
   public String getGender() {
    return Gender;
   }
   public void setGender(String gender) {
    Gender = gender;
   }
   public double getWeight() {
    return weight;
   }
   public void setWeight(double weight) {
    this.weight = weight;
   }
   public double getHegiht() {
    return hegiht;
   }
   public void setHegiht(double hegiht) {
    this.hegiht = hegiht;
   }
   public double getBmi() {
    return bmi;
   }
   public void setBmi(double bmi) {
    this.bmi = bmi;
   }

}
public class Health {

    public static void calculate(patient object) {
        System.out.println(object.getName() + " bmi");
        double heightMeters = object.getHegiht() / 100.0;
        object.setBmi(object.getWeight() / (heightMeters * heightMeters));
        System.out.println(object.getBmi());
        calculate(object.getAge(), object.getBmi());
        calculate(object.getBmi(), object.getAge(), object.getGender());
    }

    public static void calculate(int age, double bmi) {
        System.out.println("body age");
        if (bmi < 18.5)
            System.out.println(age + 2);
        else if (bmi > 25)
            System.out.println(age + 5);
        else
            System.out.println(age);
    }

    public static void calculate(double bmi, int age, String gender) {
        System.out.println("fat rate");
        if (gender.equals("male"))
            System.out.println((1.20 * bmi) + (0.23 * age) - 16.2);
        else
            System.out.println((1.20 * bmi) + (0.23 * age) - 5.4);
    }

    public static void main(String[] args) {
        patient patient1 = new patient();
        patient1.setName("shi");
        patient1.setAge(34);
        patient1.setGender("male");
        patient1.setWeight(68.2);
        patient1.setHegiht(158);

        patient patient2 = new patient();
        patient2.setName("kii");
        patient2.setAge(21);
        patient2.setGender("female");
        patient2.setWeight(85.2);
        patient2.setHegiht(155);

        calculate(patient2);
        calculate(patient1);
    }
}/*ublic class Health {
       public static void  calculate (int age,double bmi){
        System.out.println("body age");
        if(bmi<18.5)
            System.out.println(age+2);
        else if(bmi>25) 
            System.out.println(age+5);
        else System.out.println(age ); 
    
    
    }
    public static void  calculate(double bmi,int age,String gender){
        System.out.println("fat rate");
        if(gender.equals("male"))
            System.out.println((1.20*bmi)+(0.23*age)-16.2);
        else
            System.out.println((1.20*bmi)+(0.23*age)-5.4);
    }
       public static void calculate(patient object) {
        System.out.println(object.getName() + " bmi");
        double heightMeters = object.getHegiht() / 100.0;
        object.bmi = object.getWeight() / (heightMeters * heightMeters);
        System.out.println(object.bmi);
        calculate(object.age, object.bmi);
        calculate(object.bmi, object.age, object.Gender);
    } 
       
    public static void main(String[] args) {
        patient patient1 =new patient();
        patient1.name ="shi";
        patient1.age=34;
        patient1.Gender="male";
        patient1.weight=68.2; patient1.hegiht=158;

        patient patient2 =new patient();
        patient2.name ="kii";
        patient2.age=21;
        patient2.Gender="female";
        patient2.weight=85.2; patient2.hegiht=155;
          calculate(patient2);
          calculate(patient1);
    }
    
}*/
