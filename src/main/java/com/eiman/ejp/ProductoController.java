package com.eiman.ejp;

import com.eiman.ejo.Producto; // Importar desde el JAR
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Controlador para la interfaz principal definida en producto.fxml.
 */
public class ProductoController implements Initializable {

    @FXML
    private Producto panProducto;

    @FXML
    private Producto manzanaProducto;

    @FXML
    private Producto lecheProducto;

    /**
     * Metodo que se ejecuta al iniciar la interfaz. Inicializa los productos con sus
     * valores predeterminados: nombre, stock e imagen.
     *
     * @param url La URL que identifica el recurso FXML.
     * @param resourceBundle El conjunto de recursos utilizado en el archivo FXML.
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Configurar el producto "Pan"
        panProducto.setName("Pan");
        panProducto.setStock(10);
        panProducto.setImage(new Image(getClass().getResource("/images_2/pan.png").toExternalForm()));

        // Configurar el producto "Manzana"
        manzanaProducto.setName("Manzana");
        manzanaProducto.setStock(50);
        manzanaProducto.setImage(new Image(getClass().getResource("/images_2/manzana.png").toExternalForm()));

        // Configurar el producto "Leche"
        lecheProducto.setName("Leche");
        lecheProducto.setStock(200);
        lecheProducto.setImage(new Image(getClass().getResource("/images_2/leche.png").toExternalForm()));
    }
}
