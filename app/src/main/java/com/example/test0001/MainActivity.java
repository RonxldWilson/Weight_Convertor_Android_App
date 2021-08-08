package com.example.test0001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textview;
    private EditText editTextTextPersonName3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        textview =  findViewById(R.id.textView4);
        editTextTextPersonName3 = findViewById(R.id.editTextTextPersonName3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            //    Toast.makeText(android.content.Context,text: "", Toast.LENGTH_SHORT).show();
            String s = editTextTextPersonName3.getText().toString();
            int kg = Integer.parseInt(s);
            double pound = 2.205 * kg;
            textview.setText("The Weight in Pound is " + pound);
                Toast.makeText(getApplicationContext(),"Thanks for Downloading the App", Toast.LENGTH_SHORT).show();
            }
        });

    }
}