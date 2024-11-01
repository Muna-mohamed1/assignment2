package Cret;

public class Doctor extends Hospital{
    String specialty;

    public Doctor(String name, String specialty) {
        this.name=name;
        this.specialty=specialty;
    }


    @Override
    public void work()
    {
        System.out.println(name + "the" + specialty  + "doctor is treating patients");
    }

    public void prescribeMedicine(){
        System.out.println(name+"prescribes medicine");
    }
}
