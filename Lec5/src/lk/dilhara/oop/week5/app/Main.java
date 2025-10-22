package lk.dilhara.oop.week5.app;

import lk.dilhara.oop.week5.Doctor;
import lk.dilhara.oop.week5.Receptionist;
import lk.dilhara.oop.week5.StaffMember;

public class Main {
    public static void main(String[] args) {

        StaffMember s = new Doctor("Dilhara","De Silva",
                "23/01/2005", "077019292929", "S0012",
                "L123123", "Cardiology",
                12);

        System.out.println(s);

        s = new Receptionist("Dilhara","De Silva",
                "23/01/2005", "077019292929", "S0012",
                12, 40);

        System.out.println(s);

        StaffMember[] employeeList = new StaffMember[10];
        //The employeeList is an Array
        //Array is fixed in size
        //Array does not have underlying operations to support
        //  add item, delete item, or list the items
    }
}








