package com.example.mac.week1testpart2part2lettercount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public static void main(String[] args) {

        char[] letters = new char[26];// Array for alphabet
        int[] count = new int[26];// Array for letter count
        for (int i = 0; i < 26; i++) {
            letters[i] = (char) (i + 97); // populate array with alphabet
            count[i] = 0; // initilize count array
        }
        String testString = "supercalifragilisticexpialidocious"; // test string
        System.out.println(testString);
        for (int i = 0; i < testString.length(); i++){ // loop through test string
            for (int j = 0; j < 26; j++){ // loop through alphabet
                if (testString.charAt(i) == letters[j]){ // compare test character to alphabet
                    count[j]++; // increment count when true
                }
            }
        }
        for (int x = 0; x < 26; x++){ // loop through count array
            System.out.println(letters[x]+ ":"+count[x]); // print out results
        }
    }
}
