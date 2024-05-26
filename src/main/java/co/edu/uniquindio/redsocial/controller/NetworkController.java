package co.edu.uniquindio.redsocial.controller;

import co.edu.uniquindio.redsocial.factory.Creador;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class NetworkController implements Initializable {

    ObservableList<String> observableRol;

    @FXML
    private ComboBox<String> cmbRol;

    @FXML
    private TextField txtClave;

    @FXML
    private TextField txtUsuario;

    @FXML
    void iniciarSesion(ActionEvent event) {

    }

    @FXML
    void seleccionarRol(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        try {
            Creador.getInstance().crearBase();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        observableRol = FXCollections.observableArrayList("Administrador","Vendedor");
        this.cmbRol.setItems(observableRol);



    }
}
