package com.spreadsheet.pedagogicalspreadsheet.model.objects;

import java.util.LinkedList;

public class Spreadsheet implements SpreadsheetInterface{

    /********************** ATTRIBUTES **************************/

    private String name;
    private int nbColumns = 28;
    private int nbRows = 50;
    private LinkedList<Cell> modifiedCell;
    // private LinkedList<Diagram> createdDiagram









    /********************** CONSTRUCTOR **************************/

    public Spreadsheet() {
        modifiedCell = new LinkedList<Cell>();
    }
    public Spreadsheet(String name) {
        this.name = name;
        this.modifiedCell = new LinkedList<Cell>();
    }













    /********************** Getter/Setter, toString etc. **************************/
    @Override
    public String toString() {
        return "Spreadsheet{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getNbColumns() {
        return nbColumns;
    }

    public int getNbRows() {
        return nbRows;
    }

    public LinkedList<Cell> getModifiedCell() {
        return modifiedCell;
    }





/********************** METHODS **************************/








}
