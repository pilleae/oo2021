
class Harjutus<P extends Number>{
    
    P[] arr;

    Harjutus(P[] ob){
        arr = ob;
    }

    double add(){
        double sum = 0.0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i].doubleValue();

        }

        return sum;
    }
}
