public class Proov5 {
    public static void kuvaOlek(Voolujuht v) {
        if(v.kasJuhib()) {
			System.out.println("Juhib");
		} else {
			System.out.println("Ei juhi");
		}
	}	
	public static void main(String[] arg) {
       
        Lyliti a = new Lyliti();
        Lyliti b = new Lyliti();
        Lyliti c = new Lyliti();
        Lyliti d = new Lyliti();
        Lyliti e = new Lyliti();
        Lyliti f = new Lyliti();
        Lyliti g = new Lyliti();
       

        Jadayhendus j1 = new Jadayhendus();
        Jadayhendus j2 = new Jadayhendus();
        Jadayhendus j3 = new Jadayhendus();
        
        
        Roopyhendus r1 = new Roopyhendus();
        Roopyhendus r2 = new Roopyhendus();
        Roopyhendus r3 = new Roopyhendus();

        r1.lisa(a);
        r1.lisa(b);
        j1.lisa(r1);
        j1.lisa(g);
        j1.lisa(r3);
        j2.lisa(e);
        j2.lisa(f);
        r2.lisa(j1);
        r2.lisa(j2);
        r3.lisa(c);
        r3.lisa(d);
        
    
        a.seisund(true);
        b.seisund(false);
        c.seisund(false);
        d.seisund(true);
        e.seisund(true);
        f.seisund(true);
        g.seisund(true);
        kuvaOlek(j2);

        
        a.seisund(false);
        b.seisund(false);
        c.seisund(false);
        d.seisund(true);
        e.seisund(true);
        f.seisund(true);
        g.seisund(true);
        kuvaOlek(j2);
    }
}