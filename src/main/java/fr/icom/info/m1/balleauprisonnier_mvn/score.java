package fr.icom.info.m1.balleauprisonnier_mvn;

import javafx.scene.control.Label;
import javafx.scene.text.Font;

class Score {
	public static Label label1= new Label();
	public static Label label2= new Label();
	public static Label label3= new Label();
	public static  Label label4= new Label();
	 String message1=Field.message1;
	 String message2=Field.message2;
	
	Score(){
	 //Label label1 ;
     label1.setFont(Font.font("Arial", 14));
     label1.setText("Score equipe1:");
     label1.setTranslateY(50);
     label1.setTranslateX(450);
    // Label label2 = new Label();
     label2.setFont(Font.font("Arial", 14));
     label2.setTranslateY(50);
     label2.setTranslateX(550);
     label2.setText(message1);
     //Label label3 = new Label();
     label3.setFont(Font.font("Arial", 14));
     label3.setText("Score equipe2:");
     label3.setTranslateY(550);
     label3.setTranslateX(450);
     //Label label4 = new Label();
     label4.setFont(Font.font("Arial", 14));
     label4.setTranslateY(550);
     label4.setTranslateX(550);
     label4.setText(message2);
}
}
