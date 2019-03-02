import java.util.List;

public class Magazyn {
    List <String> listaPracownikow;
    List <String> listaProduktów;

    public Magazyn(List<String> listaPracownikow, List<String> listaProduktów) {
        this.listaPracownikow = listaPracownikow;
        this.listaProduktów = listaProduktów;
    }

    @Override
    public String toString() {
        return "Magazyn{" +
                "listaPracownikow=" + listaPracownikow +
                ", listaProduktów=" + listaProduktów +
                '}';


    }
}
