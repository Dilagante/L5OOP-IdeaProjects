public class Student extends Person {

    private String idNum;
    private double fee;
    private int grade;

    public Student(String name, int age, String gender, String idNum){
        super(name, age, gender);
        this.idNum = idNum;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return super.toString() + ", IDNumber: " + idNum + ", Fee: " + fee + ", Grade: " + grade;
    }

}
