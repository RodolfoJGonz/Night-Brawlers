module com.project {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    
    

    opens com.project to javafx.fxml;
    exports com.project;
    requires java.sql;
    opens com.controller to javafx.fxml;
    exports com.controller;
    
    
    //opens sample;
}
