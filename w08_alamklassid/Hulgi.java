public class Hulgi extends KeraamilinePlaat {
    private int alusteArv;
   
    public Hulgi (int ruutmeetrid,double jaeHind,String v2rv, int alusteArv) {
    super(ruutmeetrid,jaeHind,v2rv);
    this.alusteArv = alusteArv;
    }
   
    public double getAllahindlus() {
    if (alusteArv > 10){
    return super.getAllahindlus() - (0.25 * super.getAllahindlus());
    }
    else {
    return super.getAllahindlus();
    }
    }
   }