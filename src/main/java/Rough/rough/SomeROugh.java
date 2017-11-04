package Rough.rough;

interface ABC{

    public void display();
}



public class SomeROugh implements  ABC{

    @Override
    public void display() {
        System.out.println("SomeROugh");
    }
}

 class Some implements  ABC{

    @Override
    public void display() {
        System.out.println("Some");
    }
}


class SomeElse {

    public static void main(String[] args) {

        ABC abc = new SomeROugh();
        abc.display();
    }
}