package fr.icom.info.m1.balleauprisonnier_mvn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;

public class Field_controleur extends Canvas{
	 static ArrayList<String> input = new ArrayList<String>();
	
	
	
	 private static Player[] Equipe1=Field.Equipe1;
	 private static Player[] Equipe2=Field.Equipe2;
	 
	 static GraphicsContext gc=Field.gc;


	public static double Equipe2shoot;
	public static List<Projectile> projectile1= new ArrayList<Projectile>();
	 
	 private AnimationTimer timer; 
	public static double[] controleur() {
	
		double st =Math.random() * 3- 1;
		
	    Equipe2shoot=1;
	    /** 
	     * Event Listener du clavier 
	     * quand une touche est relachee on l'enleve de la liste d'input
	     *   
	     */

	    
	    /** 
	     * 
	     * Boucle principale du jeu
	     * 
	     * handle() est appelee a chaque rafraichissement de frame
	     * soit environ 60 fois par seconde.
	     * 
	     */
	    
	            for (int i = 0; i < Equipe1.length; i++)
	    	    {
	            	player_controleur a=new player_controleur();
	        		if (i==0 && input.contains("Y"))
	        		{
	        			Equipe1[i].x=a.moveLeft(Equipe1[i].x);
	        			a.spriteAnimate(Equipe1[i].x, Equipe1[i]);
	        		} 
	        		if (i==0 && input.contains("I")) 
	        		{
	        			Equipe1[i].x=a.moveRight(Equipe1[i].x);	
	        			a.spriteAnimate(Equipe1[i].x, Equipe1[i]);
	        		}
	        		if (i==0 && input.contains("F"))
	        		{
	        			Equipe1[i].angle=a.turnLeft(Equipe1[i].angle);
	        		} 
	        		if (i==0 && input.contains("DOWN")) 
	        		{
	        			Equipe1[i].angle=a.turnRight(Equipe1[i].angle);	        			
	        		}
	        		if (i==1 && input.contains("A"))
	        		{
	        			Equipe1[i].x=a.moveLeft(Equipe1[i].x);
	        			a.spriteAnimate(Equipe1[i].x, Equipe1[i]);
	        		} 
	        		if (i==1 && input.contains("B")) 
	        		{
	        			Equipe1[i].x=a.moveRight(Equipe1[i].x);	 
	        			a.spriteAnimate(Equipe1[i].x, Equipe1[i]);
	        		}
	        		if (i==1 && input.contains("H"))
	        		{
	        			Equipe1[i].angle=a.turnLeft(Equipe1[i].angle);
	        		} 
	        		if (i==1 && input.contains("O")) 
	        		{
	        			Equipe1[i].angle=a.turnRight(Equipe1[i].angle);	        			
	        		}
	        		if (i==0&&input.contains("M")){
	        			a.shoot(Equipe1[i]);
	        			
	        		
	        			if(Equipe1[i].visible==true) {
	        			projectile1.add(new Projectile(1,gc,"bottom", Equipe1[0].x, Equipe1[0].y-150,Equipe1[0].angle+360,50,true));
					}
	        		}
	        		if (i==1&&input.contains("T")){
	        			a.shoot(Equipe1[i]);
	        		
	        			if(Equipe1[i].visible==true) {
	        			projectile1.add(new Projectile(1,gc,"bottom", Equipe1[1].x, Equipe1[1].y-150,Equipe1[1].angle+360,50,true));
	        		
	        		}
	        		}
	        	
	        		if (i==2){
	        			if(Equipe1[i].x>0 && Equipe1[i].x<500) {
	        				st= Math.random() * 3- 1;
	        				Equipe1[i].x=Equipe1[i].x+st;
	        				a.spriteAnimate(Equipe1[i].x, Equipe1[i]);
	        		
					}
	        			
	        				
	        		
	        		}
	        		
	        		Equipe1[i].display();
	    	    }
	            for (int i = 0; i < Equipe2.length; i++)
	    	    {
	            	player_controleur a=new player_controleur();
	        		if (i==0 && input.contains("LEFT"))
	        		{
	        			
	        			Equipe2[i].x=a.moveLeft(Equipe2[i].x);
	        			a.spriteAnimate(Equipe2[i].x, Equipe2[i]);
	        		} 
	        		if (i==0 && input.contains("RIGHT")) 
	        		{
	        			Equipe2[i].x=a.moveRight(Equipe2[i].x);	
	        			a.spriteAnimate(Equipe2[i].x, Equipe2[i]);
	        		}
	        		if (i==0 && input.contains("UP"))
	        		{
	        			Equipe2[i].angle=a.turnLeft(Equipe2[i].angle);
	        		} 
	        		if (i==0 && input.contains("DOWN")) 
	        		{
	        			Equipe2[i].angle=a.turnRight(Equipe2[i].angle);	        			
	        		}
	        		if (i==1 && input.contains("Q"))
	        		{
	        			Equipe2[i].x=a.moveLeft(Equipe2[i].x);
	        			a.spriteAnimate(Equipe2[i].x, Equipe2[i]);
	        		} 
	        		if (i==1 && input.contains("D")) 
	        		{
	        			Equipe2[i].x=a.moveRight(Equipe2[i].x);	
	        			a.spriteAnimate(Equipe2[i].x, Equipe2[i]);
	        		}
	        		if (i==1 && input.contains("Z"))
	        		{
	        			Equipe2[i].angle=a.turnLeft(Equipe2[i].angle);
	        		} 
	        		if (i==1 && input.contains("S")) 
	        		{
	        			Equipe2[i].angle=a.turnRight(Equipe2[i].angle);	 
	        			
	        		}
	        		if (i==0&&input.contains("SPACE")){
	        			a.shoot(Equipe2[i]);
	        			
	        			if(Equipe2[i].visible==true) {
	        			projectile1.add(new Projectile(2,gc,"top", Equipe2[0].x, Equipe2[0].y+150,Equipe2[0].angle+360,50,true));
					}
	        		}
	        		if (i==1&&input.contains("E")){
	        			a.shoot(Equipe2[i]);
	        			
	        		
	        			if(Equipe2[i].visible==true) {
	        			 projectile1.add(new Projectile(2,gc,"top", Equipe2[1].x, Equipe2[1].y+150,Equipe2[1].angle+360,50,true));
					//}	
	        		}
	        		}
	        			if (i==2 && input.contains("A"))
		        		{
		        			Equipe2[i].x=a.moveLeft(Equipe2[i].x);
		        			a.spriteAnimate(Equipe2[i].x, Equipe2[i]);
		        		} 
		        		if (i==2 && input.contains("B")) 
		        		{
		        			Equipe2[i].x=a.moveRight(Equipe2[i].x);	 
		        			a.spriteAnimate(Equipe2[i].x, Equipe2[i]);
		        		}
		        		if (i==2 && input.contains("H"))
		        		{
		        			Equipe2[i].angle=a.turnLeft(Equipe2[i].angle);
		        		} 
		        		if (i==2 && input.contains("O")) 
		        		{
		        			Equipe2[i].angle=a.turnRight(Equipe2[i].angle);	        			
		        		}
	        		
		        		if (i==2&&input.contains("T")){
		        			a.shoot(Equipe2[i]);
		        		
		        			if(Equipe2[i].visible==true) {
		        			projectile1.add(new Projectile(1,gc,"bottom", Equipe2[2].x, Equipe2[2].y-150,Equipe2[2].angle+360,50,true));
		        		
		        		}
	        	
	        			
	        		
	        		Equipe2[i].display();
	    	    }
	            double[] resultat= {Equipe1[0].x,Equipe1[1].x,Equipe1[0].angle,Equipe1[1].angle, Equipe2[0].x,Equipe2[1].x,Equipe2[0].angle,Equipe2[1].angle};
				
	            return resultat;
	    	}
	     
	;
;

	public static ArrayList<String> pressed(KeyEvent event) {
		 String code = event.getCode().toString();
         // only add once... prevent duplicates
         if ( !input.contains(code) )
             input.add( code );
         ArrayList<String> resultat= (input);
         
         return resultat;
}
	public static ArrayList<String> released(KeyEvent event) {
		String code = event.getCode().toString();
        input.remove( code );
        ArrayList<String> resultat= (input);
        return resultat;
}
	public static boolean collision(Player equipe1, Projectile projectile) {
		boolean collisiondetected = false;
		if(equipe1.sprite.getBoundsInParent().intersects(projectile.sprite.getBoundsInParent())) {
			 collisiondetected = true;
	}
		return collisiondetected;
	}
	public static boolean collisionobstacle(Obstacle obs, Projectile projectile) {
		boolean collisiondetected = false;
		if(obs.sprite.getBoundsInParent().intersects(projectile.sprite.getBoundsInParent())) {
			 collisiondetected = true;
	}
		return collisiondetected;
	}
	public static double angleeq(Double angles) {
		return angles;
	}
}
