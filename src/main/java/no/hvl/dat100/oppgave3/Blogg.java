package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;
import no.hvl.dat100.oppgave2.Tekst;

public class Blogg {

	// TODO: objektvariable
    private Innlegg[] innleggtabell;
    private int nesteledig;


	public Blogg() {
        innleggtabell = new Innlegg[20];
		nesteledig = 0;
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
        nesteledig = 0;
	}

	public int getAntall() {
        int x = 0;
        for (Innlegg i : innleggtabell) {
            if (i != null) {
                x++;
            }
        }
        return x;
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
        for (int i = 0; i< innleggtabell.length; i++) {
            if (innleggtabell[i] != null && innleggtabell[i].erLik(innlegg)) {
                return i;
            }
        }
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
        for (int i = 0; i< innleggtabell.length; i++) {
            if (innleggtabell[i] != null && innleggtabell[i].erLik(innlegg)) {
                return true;
            }
        }
        return false;
	}

	public boolean ledigPlass() {
		int j = 0;
        for (Innlegg i : innleggtabell) {
            if (i == null) {
                nesteledig = j;
                return true;
            }
            j++;
        }
        return false;
	}
	
	public boolean leggTil(Innlegg innlegg) {
        if (finnes(innlegg) == false) {
            if (!finnes(innlegg) && ledigPlass()) {
                innleggtabell[nesteledig] = innlegg;
                return true;
            }
        }
        return false;
	}
	
	public String toString() {
        String s = getAntall() + "\n";
        for (Innlegg i : innleggtabell) {
            if (i != null) {
                s += i.toString();
            }
        }
        return s;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}