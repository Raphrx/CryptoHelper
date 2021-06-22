package View;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
 
public class TableauGraphique extends JFrame{
     
    public TableauGraphique() {

        this.setLocationRelativeTo(null);
        this.setSize(500,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("List of transactions");
        String header[] = {"Buy/Sell","Token","Price", "Amount"};
        Object data[][]={{1, 1, 1, 1}};
         
        JTable table = new JTable(data, header);
        this.getContentPane().add(new JScrollPane(table));
        this.setVisible(true);
    }
}