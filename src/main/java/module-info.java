module co.edu.uniquindio.redsocial {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens co.edu.uniquindio.redsocial to javafx.fxml;
    exports co.edu.uniquindio.redsocial;
}