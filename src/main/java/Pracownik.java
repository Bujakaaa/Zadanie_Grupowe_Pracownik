public class Pracownik {
    private String name;
    private String surName;
    private long idNumber;
    private int age;
    private int salary;

    public Pracownik(String name, String surName, long idNumber, int age, int salary) {
        this.name = name;
        this.surName = surName;
        this.idNumber = idNumber;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public long getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }

    public int getAge() {
        return age;
    }


    public int getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return "Pracownik{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", idNumber=" + idNumber +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
