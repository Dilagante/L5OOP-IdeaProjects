package PersonProject;

public class Student extends Person{

    private String ID;
    private String course;

    public Student(String name, String ID){
        super(name);
        this.ID = ID;
    }

    public void setCourse(String course){
        this.course = course;
    }

    public String getCourse(){
        return course;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }






}
