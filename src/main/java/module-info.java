module com.example.shopper {
    requires javafx.controls;
    requires javafx.fxml;
    requires spring.boot.autoconfigure;
    requires org.slf4j;
    requires spring.web;
    requires spring.boot;
    requires spring.context;


    opens shopperApplication to javafx.fxml;
    exports shopperApplication;
}