package fr.icom.info.m1.balleauprisonnier_mvn;


import java.awt.GridBagConstraints;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * Classe principale de l'application 
 * s'appuie sur javafx pour le rendu
 */

public class App extends Application 
{
	
	public static boolean bstops;

	/**
	 * En javafx start() lance l'application
	 *
	 * On cree le SceneGraph de l'application ici
	 * @see http://docs.oracle.com/javafx/2/scenegraph/jfxpub-scenegraph.htm
	 * 
	 */
	
	@Override
	public void start(Stage stage) throws Exception 
	{
		// Nom de la fenetre
        stage.setTitle("BalleAuPrisonnier");

        Group root = new Group();
        Scene scene = new Scene( root );
        
        // On cree le terrain de jeu et on l'ajoute a la racine de la scene
      
       Score scores= new Score();
        Field gameField = new Field(scene, 600, 600 );
        root.getChildren().add( gameField );
      
        root.getChildren().add( scores.label1);
       root.getChildren().add( scores.label2);
        root.getChildren().add( scores.label3);
        root.getChildren().add( scores.label4);
   
        root.getChildren().add(gameField.getobstacle1()[0].sprite);
        root.getChildren().add(gameField.getobstacle1()[1].sprite);
        root.getChildren().add(gameField.getobstacle1()[2].sprite);
       root.getChildren().add(gameField.getobstacle1()[3].sprite);
        root.getChildren().add(gameField.getEquipe1()[0].sprite);
        root.getChildren().add(gameField.getEquipe1()[1].sprite);
        root.getChildren().add(gameField.getEquipe1()[2].sprite);
       root.getChildren().add(gameField.getEquipe2()[0].sprite);
       root.getChildren().add(gameField.getEquipe2()[1].sprite);
        root.getChildren().add(gameField.getEquipe2()[2].sprite);
        
        // On ajoute la scene a la fenetre et on affiche
        stage.setScene( scene );
        stage.show();
	}
	
  

	public static void main(String[] args) 
    {
        //System.out.println( "Hello World!" );
    	Application.launch(args);
    	
    }
}
