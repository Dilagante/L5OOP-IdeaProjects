package lk.dilhara.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WestminsterHealthCentreManager implements HealthCentreManager{

    private List<StaffMember> staffMemberList;
    private int staffLimit;
    private int noOfDoctors;
    private int noOfReceptionists;

    public WestminsterHealthCentreManager(int staffLimit, List<StaffMember> staffMemberList){
        this.staffLimit = staffLimit;
        this.staffMemberList = staffMemberList;
        this.noOfDoctors = 0;
        this.noOfReceptionists = 0;
    }

    @Override
    public boolean runMenu() {

        System.out.println("=== Welcome to the Westminster Health Centre Management System ===");
        System.out.println("1. Add New Staff Member");
        System.out.println("2. Remove Staff Member");
        System.out.println("3. View All Staff");
        System.out.println("4. Search Staff by ID");
        System.out.println("0. Exit");

        System.out.print("Enter your choice: ");
        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();

        switch (choice) {
            case 1:
                addStaffMember();
                break;
            case 2:
                removeStaffMember();
                break;
            case 3:
                printStaffMember();
                break;

        }

        return false;
    }

    @Override
    public void addStaffMemberList(StaffMember staff) {


        staffMemberList.add(staff);

    }

    public void addStaffMember() {

        if (staffMemberList.size() >= staffLimit){
            System.out.println("Maximum Staff Member Limit Reached");
            System.out.println("Cannot add more Staff Members");
            return;
        }

        StaffMember member = null;

        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the Name: ");
        String name = s1.next();
        System.out.print("Enter the Surname: ");
        String surname = s1.next();
        System.out.print("Enter the Date of Birth: ");
        String dob = s1.next();
        System.out.print("Enter the Phone Number: ");
        String phoneNo = s1.next();
        System.out.print("Enter the Staff ID: ");
        String staffID = s1.next();

        while (true) {
            System.out.println("Do you want to add a Doctor or a Receptionist");
            System.out.print("Type D for Doctor, R for Receptionist: ");
            String staffType = s1.next();

            switch (staffType) {
                case "D":
                case "d":
                    System.out.print("Enter the Licence Number: ");
                    String licenceNumber = s1.next();
                    System.out.print("Enter the Specialisation: ");
                    String specialisation = s1.next();
                    System.out.print("Enter the Number of Consultations per week: ");
                    int numberConsultationsPerWeek = s1.nextInt();

                    member = new Doctor(name, surname, dob, phoneNo, staffID,
                            licenceNumber, specialisation, numberConsultationsPerWeek);

                    noOfDoctors++;
                    break;

                case "R":
                case "r":
                    System.out.print("Enter the Desk Number: ");
                    int deskNumber = s1.nextInt();
                    System.out.print("Enter the Hours Per Week: ");
                    int hoursPerWeek = s1.nextInt();

                    member = new Receptionist(name, surname, dob, phoneNo,
                            staffID, deskNumber, hoursPerWeek);

                    noOfReceptionists++;
                    break;

                default:
                    System.out.println("Invalid Choice. Try again.");
                    continue;
            }
            break;
        }
        addStaffMemberList(member);
        System.out.println("Staff Member added to the list Successfully!");
    }

    @Override
    public void printStaffMember() {

    }

    @Override
    public void runGUI() {

    }

    public void removeStaffMember(){
        System.out.print("Enter the Staff ID of the member you wish to remove: ");
        Scanner s2 = new Scanner(System.in);
        String staffIDToRemove = s2.next();

        boolean found = false;

        for (StaffMember member: staffMemberList) {
            if (member.getStaffID().equals(staffIDToRemove)){
                found = true;
                staffMemberList.remove(member);
                System.out.println("Staff Member " + staffIDToRemove + " Successfully removed");
                if (member instanceof Doctor){
                    noOfDoctors--;
                }
                else {
                    noOfReceptionists--;
                }
                break;
            }
        }

        if (!found) {
            System.out.println("Staff Member " + staffIDToRemove + " not found in the list");
        }
    }
}
