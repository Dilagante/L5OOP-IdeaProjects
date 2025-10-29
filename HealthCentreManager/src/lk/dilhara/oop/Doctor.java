package lk.dilhara.oop;

public class Doctor extends StaffMember{

    private String licenceNumber;
    private String specialisation;
    private int numberConsultationsperWeek;

    public Doctor(String name, String surname, String dob,
                  String phoneNo, String staffID, String licenceNumber,
                  String specialisation, int numberConsultationsperWeek){
        super(name, surname, dob, phoneNo,staffID);
        this.licenceNumber = licenceNumber;
        this.specialisation = specialisation;
        this.numberConsultationsperWeek = numberConsultationsperWeek;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public int getNumberConsultationsperWeek() {
        return numberConsultationsperWeek;
    }

    public void setNumberConsultationsperWeek(int numberConsultationsperWeek) {
        this.numberConsultationsperWeek = numberConsultationsperWeek;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Licence Number: " + licenceNumber
                + ", Specialisation: " + specialisation
                + ", Number of Consultations per Week: " +
                numberConsultationsperWeek;
    }
}
