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
public class RomanPrinterTests {


    // Variabili di istanza per l'input e l'output atteso
    private String input;
    private String expectedOutput;


    // Costruttore che inizializza le variabili di istanza con i valori dei parametri
    public RomanPrinterTests(String input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }


    // Metodo che fornisce i dati di test come una collezione di array di stringhe
    @Parameters
    public static Collection<String[]> testConditions() {


        // Array bidimensionale con i valori di input e gli output attesi
        String[][] expectedOutputs = {
                { "1", " _____  \n" +
                        "|_   _| \n" +
                        "  | |   \n" +
                        "  | |   \n" +
                        " _| |_  \n" +
                        "|_____| \n" },
                { "3", " _____   _____   _____  \n" +
                        "|_   _| |_   _| |_   _| \n" +
                        "  | |     | |     | |   \n" +
                        "  | |     | |     | |   \n" +
                        " _| |_   _| |_   _| |_  \n" +
                        "|_____| |_____| |_____| \n" },
                { "4", " _____  __      __ \n" +
                        "|_   _| \\ \\    / / \n" +
                        "  | |    \\ \\  / /  \n" +
                        "  | |     \\ \\/ /   \n" +
                        " _| |_     \\  /    \n" +
                        "|_____|     \\/     \n" },
                { "8", "__      __  _____   _____   _____  \n" +
                        "\\ \\    / / |_   _| |_   _| |_   _| \n" +
                        " \\ \\  / /    | |     | |     | |   \n" +
                        "  \\ \\/ /     | |     | |     | |   \n" +
                        "   \\  /     _| |_   _| |_   _| |_  \n" +
                        "    \\/     |_____| |_____| |_____| \n" },
                { "19", "__   __  _____  __   __ \n" +
                        "\\ \\ / / |_   _| \\ \\ / / \n" +
                        " \\ V /    | |    \\ V /  \n" +
                        "  > <     | |     > <   \n" +
                        " / . \\   _| |_   / . \\  \n" +
                        "/_/ \\_\\ |_____| /_/ \\_\\ \n" },
                { "333", "  _____    _____    _____  __   __ __   __ __   __  _____   _____   _____  \n" +
                        " / ____|  / ____|  / ____| \\ \\ / / \\ \\ / / \\ \\ / / |_   _| |_   _| |_   _| \n" +
                        "| |      | |      | |       \\ V /   \\ V /   \\ V /    | |     | |     | |   \n" +
                        "| |      | |      | |        > <     > <     > <     | |     | |     | |   \n" +
                        "| |____  | |____  | |____   / . \\   / . \\   / . \\   _| |_   _| |_   _| |_  \n" +
                        " \\_____|  \\_____|  \\_____| /_/ \\_\\ /_/ \\_\\ /_/ \\_\\ |_____| |_____| |_____| \n" },
                { "500", " _____   \n" +
                        "|  __ \\  \n" +
                        "| |  | | \n" +
                        "| |  | | \n" +
                        "| |__| | \n" +
                        "|_____/  \n" },
                { "979", "  _____   __  __   _       __   __ __   __  _____  __   __ \n" +
                        " / ____| |  \\/  | | |      \\ \\ / / \\ \\ / / |_   _| \\ \\ / / \n" +
                        "| |      | \\  / | | |       \\ V /   \\ V /    | |    \\ V /  \n" +
                        "| |      | |\\/| | | |        > <     > <     | |     > <   \n" +
                        "| |____  | |  | | | |____   / . \\   / . \\   _| |_   / . \\  \n" +
                        " \\_____| |_|  |_| |______| /_/ \\_\\ /_/ \\_\\ |_____| /_/ \\_\\ \n" },
                { "1000", " __  __  \n" +
                        "|  \\/  | \n" +
                        "| \\  / | \n" +
                        "| |\\/| | \n" +
                        "| |  | | \n" +
                        "|_|  |_| \n" }};


        // Ritorna i dati di test come una lista
        return Arrays.asList(expectedOutputs);
    }


    // Test parametrizzato che verifica la conversione da numero intero a numero romano in ASCII Art
    @Test
    public void testConvertNumbers() {
        assertEquals(expectedOutput,
                RomanPrinter.print(Integer.parseInt(input)));
    }
}

