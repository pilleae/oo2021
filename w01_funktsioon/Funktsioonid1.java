public class Funktsioonid1{
    //Sis km, valj hind
    //sisseistumistasu 3 eurot, kilomeetri hind 80 senti.
    
    public static double taksoSoit(double k){
		return 3+k*0.80;
	}
    public static String tempHinnang(int t){
        if(t<18){return "kylm";}
        return "soe";
    }
    public static double ringPindala(double r){
        return Math.PI*r*r;
    }
    public static void main(String[] arg){
        System.out.println(ringPindala(5));
        if(arg.length==1){
            System.out.println(
             tempHinnang(
               Integer.parseInt(arg[0])));
        }
        System.out.println(taksoSoit(2));
    }
}