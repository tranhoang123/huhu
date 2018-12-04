package application;
	

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage)  {
		try {
			  Parent root = FXMLLoader.load(getClass().getResource("View.fxml"));
			  primaryStage.setScene(new Scene(root));
	          primaryStage.show();        
	          primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
	        	    @Override
	        	    public void handle(WindowEvent t) {
	        	        //Platform.exit();
	        	        System.exit(0);
	        	    }
	        	});
		} catch(Exception e) {
			e.printStackTrace();
		}
		//Platform.exit();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
