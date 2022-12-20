package com.spreadsheet.pedagogicalspreadsheet.view;

import com.spreadsheet.pedagogicalspreadsheet.controller.FilePrincipalState;
import com.spreadsheet.pedagogicalspreadsheet.model.objects.Spreadsheet;
import javafx.css.CssMetaData;
import javafx.css.Styleable;
import javafx.scene.control.Button;
import javafx.scene.control.Cell;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;

public class SpreadsheetView extends Region {

    private static final Logger logger = LoggerFactory.getLogger(FilePrincipalState.class);
    private LinkedList<CellView> cellsColumns;
    private LinkedList<CellView> cellsRows;
    private Spreadsheet spreadsheet;
    public SpreadsheetView() {
        // Initialize the component's layout and style
        this.spreadsheet = new Spreadsheet();
        this.init(this.spreadsheet);
    }


    public SpreadsheetView(Spreadsheet spreadsheet) {
        // Initialize the
        this.spreadsheet = spreadsheet;
        this.init(this.spreadsheet);
    }



    private void init(Spreadsheet spreadsheet) {
        // CSS red border to delete in the future
        String css = Window.windowStage.getScene().getRoot().getStylesheets().get(0);
        getStylesheets().add(css);
        getStyleClass().add("border-test");

        // initialisation value
        this.cellsColumns = new LinkedList<>();
        this.cellsRows = new LinkedList<>();


        VBox vbox = new VBox();
        logger.debug(vbox.toString());
        HBox[] hboxes = new HBox[spreadsheet.getNbRows()];
        hboxes[0] = new HBox();
        logger.debug(hboxes.toString());
        hboxes[0].getChildren().add(new CellView());
        for(int i = 1; i<spreadsheet.getNbColumns()+1 ; i++){
            CellView c;
            if(i<26){
                logger.debug(String.valueOf((char)(i+64)));
                c = new CellView(String.valueOf((char)(i+64)));
            }
            else if(26<=i && i<52){
                c = new CellView("A"+String.valueOf(+(char)i+64-26));
            }
            else{
                c = new CellView();
            }
            cellsColumns.add(c);
            hboxes[0].getChildren().add(c);
        }

        logger.debug("first hboxes finish");
        for(int i=1; i<spreadsheet.getNbRows() ; i++){
            hboxes[i] = new HBox();
            hboxes[i].getChildren().add(new CellView(String.valueOf(i)));
            for(int j=1; j<spreadsheet.getNbColumns() ; j++){

            }
        }
        logger.debug("others hboxes finish");



        // add each hboxes to the vbox
        for(int i =0; i<spreadsheet.getNbColumns(); i++){
            vbox.getChildren().add(hboxes[i]);
        }
        vbox.setPrefSize(USE_COMPUTED_SIZE,30);
//        vbox.getStyleClass().add("firstLine");
        this.getChildren().add(vbox);
    }
}
