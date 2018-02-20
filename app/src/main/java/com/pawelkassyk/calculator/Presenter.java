package com.pawelkassyk.calculator;


public class Presenter {

    public String getScreenToDisplay(String clicked, String currentDisplay) {
        String result = currentDisplay + clicked;
        if (clicked.equals("=")) {
            return CalculationEngine.calculate(currentDisplay);
        }
        if (currentDisplay.equals("0")) {
            return clicked;
        }
        return result;
    }

//    private void updateScreenBy(String clicked) {
//        String newValue = clicked;
//        if (screenIsNotZero()) {
//            newValue = currentDisplay() + clickedValue;
//        }
//        screen.setText(newValue);
//    }
//
//    private boolean screenIsNotZero() {
//        return !currentDisplay().equals("0");
//    }

}
