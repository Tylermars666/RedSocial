package co.edu.uniquindio.redsocial.controller;

import co.edu.uniquindio.redsocial.model.Vendedor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

public class AdminController {

    @FXML
    private TableColumn<?, ?> colApellido;

    @FXML
    private TableColumn<?, ?> colId;

    @FXML
    private TableColumn<?, ?> colNombre;

    @FXML
    private VBox postContainer;

    @FXML
    private TableView<Vendedor> tblVendedores;

    @FXML
    private TextField txtIdVendedor;

    @FXML
    private TextField txtNombreVendedor;

    @FXML
    void eliminarVendedor(ActionEvent event) {

    }

    @FXML
    void seleccionarVendedor(MouseEvent event) {

    }

}
