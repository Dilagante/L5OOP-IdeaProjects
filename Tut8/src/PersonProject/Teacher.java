package PersonProject;

public class Teacher extends Person{

    private double salary;

    public Teacher(){
        super();
    }
    public Teacher(String n, String s){
        name = n;
        salary = 15000; //initial salary
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    public String toString(){
        return "The name of the employee is " + this.getName() + " the salary is " + salary;
    }
}
