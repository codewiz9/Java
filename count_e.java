public class count_e {
    public static void main(String[] args) {
        //bellow I intlize values needed
        String word = "Ethan Koch";
        int count = 0;
        //bellow is the main loop that itrates through the word
        for (int i = 0; i < word.length(); i++){
            //bellow changes the word to lwoer case
            word = word.toLowerCase();
            //bellow is the main if statment that checks weather the letter at a given index is equal to e
            if (word.charAt(i) == 'e'){
                //bellow incrmats the count if the letter at index i is equal to e
                count++;
            }
        }
        System.out.println(count);
    }
}
