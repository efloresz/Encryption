/*
Author: Emily Flores
Purpose: Program encrypts text provided by user.
Data Modified: 05/20/23
*/
import java.util.Scanner;
class Encryption {
    public static void main(String[] args){
        String word, updatedWord = "";
        System.out.print("Enter a word to encrypt: ");

        try{
            Scanner input = new Scanner(System.in);
            word = input.nextLine();
            for(int i = 0; i < word.length(); i++){
                char ch = Character.toLowerCase(word.charAt(i));
                // dictionary with a key of 3
                switch(ch){
                    case 'a':
                        updatedWord = updatedWord + "d";
                        break;
                    case 'b':
                        updatedWord = updatedWord + "e";
                        break;
                    case 'c':
                        updatedWord = updatedWord + "f";
                        break;
                    case 'd':
                        updatedWord = updatedWord + "g";
                        break;
                    case 'e':
                        updatedWord = updatedWord + "h";
                        break;
                    case 'f':
                        updatedWord = updatedWord + "i";
                        break;
                    case 'g':
                        updatedWord = updatedWord + "j";
                        break;
                    case 'h':
                        updatedWord = updatedWord + "k";
                        break;
                    case 'i':
                        updatedWord = updatedWord + "l";
                        break;
                    case 'j':
                        updatedWord = updatedWord + "m";
                        break;
                    case 'k':
                        updatedWord = updatedWord + "n";
                        break;
                    case 'l':
                        updatedWord = updatedWord + "o";
                        break;
                    case 'm':
                        updatedWord = updatedWord + "p";
                        break;
                    case 'n':
                        updatedWord = updatedWord + "q";
                        break;
                    case 'o':
                        updatedWord = updatedWord + "r";
                        break;
                    case 'p':
                        updatedWord = updatedWord + "s";
                        break;
                    case 'q':
                        updatedWord = updatedWord + "t";
                        break;
                    case 'r':
                        updatedWord = updatedWord + "u";
                        break;
                    case 's':
                        updatedWord = updatedWord + "v";
                        break;
                    case 't':
                        updatedWord = updatedWord + "w";
                        break;
                    case 'u':
                        updatedWord = updatedWord + "x";
                        break;
                    case 'v':
                        updatedWord = updatedWord + "y";
                        break;
                    case 'w':
                        updatedWord = updatedWord + "z";
                        break;
                    case 'x':
                        updatedWord = updatedWord + "a";
                        break;
                    case 'y':
                        updatedWord = updatedWord + "b";
                        break;
                    case 'z':
                        updatedWord = updatedWord + "c";
                        break;
                }

            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.print("The encrypted word is: " + updatedWord);
    }
}
