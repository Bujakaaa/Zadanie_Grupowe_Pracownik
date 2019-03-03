public class Produkt {

    private String nazwa;
    private String cenaNetto;
    private Podatek podatekVat;

    public Produkt(String nazwa, String cenaNetto, Podatek podatekVat) {
        this.nazwa = nazwa;
        this.cenaNetto = cenaNetto;
        this.podatekVat = podatekVat;
    }

    public Produkt(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getCenaNetto() {
        return cenaNetto;
    }

    public Podatek getPodatekVat() {
        return podatekVat;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "nazwa='" + nazwa + '\'' +
                ", cenaNetto='" + cenaNetto + '\'' +
                ", podatekVat=" + podatekVat +
                '}'+"\n";
    }
}
