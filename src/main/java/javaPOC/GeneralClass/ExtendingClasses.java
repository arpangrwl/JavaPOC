package javaPOC.GeneralClass;

/**
 * Created by Arpan on 7/23/17.
 */


class Employee {
    private int sal;

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public void funcEmp() {
        System.out.println("I am employee");
    }
}

class gateKeeper extends Employee {

    @Override
    public int getSal() {
        int bonusMonthly = 1000;
        int gkSal = super.getSal();

        return (bonusMonthly + gkSal);
    }

    @Override
    public void setSal(int sal) {
        super.setSal(sal);
    }

    public void funcGateKeeper() {
        System.out.println("I am Gate Keeper");
    }

}

class SE extends Employee {

    @Override
    public int getSal() {
        return super.getSal();
    }

    @Override
    public void setSal(int sal) {
        int mon = 50000;
        super.setSal(sal + mon);
    }

    public void funcSE() {
        System.out.println("I am Software Engineer");
    }

}


public class ExtendingClasses {
    public static void main(String[] args) {

//        Employee emp = new SE();
//        emp.setSal(50000);
//
//        System.out.println(emp.getSal());

        Employee emp = new Employee();
        emp.setSal(1000);


        gateKeeper gk = (gateKeeper) emp;
        System.out.println(gk.getSal());
    }
}
