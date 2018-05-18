// package main.java;

import java.io.Console;
import java.util.Random;

public class App{
    public static void main(String[] args) {
        
    String[] Words= new String []{"confetti","bamboo","shopaholic","dinner","vampire"};
    Random rand = new Random();
    int i = rand.nextInt(Words.length);

String ThePickedWord = Words[i];


HangMan hangMan = new HangMan();
Console myConsole = System.console();
hangMan.CheckifMatchFound(ThePickedWord);

    }

        }