package com.example.calculator;

import androidx.annotation.RequiresPermission;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ItemViewModel viewModel;
    double ReadDisplay;
    double Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ItemViewModel viewModel = new ViewModelProvider(this).get(ItemViewModel.class);
        ReadDisplay = 0;
        Result = 0;

        EditText Display = findViewById(R.id.Display);
        Button Add = findViewById(R.id.Add);
        Button Subtract = findViewById(R.id.Subtract);
        Button Multiply = findViewById(R.id.Multiply);
        Button Divide = findViewById(R.id.Divide);
        Button Smiley = findViewById(R.id.Smiley);
        Button PowerOf = findViewById(R.id.PowerOf);
        Button Negate = findViewById(R.id.Negate);
        Button Clear = findViewById(R.id.Clear);
        Button Equals = findViewById(R.id.Equals);

        Button DecimalPoint = findViewById(R.id.DecimalPoint);
        Button Zero = findViewById(R.id.Zero);
        Button One = findViewById(R.id.One);
        Button Two = findViewById(R.id.Two);
        Button Three = findViewById(R.id.Three);
        Button Four = findViewById(R.id.Four);
        Button Five = findViewById(R.id.Five);
        Button Six = findViewById(R.id.Six);
        Button Seven = findViewById(R.id.Seven);
        Button Eight = findViewById(R.id.Eight);
        Button Nine = findViewById(R.id.Nine);

        Add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ReadDisplay = Double.parseDouble(Display.getText().toString());     //gets display input
                boolean skip = false;       //used to check whether this is the second operator entered

                if (viewModel.getCheckFirstNum() ==  true){     //first number has been entered and operator is pressed
                    viewModel.setFirstNum(ReadDisplay);
                    viewModel.setCheckFirstNum(false);
                    viewModel.setOperatorEntered(true);
                    skip = true;
                    viewModel.setFirstOp(false);
                } else if (viewModel.getFirstOp() == true || viewModel.getOperatorEntered() == false){      //first number, operator has been pressed, second num entered and operator pressed again.
                    viewModel.setSecondNum(ReadDisplay);
                    viewModel.setFirstOp(false);
                    viewModel.setOperatorEntered(false);
                }

                if (viewModel.getFirstOp() == false && skip == false){      //second time operator is pressed, calculates first two numbers with appropriate operator and displays on screen.
                    viewModel.setSecondNum(ReadDisplay);
                    double sum = GetSum(viewModel);
                    viewModel.setFirstNum(sum);
                    viewModel.setOperatorEntered(false);
                    String text = Double.toString(sum);
                    Display.setText(text);
                }

                viewModel.setNumEntered(false);
                viewModel.setOperator("+");
            }
        });

        Subtract.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ReadDisplay = Double.parseDouble(Display.getText().toString());
                boolean skip = false;

                if (viewModel.getCheckFirstNum() ==  true){     //first number has been entered and operator is pressed
                    viewModel.setFirstNum(ReadDisplay);
                    viewModel.setCheckFirstNum(false);
                    viewModel.setOperatorEntered(true);
                    skip = true;
                    viewModel.setFirstOp(false);
                } else if (viewModel.getFirstOp() == true || viewModel.getOperatorEntered() == false){      //first number, operator has been pressed, second num entered and operator pressed again.
                    viewModel.setSecondNum(ReadDisplay);
                    viewModel.setFirstOp(false);
                    viewModel.setOperatorEntered(false);
                }

                if (viewModel.getFirstOp() == false && skip == false){      //second time operator is pressed, calculates first two numbers with appropriate operator and displays on screen.
                    viewModel.setSecondNum(ReadDisplay);
                    double sum = GetSum(viewModel);
                    viewModel.setFirstNum(sum);
                    viewModel.setOperatorEntered(false);
                    String text = Double.toString(sum);
                    Display.setText(text);
                }

                viewModel.setNumEntered(false);
                viewModel.setOperator("-");
            }
        });

        Multiply.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ReadDisplay = Double.parseDouble(Display.getText().toString());
                boolean skip = false;

                if (viewModel.getCheckFirstNum() ==  true){     //first number has been entered and operator is pressed
                    viewModel.setFirstNum(ReadDisplay);
                    viewModel.setCheckFirstNum(false);
                    viewModel.setOperatorEntered(true);
                    skip = true;
                    viewModel.setFirstOp(false);
                } else if (viewModel.getFirstOp() == true || viewModel.getOperatorEntered() == false){      //first number, operator has been pressed, second num entered and operator pressed again.
                    viewModel.setSecondNum(ReadDisplay);
                    viewModel.setFirstOp(false);
                    viewModel.setOperatorEntered(false);
                }

                if (viewModel.getFirstOp() == false && skip == false){      //second time operator is pressed, calculates first two numbers with appropriate operator and displays on screen.
                    viewModel.setSecondNum(ReadDisplay);
                    double sum = GetSum(viewModel);
                    viewModel.setFirstNum(sum);
                    viewModel.setOperatorEntered(false);
                    String text = Double.toString(sum);
                    Display.setText(text);
                }

                viewModel.setNumEntered(false);
                viewModel.setOperator("*");
            }
        });

        Divide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ReadDisplay = Double.parseDouble(Display.getText().toString());
                boolean skip = false;

                if (viewModel.getCheckFirstNum() ==  true){     //first number has been entered and operator is pressed
                    viewModel.setFirstNum(ReadDisplay);
                    viewModel.setCheckFirstNum(false);
                    viewModel.setOperatorEntered(true);
                    skip = true;
                    viewModel.setFirstOp(false);
                } else if (viewModel.getFirstOp() == true || viewModel.getOperatorEntered() == false){      //first number, operator has been pressed, second num entered and operator pressed again.
                    viewModel.setSecondNum(ReadDisplay);
                    viewModel.setFirstOp(false);
                    viewModel.setOperatorEntered(false);
                }

                if (viewModel.getFirstOp() == false && skip == false){      //second time operator is pressed, calculates first two numbers with appropriate operator and displays on screen.
                    viewModel.setSecondNum(ReadDisplay);
                    double sum = GetSum(viewModel);
                    viewModel.setFirstNum(sum);
                    viewModel.setOperatorEntered(false);
                    String text = Double.toString(sum);
                    Display.setText(text);
                }

                viewModel.setNumEntered(false);
                viewModel.setOperator("/");
            }
        });

        PowerOf.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ReadDisplay = Double.parseDouble(Display.getText().toString());
                boolean skip = false;

                if (viewModel.getCheckFirstNum() ==  true){     //first number has been entered and operator is pressed
                    viewModel.setFirstNum(ReadDisplay);
                    viewModel.setCheckFirstNum(false);
                    viewModel.setOperatorEntered(true);
                    skip = true;
                    viewModel.setFirstOp(false);
                } else if (viewModel.getFirstOp() == true || viewModel.getOperatorEntered() == false){      //first number, operator has been pressed, second num entered and operator pressed again.
                    viewModel.setSecondNum(ReadDisplay);
                    viewModel.setFirstOp(false);
                    viewModel.setOperatorEntered(false);
                }

                if (viewModel.getFirstOp() == false && skip == false){      //second time operator is pressed, calculates first two numbers with appropriate operator and displays on screen.
                    viewModel.setSecondNum(ReadDisplay);
                    double sum = GetSum(viewModel);
                    viewModel.setFirstNum(sum);
                    viewModel.setOperatorEntered(false);
                    String text = Double.toString(sum);
                    Display.setText(text);
                }

                viewModel.setNumEntered(false);
                viewModel.setOperator("^");
            }
        });

        Negate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ReadDisplay = Double.parseDouble(Display.getText().toString());
                viewModel.setOperator("N");

                if (viewModel.getCheckFirstNum() ==  true){     //first number has been entered and operator is pressed
                    viewModel.setFirstNum(ReadDisplay * -1);
                    String text = Double.toString(viewModel.getFirstNum());
                    Display.setText(text);
                    viewModel.setCheckFirstNum(false);
                    viewModel.setOperatorEntered(false);
                } else if (viewModel.getFirstOp() == true){     //first number and operator already pressed, and second number entered and negate pressed
                    viewModel.setSecondNum(ReadDisplay * -1);
                    String text = Double.toString(viewModel.getSecondNum());
                    Display.setText(text);
                    viewModel.setFirstOp(false);
                    viewModel.setOperatorEntered(false);
                }

                viewModel.setNumEntered(true);
            }
        });

        Smiley.setOnClickListener(new View.OnClickListener(){       //enjoy :)
            public void onClick(View v){
                Toast.makeText(getApplicationContext(),"Be happy! : )",Toast.LENGTH_LONG).show();
            }
        });

        Clear.setOnClickListener(new View.OnClickListener() {          //clears all variables and display
            public void onClick(View v) {
                viewModel.setFirstNum(0);
                viewModel.setSecondNum(0);
                viewModel.setFirstOp(true);
                viewModel.setCheckFirstNum(true);
                viewModel.setOperatorEntered(false);
                viewModel.setFirstEntered(true);
                viewModel.setNumEntered(true);
                viewModel.setOperator(" ");
                String text = "";
                Display.setText(text);
            }
        });

        Equals.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ReadDisplay = Double.parseDouble(Display.getText().toString());
                double sum = 0;
                if (viewModel.getOperatorEntered() ==  false){          //produces appropriate calculation depending on operator entered
                    viewModel.setSecondNum(ReadDisplay);
                    if(viewModel.getOperator().equals("+")){
                        sum = viewModel.getFirstNum() + viewModel.getSecondNum();
                    } else if(viewModel.getOperator().equals("-")){
                        sum = viewModel.getFirstNum() - viewModel.getSecondNum();
                    } else if(viewModel.getOperator().equals("*")){
                        sum = viewModel.getFirstNum() * viewModel.getSecondNum();
                    } else if(viewModel.getOperator().equals("/")){
                        sum = viewModel.getFirstNum() / viewModel.getSecondNum();
                    } else if(viewModel.getOperator().equals("^")){
                        sum = Math.pow(viewModel.getFirstNum(), viewModel.getSecondNum());
                    } else if(viewModel.getOperator().equals("N")){
                        sum = viewModel.getFirstNum() - viewModel.getSecondNum();
                    }

                    viewModel.setFirstNum(sum);
                    String text = Double.toString(sum);
                    Display.setText(text);
                    viewModel.setOperatorEntered(false);
                } else{
                    viewModel.setOperatorEntered(false);
                }
                viewModel.setFirstOp(true);
                viewModel.setCheckFirstNum(true);
                viewModel.setNumEntered(true);
            }
        });

        DecimalPoint.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(viewModel.getFirstEntered() == true){
                    Display.getText().clear();
                    String text = "0.";
                    Display.setText(text);
                    viewModel.setFirstEntered(false);
                }
                else if (viewModel.getNumEntered() ==  true){
                    String text = Display.getText().toString();
                    text = text + ".";
                    Display.setText(text);
                } else{
                    Display.getText().clear();
                    String text = "0.";
                    Display.setText(text);
                }
                viewModel.setOperatorEntered(false);
            }
        });

        Zero.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(viewModel.getFirstEntered() == true){
                    Display.getText().clear();
                    String text = "0";
                    Display.setText(text);
                    viewModel.setFirstEntered(false);
                }
                else if (viewModel.getNumEntered() ==  true){
                    String text = Display.getText().toString();
                    text = text + "0";
                    Display.setText(text);
                } else{
                    Display.getText().clear();
                    String text = "0";
                    Display.setText(text);
                }
                viewModel.setOperatorEntered(false);
            }
        });

        One.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(viewModel.getFirstEntered() == true){
                    Display.getText().clear();
                    String text = "1";
                    Display.setText(text);
                    viewModel.setFirstEntered(false);
                }
                else if (viewModel.getNumEntered() ==  true){
                    String text = Display.getText().toString();
                    text = text + "1";
                    Display.setText(text);
                } else{
                    Display.getText().clear();
                    String text = "1";
                    Display.setText(text);
                }
                viewModel.setOperatorEntered(false);
            }
        });

        Two.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(viewModel.getFirstEntered() == true){
                    Display.getText().clear();
                    String text = "2";
                    Display.setText(text);
                    viewModel.setFirstEntered(false);
                }
                else if (viewModel.getNumEntered() ==  true){
                    String text = Display.getText().toString();
                    text = text + "2";
                    Display.setText(text);
                } else{
                    Display.getText().clear();
                    String text = "2";
                    Display.setText(text);
                }
                viewModel.setOperatorEntered(false);
            }
        });

        Three.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(viewModel.getFirstEntered() == true){
                    Display.getText().clear();
                    String text = "3";
                    Display.setText(text);
                    viewModel.setFirstEntered(false);
                }
                else if (viewModel.getNumEntered() ==  true){
                    String text = Display.getText().toString();
                    text = text + "3";
                    Display.setText(text);
                } else{
                    Display.getText().clear();
                    String text = "3";
                    Display.setText(text);
                }
                viewModel.setOperatorEntered(false);
            }
        });

        Four.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(viewModel.getFirstEntered() == true){
                    Display.getText().clear();
                    String text = "4";
                    Display.setText(text);
                    viewModel.setFirstEntered(false);
                }
                else if (viewModel.getNumEntered() ==  true){
                    String text = Display.getText().toString();
                    text = text + "4";
                    Display.setText(text);
                } else{
                    Display.getText().clear();
                    String text = "4";
                    Display.setText(text);
                }
                viewModel.setOperatorEntered(false);
            }
        });

        Five.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(viewModel.getFirstEntered() == true){
                    Display.getText().clear();
                    String text = "5";
                    Display.setText(text);
                    viewModel.setFirstEntered(false);
                }
                else if (viewModel.getNumEntered() ==  true){
                    String text = Display.getText().toString();
                    text = text + "5";
                    Display.setText(text);
                } else{
                    Display.getText().clear();
                    String text = "5";
                    Display.setText(text);
                }
                viewModel.setOperatorEntered(false);
            }
        });

        Six.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(viewModel.getFirstEntered() == true){
                    Display.getText().clear();
                    String text = "6";
                    Display.setText(text);
                    viewModel.setFirstEntered(false);
                }
                else if (viewModel.getNumEntered() ==  true){
                    String text = Display.getText().toString();
                    text = text + "6";
                    Display.setText(text);
                } else{
                    Display.getText().clear();
                    String text = "6";
                    Display.setText(text);
                }
                viewModel.setOperatorEntered(false);
            }
        });

        Seven.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(viewModel.getFirstEntered() == true){
                    Display.getText().clear();
                    String text = "7";
                    Display.setText(text);
                    viewModel.setFirstEntered(false);
                }
                else if (viewModel.getNumEntered() ==  true){
                    String text = Display.getText().toString();
                    text = text + "7";
                    Display.setText(text);
                } else{
                    Display.getText().clear();
                    String text = "7";
                    Display.setText(text);
                }
                viewModel.setOperatorEntered(false);
            }
        });

        Eight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(viewModel.getFirstEntered() == true){
                    Display.getText().clear();
                    String text = "8";
                    Display.setText(text);
                    viewModel.setFirstEntered(false);
                }
                else if (viewModel.getNumEntered() ==  true){
                    String text = Display.getText().toString();
                    text = text + "8";
                    Display.setText(text);
                } else{
                    Display.getText().clear();
                    String text = "8";
                    Display.setText(text);
                }
                viewModel.setOperatorEntered(false);
            }
        });

        Nine.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(viewModel.getFirstEntered() == true){
                    Display.getText().clear();
                    String text = "9";
                    Display.setText(text);
                    viewModel.setFirstEntered(false);
                }
                else if (viewModel.getNumEntered() ==  true){
                    String text = Display.getText().toString();
                    text = text + "9";
                    Display.setText(text);
                } else{
                    Display.getText().clear();
                    String text = "9";
                    Display.setText(text);
                }
                viewModel.setOperatorEntered(false);
            }
        });

    }

    private double GetSum(ItemViewModel viewModel) {        //calculates appropriate sum given the operator
        double sum = 0;
        if(viewModel.getOperator().equals("+")){
            sum = viewModel.getFirstNum() + viewModel.getSecondNum();
        } else if(viewModel.getOperator().equals("-")){
            sum = viewModel.getFirstNum() - viewModel.getSecondNum();
        } else if(viewModel.getOperator().equals("*")){
            sum = viewModel.getFirstNum() * viewModel.getSecondNum();
        } else if(viewModel.getOperator().equals("/")){
            sum = viewModel.getFirstNum() / viewModel.getSecondNum();
        } else if(viewModel.getOperator().equals("^")){
            sum = Math.pow(viewModel.getFirstNum(), viewModel.getSecondNum());
        } else if(viewModel.getOperator().equals("N")){
            sum = viewModel.getFirstNum() - viewModel.getSecondNum();
        }
        return sum;
    }

}