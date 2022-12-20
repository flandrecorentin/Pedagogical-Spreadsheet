package com.spreadsheet.pedagogicalspreadsheet.model.objects;

import javafx.scene.control.SkinBase;

public class Cell  {

    /********** ATTRIBUT ************/
    private String column;
    private int row;
    private String value;
    // private Formula calculateFormula;
    // private Linkedlist<Cell> referencedCell;


    /********** Getter/Setter/Constructors/toString.... ************/
    public Cell() {
    }

    public String getColumn() {
        return column;
    }
    public int getColumnNumber(){
        if(this.column.length()==1){
            return (int) this.column.charAt(0) -64;
        }
        else{
            return ((int) this.column.charAt(0) -64)*26+(int) this.column.charAt(1) -64;
        }
    }

    public int getRow() {
        return row;
    }

    public String getValue() {
        return value;
    }






    /********** METHODS ************/
}
