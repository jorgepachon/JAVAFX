package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Inicio extends Application {
	private AnchorPane rootLayout;
	private Stage primaryStage;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("Calculadora");
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Inicio.class.getResource("UICalculadora.fxml"));
			rootLayout = (AnchorPane) loader.load();
			Scene scene= new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
