package fr.icom.info.m1.balleauprisonnier_mvn;


import java.util.Random;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.transform.Rotate;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

/**
 * 
 * Classe gerant un joueur
 *
 */
public class Player 
{
	  double x;       // position horizontale du joueur
	  final double y; 	  // position verticale du joueur
	  double angle = 90; // rotation du joueur, devrait toujour être en 0 et 180
	  double step;    // pas d'un joueur
	  String playerColor;
	  int ids;
	  
	  // On une image globale du joueur 
	  Image directionArrow;
	  Sprite sprite;
	  ImageView PlayerDirectionArrow;
	  Projectile balle;
	  GraphicsContext graphicsContext;
	 // Image balle;
	  ImageView TirDirectionArrow;
	  String side;
	//private boolean visible=false;
	   boolean visible;
	   public static int baille=0;
	  
	  /**
	   * Constructeur du Joueur
	   * 
	   * @param gc ContextGraphic dans lequel on va afficher le joueur
	   * @param color couleur du joueur
	   * @param yInit position verticale
	   */
	  Player(int id,GraphicsContext gc,String color, int xInit, int yInit, String side,boolean visibles)
	  {
		// Tous les joueurs commencent au centre du canvas, 
	    x = xInit;               
	    y = yInit;
	    ids=id;
	    graphicsContext = gc;
	    playerColor=color;
	    visible=visibles;
	    angle = 0;
	    
	    // On charge la representation du joueur
        if(side=="top"){
        	directionArrow = new Image("assets/PlayerArrowDown.png");
		}
		else{
			directionArrow = new Image("assets/PlayerArrowUp.png");
		}
        
        PlayerDirectionArrow = new ImageView();
        PlayerDirectionArrow.setImage(directionArrow);
        PlayerDirectionArrow.setFitWidth(10);
        PlayerDirectionArrow.setPreserveRatio(true);
        PlayerDirectionArrow.setSmooth(true);
        PlayerDirectionArrow.setCache(true);
        
	    
        
        Image tilesheetImage = new Image("assets/orc.png");
        sprite = new Sprite(tilesheetImage, 0,0, Duration.seconds(.2), side,visible);
        
        	
        sprite.setX(x);
        sprite.setY(y);
        
        //balle.display();
        //directionArrow = sprite.getClip().;

	    // Tous les joueurs ont une vitesse aleatoire entre 0.0 et 1.0
         

        // Pour commencer les joueurs ont une vitesse / un pas fixe
        //step = 1;
        
	  }

	  /**
	   *  Affichage du joueur
	   */
	  void display()
	  {
		  if(visible!=false) {
		  graphicsContext.save(); // saves the current state on stack, including the current transform
	      rotate(graphicsContext, angle, x + directionArrow.getWidth() / 2, y + directionArrow.getHeight() / 2);
		  graphicsContext.drawImage(directionArrow, x, y);
		  graphicsContext.restore(); // back to original state (before rotation)
		  sprite.setX(x);
	      sprite.setY(y);
	      
	  }
		  if(visible==false) {
			  sprite.setVisible(false);
		  }
	  }

	  private void rotate(GraphicsContext gc, double angle, double px, double py) {
		  Rotate r = new Rotate(angle, px, py);
		  gc.setTransform(r.getMxx(), r.getMyx(), r.getMxy(), r.getMyy(), r.getTx(), r.getTy());
	  }
	  
	  //void ball(String Sides,double xa,double ya,double angles, double vitesse) {
		  
		// balle= new Projectile( graphicsContext);
		 //int encounter=0;
		// while(y<600){
		//while(encounter<16) {
		//	balle.moveImage(graphicsContext,Sides,xa, ya,angles,vitesse);
		  
		//  encounter++;
	  //}
	  }
	  //}
	  /**
	   *  Deplacement du joueur vers la gauche, on cantonne le joueur sur le plateau de jeu
	   */
	 
	  
	  
//}
