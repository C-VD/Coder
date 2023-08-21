module com.example.coder {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.coder to javafx.fxml;
    exports com.example.coder;
}