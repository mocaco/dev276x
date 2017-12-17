import static java.lang.System.out;

public class starStringClass {

    public static void main(String[] args) {

//        out.print(starString(10));
        out.print(repeat("hi", 3));

    }

    ////https://practiceit.cs.washington.edu/problem/view/cs2/sections/recursion/starString
    public static String starString(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();

        } else if (n == 0) {
            return "*";
        } else if (n == 1) {
            return "**";
        } else {
            return starString(n - 1) + starString(n - 1);
        }
    }
    //https://practiceit.cs.washington.edu/problem/view/bjp4/chapter12/e11-repeat

    public static String repeat(String s, int n) {
        if (n < 0) {
            throw new IllegalArgumentException();

        } else if (n == 0) {
            return "";
        } else if (n == 1) {
            return s;
        } else {
            return repeat(s, n - 1) + s;
        }
    }

    //https://practiceit.cs.washington.edu/problem/view/bjp4/chapter12/s3-mystery1

    public void mystery1(int n) {
        if (n <= 1) {
            System.out.print(n);
        } else {
            mystery1(n / 2);
            System.out.print(", " + n);
        }
    }


}
