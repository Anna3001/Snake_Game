package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        VBox root = new VBox(10);
        Scene scene = new Scene(root);
        root.setPrefSize(1000,700);
        root.setStyle("-fx-background-color: lightgrey;");

        stage.setResizable(false);
        stage.setScene(scene);
        stage.setTitle("Snake Game");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
