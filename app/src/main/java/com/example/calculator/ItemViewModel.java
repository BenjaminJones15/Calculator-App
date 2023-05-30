package com.example.calculator;

import androidx.lifecycle.ViewModel;

public class ItemViewModel extends ViewModel {

    public double FirstNum = 0;     //stores first number
    public double SecondNum = 0;        //stores second number
    public boolean FirstOp = true;      //checks if this is the first operation being performed
    public boolean CheckFirstNum = true;        //checks if this is the first number being entered

    public boolean OperatorEntered = false;     //checks if the last button pressed was an operator
    public boolean FirstEntered = true;     //checks if a number has been entered
    public boolean NumEntered = true;       //checks if the last button pressed was a number
    public String Operator;             //stores the operator last pressed

    public double getFirstNum() {return FirstNum;}

    public void setFirstNum(double firstnum) {FirstNum = firstnum;}

    public double getSecondNum() {return SecondNum;}

    public void setSecondNum(double secondnum) {SecondNum = secondnum;}

    public boolean getFirstOp() {return FirstOp;}

    public void setFirstOp(boolean firstOp) {FirstOp = firstOp;}

    public boolean getCheckFirstNum() {return CheckFirstNum;}

    public void setCheckFirstNum(boolean checkfirstnum){CheckFirstNum = checkfirstnum;}

    public boolean getOperatorEntered(){return OperatorEntered;}

    public void setOperatorEntered(boolean operatorentered) {OperatorEntered = operatorentered;}

    public boolean getFirstEntered() {return FirstEntered;}

    public void setFirstEntered(boolean firstentered) {
        FirstEntered = firstentered;
    }

    public boolean getNumEntered() {
        return NumEntered;
    }

    public void setNumEntered(boolean numentered) {
        NumEntered = numentered;
    }

    public String getOperator() {return Operator;}

    public void setOperator(String operator){Operator = operator;}
}
