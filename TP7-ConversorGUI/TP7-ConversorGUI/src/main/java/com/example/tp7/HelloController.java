package com.example.tp7;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private Button btnConverter;
    @FXML
    private Button btnLimpar;
    @FXML
    private Button btnSair;
    @FXML
    private TextField txtCelsius;
    @FXML
    private TextField txtFahrenheit;

    @FXML
    public void converterTemperaturaAction(ActionEvent actionEvent) {
        String valorString = txtCelsius.getText().trim();

        if (!valorString.isEmpty()) {
            try {
                float temperatura = Float.parseFloat(valorString);

                txtFahrenheit.setText(String.valueOf(temperatura * 1.8 + 32));

            } catch (NumberFormatException nfe) {
                criarAlerta().showAndWait();

            }
        } else {
            criarAlerta().showAndWait();
        }

        txtCelsius.requestFocus();
    }

    private Alert criarAlerta() {
        Alert alerta = new Alert(Alert.AlertType.ERROR);

        alerta.setTitle("Celsius");
        alerta.setHeaderText("Erro na temperatura Celsius");
        alerta.setContentText("Não foi introduzido nenhum valor numérico!");

        return alerta;
    }

    @FXML
    public void limparDadosAction(ActionEvent actionEvent) {
        txtCelsius.setText("");
        txtFahrenheit.setText("");

        txtCelsius.requestFocus();
    }

    @FXML
    public void sairAplicacaoAction(ActionEvent actionEvent) {
        Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);

        alerta.setTitle("Aplicação");
        alerta.setHeaderText("Confirmação da ação.");
        alerta.setContentText("Deseja mesmo fechar a aplicação?");

        ((Labeled) alerta.getDialogPane().lookupButton(ButtonType.OK)).setText("Yes");
        ((Labeled) alerta.getDialogPane().lookupButton(ButtonType.CANCEL)).setText("No");

        if (alerta.showAndWait().get() == ButtonType.OK) {
            ((Stage) btnSair.getScene().getWindow()).close();
        }
    }

}