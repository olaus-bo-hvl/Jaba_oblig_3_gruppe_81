package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

        boolean skrevet = false;
        String fullFilsti = mappe + "/" + filnavn;

		try {
            PrintWriter skriver = new PrintWriter(new FileWriter(fullFilsti));

            skriver.print(samling.toString());

            skriver.close();
            skrevet = true;

        } catch (IOException e) {
            System.out.println("Feil ved skriving til fil: " + e.getMessage());
            skrevet = false;
        }

        return skrevet;
	}
}
