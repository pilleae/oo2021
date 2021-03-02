public class KogumisKonto { 
     public static double intressiM22r; 
         private double kontoJ22k;

         public KogumisKonto() {
         intressiM22r = 0.00; 
         kontoJ22k = 0.0; 
         }

         public KogumisKonto(double intress, double j22k) {
         intressiM22r = intress;
         kontoJ22k = j22k;
         }

         public void sisestaSumma(double uusJ22k) { 
         kontoJ22k = uusJ22k;
         }

         public double arvutaIntressiM22r() { 
         double intress = (kontoJ22k * intressiM22r/12); 
         kontoJ22k = kontoJ22k + intress;
         return intressiM22r;
         }

         public double n2itaJ22ki() { 
         return kontoJ22k;
         }

         public static void uuendaIntressiM22ra(double uusIntressiM22r) { 
         intressiM22r = uusIntressiM22r;
         }

         public double n2itaIntressiM22ra() {
         return intressiM22r;
         }
}


