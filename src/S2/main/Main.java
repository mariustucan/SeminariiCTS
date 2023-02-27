package S2.main;

import S2.clase.Calculator;
import S2.clase.MatrixDataHandler;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Calculator calculator = new Calculator();
//        double result = calculator.power(2,5);
//        double result2 =calculator.power(2,7);
//        double resultFinal=result+result2;
//        System.out.println("Rezultatul este: " + resultFinal);

        double x = calculator.readDouble("Tastați valoarea pentru X: ");
        double y = calculator.readDouble("Tastați valoarea pentru Y: ");

        double result=calculator.power(x,5)+calculator.power(y,7);
        System.out.println(result);

        MatrixDataHandler mH = new MatrixDataHandler(5, 7, "matrix.txt");
        mH.modifyValueAndUpdateFile("matrix.txt", 3, 4, 345);
    }
}
