public class arvudeKeskmine {
    public static void main(String[] args){
        int[] num={102, 34, 22}; 
        //int count=0;
        int sum=0;
        for(int i=0; i<num.length; i++) 
            sum = sum + num[i];
            //count = count +1;
            double avg = sum/num.length;

        System.out.println("Arvude aritmeetiline keskmine: " + avg);
    }      
}