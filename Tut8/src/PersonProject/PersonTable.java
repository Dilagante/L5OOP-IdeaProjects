package PersonProject;
import javax.swing.*;
import java.util.*;

public class PersonTable extends JFrame{

    JTable myTable;
    PersonTableModel tableModel;
    ArrayList<Person> list;

    public PersonTable(ArrayList<Person> list){
        this.list = list;

        PersonTableModel tableModel = new PersonTableModel(list);

        JTable myTable = new JTable(tableModel);

        setSize(800,600);

        JScrollPane scroll = new JScrollPane(myTable);

        add(scroll);

        setTitle("Table Thingy");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
}