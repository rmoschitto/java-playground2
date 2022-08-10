module com.galvanize.javaplayground2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.galvanize.javaplayground2 to javafx.fxml;
    exports com.galvanize.javaplayground2;
}