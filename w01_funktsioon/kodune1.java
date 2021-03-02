import java.util.Scanner;

public class kodune1{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        System.out.print("Sisesta kaal kilogrammides: ");
        double kaal = input.nextDouble();

        System.out.print("Sisesta pikkus meetrites: ");
        double pikkus = input.nextDouble();

        // arvutan kehamassiindeksi NB pikkus sentimeetrites
        double BMI = kaal / (pikkus*pikkus);


        //NB pikkus teisendada!!
        double ideaal = (2.2 * BMI) + (3.5 * BMI) * (pikkus/100) - 1.5;
    

        System.out.printf("Sinu ideaalkaal on: %.1f\n", ideaal);
        System.out.printf("Sinu kehamassiindeks on: %.1f\n", BMI);

        if (BMI < 18.5 ) {
            System.out.println("Oled alakaalus!");
        }

        else if (BMI >= 18.5 && BMI < 25) {
            System.out.println("Oled normaalkaalus!");
        }

        else if (BMI >= 25 && BMI< 30) {
            System.out.println("Oled kerges v6i m66dukas ylekaalus!");
        }

        else if (BMI >= 30) {
            System.out.println("Oled rasvunud, v6ta midagi ette!");
        }

    }
    
}
