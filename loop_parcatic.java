public class loop_parcatic {
    public static void do_loop(){
        int x = 3;
        do {
            System.out.println(x);
            x--;
    } while(x > 3);
    System.out.println("do loop test");
    }

    public static void while_loop(){
        int x = 3;
        while (x > 0) {
            System.out.println(x);
            x--;
        }
        System.out.println("blastoff");
    }

    public static void main(String[] args) {
        do_loop();
        while_loop();
    }
}
