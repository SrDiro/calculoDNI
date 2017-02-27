/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebass;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Rasul
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button calcularLetra;
    @FXML
    private TextField intDNI;
    @FXML
    private TextField letraDNI;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        int dni, resto;
        String letra = "shit", dniString;
        dniString = this.intDNI.getText();

        try {

            if (dniString.length() == 8) {
                dni = Integer.parseInt(dniString);
                resto = dni % 23;

                for (int i = 0; i < letras.length; i++) {
                    letra = String.valueOf(letras[resto]);
                }

                this.letraDNI.setText(letra);

            }else{
                throw new ErrorDNI(dniString);
            }
        } catch (ErrorDNI e) {
            this.letraDNI.setText(e.getMessage());
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
