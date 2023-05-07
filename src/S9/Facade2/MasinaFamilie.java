package S9.Facade2;

public class MasinaFamilie implements Automobil {
    String descriere;

    public MasinaFamilie(String descriere) {
        this.descriere = descriere;
    }

    @Override
    public String descriere() {
        return descriere;
    }
}
