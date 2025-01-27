import java.util.Scanner;

public class algorithm_numbers {
    public static void largest(int a, int b, int c){
        if ((a > b) && (a > c)){
            System.out.println(a);
        }else if ((b > c) && (b > a)){
            System.out.println(b);
        }else{
            System.out.println(c);
        }}
    public static void mean(int d, int e, int f){
        double mean = (d + e + f) / 3.0;
        System.out.println(mean);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); 
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        String option = scanner.nextLine();

        if (option == "l"){
            largest(a, b, c);
        }else if (option == "m"){
            mean(a, b, c);
        }
    }
}