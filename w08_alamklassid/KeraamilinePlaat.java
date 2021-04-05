public class KeraamilinePlaat {

    private double ruutmeetrid;
    private String v2rv;
    private double jaeHind; //m2 hind
   
    public KeraamilinePlaat (double ruutmeetrid,double jaeHind,String v2rv) {
    this.ruutmeetrid = ruutmeetrid;
    this.jaeHind = jaeHind;
    this.v2rv = v2rv;
    }
   
    public double getAllahindlus() {
        return jaeHind * ruutmeetrid;
    }
   }
   