package TP1BDCS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestDiagnostique
{
    static final float taux_CAD_vers_EUR = (float)0.67153;
    static final float taux_CAD_vers_USD = (float)0.80153;
    static final float taux_CAD_vers_BTC = (float)0.00023;

    public static void main(String[] args)
    {

        /* Initialiser la fenêtre */
        JFrame fenetre = new JFrame();
        fenetre.setSize(500,200);

        JPanel panneauPrincipal = new JPanel();
        panneauPrincipal.setLayout(new BoxLayout(panneauPrincipal, BoxLayout.Y_AXIS));

        /*          Ajout composants graphiques         */

        JLabel labelMontant = new JLabel("Montant (CAD)");
        JTextField montant = new JTextField();
        String[] listeDevises = {"USD", "EUR", "BTC"};
        JComboBox selectDevise = new JComboBox(listeDevises);
        JButton validerConversion = new JButton("Convertir");
        JLabel resultConv = new JLabel("Résultat");

        validerConversion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String montantTexte = montant.getText();
                float montantNum = Integer.parseInt(montantTexte);

                String devise = (String)selectDevise.getSelectedItem();
                float montantConverti = 0;
                if(devise.compareTo("USD")==0)
                {
                    montantConverti = montantNum*taux_CAD_vers_USD;

                }else if(devise.compareTo("EUR")==0)
                {
                    montantConverti = montantNum*taux_CAD_vers_EUR;

                }else if(devise.compareTo("BTC")==0)
                {
                    montantConverti = montantNum*taux_CAD_vers_BTC;

                }
                System.out.println("le montant converti est "+montantConverti);
                String montantTxt = Float.toString(montantConverti);
                resultConv.setText(montantTxt);
            }
        });


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

        contrainte.gridx=1;
        contrainte.gridy=0;
        panneauPrincipal.add(resultConv, contrainte);

        contrainte.gridx=1;
        contrainte.gridy=1;
        panneauPrincipal.add(validerConversion, contrainte);

        fenetre.setContentPane(panneauPrincipal);
        fenetre.setVisible(true);
    }

}
