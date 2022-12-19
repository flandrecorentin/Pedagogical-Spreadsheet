module com.spreadsheet.pedagogicalspreadsheet {
    requires javafx.controls;
    requires javafx.fxml;
    requires slf4j.api;
    requires fontawesomefx;


    opens com.spreadsheet.pedagogicalspreadsheet.controller to javafx.fxml;
    exports com.spreadsheet.pedagogicalspreadsheet;
    exports com.spreadsheet.pedagogicalspreadsheet.view;

}