import java.util.Scanner;

// Main
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Inserimento Base
        System.out.println("Inserisci la base del rettangolo:");
        double base = in.nextDouble();

        // Inserimento Altezza
        System.out.println("Inserisci l'altezza del rettangolo:");
        double altezza = in.nextDouble();

        // Oggetto
        Rettangolo rettangolo = new Rettangolo(base, altezza);

        // Stampa del perimetro e dell'area del rettangolo
        System.out.println(" ");
        System.out.println("Perimetro del rettangolo: " + rettangolo.calcolaPerimetro());
        System.out.println("Area del rettangolo: " + rettangolo.calcolaArea());

        // Ridimensionamento
        System.out.println(" ");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("RIDIMENSIONAMENTO DEL RETTANGOLO:");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println(" ");
        System.out.println("Inserisci la nuova base:");
        double n_Base = in.nextDouble();

        System.out.println("Inserisci la nuova altezza:");
        double n_Altezza = in.nextDouble();

        // Ridimensionato Finito
        rettangolo.aggiornaDimensioni(n_Base, n_Altezza);

        // Stampa tutto ridimensionato
        System.out.println(" ");
        System.out.println("Nuovo perimetro del rettangolo: " + rettangolo.calcolaPerimetro());
        System.out.println("Nuova area del rettangolo: " + rettangolo.calcolaArea());
    }
}

class Rettangolo {
    private double larghezza;
    private double altezza;

    // Costruttore per inizializzare larghezza e altezza
    public Rettangolo(double larg, double alt) {
        larghezza = larg;
        altezza = alt;
    }

    // Metodo per aggiornare le dimensioni del rettangolo
    public void aggiornaDimensioni(double n_Larghezza, double n_Altezza) {
        larghezza = n_Larghezza;
        altezza = n_Altezza;
    }

    // Metodo per calcolare il perimetro
    public double calcolaPerimetro() {
        return 2 * (larghezza + altezza);
    }

    // Metodo per calcolare l'area
    public double calcolaArea() {
        return larghezza * altezza;
    }
}
