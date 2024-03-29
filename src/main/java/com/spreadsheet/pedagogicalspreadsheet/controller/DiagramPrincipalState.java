package com.spreadsheet.pedagogicalspreadsheet.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DiagramPrincipalState implements State{

    private static final Logger logger = LoggerFactory.getLogger(DiagramPrincipalState.class);

    @Override
    public void displayFilePrincipalState(Controller c){
        logger.trace("start displayFilePrincipalState(Controller c)");
        // Style for navbar
        c.changeActivedNavBarButton(c.getDiagramNavBarButton());
        c.changeActivedNavBarButton(c.getFileNavBarButton());
        // display diagramNavToolsBar

        Controller.setCurrentState(c.filePrincipalState);
        logger.trace("end start displayFilePrincipalState(Controller c)");
    }

    @Override
    public void displayCellPrincipalState(Controller c){
        logger.trace("start displayCellPrincipalState(Controller c)");
        // Style for navbar
        c.changeActivedNavBarButton(c.getDiagramNavBarButton());
        c.changeActivedNavBarButton(c.getCellNavBarButton());
        // display cellNavToolsBar

        Controller.setCurrentState(c.cellPrincipalState);
        logger.trace("end start displayCellPrincipalState(Controller c)");
    }

    @Override
    public void displayGamePrincipalState(Controller c){
        logger.trace("start displayGamePrincipalState(Controller c)");
        // Style for navbar
        c.changeActivedNavBarButton(c.getDiagramNavBarButton());
        c.changeActivedNavBarButton(c.getGameNavBarButton());
        // display gameNavToolsBar

        Controller.setCurrentState(c.gamePrincipalState);
        logger.trace("end start displayGamePrincipalState(Controller c)");
    }

    @Override
    public void displayHelpPrincipalState(Controller c){
        logger.trace("start displayHelpPrincipalState(Controller c)");
        // Style for navbar
        c.changeActivedNavBarButton(c.getDiagramNavBarButton());
        c.changeActivedNavBarButton(c.getHelpNavBarButton());
        // display gameNavToolsBar

        Controller.setCurrentState(c.helpPrincipalState);
        logger.trace("end start displayHelpPrincipalState(Controller c)");
    }

}
