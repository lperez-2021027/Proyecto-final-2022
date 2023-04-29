
package org.in5bm.luisperez.system;

import java.util.List;
import org.in5bm.luisperez.models.dao.MateriasDaoImpl;
import org.in5bm.luisperez.models.domain.Materia;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Luis Carlos Pérez
 * @date 26/09/2022
 * @time 11:40:51
 *
 */
public class Principal extends Application{

    public static void main(String[] args) {
        launch(args);
        List<Materia> listaMaterias = new MateriasDaoImpl().getAll();
        System.out.println(listaMaterias);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../views/MateriaView01.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
