package fr.icom.info.m1.balleauprisonnier_mvn;

import java.util.Random;

public class player_controleur {
	Random randomGenerator = new Random();
    double step = randomGenerator.nextFloat();
    Sprite sprite;
	public double moveLeft(double x) 
	  {	    
	    if (x > 10 && x < 520) 
	    {
			//spriteAnimate(x);
		    x -= step;
	    }
	    //System.out.print(x);
	    return x;
	  }

	  /**
	   *  Deplacement du joueur vers la droite
	   */
	  public double moveRight(double x) 
	  {
	    if (x > 10 && x < 520) 
	    {
			//spriteAnimate(x);
		    x += step;
	    }
	    return x;
	  }

	  
	  /**
	   *  Rotation du joueur vers la gauche
	   */
	  public double turnLeft(double angle) 
	  {
	    if (angle > 0 && angle < 180) 
	    {
	    	angle += 1;
	    }
	    else {
	    	angle += 1;
	    }
	    return angle;
	  }

	  
	  /**
	   *  Rotation du joueur vers la droite
	   */
	  public double turnRight(double angle) 
	  {
	    if (angle > 0 && angle < 180) 
	    {
	    	angle -=1;
	    }
	    else {
	    	angle -= 1;
	    }
	    return angle;
	  }


	  void shoot(Player d){
		  Sprite sprites = d.sprite;
	  	sprites.playShoot();
	  	//projectile.ball(10,1,1);
	  }
	  
	  /**
	   *  Deplacement en mode boost
	   */
	  /*public double boost(double x) 
	  {
	    x += step*2;
		  spriteAnimate(x,);
		return x;
	  }
*/
	  void spriteAnimate(double x, Player d){
	  	  //System.out.println("Animating sprite");
		  Sprite sprites = d.sprite;
		  if(!sprites.isRunning) {sprites.playContinuously();}
		    sprites.setX(x);
		 // sprite.setY(y);
	  }
}
