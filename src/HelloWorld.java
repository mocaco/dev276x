public class HelloWorld {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 0; i < 11; i++) {
            System.out.print(num + " ");
            num += num;
        }
        int c = 5;
        for (int i = 2; i <= c; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println("Tricky!");
            }
        }
        int x = 64;
        int y = 0;
        while (x % 2 == 0) {
            y++;
            x = x / 2;
        }
        System.out.println(x + " " + y);
        int z;
        for (z = 0; z <= 7; z += 7) {
            System.out.println("Here");
        }
        System.out.println(z);


    }
}
