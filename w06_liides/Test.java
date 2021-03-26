public class Test 
{ 
  public static void main(String[] args) 
  { 
    Pindala ring; //uus liides
    ring = new Ring(); // loob uue objekti Ring
    float Ring = ring.arvutaPindala(20.5f, 17.5f); //x, y v22rtused
    System.out.println("Ringi pindala on: " +Ring+" cm2"); 
    
    Pindala ruut;//uusliides
    ruut = new Ruut(); // Loob uue objekti Ruut
    float Ruut = ruut.arvutaPindala(23, 11.5f); //x,y v22rtused
    System.out.println("Ruudu pindala on: " +Ruut+" cm2"); 
  } 
}