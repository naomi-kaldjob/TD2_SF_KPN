package fr.icom.info.m1.balleauprisonnier_mvn;
import fr.icom.info.m1.balleauprisonnier_mvn.Sprite;


import java.util.concurrent.TimeUnit;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;
import javafx.scene.canvas.GraphicsContext;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.geometry.Bounds;
import javafx.scene.Node;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;
class Projectile  {
		//int vitesse;
		//double[] pos=new double[2];
		//double ya;
		//public Node sprite;

		Sprite sprite;
		double angle  ;
		double angles;	
			//GraphicsContext gcs;
			Image balle;
		double xa;
			//ImageView TirDirectionArrow;
			double ya;
			String sides;
			double vitesse;
			//Timer t=new Timer(5,this);

			private GraphicsContext gc;
			private double xas;
			//private int avantx;
			private double yas;
			private ImageView PlayerDirectionArrow;
			private ImageView balles;
			int ids;
			 boolean visibles;

			//private int avanty;
			

			 
			//Projectile();
			Projectile(int id,GraphicsContext gcs,String side,double xy,double yy,double angle,double vitesses,boolean visible){
				ids=id;
				gc=gcs;
				sides=side;
				xa=xy;
				ya=yy;
				angles=angle;
				vitesse=vitesses;
				visibles=visible;
				balle = new Image("assets/ball.png");
				 balles = new ImageView();
			        balles.setImage(balle);
			        balles.setFitWidth(10);
			       balles.setPreserveRatio(true);
			        balles.setSmooth(true);
			        balles.setCache(true);
				
		         sprite = new Sprite(balle, 0,0, Duration.seconds(.2), "top",true); 
		    //    x=xa;
		    //    y=ya;
		         //this.angle=angle;
		   //     double angles = angle;
		       	sprite.setX(xa);
		     	  	sprite.setY(ya);
		     	  //System.out.print(angles);

			}
			//GraphicsContext gc,
			public void effacerimage(GraphicsContext gcs,double avantx,double avanty) {
				//gcs.fillStyle = "";
				//gcs.Fillrect();
				 //setColor(LIGHTGRAY);
				gcs.clearRect( avantx,avanty,balle.getWidth(),balle.getHeight());
			}
			//GraphicsContext gc,double xa,double ya
			public void draw(GraphicsContext gcs)  {
				//Timeline timeline = new Timeline(
						//new KeyFrame(Duration.seconds(0),new EventHandler<ActionEvent>() {
					
					//public void handle(ActionEvent actionEvent){
						//gcs.save();
				        sprite = new Sprite(balle, 0,0, Duration.seconds(.2), "top",true); 
				        sprite.setX(xa);
				        sprite.setY(ya);
						gcs.drawImage(balle,xa,ya,balle.getWidth(),balle.getHeight());
						//gcs.restore();
						//System.out.print("y de la balle"+(ya));
						
				}
		
				
			//public void moveImage(GraphicsContext gc,String sides,double xa,double ya,double angles,double vitesse) {
			//String sides
			//double x,double y,double angles
			public void display(GraphicsContext gcs) {
				if(visibles==true) {
				gcs.setFill( Color.LIGHTGRAY);
				
				double avantx;
			  double avanty;
				
				//int encounter = 0;
				//en=false;
				//en==false;
				int encounter = 0;
				
				//while(encounter<20) {
				
					 if(xa>0 & xa<600 & ya>0 & ya<600){
				 
					// System.out.print("n"+"\n");
					 if(sides=="top") {
						 //System.out.print(y);
						 //angles+=90;
						 //sprite = new Sprite(balle, 0,0, Duration.seconds(.2), "top"); 
						 //sprite.setX();
						 //gc.clearRect( xa,ya,balle.getWidth(),balle.getHeight());
						 //xa+=Math.sin(angles)*vitesse;
				         //ya+=Math.cos(angles)*vitesse;
						 //xa += vitesse*Math.cos(Math.toRadians(angles));
						 //ya += vitesse * Math.sin(Math.toRadians(angles));
						 //System.out.print("angles"+angles);
						 //System.out.print("position y"+ya);
				         //x+=Math.sin(angles)*vitesse;
				         //y-=Math.cos(angles)*vitesse;
						 //draw(gc,xa,ya);
						 //effacerimage(xa, ya);
						 //effacerimage(gcs,xa, ya);
						 
						 //System.out.print("xa"+xa);
						 
						// effacerimage(gcs,xa, ya);
						 //draw(gcs);
						// System.out.print("la valeur de avantx"+avantx);
						 //gcs.drawImage(balle,xa,ya,balle.getWidth(),balle.getHeight());
						
						 gcs.setFill( Color.LIGHTGRAY);
				         gcs.fillRect(0, 0, balle.getWidth(), balle.getHeight());
				         gcs.drawImage(balle,xa,ya,balle.getWidth(),balle.getHeight());
						 xa = xa - vitesse*Math.sin(Math.toRadians(angles));
						 ya = ya + vitesse * Math.cos(Math.toRadians(angles));
						 //gcs.save();
						 //gcs.setFill( Color.LIGHTGRAY);
						 
						 gcs.drawImage(balle,xa,ya,balle.getWidth(),balle.getHeight());
						 gcs.setFill( Color.LIGHTGRAY);
				         gcs.fillRect(xa, ya, balle.getWidth(), balle.getHeight());
				         sprite = new Sprite(balle, 0,0, Duration.seconds(.2), "top",true); 
					        sprite.setX(xa);
					        sprite.setY(ya);
				           // effacerimage(gcs,xa, ya);
						 //gcs.restore();
						 //draw(gc,xa,ya);
						//draw();
						 
						 //draw();
						 //System.out.print("nouveau y"+(y));
						 
					 }
						 else {
							 //angles-=90;
							 
							// gc.clearRect( xa,ya,balle.getWidth(),balle.getHeight());
							// System.out.print(angles);
					         //xa+=Math.sin(360)*vitesse;
					        // ya-=Math.cos(360)*vitesse;
							 //xa = xa + vitesse*Math.sin(Math.toRadians(angles));
							 //ya = ya - vitesse * Math.cos(Math.toRadians(angles));
							 
							 //draw(gc,xa,ya);
							// effacerimage( xa,ya);
							// effacerimage(gcs,xa, ya);
							
							 
							// System.out.print("la valeur de avantx"+avantx);
							// System.out.print("la valeur de avanty"+avanty);
							// xa=modificationx( xa);
							// ya=modificationx(ya)
							 gcs.setFill( Color.LIGHTGRAY);
					         gcs.fillRect(0, 0, balle.getWidth(), balle.getHeight());
					         gcs.drawImage(balle,xa,ya,balle.getWidth(),balle.getHeight());
							 xa = xa + vitesse*Math.sin(Math.toRadians(angles));
							 ya = ya - vitesse * Math.cos(Math.toRadians(angles));
							 gcs.drawImage(balle,xa,ya,balle.getWidth(),balle.getHeight());
							 gcs.setFill( Color.LIGHTGRAY);
					         gcs.fillRect(xa, ya, balle.getWidth(), balle.getHeight());
							 sprite = new Sprite(balle, 0,0, Duration.seconds(.2), "top",true); 
						        sprite.setX(xa);
						        sprite.setY(ya);
							 //draw(gc,xa,ya);
							 //draw();
							// effacerimage( xa,ya);
							 
							
							 //effacerimage( gc,avantx, avanty);
				}
					 
					
					 //}
					// encounter++;
					 //System.out.print("encounter"+encounter);
					
				} 
					 //else {
					//	 ya=y;
					//	 xa=x;
					// }
					 //System.out.print(ya);
				}	 
					 
				}
				
