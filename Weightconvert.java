import java.util.Scanner;

public class Weightconvert {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         double weight;
         double newWeight;
         int choice;

         System.out.println("Weight Conversion Program:");
         System.out.println("1: Convert lbs to kgs");
         System.out.println("2: Convert kgs to lbs");

         System.out.print("Choose an option:");
         choice =sc.nextInt();

         if(choice==1){
            System.out.print("Enter the weiht in lbs: ");
            weight =sc.nextDouble();
            newWeight=weight*0.453592;
            System.out.println("The new Weight in kgs: "+newWeight);
                 }
         if(choice==2){
            System.out.print("Enter the weight in kgs: ");
            weight =sc.nextDouble();
            newWeight=weight*2.20462;
            System.out.println("The new Weight in lbs: %.2f"+newWeight);
                 }
       else{
System.out.println("That ws nt a valid choice");
}
sc.close();
    }
    
}
