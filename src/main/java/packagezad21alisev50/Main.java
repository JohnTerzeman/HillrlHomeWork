package packagezad21alisev50;

public class Main {
    public static void main(String[] args) {
        //4! = 4321
        //1!=1
        //15!=151413...1
        //0!=1
        System.out.println(fac(4));
    }

    //fac(4
    //46=24
    //32=6
    //21
    //fac(1) = return 1;
    private static int fac(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fac(n - 1);
    }

}
