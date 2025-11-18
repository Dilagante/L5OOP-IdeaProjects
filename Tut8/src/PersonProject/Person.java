package PersonProject;

public class Person {

    // instance variables
    protected String name;
    private Date dob;

    //constructors
    public Person(){
        name= "";
        dob = null;
    }
    public Person(String n) {
        name = n;
    }

    //methods
    public void setName(String n){
        name = n;
    }

    public String getName() {
        return name;
    }

    public Date getDOB() {
        return dob;
    }

    public void setDOB(Date dob){
        this.dob = dob;
    }

    public String toString(){
        return ("The name is " + name + " and the age is " + dob.getDate());
    }



}
