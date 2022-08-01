public class TestRecursion {
    public static void main(String[] args) {
        int ret = factorial(5);
        System.out.println(ret);
    }

    public static int factorial(int n){
        if (n == 1){
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

}
