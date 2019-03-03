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


    }
}
