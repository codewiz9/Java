public class Ethan_Koch_Assignment1_ProgramA {
    public static void main(String[] args) {
        //bellow I intlize all the varribles I will use
        int num_1 = 0;
        int num_2 = 1;
        int num_3;
        //I loop through 10 times to rpint 10 numbers
        for (int i = 0; i < 10; i++){
            //num1 will alwys be the value where the next number is stored so i rint it first
            System.out.println(num_1);
            //num 3 is the next number and I caulate it by adding the two previous numbers
            //wich are stored in num2 and num2 together
            num_3 = num_1 + num_2;
            //num2 will alwys hold the next value the in the sequence so i set num1 equla to num2
            num_1 = num_2;
            //num2 is set equal to num3 bc num3 is the next next number
            num_2 = num_3;
        }
    }
}
