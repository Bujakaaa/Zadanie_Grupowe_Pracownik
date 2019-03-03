import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Magazyn {
   private List <Pracownik> listaPracownikow = new ArrayList<Pracownik>();
   private List <String> listaProduktów = new ArrayList<String>();
    Scanner scanner = new Scanner(System.in);

    public Magazyn(List<Pracownik> listaPracownikow, List<String> listaProduktów) {
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


    public void addPracownik(){
        System.out.println("Podaj dane pracownika");
        String dataOfEmplyee = scanner.nextLine();
        String pattern = "([a-zA-Z]+)\\s([a-zA-Z]+)\\s([0-9]+)\\s+([0-9]+)\\s([--9]+)";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(dataOfEmplyee);
        //m.find(); must be m.find() in the other way it doesn't get any matches
        if (m.find( )) {
            System.out.println("Imie : " + m.group(1) );
            System.out.println("Nazwisko : " + m.group(2) );
            System.out.println("Pesel : " + m.group(3) );
            System.out.println("Wiek: " + m.group(4) );
            System.out.println("Wynagrodzenie : " + m.group(5) );
        }else {
            System.out.println("Nie udalo sie znalezc poszukiwanych informacji");
        }
        long idNumber = Long.parseLong(m.group(3));
        int age = Integer.parseInt(m.group(4));
        int salary = Integer.parseInt(m.group(5));
        listaPracownikow.add(new Pracownik(m.group(1), m.group(2), idNumber, age, salary));
    }

    public void deletePracownik(){
        System.out.println("Podaj pesel pracownika, ktorego chcesz usunac");
        long idNumber = Long.parseLong(scanner.nextLine());
        for (Pracownik a : listaPracownikow){
            if (a.getIdNumber() == idNumber){
                listaPracownikow.remove(a);
                break;  // it needs to have break to end the loop when it finds the object
            }else {
                System.out.println("Nie ma pracownika o takim id");
            }
        }

    }

    public void getPracownikByIdNumber(){
        System.out.println("Podaj pesel pracownika, ktorego dane chcesz wystwietlic");
        long idNumber = Long.parseLong(scanner.nextLine());
        for (Pracownik a : listaPracownikow){
            if (a.getIdNumber() == idNumber){
                System.out.println(a);;
                break;  // it needs to have break to end the loop when it finds the object
            }else {
                System.out.println("Nie ma pracownika o takim id");
            }
        }

    }



    public List<Pracownik> getListaPracownikow() {
        return listaPracownikow;
    }

    public void setListaPracownikow(List<Pracownik> listaPracownikow) {
        this.listaPracownikow = listaPracownikow;
    }

}
