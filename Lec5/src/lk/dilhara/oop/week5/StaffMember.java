package lk.dilhara.oop.week5;

public abstract class StaffMember {

    private String name;
    private String surname;
    private String dob;
    private String phoneNo;
    private String staffID;

    public StaffMember(String name, String surname, String dob, String phoneNo, String staffID) {

        this.name = name;
        this.surname = surname;
        this.dob = dob;
        this.phoneNo = phoneNo;
        this.staffID = staffID;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDob() {
        return dob;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getStaffID() {
        return staffID;
    }

    @Override
    public String toString() {
        return "Staff Member{Name: " + name + ", Surname: " + surname +
        ", Date of Birth: " + dob + ", Phone No: " + phoneNo + ", Staff ID: "
        + staffID;
    }

}
