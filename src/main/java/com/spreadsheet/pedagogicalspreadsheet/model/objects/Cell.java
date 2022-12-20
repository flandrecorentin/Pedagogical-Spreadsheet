package com.spreadsheet.pedagogicalspreadsheet.model.objects;

import javafx.scene.control.SkinBase;

public class Cell extends SkinBase<javafx.scene.control.Cell> {

    /********** ATTRIBUT ************/
    private String column;
    private int row;
    private String value;
    // private Formula calculateFormula;
    // private Linkedlist<Cell> referencedCell;


    /********** Getter/Setter/Constructors/toString.... ************/
    public Cell(javafx.scene.control.Cell control) {
        super(control);
    }




    /********** METHODS ************/
}
