package Circle;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class main extends Application{
	
	public static final double WORLD_WIDTH = 500;
	public static final double WORLD_HEIGHT = 500;
	
	Group root = new Group();
	Scene scene = new Scene(root, WORLD_WIDTH, WORLD_HEIGHT);
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		createCircle();
		
		primaryStage.setTitle("Circle");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
	
	private void createCircle(){
		Circle cir = new Circle(WORLD_WIDTH/50);
		cir.setFill(Color.rgb(0, 255, 255));
		cir.setTranslateX(WORLD_WIDTH/2);
		cir.setTranslateY(WORLD_WIDTH/2);
		
		root.getChildren().addAll(cir);
		
	}
	
}