module com.r4ppz {
    requires javafx.fxml;
    requires transitive javafx.graphics;
    requires transitive javafx.controls;

    opens com.r4ppz to javafx.fxml;

    exports com.r4ppz;
}