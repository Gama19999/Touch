module com.serial30.toque {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.serial30.toque to javafx.fxml;
    exports com.serial30.toque;
}
