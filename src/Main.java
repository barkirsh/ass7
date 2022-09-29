import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

import java.util.regex.*;


//NP {,} such as NP {, NP, ..., {and|or} NP}

/**
 * NP = "<np>.*</np>"
 */

//<np> heyperym</np> hearst <np> hyponum<\np> and|or <np> hyponum <\np>
//such NP as NP {, NP, ..., {and|or} NP}
//NP {,} including NP {, NP, ..., {and|or} NP}
//NP {,} especially NP {, NP, ..., {and|or} NP}
// NP {,} which is {{an example|a kind|a class} of} NP

public class Main {


    public int searchAll(String s, int indexFrom, String[] patterns) {
        for (int i = 0; i < 5; i++) {
            if (s.indexOf("np", indexFrom) != -1) {
                return s.indexOf("np", indexFrom);
            }
        }

        return indexFrom;
    }

    public static void main(String[] args) throws IOException {
        Pattern patt = Pattern.compile("[a-z]+");
        patt.matcher("aaa");

        /**
         * read files
         *
         *serch for hearst pattern
         * if there is a pattern then find the field and appearance
         * enter them to database
         */
        //List<BufferedReader> listOfFiles = new ArrayList<>();
        // for ()

        //"C:\Users\barki\OOP EX\data\corpus\mbta.com_mtu.pages_0.possf2"
        System.out.println("Hello world!");
        FileInputStream in = null;

        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("C:/Users/barki/OOP EX/data/corpus/mbta.com_mtu.pages_0.possf2"));
            // in = new FileInputStream("C:/Users/barki/OOP EX/data/corpus/mbta.com_mtu.pages_0.possf2");

            int c;


            String line;
            line = br.readLine();
            System.out.println(line);
            for (int i = line.indexOf("<np>") + 4; i < line.indexOf("</np>"); i++) {
                System.out.print(line.charAt(i));
            }
            

/*
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

 */
        } finally {
            if (in != null) {
                in.close();
            }
        }
    }
}