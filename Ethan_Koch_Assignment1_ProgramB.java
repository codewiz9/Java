
public class Ethan_Koch_Assignment1_ProgramB{
    public static void main(String[] args) {
            //I declar the word that I will use in the following loop//
            //I also repeate the same prosses for all words
            String word1 = "Samford";
            int count1 = 0;
            //I loop through the word//
            for (int j = word1.length()-1; j >= 0; j--){
                //Bellow I take a char out of the word//
                char c = word1.charAt(j);
                //I use the following if statment to check if the char i got above is a voulw then i incrment count
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    //I incremnt the count by one to relefct there being a vowl in the string
                    count1++;
                }
        }
        //bellow I roint my result//
        System.out.println("There are " + count1 + " vowles in the string " + word1);
        //I repate the prosses above for all the requsted strings
        String word2 = "Italy";
        int count2 = 0;
        for (int j = word2.length()-1; j >= 0; j--){
            char c = word2.charAt(j);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count2++;
            }
    }
    System.out.println("There are " + count2 + " vowles in the string " + word2);


    String word3 = "I want to go to the football game";
    int count3 = 0;
    for (int j = word3.length()-1; j >= 0; j--){
        char c = word3.charAt(j);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            count3++;
        }
}
System.out.println("There are " + count3 + " vowles in the string " + word3);

String word4 = "Barnes and Noble Bookstore";
int count4 = 0;
for (int j = word4.length()-1; j >= 0; j--){
    char c = word4.charAt(j);
    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        count4++;
    }
}
System.out.println("There are " + count4 + " vowles in the string " + word4);

String word5 = "Smith";
int count5 = 0;
for (int j = word5.length()-1; j >= 0; j--){
    char c = word5.charAt(j);
    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        count5++;
    }
}
System.out.println("There are " + count5 + " vowles in the string " + word5);


            }
    }