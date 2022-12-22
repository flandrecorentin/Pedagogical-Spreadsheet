package com.spreadsheet.pedagogicalspreadsheet.view;

import com.spreadsheet.pedagogicalspreadsheet.controller.FilePrincipalState;
import com.spreadsheet.pedagogicalspreadsheet.model.objects.Cell;
import com.spreadsheet.pedagogicalspreadsheet.model.objects.Spreadsheet;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;

public class SpreadsheetView extends Region {

    private static final Logger logger = LoggerFactory.getLogger(FilePrincipalState.class);
    private LinkedList<CellView> allCellsView;
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

        // initialisation value
        this.allCellsView = new LinkedList<>();

        VBox vbox = new VBox();
        logger.debug(vbox.toString());
        HBox[] hboxes = new HBox[spreadsheet.getNbRows()+1];
        hboxes[0] = new HBox();
        logger.debug(hboxes.toString());
        CellView firstCell = new CellView("", 30, 10);
        hboxes[0].getChildren().add(0, firstCell);
        this.allCellsView.add(firstCell);

        for(int i = 1; i<spreadsheet.getNbColumns()+1 ; i++){
            CellView c;
            if(i<=26){
                c = new CellView(String.valueOf((char)(i+64)));
//                logger.debug(String.valueOf((char)(i+64)));
            }
            //  /adjust to avoid all elements
            else if(i>26 && i<676){
                int quotient = i/26;
                int remainder = i%26;
                char firstChar = (char)(quotient+64);
                char secondChar = (char) (remainder+64);
                c = new CellView(Character.toString(firstChar)+Character.toString(secondChar));
//                logger.debug(Character.toString(firstChar)+Character.toString(secondChar));
            }
            else{
                c = new CellView();
            }
            this.allCellsView.add(c);
            hboxes[0].getChildren().add(i, c);
        }
        logger.debug("first hboxes finish");



        for(int i=1; i<spreadsheet.getNbRows()+1; i++){
            hboxes[i] = new HBox();
            CellView c = new CellView(String.valueOf(i), 30, 10);
            hboxes[i].getChildren().add(0,c);
            this.allCellsView.add(c);
        }
        logger.debug("each first CellView of hboxes finish");




        for(int i=1; i< spreadsheet.getNbRows()+1; i++){
            for(int j=1; j< spreadsheet.getNbColumns()+1; j++){

                hboxes[i].getChildren().add(j, new CellView());
            }
            // Modify the size of all CellView of the row and the column respective !

        }
        logger.debug("all others CellView blank finished");




        for (Cell cell: spreadsheet.getModifiedCell()) {
            logger.debug("One modified Cell taken into consideration");
            hboxes[cell.getRow()].getChildren().add(cell.getColumnNumber(), new CellView(cell));
        }
        logger.debug("each modified CellView finish");











        // add each hboxes to the vbox
        for(int i =0; i<spreadsheet.getNbRows()+1; i++){
            vbox.getChildren().add(hboxes[i]);
        }
        vbox.setPrefSize(USE_COMPUTED_SIZE,30);
//        vbox.getStyleClass().add("firstLine");
        this.getChildren().add(vbox);
    }
}
