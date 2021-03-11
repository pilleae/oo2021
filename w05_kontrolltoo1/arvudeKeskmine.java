public class arvudeKeskmine {
    public static void main(String[] args){
        int[] num={102, 34, 22};
        float count=0;
        float sum=0;
        float avg=0;
        for(int i=0; i<3; i++){
            sum = sum + num[i];
            count = count +1;
            avg = sum/count;
        
        }
        
        System.out.println("Aritmeetiline keskmine: " + avg);
    }
}