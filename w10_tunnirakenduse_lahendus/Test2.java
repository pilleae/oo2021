class Test2{

    public static void main(String arg[]){

    Andmed<Integer> a=new Andmed<Integer>(); 
    Andmed<Double> b=new Andmed<Double>();  
    Andmed<Tudeng> c=new Andmed<Tudeng>();  

    a.push(10);
    a.push(20);
    a.push(30);
    
    b.push(1.2);
    b.push(2.34);
    b.push(56.789);
    b.push(0.15);
    
    c.push( new Tudeng("Mari",2) );
    c.push( new Tudeng("Paul",3) );
    c.push( new Tudeng("Oskar",7) );
    c.push( new Tudeng("Paabut",5) );
    c.push( new Tudeng("Malle",5) );
    c.push( new Tudeng("Jaana",5) );
    c.push( new Tudeng("Taavi",5) );
    
    System.out.println("\nIntegers:");
    while(a.hasElements()){
    System.out.println(a.pop());
    }
    
    System.out.println("\nDoubles:");
    while(b.hasElements()){
    System.out.println(b.pop());
    }
    
    System.out.println("\nTudengid:");
    while(c.hasElements()){
    System.out.println(c.pop());
}
}
}