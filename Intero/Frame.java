package Intero;

//Imports
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.*;
import java.util.Calendar;

import javax.swing.*;

public class Frame extends JFrame implements ActionListener{

	// Création des différent Panel
	JPanel Panel = new JPanel();
	
	// Création des différent Label
	JLabel Celsius = new JLabel("Celsius");
	JLabel Fahrenheit = new JLabel("0 Fahrenheit");
	
	// Création des différent TextField
 JTextField Saisie =new JTextField(""); 
 
 // Création des différent Bouton
 JButton Convert = new JButton("Convert");
	
 // Constructeur
	Frame (){
		super();
		build();
	}
	
	// Creation de la fenetre
	private void build() {
		
		// Définition des paramètres de la fenetre
		this.setTitle("Convert Celsius to Fahrenheit"); // Définition du titre de la page
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Boutton permettant de fermer la page
		this.setSize(400,100); // Largeur,Hauteur
		this.setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
	    
	    //Définition du Panel principal
	    Panel.setBackground(Color.LIGHT_GRAY); // Couleur fond
	    Panel.setLayout(new GridLayout(2, 2)); // Disposition des elements
	    
	    // Ajout des elements
	    Panel.add(Saisie);
	    Panel.add(Celsius);
	    Panel.add(Convert);
	    Panel.add(Fahrenheit);
	    
	    // Ajour des actions
	    Convert.addActionListener(this);
	   
	    //Affiche le Panel principal dans la fenetre
	    this.add(Panel);

	}

	// Creation des actions / Interactions avec les boutons
	public void actionPerformed(ActionEvent e) {
		  Object source = e.getSource();
		  
		  // Si le bouton "Saisie" est selectionné 

		  //Convertion de la saisie text (String) en Integer
		int val_saisie = Integer.parseInt(Saisie.getText());
		
		// Convertion des celcuis en Fahrenheit
		int val_en_far = (int) (val_saisie * 1.8 + 32);

		// On change le champ de text avec la nouvel valeur desFahrenheit
		Fahrenheit.setText(val_en_far+" Fahrenheit");	  

		//On Rafraichie la page
	       SwingUtilities.updateComponentTreeUI(this);
	}
}