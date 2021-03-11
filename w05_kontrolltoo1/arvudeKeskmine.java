public class arvudeKeskmine {
    public static void main(String[] args){
        int[] num={102, 34, 22};
        int count=0;
        int sum=0;
        int avg=0;
        for(int i=0; i<3; i++){
            sum = sum + num[i];
            count = count +1;
            avg = sum/count;
        
        }
        
        System.out.println("Arvude ymardatud aritmeetiline keskmine: " + avg);
    }
}