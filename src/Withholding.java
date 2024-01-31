import java.util.Scanner;
public class Withholding {
    //Setting up a scanner for user input. Declaring variable //
    // double is used since working with decimals//
    public static void main(String[] args){
        System.out.println("Enter your weekly income:");


        Scanner input = new Scanner(System.in);
        double income;

        income = input.nextDouble();

        //Beginning an if-else statement for the four statements//
        //income < 500$/10% //
        if (income < 500.00){
            income = income * .1;
            System.out.println("Your average tax withholding is:" + " " + income);
        }
        //income >= $500 < $1500/15% //
        else if (income >= 500.00 && income < 1500.00) {
            income = income * .15;
            System.out.println("Your average tax withholding is:" + " " + income);
        }
        //income >= 1500 < 2500/20% //
         else if (income >= 1500.00 &&  income < 2500.00){
             income = income * .2;
            System.out.println("Your average tax withholding is:" + " " + income);
        }
        //income > 2500/30 //
         else  {
             income = income * .3;
            System.out.println("Your average tax withholding is:" + " " + income);
        }


    }
}
