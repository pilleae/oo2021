public class test8 {
    //(double ruutmeetrid,double jaeHind,String v2rv, int aasta)
    public static void main(String[] args) 
    {
        Suurus plaaditellimus4 = new Suurus(11,6,"Must/matt",15,15);
        Eelminehooaeg plaaditellimus3 = new Eelminehooaeg(30,9,"Kollane/matt",2019);
        Hulgi plaaditellimus2 = new Hulgi(100,5,"Sinine/horisontaalnetriip",12);
        KeraamilinePlaat plaaditellimus1 = new KeraamilinePlaat(10,5,"Punane/korglaige");

     System.out.printf("\n Tellimus 1 hind: %.2f", plaaditellimus1.getAllahindlus());
     System.out.printf(" eurot");
     System.out.printf("\n Tellimus 2 hind: %.2f", plaaditellimus2.getAllahindlus());
     System.out.printf(" eurot");
     System.out.printf("\n Tellimus 3 hind: %.2f", plaaditellimus3.getAllahindlus());
     System.out.printf(" eurot");
     System.out.printf("\n Tellimus 4 hind: %.2f", plaaditellimus4.getAllahindlus());
     System.out.printf(" eurot");
     System.out.printf("\n");

     
     }
    }


