package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String firstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a search term: ");
        String searchWord = input.nextLine().toLowerCase();
        if (firstSentence.toLowerCase().contains(searchWord)) {
            //identify the found word length and location
            System.out.println(searchWord + " was found");
            System.out.println(searchWord + " is " + searchWord.length() + " characters long and begins at index "+ firstSentence.toLowerCase().indexOf(searchWord)+".");
            //create new strings to eliminate the specified word
            Integer wordLength = searchWord.length();
            Integer wordLoc = firstSentence.toLowerCase().indexOf(searchWord);
            String sub1 = firstSentence.substring(0, wordLoc);
            String sub2 = firstSentence.substring(wordLoc+wordLength, firstSentence.length()-1);
            //combine into a new sentence
            String newSentence = "";
            newSentence=newSentence.concat(sub1).trim().concat(sub2).trim();
            System.out.println(newSentence);
        }else{
            System.out.println(searchWord + " was not found");
        }
    }


}
