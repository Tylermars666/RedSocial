package co.edu.uniquindio.redsocial.controller;

import co.edu.uniquindio.redsocial.database.Database;
import co.edu.uniquindio.redsocial.factory.Creador;
import co.edu.uniquindio.redsocial.factory.Login;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class NetworkController implements Initializable {

    ObservableList<String> observableRol;

    Stage ventanaLogin;

    String rolSeleccionado;

    @FXML
    private ComboBox<String> cmbRol;

    @FXML
    private TextField txtClave;

    @FXML
    private TextField txtUsuario;

    @FXML
    void iniciarSesion(ActionEvent event) {

        String usuario = txtUsuario.getText();
        String clave = txtClave.getText();

        if(Database.getInstance().validarCredenciales(usuario,clave)){

            if(rolSeleccionado.equalsIgnoreCase("Administrador")){

                try{
                    abrirVentanaAdmin();
                }catch (Exception e){
                    e.printStackTrace();
                }

            } else if (rolSeleccionado.equalsIgnoreCase("Vendedor")){
                {
                    try{
                        abrirVentanaVendedor();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }

        }


    }

    @FXML
    void seleccionarRol(ActionEvent event) {

        rolSeleccionado = this.cmbRol.getSelectionModel().getSelectedItem();

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

    private void abrirVentanaAdmin() throws Exception{

        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/redsocial/view/admin-view.fxml"));

        Scene scene1 = new Scene(loader1.load());
        Stage stage1 = new Stage();
        stage1.setTitle("Admin");
        stage1.setScene(scene1);

        AdminController controller1 = loader1.getController();
        stage1.show();
        ventanaLogin.close();


    }

    private void abrirVentanaVendedor() throws Exception{


        FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/redsocial/view/user-view.fxml"));

        Scene scene2 = new Scene(loader2.load());
        Stage stage2 = new Stage();
        stage2.setTitle("Usuario");
        stage2.setScene(scene2);

        UserController controller2 = loader2.getController();
        stage2.show();
        ventanaLogin.close();



    }

    public void stageListener(Stage stage){

        ventanaLogin = stage;

    }
}
