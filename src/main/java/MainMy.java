import java.util.ArrayList;
import java.util.List;

public class MainMy {
    public static void main(String[] args) {

        List<Produkt> produktList = new ArrayList<Produkt>();
        List<String> listaprocowników = new ArrayList<String>();

//        listaprocowników.add("bu");
        produktList.add(new Produkt("Bułka", "5,50", Podatek.VAT23));
        produktList.add(new Produkt("mleko", "3,20", Podatek.VAT23));
        produktList.add(new Produkt("masło", "6,30", Podatek.VAT23));
        produktList.add(new Produkt("jajka", "9,90", Podatek.VAT23));
        produktList.add(new Produkt("mąka", "2,15", Podatek.VAT23));

        Magazyn magazyn = new Magazyn(listaprocowników, produktList);

        magazyn.dodajProdukt(new Produkt("jabłka", "3,80", Podatek.VAT23)); //dziala

        magazyn.usunProdukt("masło");

        System.out.println(magazyn.wypiszProdukt("mąka")); //dziala :)
        System.out.println();

        System.out.println(magazyn.wypiszAllProdukty()); //dziala


    }
}
