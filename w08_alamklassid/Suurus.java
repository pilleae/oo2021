public class Suurus extends KeraamilinePlaat {
    private int laius;
    private int k6rgus;
   
    public Suurus (double ruutmeetrid,double jaeHind,String v2rv, int laius, int k6rgus) {
    super(ruutmeetrid,jaeHind,v2rv);
    this.laius = laius;
    this.k6rgus = k6rgus;
    }
   
    public double getAllahindlus() {
    if (laius < 20 && k6rgus < 20) {

    return super.getAllahindlus() - (0.05 * super.getAllahindlus());
    }
    else {
        
    return super.getAllahindlus() - (0.1 * super.getAllahindlus());
    }
    }
   }