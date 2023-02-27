package S2.clase;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    /**
     * Această metodă calculează suma dintre x ridicat la puterea a-5-a și y ridicat la puterea a-7-a.
     * @return Returnează rezultatul calculat.
     * @throws NumberFormatException Aruncă excepție dacă datele introduse pentru x sau y nu sunt numere.
     * @throws IOException Aruncă excepție dacă apare o eroare la citirea datelor.
     */
//    public double calculateX5PlusY7() throws NumberFormatException, IOException {
//        double x = readDouble("Tastați valoarea pentru X: ");
//        double y = readDouble("Tastați valoarea pentru Y: ");
//
//        double x5 = power(x, 5);
//        double y7 = power(y, 7);
//
//        return x5 + y7;
//    }

    /**
     * Această metodă citește un număr de la tastatură.
     * @param message Mesajul afișat pentru a indica ce număr trebuie introdus.
     * @return Returnează numărul introdus de la tastatură.
     * @throws NumberFormatException Aruncă excepție dacă datele introduse nu sunt un număr valid.
     * @throws IOException Aruncă excepție dacă apare o eroare la citirea datelor.
     */
    public double readDouble(String message) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                System.out.print(message);
                String input = reader.readLine();
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Ați introdus o valoare nevalidă. Vă rugăm să încercați din nou.");
            }
        }
    }

    /**
     * Această metodă calculează o bază ridicată la o anumită putere.
     * @param base Baza care trebuie ridicată la putere.
     * @param exponent Puterea la care trebuie ridicată baza.
     * @return Returnează rezultatul ridicării la putere.
     */
    public double power(double base, int exponent) {
        double result = 1.0;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }




}
