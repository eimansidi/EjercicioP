module com.eiman.ejp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.eiman.ejp to javafx.fxml;
    exports com.eiman.ejp;
}