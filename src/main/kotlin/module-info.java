module com.proj.neobytebank {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;

    requires org.kordamp.bootstrapfx.core;

    opens com.proj.neobytebank to javafx.fxml;
    exports com.proj.neobytebank;
}