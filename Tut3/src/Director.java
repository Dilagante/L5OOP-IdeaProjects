public class Director {

    private final String name;
    private final String surname;
    private int numberOfMovies;
    private Date dob;


    public Director(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String toString() {
        return "Director [ Name = " + name + ", Surname = " + surname + ", Date of Birth = " + dob.getDate() + ", Movies directed = " + numberOfMovies + " ]";
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getDob() {
        return dob;
    }

    public int getNumberOfMovies() {
        return numberOfMovies;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setNumberOfMovies(int numberOfMovies) {
        this.numberOfMovies = numberOfMovies;
    }
}
