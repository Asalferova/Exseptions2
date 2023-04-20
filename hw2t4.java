import java.util.Scanner;

public class hw2t4 {
    public static void main(String[] args) {
        System.out.println(isEmptyString());
    }


    // Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
    // Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

    public static String isEmptyString() {
           Scanner in = new Scanner(System.in);
           System.out.print("Input a String: ");
           String s = in.nextLine();
           in.close();
           if(s == null || s.isEmpty()){
                throw new RuntimeException("пустые строки вводить нельзя");
           }
           return s;
    }
}

