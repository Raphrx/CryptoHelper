package View;

import javax.swing.JButton;
import java.awt.*;
import java.awt.event.*;

public class MenuButton extends JButton{
    
    public MenuButton(String text){

        // Initial aspect
        this.setText(text);
        this.setBackground(Color.BLACK);
        this.setForeground(Color.WHITE);
        this.setBorderPainted(false);
        this.setFont(new Font("Helvetica Neue", Font.BOLD, 30));

        // Action Listener
        this.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {     
    
            }
        });

        // Enter and exit mouse listener
        JButton mainButton = this;
        this.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mainButton.setBackground(Color.GREEN.darker());
                mainButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
        
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mainButton.setBackground(Color.BLACK);
                mainButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
    }   
}
