package TP1BDCS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TestDiagnostique
{
    public static void main(String[] args)
    {
        /* Initialiser la fenêtre */
        JFrame fenetre = new JFrame();
        fenetre.setSize(500,100);

        JPanel panneauPrincipal = new JPanel();
        panneauPrincipal.setLayout(new BoxLayout(panneauPrincipal, BoxLayout.Y_AXIS));

        /*          Ajout composants graphiques         */

        JLabel labelMontant = new JLabel("Montant (CAD)");
        JTextField montant = new JTextField();
        String[] listeDevises = {"USD", "EUR", "BTC"};
        JComboBox selectDevise = new JComboBox(listeDevises);
        JButton validerConversion = new JButton("Convertir");
        JLabel resultConv = new JLabel("Résultat");

        validerConversion.addActionListener();


        GridBagConstraints contrainte = new GridBagConstraints();

        contrainte.fill=GridBagConstraints.BOTH;

        contrainte.gridx=0;
        contrainte.gridy=0;
        panneauPrincipal.add(labelMontant, contrainte);

        contrainte.gridx=0;
        contrainte.gridy=1;
        panneauPrincipal.add(montant, contrainte);

        contrainte.gridx=0;
        contrainte.gridy=2;
        panneauPrincipal.add(selectDevise, contrainte);

        contrainte.gridx=0;
        contrainte.gridy=3;
        panneauPrincipal.add(resultConv, contrainte);

        contrainte.gridx=0;
        contrainte.gridy=4;
        panneauPrincipal.add(validerConversion, contrainte);

        fenetre.setContentPane(panneauPrincipal);
        fenetre.setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
       /*if(e.getSource()==validerConversion)
       {

       }*/
       System.out.println(e.getSource());
    }
}
