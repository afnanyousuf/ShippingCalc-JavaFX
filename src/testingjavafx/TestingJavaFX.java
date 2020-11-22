package testingjavafx;
import java.io.File;
import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



/**
 *
 * @author afnanwork
 */
public class TestingJavaFX extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
 
    @Override
    public void start(Stage stage) throws Exception {
        //VBox root = FXMLLoader.load(getClass().getResource("FXMLTesting.fxml"));
        
        URL url = new File("src/testingjavafx/FXMLTesting.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(url);
        stage.setTitle("Shipping Calculator");
        stage.setScene(new Scene(root));
        stage.show();
    }
    
}
