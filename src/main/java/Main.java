import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Pracownik> listaPracownikow = new ArrayList<Pracownik>();
        List<String> listaProduktow = new ArrayList<String>();

        Magazyn magazyn = new Magazyn(listaPracownikow, listaProduktow);

        magazyn.addPracownik();

        System.out.println(magazyn.getListaPracownikow());

        magazyn.deletePracownik();

        System.out.println(magazyn.getListaPracownikow());



    }
}
