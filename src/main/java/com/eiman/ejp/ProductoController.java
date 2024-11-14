package com.eiman.ejp;

import com.eiman.ejo.ProductoApplication; // Importar desde el JAR
import javafx.fxml.FXML;
import javafx.scene.image.Image;

/**
 * Controlador para la interfaz principal definida en producto.fxml.
 */
public class ProductoController {

    @FXML
    private ProductoApplication panProducto;

    @FXML
    private ProductoApplication manzanaProducto;

    @FXML
    private ProductoApplication lecheProducto;

    @FXML
    public void initialize() {
        // Configurar el producto "Pan"
        panProducto.setName("Pan");
        panProducto.setStock(10);
        panProducto.setImage(new Image(getClass().getResource("/images/pan.png").toExternalForm()));

        // Configurar el producto "Manzana"
        manzanaProducto.setName("Manzana");
        manzanaProducto.setStock(50);
        manzanaProducto.setImage(new Image(getClass().getResource("/images/manzana.png").toExternalForm()));

        // Configurar el producto "Leche"
        lecheProducto.setName("Leche");
        lecheProducto.setStock(200);
        lecheProducto.setImage(new Image(getClass().getResource("/images/leche.png").toExternalForm()));
    }
}
