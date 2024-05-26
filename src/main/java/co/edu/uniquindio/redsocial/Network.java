package co.edu.uniquindio.redsocial;

import co.edu.uniquindio.redsocial.controller.NetworkController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Network extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Network.class.getResource("view/network-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
        NetworkController controller = fxmlLoader.getController();
        controller.stageListener(stage);
    }

    public static void main(String[] args) {
        launch();
    }
}