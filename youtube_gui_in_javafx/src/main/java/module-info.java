module com.github.bladomo3306 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.github.bladomo3306 to javafx.fxml;
    exports com.github.bladomo3306;
}
