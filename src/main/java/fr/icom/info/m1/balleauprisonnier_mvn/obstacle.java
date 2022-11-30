package fr.icom.info.m1.balleauprisonnier_mvn;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.util.Duration;

class Obstacle {
	private GraphicsContext gcss;
		 Sprite sprite;
		 Image obstacles;
		 double positiony;
		double positionx;
	     ImageView obstaclesview;

		Obstacle(GraphicsContext gcs,double xy,double yy){
			gcss=gcs;
			
			positionx=xy;
			positiony=yy;
			
			obstacles = new Image("assets/arbre.png");
			obstaclesview = new ImageView();
			obstaclesview.setImage(obstacles);
			obstaclesview.setFitWidth(10);
			obstaclesview.setPreserveRatio(true);
			obstaclesview.setSmooth(true);
			obstaclesview.setCache(true);
			
	         sprite = new Sprite(obstacles, 0,0, Duration.seconds(.2), "top",true); 
	    //    x=xa;
	    //    y=ya;
	         //this.angle=angle;
	   //     double angles = angle;
	       	sprite.setX(positionx);
	     	  	sprite.setY(positiony);
	     	
		}
		 void display() {
				
			 gcss.setFill( Color.LIGHTGRAY);
			//gap.save();
		
			 gcss.drawImage(obstacles,positionx,positiony,100,100);
			sprite.setX(positionx);
     	  	sprite.setY(positiony);
			//gap.restore();
			
		}
}
