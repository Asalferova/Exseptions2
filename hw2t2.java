public class hw2t2 {
    // 2. Если необходимо, исправьте данный код 
    public static void main(String[] args) {
        int [] intArray = new int [] {1,2,3,4,5,6,7,8,9};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("на ноль делить нельзя: " + e);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("в массиве меньше 8 элементов: " + e);
        } 
    } 
}
