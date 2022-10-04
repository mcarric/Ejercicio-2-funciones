module com.example.javabasicejercicios {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javabasicejercicios to javafx.fxml;
    exports com.example.javabasicejercicios;
}