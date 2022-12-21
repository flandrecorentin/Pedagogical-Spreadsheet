package com.spreadsheet.pedagogicalspreadsheet.controller;

import com.spreadsheet.pedagogicalspreadsheet.model.objects.Spreadsheet;
import com.spreadsheet.pedagogicalspreadsheet.view.SpreadsheetView;
import com.spreadsheet.pedagogicalspreadsheet.view.Window;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FilePrincipalState implements State {
    private static final Logger logger = LoggerFactory.getLogger(FilePrincipalState.class);

    @Override
    public void displayHomeState(Controller c){
        // need to change the place of this methods
        logger.trace("start displayHomeState(Controller c)");
        logger.debug("************************ start spreadsheetView");
        Spreadsheet spreadsheet = new Spreadsheet("feuille1");
        Window.spreadsheets.add(spreadsheet);
        logger.debug("Spreadsheets of the window: "+ Window.spreadsheets.toString());
        SpreadsheetView customComponentTest = new SpreadsheetView(spreadsheet);
        c.getScrollPane().setContent(customComponentTest);
        logger.debug("************************ end spreadsheetView");
        logger.trace("end start displayHomeState(Controller c)");
    }
    @Override
    public void displayCellPrincipalState(Controller c){
        logger.trace("start displayCellPrincipalState(Controller c)");
        // Style for navbar
        c.changeActivedNavBarButton(c.getFileNavBarButton());
        c.changeActivedNavBarButton(c.getCellNavBarButton());
        // display cellNavToolsBar

        Controller.setCurrentState(c.cellPrincipalState);
        logger.trace("end start displayCellPrincipalState(Controller c)");
    }


    @Override
    public void displayDiagramPrincipalState(Controller c){
        logger.trace("start displayDiagramPrincipalState(Controller c)");
        // Style for navbar
        c.changeActivedNavBarButton(c.getFileNavBarButton());
        c.changeActivedNavBarButton(c.getDiagramNavBarButton());
        // display diagramNavToolsBar

        Controller.setCurrentState(c.diagramPrincipalState);
        logger.trace("end start displayCellPrincipalState(Controller c)");
    }

    @Override
    public void displayGamePrincipalState(Controller c){
        logger.trace("start displayGamePrincipalState(Controller c)");
        // Style for navbar
        c.changeActivedNavBarButton(c.getFileNavBarButton());
        c.changeActivedNavBarButton(c.getGameNavBarButton());
        // display gameNavToolsBar

        Controller.setCurrentState(c.gamePrincipalState);
        logger.trace("end start displayGamePrincipalState(Controller c)");
    }

    @Override
    public void displayHelpPrincipalState(Controller c){
        logger.trace("start displayHelpPrincipalState(Controller c)");
        // Style for navbar
        c.changeActivedNavBarButton(c.getFileNavBarButton());
        c.changeActivedNavBarButton(c.getHelpNavBarButton());
        // display gameNavToolsBar

        Controller.setCurrentState(c.helpPrincipalState);
        logger.trace("end start displayHelpPrincipalState(Controller c)");
    }
}
