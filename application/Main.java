package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import java.io.IOException;


public class Main extends Application {
    private Stage primaryStage;
    private Pane rootLayout;
    
	@Override
	public void start(Stage primaryStage) {
		try {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Pathfinder Character Sheet");
		
		initSheetDisplay();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void initSheetDisplay()
	{
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("PathfinderCharSheet_Layout.fxml"));
            rootLayout = (Pane) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	public static void main(String[] args) {
		launch(args);
	}
}
