public class Test {
    int fact(int n){
        if (n <=1) return n;
        else return n*fact(n-1);
    }

    int power(int a, int n, int result) {
        if (n == 0) return result;
        return power(a, n-1, result * a);
    }

    int mul(int a, int b, int res) {
        if (b == 0) return res;
        return mul(a, b - 1, res + a);
    }
    public static void main(String... args) {
        Test t = new Test();
        int n = 5;
        System.out.println(t.fact(n));  
        System.out.println(t.power(4, 3, 1));
        System.out.println(t.mul(4, 5, 0));
    }
}