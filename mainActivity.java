package com.example.calculatortutorial;

import androidx.appcompat.app.AppCompatActivity;
import org.mariuszgromada.math.mxparser.*;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class mainActivity extends AppCompatActivity {

    private EditText usersInputBox;
    private ImageButton backspaceBTN;

    private Button clearBTN;
    private Button btnPar;
    private Button exponentBTN;
    private Button divideBTN;
    private Button sevenBTN;
    private Button eightBTN;
    private Button nineBTN;
    private Button multiplyBTN;
    private Button fourBTN;
    private Button fiveBTN;
    private Button sixBTN;
    private Button subtractBTN;
    private Button oneBTN;
    private Button twoBTN;
    private Button threeBTN;
    private Button addBTN;
    private Button plusMinusBTN;
    private Button zeroBTN;
    private Button pointBTN;
    private Button equalsBTN;

    float x1, x2, y1, y2;
    public boolean onTouchEvent(MotionEvent touchEvent){
        switch(touchEvent.getAction()){
            case MotionEvent.ACTION_DOWN:
                x1 = touchEvent.getX();
                y1 = touchEvent.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2 = touchEvent.getX();
                y2 = touchEvent.getY();
                if(x1 < x2){
                Intent i = new Intent(mainActivity.this, MainActivity3.class);
                startActivity(i);
            }else if(x1 > x2){
                Intent i = new Intent(mainActivity.this, MapsActivity.class);
                startActivity(i);
            }
            break;
        }
        return false;
    }

    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //sets up the user interface views
        setupUI();
        //clear all text in users input
        usersInputBox.setText("");

        backspaceBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //gets the cursors position
                int cursorPosEnd = usersInputBox.getSelectionEnd();
                int textLength = usersInputBox.getText().length();

                if (cursorPosEnd != 0 && textLength != 0){
                    SpannableStringBuilder selection = (SpannableStringBuilder) usersInputBox.getText();
                    selection.replace(cursorPosEnd - 1, cursorPosEnd, "");
                    //updates the text
                    usersInputBox.setText(selection);
                    //puts the cursor back in the correct spot
                    usersInputBox.setSelection(cursorPosEnd - 1);
                }
            }
        });

        zeroBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = usersInputBox.getSelectionStart();
                usersInputBox.setText(updateText("0", usersInputBox.getText().toString(), pos));
                usersInputBox.setSelection(pos + 1);
            }
        });

        oneBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = usersInputBox.getSelectionStart();
                usersInputBox.setText(updateText("1", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
                usersInputBox.setSelection(pos + 1);
            }
        });

        twoBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = usersInputBox.getSelectionStart();
                usersInputBox.setText(updateText("2", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
                usersInputBox.setSelection(pos + 1);
            }
        });

        threeBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = usersInputBox.getSelectionStart();
                usersInputBox.setText(updateText("3", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
                usersInputBox.setSelection(pos + 1);
            }
        });

        fourBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = usersInputBox.getSelectionStart();
                usersInputBox.setText(updateText("4", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
                usersInputBox.setSelection(pos + 1);
            }
        });

        fiveBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = usersInputBox.getSelectionStart();
                usersInputBox.setText(updateText("5", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
                usersInputBox.setSelection(pos + 1);
            }
        });

        sixBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = usersInputBox.getSelectionStart();
                usersInputBox.setText(updateText("6", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
                usersInputBox.setSelection(pos + 1);
            }
        });

        sevenBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = usersInputBox.getSelectionStart();
                usersInputBox.setText(updateText("7", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
                usersInputBox.setSelection(pos + 1);
            }
        });

        eightBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = usersInputBox.getSelectionStart();
                usersInputBox.setText(updateText("8", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
                usersInputBox.setSelection(pos + 1);
            }
        });

        nineBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = usersInputBox.getSelectionStart();
                usersInputBox.setText(updateText("9", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
                usersInputBox.setSelection(pos + 1);
            }
        });

        clearBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                usersInputBox.setText("");
            }
        });

        exponentBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = usersInputBox.getSelectionStart();
                usersInputBox.setText(updateText("^", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
                usersInputBox.setSelection(pos + 1);
            }
        });

        plusMinusBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = usersInputBox.getSelectionStart();
                usersInputBox.setText(updateText("-", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
                usersInputBox.setSelection(pos + 1);
            }
        });

        pointBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = usersInputBox.getSelectionStart();
                usersInputBox.setText(updateText(".", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
                usersInputBox.setSelection(pos + 1);
            }
        });

        equalsBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String expression = usersInputBox.getText().toString();

                expression = expression.replaceAll("÷", "/");
                expression = expression.replaceAll("×", "*");

                Expression exp = new Expression(expression);

                String result = String.valueOf(exp.calculate());

                usersInputBox.setText(result);
                usersInputBox.setSelection(result.length());

            }
        });

        divideBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = usersInputBox.getSelectionStart();
                usersInputBox.setText(updateText("÷", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
                usersInputBox.setSelection(pos + 1);
            }
        });

        multiplyBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = usersInputBox.getSelectionStart();
                usersInputBox.setText(updateText("×", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
                usersInputBox.setSelection(pos + 1);
            }
        });

        subtractBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = usersInputBox.getSelectionStart();
                usersInputBox.setText(updateText("-", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
                usersInputBox.setSelection(pos + 1);
            }
        });

        addBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = usersInputBox.getSelectionStart();
                usersInputBox.setText(updateText("+", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
                usersInputBox.setSelection(pos + 1);
            }
        });

        btnPar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = usersInputBox.getSelectionStart();
                int openPar = 0;
                int closedPar = 0;
                int inboxLength = usersInputBox.getText().toString().length();

                for (int i = 0; i < usersInputBox.getSelectionStart(); i++){
                    if (usersInputBox.getText().toString().substring(i, i+1).equals("(")){
                        openPar += 1;
                    }
                    else if (usersInputBox.getText().toString().substring(i, i+1).equals(")")){
                        closedPar += 1;
                    }
                }

                if (openPar == closedPar || usersInputBox.getText().toString().substring(
                        inboxLength - 1, inboxLength).equals("(")){
                    //usersInputBox.setText(String.format("%s%s", usersInputBox.getText().toString(), "("));
                    usersInputBox.setText(updateText("(", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
                }
                else if (closedPar < openPar && !usersInputBox.getText().toString().substring(
                        inboxLength - 1, inboxLength).equals("(")){
                    //usersInputBox.setText(String.format("%s%s", usersInputBox.getText().toString(), ")"));
                    usersInputBox.setText(updateText(")", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
                }
                usersInputBox.setSelection(pos + 1);
            }
        });

    }

    private void setupUI(){
        usersInputBox = findViewById(R.id.textView);
        usersInputBox.setShowSoftInputOnFocus(false);   //used to prevent the users keyboard from popping up but keeps the carrot

        backspaceBTN = findViewById(R.id.button21);

        clearBTN = findViewById(R.id.clearBTN);
        btnPar = findViewById(R.id.parenthesisBTN);
        exponentBTN = findViewById(R.id.exponentBTN);
        divideBTN = findViewById(R.id.divideBTN);
        sevenBTN = findViewById(R.id.sevenBTN);
        eightBTN = findViewById(R.id.eightBTN);
        nineBTN = findViewById(R.id.nineBTN);
        multiplyBTN = findViewById(R.id.multiplyBTN);
        fourBTN = findViewById(R.id.fourBTN);
        fiveBTN = findViewById(R.id.fiveBTN);
        sixBTN = findViewById(R.id.sixBTN);
        subtractBTN = findViewById(R.id.subtractBTN);
        oneBTN = findViewById(R.id.oneBTN);
        twoBTN = findViewById(R.id.twoBTN);
        threeBTN = findViewById(R.id.threeBTN);
        addBTN = findViewById(R.id.addBTN);
        plusMinusBTN = findViewById(R.id.plusMinusBTN);
        zeroBTN = findViewById(R.id.zeroBTN);
        pointBTN = findViewById(R.id.pointBTN);
        equalsBTN = findViewById(R.id.equalsBTN);
    }

    private String updateText(String stringToAdd, String oldString, int cursorPos){
        String leftOfCursor = oldString.substring(0, cursorPos);
        String rightOfCursor = oldString.substring(cursorPos);

        return leftOfCursor + stringToAdd + rightOfCursor;

    }
}