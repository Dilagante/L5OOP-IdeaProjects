package lk.dilhara.oop;

import java.util.Comparator;

public class SurnameComparator implements Comparator<StaffMember> {

    @Override
    public int compare(StaffMember o1, StaffMember o2) {
        return o1.getSurname().compareTo(o2.getSurname());
    }
}
