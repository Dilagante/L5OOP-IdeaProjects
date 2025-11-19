/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarycentre_package;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author b.villarini
 */
public class ItemTableGUI extends JFrame {
    
    JTable myTable;
    ItemTableModel tableModel;
    ArrayList<Item> itemList;
    JButton button;
    
    // contructor
    public ItemTableGUI(ArrayList<Item> itemList){
        
        //set the title
        this.setTitle("Items in Westminster Library");
        
        // initialise and instantiate the instance variable 
        this.itemList = itemList;
        tableModel = new ItemTableModel(itemList);
        myTable =  new JTable(tableModel);
        
        // set the size of the frame 
        setBounds(20,20,800,600); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
        // sorting
        myTable.setAutoCreateRowSorter(true);
      
        // add the table to the panel
        JScrollPane scrollPane = new JScrollPane(myTable); 
        scrollPane.setPreferredSize(new Dimension(380,280)); 

        // add a button on the bottom
        button = new JButton("Info");

        Handler handler = new Handler();

        button.addActionListener(handler);
        
        // add the panel to the frame
        add(scrollPane,BorderLayout.CENTER); 
        add(button, BorderLayout.SOUTH);
    }
  
    public class Handler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            int bookCounter = 0;
            int DVDCounter = 0;
            int magazineCounter = 0;

            for (Item i: itemList) {
                if (i instanceof Book) {
                    bookCounter++;
                } else if (i instanceof DVD) {
                    DVDCounter++;
                }
                else if (i instanceof Magazine) {
                    magazineCounter++;
                }
            }

            button.setText("No of Books: " + bookCounter +
                    " | No of DVDs: " + DVDCounter +
                    " | No of Magazines: " + magazineCounter);
        }
    }
    
}
