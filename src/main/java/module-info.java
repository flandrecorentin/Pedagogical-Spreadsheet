module com.spreadsheet.pedagogicalspreadsheet {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.spreadsheet.pedagogicalspreadsheet to javafx.fxml;
    exports com.spreadsheet.pedagogicalspreadsheet;
}