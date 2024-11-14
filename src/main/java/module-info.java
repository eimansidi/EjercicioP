module com.eiman.ejp {
    requires com.eiman.ejo;
    requires javafx.controls;


    opens com.eiman.ejp to javafx.fxml;
    exports com.eiman.ejp;
}