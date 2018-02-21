package com.pawelkassyk.calculator;


public class Presenter {

    public String getScreenToDisplay(String clicked, String currentDisplay) {
        String result = currentDisplay + clicked;
        if (clicked.equals("=")) {
            if (!lastCharacterIsOperation(currentDisplay)) {
                return CalculationEngine.calculate(currentDisplay);
            }
            return currentDisplay;
        }
        if (currentDisplay.equals("0")) {
            if (isOperation(clicked)) {
                return "0" + clicked;
            }
            return clicked;
        }
        if (lastCharacterIsOperation(currentDisplay) && isOperation(clicked)) {
            return replaceLastCharacterWithClicked(currentDisplay, clicked);
        }
        return result;
    }

    private boolean lastCharacterIsOperation(String given) {
        int lastCharIndex = given.length() - 1;
        char lastCharacter = given.charAt(lastCharIndex);
        return lastCharacter == '*' || lastCharacter == '-' || lastCharacter == '+' || lastCharacter == '/';
    }

    private boolean isOperation(String clicked) {
        return clicked.equals("*") || clicked.equals("-") || clicked.equals("+") || clicked.equals("/");
    }

    private String replaceLastCharacterWithClicked(String currentDisplay, String clicked) {
        int lastCharIndex = currentDisplay.length() - 1;
        currentDisplay = currentDisplay.substring(0, lastCharIndex);
        return currentDisplay + clicked;
    }

}
