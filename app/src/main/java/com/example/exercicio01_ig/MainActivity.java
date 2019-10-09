package com.example.exercicio01_ig;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alterarTexto(View view){
        Button button1 = findViewById(R.id.button1);
        EditText txt1 = findViewById(R.id.editText1);
        button1.setText(txt1.getText());

        Button button2 = findViewById(R.id.button2);
        EditText txt2 = findViewById(R.id.editText2);
        button2.setText(txt2.getText());

        Button button3 = findViewById(R.id.button3);
        EditText txt3 = findViewById(R.id.editText3);
        button3.setText(txt3.getText());

        Button button4 = findViewById(R.id.button4);
        EditText txt4 = findViewById(R.id.editText4);
        button4.setText(txt4.getText());
    }
}
