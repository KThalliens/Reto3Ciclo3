

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class reto3 extends Application {
    @Override
    //Esta estructura siempre es la misma; lo unico que se cambia es el nombre del archivo FXML.
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader =new FXMLLoader(getClass().getResource("reto3.fxml"));//instanciando
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);

        primaryStage.setTitle("reto3"); //EDITABLE!!! este el nombre del fxm
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
