public class Massivi {
    public static void main(String[] args) {
        int myArray []= {5,3,67};
        int sum = 0;
        int myArray2 [] = {5,7,0};
        int sum2 = 0;
        int myArray3 [] = {2,4,6};
        int sum3 = 0;


        for (int i = 0; i < myArray.length; i ++){
            sum = sum + myArray[i];
        }


        for (int i = 0; i < myArray2.length; i ++){
            sum2 = sum2 + myArray2[i];
        }


        for (int i = 0; i < myArray3.length; i ++){
            sum3 = sum3 + myArray3[i];
        }



        if (sum>sum2 && sum>sum3){
                System.out.println("Максимальная сумма чисел из трёх массивов равна " + sum);
        }else if (sum2>sum && sum2>sum3){
                System.out.println("Максимальная сумма чисел из трёх массивов равна " + sum2);
        }else if (sum3>sum && sum3>sum2){
                    System.out.println("Максимальная сумма чисел из трёх массивов равна " + sum3);
            }
    }
}
