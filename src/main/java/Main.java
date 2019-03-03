import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pracownik> listaPracownikow = new ArrayList<Pracownik>();
        List<String> listaProduktow = new ArrayList<String>();


        Magazyn magazyn = new Magazyn(listaPracownikow, listaProduktow);
        String whatToDo;

        listaPracownikow.add(new Pracownik("a", "g", 1, 23, 5000));
        listaPracownikow.add(new Pracownik("b", "h", 2, 22, 5000));
        listaPracownikow.add(new Pracownik("c", "i", 3, 21, 5000));
        listaPracownikow.add(new Pracownik("d", "j", 4, 20, 5000));
        listaPracownikow.add(new Pracownik("e", "k", 5, 19, 5000));
        listaPracownikow.add(new Pracownik("f", "l", 6, 12, 5000));


        do {
            System.out.println("Co chcesz zrobic?");
            whatToDo = scanner.nextLine();

            if (whatToDo.equalsIgnoreCase("dodaj pracownika")) {
                magazyn.addPracownik();
            } else if (whatToDo.equalsIgnoreCase("wyswietl dane pracownika")) {
                magazyn.getPracownikByIdNumber();
            } else if (whatToDo.equalsIgnoreCase("usun pracownia")) {
                magazyn.deletePracownik();
            } else if (whatToDo.equalsIgnoreCase("wyswietl wszystkich pracownikow")) {
                magazyn.getListaPracownikow2();
            }

        } while (!whatToDo.equalsIgnoreCase("quit"));


        Scanner scanner = new Scanner(System.in);
        List<Produkt> produktList = new ArrayList<Produkt>();
        List<String> listaprocowników = new ArrayList<String>();

        produktList.add(new Produkt("Bułka", "5,50", Podatek.VAT23));
        produktList.add(new Produkt("mleko", "3,20", Podatek.VAT23));
        produktList.add(new Produkt("masło", "6,30", Podatek.VAT23));
        produktList.add(new Produkt("jajka", "9,90", Podatek.VAT23));
        produktList.add(new Produkt("mąka", "2,15", Podatek.VAT23));

        Magazyn magazyn = new Magazyn(listaprocowników, produktList);
        String komenda;
        do {
            System.out.println("Co chcesz zrobić?");
            komenda = scanner.nextLine();

            if (komenda.equalsIgnoreCase("dodaj produkt")) {
                System.out.println("Podaj nazwe produktu:");
                String nazwa = scanner.nextLine();
                System.out.println("Podaj cene");
                String cena = scanner.nextLine();
                Produkt produkt = new Produkt(nazwa, cena, Podatek.VAT23);
                magazyn.dodajProdukt(produkt);

            } else if (komenda.equalsIgnoreCase("dodaj pracownika")) {
                // tutaj załaduj pozostałe parametry
//                magazyn.dodajPracownika();

            } else if (komenda.equalsIgnoreCase("usun produkt")) {
                System.out.println("Podaj nazwę produktu:");
                String produkt = scanner.nextLine();
                magazyn.usunProdukt(produkt);
            }

            else if (komenda.equalsIgnoreCase("usun pracownika")) {
            }

            else if (komenda.equalsIgnoreCase("wypisz produkt")) {
                System.out.println("Podaj nazwę produktu:");
                String produkt = scanner.nextLine();
                System.out.println(magazyn.wypiszProdukt(produkt)); //dziala :)
            }

            else if (komenda.equalsIgnoreCase("wypisz wszystkie produkty")) {
                System.out.println(magazyn.wypiszAllProdukty()); //dziala
            }


        } while (!komenda.equalsIgnoreCase("quit"));
    }
}
