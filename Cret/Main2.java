package Cret;

public class Main2 {
    public static void main(String[] args) {

        Doctor D=new Doctor("Dr.Shafe","dantist");
        D.work();
        D.rest();
        D.prescribeMedicine();

        surgeon S=new surgeon("Dr.smith","neurosurgeon",100);
        S.work();
        S.rest();
        S.SurgiesPerformed();

        Nurse N=new Nurse("joy","pediatrics");
        N.work();
        N.rest();
        N.assist();


    }
}
