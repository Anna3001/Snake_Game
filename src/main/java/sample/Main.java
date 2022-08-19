package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    static int block_size = 10;
    int width = 100;
    int height = 70;

    @Override
    public void start(Stage stage) {
        VBox root = new VBox(10);
        root.setPadding(new Insets(8));

        Field field = new Field(width, height);
        root.getChildren().add(field);

        Scene scene = new Scene(root);

        stage.setResizable(false);
        stage.setScene(scene);
        stage.setTitle("Snake Game");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
