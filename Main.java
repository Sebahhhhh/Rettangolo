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


    // Metodo per calcolare il perimetro
    public double calcolaPerimetro() {
        return 2 * (larghezza + altezza);
    }

    // Metodo per calcolare l'area
    public double calcolaArea() {
        return larghezza * altezza;
    }
}
