package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WriteTransactionGUI extends JFrame{
    
    public WriteTransactionGUI(){

        this.setSize(new Dimension(400, 200));

        JPanel mainPanel = new JPanel(new GridLayout(2,1));

        JTextField jtextfield = new JTextField();
        jtextfield.setHorizontalAlignment(JTextField.CENTER);
        Font font = new Font("Courier", Font.BOLD,35);
        jtextfield.setFont(font);
        mainPanel.add(jtextfield);

        JButton confirmButton = new JButton("Confirm");
        confirmButton.setBackground(Color.BLACK);
        confirmButton.setForeground(Color.WHITE);
        confirmButton.setBorderPainted(false);
        confirmButton.setFont(new Font("Helvetica Neue", Font.BOLD, 30));

        confirmButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {     
                String data = jtextfield.getText();      
            }
        });

        confirmButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                confirmButton.setBackground(Color.GREEN.darker());
                confirmButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
        
            public void mouseExited(java.awt.event.MouseEvent evt) {
                confirmButton.setBackground(Color.BLACK);
                confirmButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });

        mainPanel.add(confirmButton);

        this.add(mainPanel);

        // end
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
