
public class KogumisKontoTest {
     public static void main(String[] args) {

     KogumisKonto pille = new KogumisKonto();
     
     pille.sisestaSumma(15000.00); //kogumiskontole kantav summa
     pille.arvutaIntressiM22r();
     System.out.printf("Sinu kogumiskontole kantud summa on: %.2f\n",pille.n2itaJ22ki());
     
     KogumisKonto.uuendaIntressiM22ra(0.05); //m22ran intressim22r
     pille.arvutaIntressiM22r();
     System.out.printf("Inressim22r on: %.2f\n",pille.n2itaIntressiM22ra());
     System.out.printf("Aasta p2rast on Sinu kogumiskontole kogunenud summa:%.2f\n",pille.n2itaJ22ki());


     }
}