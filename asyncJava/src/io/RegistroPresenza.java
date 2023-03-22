package io;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class RegistroPresenza {
    
    private List<Presenza> elencoPresenze;

    public RegistroPresenza() {
        elencoPresenze = new ArrayList<>();
    }

    public void aggiungiPresenza(Presenza presenza) {
        elencoPresenze.add(presenza);
    }

    public void salvaPresenzeSuFile(File file) throws IOException {
        List<String> righe = new ArrayList<>();
        for (Presenza presenza : elencoPresenze) {
            String riga = presenza.getNomeDipendente() + "@" + presenza.getGiorniPresenza() + "#";
            righe.add(riga);
        }
        FileUtils.writeLines(file, StandardCharsets.UTF_8.name(), righe);
    }

    public void caricaPresenzeDaFile(File file) throws IOException {
        List<String> righe = FileUtils.readLines(file, StandardCharsets.UTF_8.name());
        elencoPresenze.clear();
        for (String riga : righe) {
            String[] tokens = riga.split("@");
            String nomeDipendente = tokens[0];
            String[] subTokens = tokens[1].split("#");
            int giorniPresenza = Integer.parseInt(subTokens[0]);
            Presenza presenza = new Presenza(nomeDipendente, giorniPresenza);
            elencoPresenze.add(presenza);
        }
    }
    
    public void stampaPresenze() {
        for (Presenza presenza : elencoPresenze) {
            System.out.println(presenza);
        }
    }

    public static void main(String[] args) throws IOException {
        RegistroPresenza registro = new RegistroPresenza();
        registro.aggiungiPresenza(new Presenza("Mario Rossi", 5));
        registro.aggiungiPresenza(new Presenza("Giorgio Bianchi", 7));
        registro.aggiungiPresenza(new Presenza("Gianni Verdi", 7));
        registro.salvaPresenzeSuFile(new File("presenze.txt"));
        registro.caricaPresenzeDaFile(new File("presenze.txt"));
        registro.stampaPresenze();
    }
}

class Presenza {
    private String nomeDipendente;
    private int giorniPresenza;

    public Presenza(String nomeDipendente, int giorniPresenza) {
        this.nomeDipendente = nomeDipendente;
        this.giorniPresenza = giorniPresenza;
    }

    public String getNomeDipendente() {
        return nomeDipendente;
    }

    public int getGiorniPresenza() {
        return giorniPresenza;
    }

    public String toString() {
        return nomeDipendente + ": " + giorniPresenza + " giorni";
    }
}

