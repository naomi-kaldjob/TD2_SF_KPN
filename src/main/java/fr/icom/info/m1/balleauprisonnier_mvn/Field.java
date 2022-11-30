package fr.icom.info.m1.balleauprisonnier_mvn;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.swing.JButton;

//import fr.icom.info.m1.balleauprisonnier_mvn.projectile;
import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;

/**
 * Classe gerant le terrain de jeu.
 * 
 */
public class Field extends Canvas {
	
	/** Joueurs */
	
	
	
	public static Player[] Equipe1=new Player[3];
	public static Player[] Equipe2=new Player[3];
	public static  boolean bstops;
	
	/** Couleurs possibles */
	String[] colorMap = new String[] {"blue", "green", "orange", "purple", "yellow"};
	/** Tableau traçant les evenements */
    
    
	public static Projectile[] balle1=new Projectile[3];
	public static Projectile[] balle2=new Projectile[3];
	public static Obstacle[] obstacles1=new Obstacle[4];
	 static  List<Projectile> projectiles1=Field_controleur.projectile1;
	 public  List<Player> toutequipe= new ArrayList<Player>();
	 public  List<Player> score= new ArrayList<Player>();
	 public  List<Obstacle> obst= new ArrayList<Obstacle>();
    public static  GraphicsContext gc;
    public static  GraphicsContext gc1;
    
     static String message2;
     static String message1;
	private static Field instance;
     
    final int width;
    final int height;
	
