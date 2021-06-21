package View;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame{
    
    public MainWindow(){

        // Panel master
        this.setSize(new Dimension(1200, 800));
        JPanel windowPanel = new JPanel(new BorderLayout());
        this.add(windowPanel);

        //Panel west
        PanelWest panelWest = new PanelWest();
        panelWest.link(windowPanel);

        //Panel center
        JPanel panelCenter = new JPanel(new GridLayout());
        windowPanel.add(panelCenter, BorderLayout.CENTER);

        // end
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
