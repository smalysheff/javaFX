import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.InputStream;

public class Program extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("FirstWindowApplication");
        primaryStage.setWidth(400);
        primaryStage.setHeight(300);


        InputStream iconStream = getClass().getResourceAsStream("ico.jpg");
        Image image = new Image(iconStream);
        primaryStage.getIcons().add(image);


        Pane root = new Pane();

        Button btn = new Button("Click");
        btn.setLayoutX(50);
        btn.setLayoutY(50);
        btn.setPrefSize(70, 20);

        Label label = new Label("Hello stupid");
        label.setLayoutX(150);
        label.setLayoutY(50);



        Scene scene = new Scene(root);

        primaryStage.setScene(scene);

        root.getChildren().add(btn);
        root.getChildren().add(label);
        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}