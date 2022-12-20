package com.spreadsheet.pedagogicalspreadsheet.view;

import com.spreadsheet.pedagogicalspreadsheet.controller.FilePrincipalState;
import com.spreadsheet.pedagogicalspreadsheet.model.objects.Cell;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CellView extends Control {
    private static final Logger logger = LoggerFactory.getLogger(CellView.class);
    @FXML
    private Text labelText;
    private int column;
    private int row;
    private int height = 80;
    private int width = 10;
    private Cell cell;
    public CellView(){
        labelText = new Text("");
        this.getStyleClass().setAll("test");
        this.getChildren().add(labelText);
        this.setPrefSize(height,width);
        this.getStyleClass().add("cell-view");
//        this.test();
    }

    public CellView(String s){
        labelText = new Text(s);
        this.getStyleClass().setAll("test");
        this.getChildren().add(labelText);
        this.setPrefSize(80,10);
        this.getStyleClass().add("cell-view");
//        this.test();
    }


    public CellView(String s, int height, int width){
        labelText = new Text(s);
        this.height = height;
        this.width = width;
        this.getStyleClass().setAll("test");
        this.getChildren().add(labelText);
        this.setPrefSize(this.height,this.width);
        this.getStyleClass().add("cell-view");
//        this.test();
    }


    public CellView(Cell c) {
        this.cell = c;
        labelText = new Text(c.getValue());
        this.getStyleClass().setAll("test");
        this.getChildren().add(labelText);
        this.setPrefSize(80,10);
        this.getStyleClass().add("cell-view");
    }









//    public void test(){
//        this.setOnMouseClicked(e -> {
//            logger.debug(this.labelText.getText());
//        });
//    }




    @Override
    protected Skin<?> createDefaultSkin(){
        return new MyControlSkin(this);
    }
}