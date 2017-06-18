package javaPOC.Enum;

public class EnumPOC {

    public static void main(String[] args) {
        Employee emp = new Employee("Arpan", 29, Employee.gender.MALE);
        System.out.println(emp);
    }
};

class Employee {
    private String name;
    private int age;
    private gender GEN;

    enum gender {
        MALE,
        FEMALE,
        TRANS;
    }

    public Employee(String name, int age, gender GEN) {
        this.name = name;
        this.age = age;
        this.GEN = GEN;
    }

    public gender getGEN() {
        return GEN;
    }

    public void setGEN(gender GEN) {
        this.GEN = GEN;
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", GEN=" + GEN +
                '}';
    }
}