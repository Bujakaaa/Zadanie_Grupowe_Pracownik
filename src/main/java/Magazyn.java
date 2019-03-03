import java.util.List;

public class Magazyn {
    List <String> listaPracownikow;
    List<Produkt> listaProduktów;

    public Magazyn (List<String> listaPracownikow, List<Produkt> listaProduktów) {
        this.listaPracownikow = listaPracownikow;
        this.listaProduktów = listaProduktów;
    }

    public void dodajProdukt (Produkt produkt) {
        listaProduktów.add(produkt);
    }

    public void usunProdukt (String nazwa) {
        for (Produkt p : listaProduktów) {
            if (p.getNazwa().equals(nazwa)) {
                listaProduktów.remove(p);
                break;
            }
        }
    }

    public Produkt wypiszProdukt (String nazwa) {
        Produkt produkt=null;
        for (Produkt p: listaProduktów) {
            if (p.getNazwa().equals(nazwa)){
                produkt=p;
            }
        }
        return produkt;
    }

    public List<Produkt> wypiszAllProdukty () {
        return listaProduktów;
    }




    @Override
    public String toString() {
        return "Magazyn{" +
                "listaPracownikow=" + listaPracownikow +
                ", listaProduktów=" + listaProduktów +
                '}';


    }
}
