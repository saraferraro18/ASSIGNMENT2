////////////////////////////////////////////////////////////////////
// GIULIA MARCON 2075541
// SARA FERRARO 2076442
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {


    // Metodo pubblico per convertire un numero intero in numero romano e stamparlo in ASCII
    public static String print(int num){


        // Chiama il metodo di conversione per ottenere il numero romano
        return printAsciiArt(IntegerToRoman.convert(num));
    }


    // Metodo privato per convertire una stringa di numeri romani in ASCII Art
    private static String printAsciiArt(String romanNumber){


        // Converte la stringa di numeri romani in un array di caratteri
        char[] letters = romanNumber.toCharArray();


        // Stringa che conterrà l'output finale in ASCII Art
        String str = "";


        // Ciclo per ogni riga dell'output ASCII (ci sono 6 righe per ogni carattere)
        for (int i = 0; i < 6; i++){


            // Ciclo per ogni carattere della stringa di numeri romani
            for (int j = 0; j < letters.length; j++){


                // Controlla quale carattere romano è e aggiunge la corrispondente riga ASCII
                if (letters[j] == 'I'){
                    switch(i){
                        case 0: str = str + " _____  "; break;
                        case 1: str = str + "|_   _| "; break;
                        case 2: str = str + "  | |   "; break;
                        case 3: str = str + "  | |   "; break;
                        case 4: str = str + " _| |_  "; break;
                        case 5: str = str + "|_____| "; break;
                    }
                }
                if (letters[j] == 'V'){
                    switch(i){
                        case 0: str = str + "__      __ "; break;
                        case 1: str = str + "\\ \\    / / "; break;
                        case 2: str = str + " \\ \\  / /  "; break;
                        case 3: str = str + "  \\ \\/ /   "; break;
                        case 4: str = str + "   \\  /    "; break;
                        case 5: str = str + "    \\/     "; break;
                    }
                }
                if (letters[j] == 'X'){
                    switch(i){
                        case 0: str = str + "__   __ "; break;
                        case 1: str = str + "\\ \\ / / "; break;
                        case 2: str = str + " \\ V /  "; break;
                        case 3: str = str + "  > <   "; break;
                        case 4: str = str + " / . \\  "; break;
                        case 5: str = str + "/_/ \\_\\ "; break;
                    }
                }
                if (letters[j] == 'L'){
                    switch(i){
                        case 0: str = str + " _       "; break;
                        case 1: str = str + "| |      "; break;
                        case 2: str = str + "| |      "; break;
                        case 3: str = str + "| |      "; break;
                        case 4: str = str + "| |____  "; break;
                        case 5: str = str + "|______| "; break;
                    }
                }
                if (letters[j] == 'C'){
                    switch(i){
                        case 0: str = str + "  _____  "; break;
                        case 1: str = str + " / ____| "; break;
                        case 2: str = str + "| |      "; break;
                        case 3: str = str + "| |      "; break;
                        case 4: str = str + "| |____  "; break;
                        case 5: str = str + " \\_____| "; break;
                    }
                }
                if (letters[j] == 'D'){
                    switch(i){
                        case 0: str = str + " _____   "; break;
                        case 1: str = str + "|  __ \\  "; break;
                        case 2: str = str + "| |  | | "; break;
                        case 3: str = str + "| |  | | "; break;
                        case 4: str = str + "| |__| | "; break;
                        case 5: str = str + "|_____/  "; break;
                    }
                }
                if (letters[j] == 'M'){
                    switch(i){
                        case 0: str = str + " __  __  "; break;
                        case 1: str = str + "|  \\/  | "; break;
                        case 2: str = str + "| \\  / | "; break;
                        case 3: str = str + "| |\\/| | "; break;
                        case 4: str = str + "| |  | | "; break;
                        case 5: str = str + "|_|  |_| "; break;
                    }
                }
            }
            // Va a capo dopo ogni riga di caratteri
            str += "\n";
        }


        // Ritorna la stringa finale contenente l'output in ASCII Art
        return str;
    }
}
