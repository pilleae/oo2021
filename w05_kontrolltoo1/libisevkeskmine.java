//Koosta funktsioon massiivi libiseva keskmise leidmiseks. 
////Valjundiks on massiiv, mis on sisendist kahe elemendi vorra luhem ning mille iga elemendi vaartuseks on 
//sisendmassiivi vastava elemendi ning selle jargmise ja ulejargmise elemendi keskmine.
public class libisevkeskmine{

    public static double[] movingAvg(double[] num) {
        double[] avg = new double[num.length - 2];
        for(int i = 0; i < num.length - 2; i++) {
            avg[i] = (num[i]+ num[i+1] + num[i+2]) / 3;
        }
        return avg;
    }
    
    
    public static void main(String[] arg)throws Exception {
    double[] n = {11, 31, 5, 17, 9, 32, 41, 25, 29, 1, 4, 7, 22};
    double[] test = movingAvg(n);
    
    System.out.println("Massiivi libisevad keskmised: ");
    for(int i = 0; i < test.length; i++) {
        System.out.println(test[i]);
       }
    }
}
    