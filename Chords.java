/*
* Thomas Levine
* Chords Project
*******************
* Display guitar chords given user input with note name and chord quality
* 12-09-2020
 */

// TO-DO
// 1) improve formatting with output
// 2) increase flexibility in user response
// 3) add more complex chord types (diminished, half diminished, fully diminished,
//      major seventh, dominant seventh, maj/min seventh, augmented, altered chords, etc)
// 4) add option for piano roll, or sheet music version
//     - figure out if it is possible to use images for output
// 5) add descriptions of chords in increasing complexity
//    i.e. E major (campfire chord) to variations like Emajor7 or E9
// 6) brainstorm more efficient system for storing tabs and generating chords

package ChordsProj;

import java.util.ArrayList;
import java.util.Scanner;

public class Chords {

    public static Chord userInput() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a note name: ");
        String noteName = input.nextLine();
        noteName = noteName.toLowerCase();

        System.out.print("Enter a chord quality: ");
        String quality = input.nextLine();
        quality = quality.toLowerCase();

        return new Chord(noteName, quality);
    }

    public static String repeatResponse() {
        Scanner input = new Scanner(System.in);

        System.out.print("Would you like to enter another chord? (Yes/No): ");
        String response = input.nextLine();
        response = response.toLowerCase();

        return response;
    }

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       boolean flag;
       ArrayList<Chord> chordList = new ArrayList<>();
        do {
            // obtain desired chords from user
            // get note name
            // get chord quality
            Chord userRequest = userInput();

            // output tab notation
            String[] output = userRequest.getGuitarTab();

            // ask if they would like to continue
           String response = repeatResponse();
            if (response.equals("yes")) {
                chordList.add(userRequest);
                flag = true;
            } else {
                System.out.println("\nChords:");
                chordList.add(userRequest);
                for (Chord chord : chordList) {
                    chord.printTab();
                }
                flag = false;
            }
        } while (flag);
    }
}
