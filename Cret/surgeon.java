package Cret;

public class surgeon extends Doctor{
    int surgiesPerformed;

    public surgeon(String name, String speciality,int surgiesPerformed){
        super(name,speciality);
        this.surgiesPerformed=surgiesPerformed;
    }
    public void SurgiesPerformed(){
        System.out.println(name+"surgies has performed");
    }
}
