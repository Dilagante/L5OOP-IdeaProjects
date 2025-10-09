package first;

public class Person {

    private String name;
    private String surname;
    private int age;

    public Person(String n) {
        name = n;
    }

    public Person(String n, String s) {
        name = n;
        surname = s;
    }

    public void displayName(){
        System.out.println(name + ", " + surname);
    }

    public void setSurname(String surname) {
        this.name = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
