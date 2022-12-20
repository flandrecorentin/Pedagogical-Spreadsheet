package com.spreadsheet.pedagogicalspreadsheet.view;

import com.spreadsheet.pedagogicalspreadsheet.model.objects.Cell;
import javafx.scene.control.*;
import javafx.scene.text.Text;

public class CellView extends Control {
    private Text labelText;
    private Cell cell;
    public CellView(){
        labelText = new Text("");
        this.getStyleClass().setAll("test");
        this.getChildren().add(labelText);
        this.setPrefSize(80,10);
        this.getStyleClass().add("cell-view");
    }

    public CellView(String s){
        labelText = new Text(s);
        this.getStyleClass().setAll("test");
        this.getChildren().add(labelText);
        this.setPrefSize(80,10);
        this.getStyleClass().add("cell-view");
    }







    @Override
    protected Skin<?> createDefaultSkin(){
        return new MyControlSkin(this);
    }
}