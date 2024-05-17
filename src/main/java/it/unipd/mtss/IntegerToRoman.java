////////////////////////////////////////////////////////////////////
// GIULIA MARCON 2075541
// SARA FERRARO 2076442
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {

    // Array di valori interi corrispondenti ai simboli romani
    private static final int[] values = {1};

    // Array di simboli romani corrispondenti ai valori interi
    private static final String[] symbols = {"I"};

    // Converte i numeri interi nel range [1,3] in numeri romani
    public static String convert(int number){

        // Controlla se il numero è fuori dal range [1,3]
        if (number<1 || number>3) {
            throw new IllegalArgumentException(number + " is not in range [1,3]");
        }

        // Variabile per memorizzare il risultato della conversione
        StringBuilder roman = new StringBuilder();

        // Itera su tutti i valori e simboli
        for (int i = 0; i < values.length; i++) {
            // Aggiunge i simboli romani corrispondenti fino a ridurre completamente il numero
            while (number >= values[i]) {
                roman.append(symbols[i]);
                number -= values[i];
            }
        }

        // Restituisce il risultato finale della conversione
        return roman.toString();
    }
}
