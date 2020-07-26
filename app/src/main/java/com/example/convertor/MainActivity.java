package com.example.convertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void onclick(View view){

        EditText editText = (EditText)findViewById(R.id.editText);
        String dollars = editText.getText().toString();
        double amountdollars = Double.parseDouble(dollars);
        double indianamount = amountdollars * 74.80 ;
        String indianstring = String.format("%.2f" , indianamount);
        Toast.makeText(this , "$" + amountdollars + "in Rs" + indianstring , Toast.LENGTH_LONG ).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}