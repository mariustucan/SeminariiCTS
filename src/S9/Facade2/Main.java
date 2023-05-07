package S9.Facade2;

public class Main {

    public static void main(String[] args) {
        DealerAuto da = new DealerAuto();

        System.out.println(da.descriereMasinaFamilie());
        System.out.println(da.descriereMasinaElectrica());
        System.out.println(da.descriereMasinaSport());
    }

}
