////////////////////////////////////////////////////////////////////
// GIULIA MARCON 2075541
// SARA FERRARO 2076442
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {

    // Array di valori interi corrispondenti ai simboli romani
    private static final int[] values = {500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    // Array di simboli romani corrispondenti ai valori interi
    private static final String[] symbols = {"D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};


    // Converte i numeri interi nel range [1,500] in numeri romani
    public static String convert(int number){

        // Controlla se il numero è fuori dal range [1,500]
        if (number<1 || number>500) {
            throw new IllegalArgumentException(number + " is not in range [1,500]");
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
