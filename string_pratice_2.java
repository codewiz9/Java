public class string_pratice_2 {
    public static void main(String[] args) {
        String f =  "wow ";
        String s = "you";
        String t = " rock ";
        String n = "";

        for (int i = 0; i < 3; i++){
            n = n.concat(f).concat(s).concat(t);
        }
        System.out.println(n);
    }
}
