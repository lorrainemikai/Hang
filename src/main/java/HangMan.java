// package main.java;

import java.io.Console;

// import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;

// import sun.security.x509.PrivateKeyUsageExtension;
public class HangMan {
    private String word;
    private int chances;
    private int attempts;
    Console myConsole = System.console();
    
    public String CheckifMatchFound(String TheWord){

        word = TheWord;
        attempts = 10;
        int score = 0;
        char[] characters = word.toCharArray();
        char[] store = new char[characters.length];
        for(int j=0;j<store.length;j++){
            store[j] = '*';
        }
        String answer = new String(store);
        StringBuilder fill = new StringBuilder(answer); 
        for(int e=0;e<11;e++){            
            System.out.println(characters.length + " Letter Word");
            System.out.println("NUMBER OF ATTEMPTS: " + attempts + "\r\nPUT IN THY CHARACTER THAT YOU DARE!!!");
            String guessed = myConsole.readLine().toUpperCase();
            char letter = guessed.charAt(0);
            System.out.println("Guessed Letter: " + letter);
            for(int a=0;a<characters.length;a++){
               if(letter == characters[a]){
                   fill.setCharAt(a, letter);
                   System.out.println(fill);
                   score++;
               }
            }
            chances++;
            attempts--;
            if(score == characters.length){
                System.out.println("HA HA HA ITS OVER");
                e=11;
            }
            if(chances == 11){
                System.out.println("HA HA HA BETTER LUCK NEXT TIME!");
            }

        }



    //     CheckIfBlankCorrectAnsIsSet();
    //     int UserInputlength = UserInput.length();
    //     if (UserInputlength > 1){
    //         if(TheWord.equals(UserInput)){
    //             GameOn = false;
    //             Message = "WoN";

    //             System.out.println("YOu "+ Message);
    //         }else if(TheWord.equals(UserInput)){
    //             GameOn = false;
    //             Message = "Lost";
    //             wrongCount = 7;
    //             System.out.println("YoU " + Message);
    //         }else {
    //             char c = UserInput.charAt(0);
    //             CheckifCHarFound(c);

    //             while(GameOn){
    //                 if(word.equals((CorrectAns))){
    //                     GameOn = false;
    //                     Message = "WoN";
    //                     System.out.println("You "+ Message);
    //                 }else{
    //                     Console myConsole =System.console();
    //                     System.out.println("What correct so far:" + CorrectAns);
    //                     System.out.println("Wrong Answers" + WrongAns);
    //                     System.out.println("");
    //                     System.out.println("Enter another character");
    //                     String input = myConsole.readLine().toUpperCase();
    //                     CheckifMatchFound(word, input);
    //                 }
    //             }
    //         }

    //     }
    //     return Message;
    // }
    //     public static void CheckifCHarFound(char guess){
    //         int index = word.indexOf(guess);
    //         if(index > -1){
    //           while (index >= 0) {
    //               StringBuilder UpdateCorrectChars = new StringBuilder(CorrectAns);
    //               UpdateCorrectChars.setCharAt(index, guess);
    //               index = word.indexOf(guess, index + 1);
    //               CorrectAns = UpdateCorrectChars.toString();
    //           }
    //         }else{
    //            StringBuilder UpdateWrongAns = new StringBuilder(WrongAns);
    //            UpdateWrongAns.append(guess);
    //            UpdateWrongAns.append(" ");
    //            WrongAns = UpdateWrongAns.toString();
    //            wrongCount++;
    //            if(wrongCount > 6){
    //              GameOn = false;
    //              Message = "Lost";
    //              System.out.println("You " + Message);
       
    //            }
    //         }
    //       }
    //    public static void CheckIfBlankCorrectAnsIsSet(){
    //        if (CorrectAns.length()<1){
    //            int Wordlength = word.length();
    //            for(int i = 0; i<Wordlength;i++){
    //                CorrectAns = CorrectAns + "_";
    //            }
    //        }
    //    }
    return TheWord;
    }
    }
