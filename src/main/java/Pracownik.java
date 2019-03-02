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

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
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

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
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
