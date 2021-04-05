public class Eelminehooaeg extends KeraamilinePlaat {
    private int aasta;
    //private int hooajaAllahindlus;
   
    public Eelminehooaeg (double ruutmeetrid,double jaeHind,String v2rv, int aasta) {
    super(ruutmeetrid,jaeHind,v2rv);
    this.aasta = aasta;
    //this.hooajaAllahindlus = hooajaAllahindlus;
    }
   
    public double getAllahindlus() {
        if (aasta < 2021){
            return super.getAllahindlus() - (0.5 * super.getAllahindlus());
        }
        else {
            
        return super.getAllahindlus() - (0.1 * super.getAllahindlus());
        }
        }
}