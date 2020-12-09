/*
*Thomas Levine
* Chords Project
* ****************
* Display guitar chords given user input with note name and chord quality
* --> This file is for the Chord type
* 12-09-2020
 */

package ChordsProj;

public class Chord {
    private String note;
    private String quality;
    private String name;
    private String[] guitarTab;

    public Chord(String note, String quality) {
        this.note = note.toLowerCase();
        this.quality = quality.toLowerCase();
        this.name = this.note.toUpperCase() + " " + this.name;

        // populate this.guitarTab with helper method from constructor
        this.tabHelper(this.note, this.quality);
    }

    public void tabHelper(String note, String quality) {
        /*
        OUTPUT NOTATION
        ---3---
        ---0---
        ---0---
        ---0---
        ---2---
        ---3---
        G major
         */

        String line1 = "";
        String line2 = "";
        String line3 = "";
        String line4 = "";
        String line5 = "";
        String line6 = "";
        String line7 = "";
        // try outputting G major
        if (note.equals("g")) {
            if (quality.equals("major")) {
                line1 = "---3---";
                line2 = "---0---";
                line3 = "---0---";
                line4 = "---0---";
                line5 = "---2---";
                line6 = "---3---";
                line7 = "G major";
            } else {
                line1 = "---3---";
                line2 = "---3---";
                line3 = "---3---";
                line4 = "---5---";
                line5 = "---5---";
                line6 = "---3---";
                line7 = "G minor";
            }
        } else if (note.equals("c")) {
            if (quality.equals("major")) {
                line1 = "---0---";
                line2 = "---1---";
                line3 = "---0---";
                line4 = "---2---";
                line5 = "---3---";
                line6 = "---x---";
                line7 = "C major";
            } else {
                line1 = "---3---";
                line2 = "---4---";
                line3 = "---5---";
                line4 = "---5---";
                line5 = "---3---";
                line6 = "---x---";
                line7 = "C minor";
            }
        } else if (note.equals("f")) {
            if (quality.equals("major")) {
                line1 = "---1---";
                line2 = "---1---";
                line3 = "---2---";
                line4 = "---3---";
                line5 = "---3---";
                line6 = "---1---";
                line7 = "F major";
            } else {
                line1 = "---1---";
                line2 = "---1---";
                line3 = "---1---";
                line4 = "---3---";
                line5 = "---3---";
                line6 = "---1---";
                line7 = "F minor";
            }
        } else if (note.equals("bb")) {
            if (quality.equals("major")) {
                line1 = "---6---";
                line2 = "---6---";
                line3 = "---7---";
                line4 = "---8---";
                line5 = "---8---";
                line6 = "---6---";
                line7 = "Bb major";
            } else {
                line1 = "---6---";
                line2 = "---6---";
                line3 = "---6---";
                line4 = "---8---";
                line5 = "---8---";
                line6 = "---6---";
                line7 = "Bb minor";
            }
        } else if (note.equals("eb")) {
            if (quality.equals("major")) {
                line1 = "---6---";
                line2 = "---7---";
                line3 = "---8---";
                line4 = "---8---";
                line5 = "---6---";
                line6 = "---x---";
                line7 = "Eb major";
            } else {
                line1 = "---6---";
                line2 = "---6---";
                line3 = "---8---";
                line4 = "---8---";
                line5 = "---6---";
                line6 = "---x---";
                line7 = "Eb minor";
            }
        } else if (note.equals("ab") || note.equals("g#")) {
            if (quality.equals("major")) {
                line1 = "---4---";
                line2 = "---4---";
                line3 = "---5---";
                line4 = "---6---";
                line5 = "---6---";
                line6 = "---4---";
                line7 = "Ab major";
            } else {
                line1 = "---4---";
                line2 = "---4---";
                line3 = "---4---";
                line4 = "---6---";
                line5 = "---6---";
                line6 = "---4---";
                line7 = "Ab minor";
            }
        } else if (note.equals("db") || note.equals("c#")) {
            if (quality.equals("major")) {
                line1 = "---4---";
                line2 = "---5---";
                line3 = "---6---";
                line4 = "---6---";
                line5 = "---4---";
                line6 = "---x---";
                line7 = "Db major";
            } else {
                line1 = "---4---";
                line2 = "---4---";
                line3 = "---6---";
                line4 = "---6---";
                line5 = "---4---";
                line6 = "---x---";
                line7 = "Db minor";
            }
        } else if (note.equals("gb") || note.equals("f#")) {
            if (quality.equals("major")) {
                line1 = "---2---";
                line2 = "---2---";
                line3 = "---3---";
                line4 = "---4---";
                line5 = "---4---";
                line6 = "---2---";
                line7 = "F# major";
            } else {
                line1 = "---2---";
                line2 = "---2---";
                line3 = "---2---";
                line4 = "---4---";
                line5 = "---4---";
                line6 = "---2---";
                line7 = "F# minor";
            }
        } else if (note.equals("b")) {
            if (quality.equals("major")) {
                line1 = "---7---";
                line2 = "---7---";
                line3 = "---6---";
                line4 = "---9---";
                line5 = "---9---";
                line6 = "---7---";
                line7 = "B major";
            } else {
                line1 = "---7---";
                line2 = "---7---";
                line3 = "---7---";
                line4 = "---9---";
                line5 = "---9---";
                line6 = "---7---";
                line7 = "B minor";
            }
        } else if (note.equals("e")) {
            if (quality.equals("major")) {
                line1 = "---0---";
                line2 = "---0---";
                line3 = "---1---";
                line4 = "---2---";
                line5 = "---2---";
                line6 = "---0---";
                line7 = "E major";
            } else {
                line1 = "---0---";
                line2 = "---0---";
                line3 = "---0---";
                line4 = "---2---";
                line5 = "---2---";
                line6 = "---0---";
                line7 = "E minor";
            }
        } else if (note.equals("a")) {
            if (quality.equals("major")) {
                line1 = "---0---";
                line2 = "---2---";
                line3 = "---2---";
                line4 = "---2---";
                line5 = "---0---";
                line6 = "---x---";
                line7 = "A major";
            } else {
                line1 = "---0---";
                line2 = "---1---";
                line3 = "---2---";
                line4 = "---2---";
                line5 = "---0---";
                line6 = "---x---";
                line7 = "A minor";
            }
        } else if (note.equals("d")) {
            if (quality.equals("major")) {
                line1 = "---2---";
                line2 = "---3---";
                line3 = "---2---";
                line4 = "---0---";
                line5 = "---x---";
                line6 = "---x---";
                line7 = "D major";
            } else {
                line1 = "---1---";
                line2 = "---2---";
                line3 = "---3---";
                line4 = "---0---";
                line5 = "---x---";
                line6 = "---x---";
                line7 = "D minor";
            }
        }
        this.guitarTab = new String[] {line1, line2, line3, line4, line5, line6, line7};
    }

    public void printTab() {
        for (String line : this.getGuitarTab()) {
            System.out.print(line + "\n");
        }
        System.out.println();
    }

    public String[] getGuitarTab() {
        return guitarTab;
    }

    public String getName() {
        return name;
    }

    public String getNote() {
        return note;
    }

    public String getQuality() {
        return quality;
    }

    public String toString() {

        return null;
    }
}