	private int encounter;
	
	
   
    
    /**
     * Canvas dans lequel on va dessiner le jeu.
     * 
     * @param scene Scene principale du jeu a laquelle on va ajouter notre Canvas
     * @param w largeur du canvas
     * @param h hauteur du canvas
     */
	public Field(Scene scene, int w, int h) 
	{
		super(w, h); 
		width = w;
		height = h;
		
		/** permet de capturer le focus et donc les evenements clavier et souris */
		this.setFocusTraversable(true);
		
        gc = this.getGraphicsContext2D();
        gc1=this.getGraphicsContext2D();
        
        /** On initialise le terrain de jeu */
    	
        Equipe1[0]= new Player(1,gc, colorMap[0], w/2, h-50, "bottom",true);
     
        Equipe1[0].display();
        Equipe1[1] = new Player(1,gc, colorMap[0], w/3,h-50, "bottom",true);
       //Equipe1[1].visible=true;
        Equipe1[1].display();
        Equipe1[2] = new ordinateur(1,gc, colorMap[0], w/4, h-50, "bottom",true);
        //Equipe1[2].visible=true;
        Equipe1[2].display();
        //Equipe1
        
        Equipe2[0] = new Player(2,gc, colorMap[1], w/2, 20, "top",true);
       //Equipe2[0].visible=true;
        Equipe2[0].display();
        Equipe2[1] = new Player(2,gc, colorMap[1], w/3, 20, "top",true);
        //Equipe2[1].visible=true;
        Equipe2[1].display();
        Equipe2[2] = new ordinateur(2,gc, colorMap[1], w/4, 20, "top",true);
        //Equipe2[2].
        //Equipe2[2].visible=true;
        Equipe2[2].display();
        message1="0";
        message2="0";
        toutequipe.add(Equipe1[0]);
        toutequipe.add(Equipe1[1]);
        toutequipe.add(Equipe1[2]);
        toutequipe.add(Equipe2[0]);
        toutequipe.add(Equipe2[1]);
        toutequipe.add(Equipe2[2]);
        
        obstacles1[0]=new Obstacle(gc,200,240);
        obst.add(obstacles1[0]);
        obstacles1[0].display();
        obstacles1[1]=new Obstacle(gc,450,240);
        obstacles1[1].display();
        obst.add(obstacles1[1]);
        obstacles1[2]=new Obstacle(gc,100,240);
        obstacles1[2].display();
        obst.add(obstacles1[2]);
        obstacles1[3]=new Obstacle(gc,100,240);
        obstacles1[3].display();
        obst.add(obstacles1[3]);
        //vitesse=
        //balle1[0].moveImage();
   
        //balle1[0]=new Projectile(gc,"bottom", Equipe1[0].x, Equipe1[0].y,Equipe1[0].angle+360,	50);
        //balle1[0].display();
       // balle1[1]=new Projectile(gc,"bottom", Equipe1[1].x, Equipe1[1].y,Equipe1[1].angle+360,50);
       // balle1[1].moveImage();
        //balle1[2]=new Projectile(gc,"bottom", w/4, h-50,Equipe1[2].angle+360,10 );
        //balle1[2].moveImage();
      //balle2[0]=new Projectile(gc,"top",Equipe2[0].x, Equipe2[0].y,Equipe2[0].angle+360,10 );
        //balle2[0].moveImage();
     //   balle2[1]=new Projectile(gc,"top", Equipe2[1].x, Equipe2[1].y,Equipe2[1].angle+360,10 );
       // balle2[1].moveImage();
        //Equipe1[1].getbound();
        //Equipe1[1].getbound();
        
        //balle.;
        //projectile.ball(10,1,2);
    	//joueurs[1].display();
    	//joueurs[1].display();
        //balle= new Projectile(gc,10,10,100,100,10);
        //balle.display();
        //List<String> givenList = Arrays.asList("moveleft", "moveright");
		//Random rand = new Random();
		//String  Randoms = givenList.get(rand.nextInt(givenList.size()));
	    /** 
	     * Event Listener du clavier 
	     * quand une touche est pressee on la rajoute a la liste d'input
	     * @return 
	     *   
	     */
        bouger();
	}
        public void bouger() {
	    this.setOnKeyPressed(
	    		new EventHandler<KeyEvent>()
	    	    {
	    	        public void handle(KeyEvent e)
	    	        {
	    	          Field_controleur a=new Field_controleur();
	    	          a.pressed(e);
	    	          
	    	        }
	    	    });

	    /** 
	     * Event Listener du clavier 
	     * quand une touche est relachee on l'enleve de la liste d'input
	     *   
	     */
	    this.setOnKeyReleased(
	    	    new EventHandler<KeyEvent>()
	    	    {
	    	        public void handle(KeyEvent e)
	    	        {
	    	        	Field_controleur a=new Field_controleur();
		    	          a.released(e); 
	    	        }
	    	    });
	    
	    /** 
	     * 
	     * Boucle principale du jeu
	     * 
	     * handle() est appelee a chaque rafraichissement de frame
	     * soit environ 60 fois par seconde.
	     * 
	   
	     */
	    
	     new AnimationTimer() 
	    {
	    	

			
	        public void handle(long currentNanoTime)
	        {	
	        	  gc.setFill( Color.LIGHTGRAY);
		            gc.fillRect(0, 0, width, height);
	        	//if(animationcounter<=0) {
	            // On nettoie le canvas a chaque frame
	        	//System.out.print(bstops);
	        	//if(bstops==true) {
	        		
	        		//stop();
	        	//}
	        	
	        		encounter=0;
	        		 
	        		Field_controleur a=new Field_controleur();
  	          		 double[] zt = a.controleur(); 
  	          	 Score scores= new Score();
  	          		// }
  	          		 for (Projectile p:projectiles1) {
  	          			
  	          			for (Player e:toutequipe) {
  	          				boolean collision = a.collision(e, p);
  	          				if (collision==true) {
  	          					//System.out.print(e);
  	          					e.visible=false;
  	          					e.baille=e.baille+1;
  	          					if(score.contains(e)==false ) {
  	          					if(e.ids!=p.ids) {
  	          						if(e.ids==1) {
  	          							
  	          					message1=Integer.toString(Integer.parseInt(message1)+1);
  	          					score.add(e);
  	          					//scores.label2.setText(Integer.toString(i));
  	          				//scores.label2.setText(scores.setmessage1(message1));
  	          	
  	          						}
  	          						else {
  	          						message2=Integer.toString(Integer.parseInt(message2)+1);
  	  	          					//scores.label4.setText(Integer.toString(i));
  	          						
  	          					//scores.label4.setText(scores.setmessage2(message2));
  	  	          				
  	  	          			score.add(e);
  	          						}
  	          					}
  	          				if(e.ids==p.ids) {
	          						if(e.ids==1) {
	          							
	          							message2=Integer.toString(Integer.parseInt(message2)+1);
	          				
	          					
	          					score.add(e);
	          						}
	          						else {
	          							message1=Integer.toString(Integer.parseInt(message1)+1);
	  	          					
	  	          				score.add(e);
	          						}
	          					}
  	          					
  	          				System.out.print(e.visible);
  	          					//Equipe1[0].x=Equipe1[0].x+200;
  	          			}
  	          			}
  	          			}
  	          			p.display(gc1);
  	          		 }
  	          	 for (Projectile p:projectiles1) {
  	          		 for (Obstacle  o:obst) {
  	          			boolean collisions = a.collisionobstacle(o, p);
	          				if (collisions==true) {
	          					p.visibles=false;
	          				}
  	          	 }
  	          	 }
  	          		
  	          	 obstacles1[0].display();
  	           
  	           obstacles1[1].display();
  	        
  	           obstacles1[2].display();
  	    
  	           obstacles1[3].display();
  	          			
  	          			
	    	}
  	          		 
	        
	     }.start(); // On lance la boucle de rafraichissement 
	 	
	//}
	    
	}
	
	
	public Player[] getEquipe1() {
		return Equipe1;
	}
	public Player[] getEquipe2() {
		return Equipe2;
	}
	
	public Obstacle[] getobstacle1(){
			return obstacles1;
}
	public static Field getInstance(Scene scene, int w,int h) {
		 if (instance == null) {
	            instance = new Field(scene, w, h);
	        }
	        return instance;
	}
}

