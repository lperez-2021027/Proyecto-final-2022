
package org.in5bm.luisperez.controllers;

/**
 *
 * @author Luis Carlos Pérez
 * @date 26/09/2022
 * @time 11:42:28
 * 
 *Código técnico: IN5BM
 *
 */

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Label;



public class MateriaController implements Initializable{
    
    @FXML
    private Label lbl01;
    
    @Override
    public void initialize(URL url, ResourceBundle rs) {
        lbl01.setText("hola");
    }
    
}
