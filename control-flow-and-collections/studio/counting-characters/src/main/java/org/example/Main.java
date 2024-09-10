package org.example;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);

        HashMap<Character, Integer> record = new HashMap<>();
        System.out.println("Please enter a sentence:");
        String text = input.nextLine();
        text = text.toUpperCase();
        input.close(); //Ending scanner to save memory

        char[] charactersInString = text.toCharArray();

        char current;
        for(int i = 0; i < charactersInString.length; i++) {
            //System.out.println(charactersInString[i]);
            current = charactersInString[i];
            if(Character.isAlphabetic(current));
            if(!record.containsKey(current)) {
                record.put(current, 1); // adding new record to HashMap
            } else {
                record.put(current, record.get(current)+1);// increment record key's value of character
            }

        }
           for(Character letter : record.keySet()) {
               System.out.println(letter + ": " + record.get(letter));
           }
        }
    }
