package com.eiman.ejp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Clase principal para iniciar la aplicacion.
 */
public class ProductoApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Cargar el archivo FXML principal
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/producto.fxml"));

            // Crear la escena y configurarla
            Scene scene = new Scene(loader.load());

            // Configurar y mostrar la ventana principal
            primaryStage.setTitle("Lista de Productos");
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error al cargar producto.fxml", e);
        }
    }

    /**
     * Metodo principal para lanzar la aplicacion.
     *
     * @param args Argumentos de linea de comandos.
     */
    public static void main(String[] args) {
        launch(args);
    }
}
