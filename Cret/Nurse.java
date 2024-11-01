package Cret;

public class Nurse extends Hospital{
    String department;


    public Nurse(String name,String department) {
        this.name=name;
        this.department=department;
    }

    @Override
    public void rest() {
        System.out.println(name+department + "the nurse from"+"department is taking a break" );
    }
public void assist()
{
    System.out.println("assists doctors"+name);
}
}
