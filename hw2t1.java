import java.util.InputMismatchException;
import java.util.Scanner;


public class hw2t1 {

    // 1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. 
    //Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
    public static void main(String[] args) {
        System.out.println(inFloat());
    }

    public static float inFloat() {
        try{
           Scanner in = new Scanner(System.in);
           System.out.print("Input a number: ");
           float num = in.nextFloat();
           in.close();
           return num;
        } catch (InputMismatchException e){
            System.out.println("неверно введено дробное число, дробное число вводится через запятую и числами");
        }
        return inFloat();
    }
}

