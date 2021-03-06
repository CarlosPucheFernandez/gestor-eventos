/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gestoreventos2;

import controladores.AdminEvento;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.sql.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;

import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author carlo
 */
public class CrearEventoController implements Initializable {

    @FXML
    private VBox ContenedorMenu;
    @FXML
    private Button btnMenu;
    @FXML
    private Button btnReservas;
    @FXML
    private Button btnCrearEvento;
    @FXML
    private Button btnListaEventos;
    @FXML
    private Button btnAcercaDe;
    @FXML
    private TextField tfNombre;
    @FXML
    private TextField tfAforo;
    @FXML
    private DatePicker DtFecha;
    @FXML
    private Label lblError;
    @FXML
    private Button btnGuardar;

    AdminEvento ae = new AdminEvento();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void AbrirInicio(ActionEvent event) throws IOException {
        App.setRoot("menu");
    }

    @FXML
    private void AbrirReservar(ActionEvent event) throws IOException {
        App.setRoot("registrarse");
    }

    @FXML
    private void AbrirCrearEvento(ActionEvent event) throws IOException {
        App.setRoot("crearEvento");
    }

    @FXML
    private void AbrirListaEventos(ActionEvent event) throws IOException {
        App.setRoot("listaEventos");
    }

    @FXML
    private void AbrirAcercaDe(ActionEvent event) throws IOException {
        App.setRoot("acercaDe");
    }

    @FXML
    private void guardar(ActionEvent event) throws IOException {
        Date date = Date.valueOf(DtFecha.getValue());
        ae.nuevoEvento(tfNombre.getText(), date, parseInt(tfAforo.getText()));
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Guardar");
        alert.setHeaderText("");
        alert.setContentText("reserva eliminada correctamente");
        alert.showAndWait();
        AbrirCrearEvento(event);
    }

}
