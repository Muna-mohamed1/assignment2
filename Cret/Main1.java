package Cret;

public class Main1 {
    public static void execute(Animal Animal)
    {
    Animal.Eat();
    }
    public static void main(String[] args) {

        cow C= new cow();
        cat CA=new cat();

        C.Eat();
        CA.Eat();

        C.showDetails();
        C.showDetails("cow");

        CA.showDetails();
        CA.showDetails("cat");

         execute(C);
         execute(CA);




    }
}

