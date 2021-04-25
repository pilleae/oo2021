
class Test{
    public static void main(String [] args){

        Integer i_arr[] = {6, 7, 89, 78, 6, 45, 3, 78, 90, 67, 45, 34, 45, 34, 34, 6, 43, 57, 43};
        Harjutus<Integer> a = new Harjutus<Integer>(i_arr);

        Double d_arr[] = {1.5,2.5,6.5,8.5,9.5, 11.6, 17.8, 23.6, 98.7, 12.5, 34.2, 46.2};
        Harjutus<Double> b= new Harjutus<Double>(d_arr);

        double i_sum = a.add();
        double d_sum = b.add();


        System.out.println("Arvude summa on: " + i_sum);
        System.out.println("Arvude summa on: " + d_sum);

    }
}
