public class KogumisKonto { 
     public static double intressiM22r; 
         private double kontoJ22k;

         public KogumisKonto() {
         intressiM22r = 0.00; //intressim22r aastas
         kontoJ22k = 0.0; //kogumiskonto esialgne j22k
         }

         public KogumisKonto(double intress, double j22k) {
         intressiM22r = intress;
         kontoJ22k = j22k;
         }

         public void sisestaSumma(double uusJ22k) { //kogumiskontole laekuv summa
         kontoJ22k = uusJ22k;
         }

         public double arvutaIntressiM22r() { //arvutan aastase intressisumma
         double intress = (kontoJ22k * intressiM22r/12); //intressim22r aastas jagatud kuude arvuga per aasta
         kontoJ22k = kontoJ22k + intress;
         return intressiM22r;
         }

         public double n2itaJ22ki() { //tagastan kogumiskonto j22gi
         return kontoJ22k;
         }

         public static void uuendaIntressiM22ra(double uusIntressiM22r) { //uuenda intressim22ra
         intressiM22r = uusIntressiM22r;
         }

         public double n2itaIntressiM22ra() {
         return intressiM22r;
         }
}











