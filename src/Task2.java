//Task 2. Вычислить n! (произведение чисел от 1 до n)
public class Task2 {
    static int calculateFactorial(int n){
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(calculateFactorial(5));
    }
}
