package View;

import javax.swing.*;
import java.awt.*;

public class PanelWest extends JPanel{

    public PanelWest(){

        //Panel menu west 2 rows, 1 column
        JPanel panelWest = new JPanel(new GridLayout(2,1));

        // Row 1 column 1 : write a transaction button
        WriteTransactionButton writeTransaction = new WriteTransactionButton("write a transaction");
        panelWest.add(writeTransaction);

        // Row 1 column 1 : write a transaction button
        ListTransactionButton listTransaction = new ListTransactionButton("list of transactions");
        panelWest.add(listTransaction);

        this.add(panelWest);
        
    }

    public void link(JPanel mainWindow){
        mainWindow.add(this, BorderLayout.WEST);
    }
}