			//}
					
					// else {
						// if(xa<=0 || xa>=600||ya<=0||ya>=600){
							//System.out.print("b"+avantx+"\n");
							
							//System.out.print("c"+avanty+"\n");
							//en=true;
							//System.out.print("en"+en+"\n");
							
						//}
				
			
				 //}
		//}
			
					
				//super.paint(g);
				//DoubleProperty x  = new SimpleDoubleProperty();
		       // DoubleProperty y  = new SimpleDoubleProperty();
				//Timeline timeline = new Timeline(
				 //       new KeyFrame(Duration.seconds(0),
				                   // new KeyValue(x, pos[0]),
				                  //  new KeyValue(y, pos[1])
				           // ),
				          //  new KeyFrame(Duration.seconds(6000),
				                 //   new KeyValue(x, pos[0]+Math.sin(angle)*vitesse),
				                 //   new KeyValue(y, pos[1]+Math.cos(angle)*vitesse)
				            //)
				      //  );
				     //   timeline.setAutoReverse(true);
				     //   timeline.setCycleCount(500);
				
			
				//pos[0]=pos[0]+Math.sin(angles)*vitesse;

			    
			    //System.out.print(angles);
			    //System.out.print(pos[0]);
			   // System.out.print(angles);
				//gcs.save();
				
				//rotates(gcs, angles, pos[0]+balle.getWidth() / 2, pos[1] + balle.getHeight() / 2);
			
			 
				
				//gcs.restore();
				//timeline.play();
				
				
			Bounds getboundproj() {
				return sprite.getBoundsInParent(); 
			 }        
			
		//	private collision()
						
			
		    private void rotates(GraphicsContext gc, double angle, double px, double py) {
		        Rotate r = new Rotate(angle, px, py);
		        gc.setTransform(r.getMxx(), r.getMyx(), r.getMxy(), r.getMyy(), r.getTx(), r.getTy());
		    }

		
	}