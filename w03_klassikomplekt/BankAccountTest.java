public class BankAccountTest
{

    public static void main(String[] args)
    {
        Bank Kodupank = new Bank("Kodupank");
        Bank Hiina = new Bank("Hiina Pank");
        BankAccount Pille = new BankAccount("1111111", 150, "Kodupank");
        BankAccount Mati = new BankAccount("2222222", 200, "Hiina Pank");

        System.out.printf("Pangas " + Pille.getName() + " avatud kontol numbriga #%s on vaba j22k $%.2f%n", Pille.getAccount(), Pille.getBalance());

        System.out.println("----------------------------------------------------------------------------- ");

        System.out.printf("Pangas " + Mati.getName() + " avatud kontol numbriga #%s on vaba j22k $%.2f%n", Mati.getAccount(), Mati.getBalance());
        
        System.out.println("----------------------------------------------------------------------------- ");
        
        
        Mati.TransactionB(Pille, 10);
        System.out.println("\nPeale tehingut \"Mati.Transaction(Pille, 10)\" ...");
        System.out.printf("Konto numbriga #%s j22k: $%.2f%n", Pille.getAccount(), Pille.getBalance());
        System.out.printf("Konto numbriga #%s j22k: $%.2f%n", Mati.getAccount(), Mati.getBalance());

        System.out.println("----------------------------------------------------------------------------- ");

        Mati.TransactionA(Pille, 20);
        System.out.println("\nPeale tehingut \"Mati.Transaction(Pille, 20)\" ...");
        System.out.printf("Konto numbriga #%s j22k: $%.2f%n", Pille.getAccount(), Pille.getBalance());
        System.out.printf("Konto numbriga #%s j22k: $%.2f%n", Mati.getAccount(), Mati.getBalance());

        System.out.println("----------------------------------------------------------------------------- ");

        Pille.NewInterest(0.4, 1); //intressim22r, ja periood aastas
        System.out.printf("Pangas " + Pille.getName() + " avatud kontol numbriga #%s: ", Pille.getAccount() + " on valitud intressim22ra ja perioodi j2rel juurde kogunenud summa: " + Pille.getBalance() + " eurot");

    }
}