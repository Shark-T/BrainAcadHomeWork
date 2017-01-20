package lab2_4;

/**
 * Created by SHARK on 18.01.2017.
 */
 // 2_4_5 рассчет числа Пи
public class MyCalc {
    public static double calcPi(int bound){
        double result = 0;
        int count = 0;
        for (double i=1; i<bound; i+=2){
            count++;
            result+=(count%2 ==0)? -4/i : 4/i;
         }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calcPi(5000000));
    }


}
