////////////////////////////////////////////////////////////////////
// GIULIA MARCON 2075541
// SARA FERRARO 2076442
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

// Utilizza il runner parametrizzato di JUnit per eseguire test con diverse combinazioni di parametri
@RunWith(Parameterized.class)
public class IntegerToRomanTests {

    // Variabili di istanza per l'input e l'output attesi
    private String input;
    private String expectedOutput;

    // Costruttore che inizializza le variabili di istanza con i valori dei parametri
    public IntegerToRomanTests(String input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    // Metodo che fornisce i dati di test come una collezione di array di stringhe
    @Parameters
    public static Collection<String[]> testConditions() {

        // Array bidimensionale con i valori di input e gli output attesi
        String[][] expectedOutputs = {
                { "1", "I" },
                { "2", "II" },
                { "3", "III" },
                { "4", "IV" },
                { "5", "V" },
                { "6", "VI" },
                { "7", "VII" },
                { "8", "VIII" },
                { "9", "IX" },
                { "10", "X" },
                { "11", "XI" },
                { "12", "XII" },
                { "13", "XIII" },
                { "14", "XIV" },
                { "15", "XV" },
                { "16", "XVI" },
                { "17", "XVII" },
                { "18", "XVIII" },
                { "19", "XIX" },
                { "20", "XX" }};

        // Ritorna come lista
        return Arrays.asList(expectedOutputs);
    }

    // Test parametrizzato per verificare la conversione dei numeri in numeri romani
    @Test
    public void testConvertNumbers() {
        assertEquals(expectedOutput,
                IntegerToRoman.convert(Integer.parseInt(input)));
    }

    // Test che si aspetta un'eccezione IllegalArgumentException per un valore
    // di input troppo basso (minore di 1)
    @Test(expected=IllegalArgumentException.class)
    public void TestExeption_IllegalMinArgument() {
        int number = 0;
        String expected = IntegerToRoman.convert(number);
    }

    // Test che si aspetta un'eccezione IllegalArgumentException per un valore
    // di input troppo alto (maggiore di 20)
    @Test(expected=IllegalArgumentException.class)
    public void TestExeption_IllegalMaxArgument() {
        int number = 21;
        String expected = IntegerToRoman.convert(number);
    }
}
