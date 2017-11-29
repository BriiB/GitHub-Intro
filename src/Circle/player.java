package Circle;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class player extends Circle{
	
	public player(double radius){
		
		this.setRadius(radius);
		
		this.setFill(Color.rgb((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
		
	}
}