package lk.dilhara.oop;

import java.util.Comparator;

public class NameComparator implements Comparator<StaffMember>{

    @Override
    public int compare(StaffMember o1, StaffMember o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
