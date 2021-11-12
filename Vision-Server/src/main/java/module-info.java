module com.duo.visionserver {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.duo.visionserver to javafx.fxml;
    exports com.duo.visionserver;
}