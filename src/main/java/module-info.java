module co.edu.uniquindio.redsocial {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens co.edu.uniquindio.redsocial to javafx.fxml;
    exports co.edu.uniquindio.redsocial;
    exports co.edu.uniquindio.redsocial.controller;
    opens co.edu.uniquindio.redsocial.controller to javafx.fxml;
}