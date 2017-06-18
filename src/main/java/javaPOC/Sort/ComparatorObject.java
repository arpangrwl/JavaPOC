package javaPOC.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorObject {

    public static void main(String[] args) {

        ArrayList<emp> empArr = new ArrayList<emp>();
        empArr.add(new emp("Arpan", 29, emp.gender.MALE));
        empArr.add(new emp("Nipun", 23, emp.gender.MALE));
        empArr.add(new emp("Nishtha", 26, emp.gender.FEMALE));
        empArr.add(new emp("Rohit", 25, emp.gender.TRANS));
        empArr.add(new emp("Mridula", 45, emp.gender.FEMALE));

        System.out.println(empArr);

        Collections.sort(empArr, new Comparator<emp>() {
            @Override
            public int compare(emp o1, emp o2) {
                return (o1.getAge() > o2.getAge() ? 1 : (o1.getAge() < o2.getAge() ? -1 :0));
            }
        });

        System.out.println("\n\n\n\n" + empArr);

        String type = "name";
        ArrayList<emp> sortedEmpArr  = SortByType(empArr, type);

        System.out.println("\n\n\n\n" + sortedEmpArr);
    }

    public static ArrayList<emp> SortByType(ArrayList<emp> empArr, String type) {

        if(type.equals("name")){
            Collections.sort(empArr, new Comparator<emp>() {
                @Override
                public int compare(emp o1, emp o2) {
                    return (o1.getName().compareTo(o2.getName()));
                }
            });
        }
        else if(type.equals("age"))
        {
            Collections.sort(empArr, new Comparator<emp>() {
                @Override
                public int compare(emp o1, emp o2) {
                    return (o1.getAge() > o2.getAge() ? 1 : (o1.getAge() < o2.getAge() ? -1 :0));
                }
            });
        }
        else if(type.equals("gender")){
            Collections.sort(empArr, new Comparator<emp>() {
                @Override
                public int compare(emp o1, emp o2) {
                    return (o1.getGEN().compareTo(o2.getGEN()));
                }
            });
        }

        return empArr;
    }
};

class emp {
    private String name;
    private int age;
    private gender GEN;

    enum gender {
        MALE,
        FEMALE,
        TRANS;
    };

    public emp(String name, int age, gender GEN) {
        this.name = name;
        this.age = age;
        this.GEN = GEN;
    }
    public emp() {

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
        return "emp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", GEN=" + GEN +
                '}';
    }
}