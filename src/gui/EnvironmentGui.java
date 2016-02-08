package gui;

import environment.Entrepot;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * window used to display the environment
 *
 * @author emmanuel adam
 */
@SuppressWarnings("serial")
public class EnvironmentGui extends JFrame implements ActionListener {

    /**
     * environment to display
     */
    Entrepot ent;
    JButton button_e;
    JButton button_m;

    public EnvironmentGui(Entrepot _ent) {
        ent = _ent;
        setBounds(10, 10, 800, 800);
        button_e = new JButton("Swith to euclide");
        button_m = new JButton("Switch to Manhattan");

        setTitle("A* resolution for shortest way");
        buildGui();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    /**
     * add a PanelEnvironment in the center of the window
     */
    private void buildGui() {

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(BorderLayout.CENTER, new PanelEnvironment(700, 700, ent));
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
