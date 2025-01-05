/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package radianpro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author hasun
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private ImageView myImageView;

    public void exit() {
        System.exit(0);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
