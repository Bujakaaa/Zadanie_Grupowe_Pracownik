import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Pracownik> listaPracownikow = new ArrayList<Pracownik>();
        List<String> listaProduktow = new ArrayList<String>();

        Magazyn magazyn = new Magazyn(listaPracownikow, listaProduktow);

        listaPracownikow.add(new Pracownik("a", "b",1, 21, 4000));
        listaPracownikow.add(new Pracownik("c", "d",2, 31, 4000));
        listaPracownikow.add(new Pracownik("e", "f",3, 31, 4000));
        listaPracownikow.add(new Pracownik("g", "h",4, 53, 4000));
        listaPracownikow.add(new Pracownik("i", "j",5, 34, 4000));
        listaPracownikow.add(new Pracownik("k", "l",6, 32, 4000));
        listaPracownikow.add(new Pracownik("m", "n",7, 21, 4000));

        System.out.println(magazyn.getListaPracownikow());

        for (Pracownik a : listaPracownikow){
            System.out.println(a);

        }



    }
}
