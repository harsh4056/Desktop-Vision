module com.duo.vision {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.duo.vision to javafx.fxml;
    exports com.duo.vision;
}