package com.example.unit_convertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView mytextView2;
    TextView mytextView3;
    EditText myeditText;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mytextView2 = findViewById(R.id.textView2);
        mytextView3=findViewById(R.id.textView3);
        myeditText=findViewById(R.id.editText);
        b1=findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = myeditText.getText().toString();
                if(TextUtils.isEmpty(inputText)){
                    Toast.makeText(MainActivity.this, "Please input a value to convert ", Toast.LENGTH_SHORT).show();
                }else{
                    try {
                        double meter = Double.parseDouble(inputText);
                        double cm = conversion(meter);
                        mytextView3.setText(""+cm);
                    }catch (NumberFormatException e){
                        Toast.makeText(MainActivity.this, "Please input valid number", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });



    }
    public double conversion(double meter){
        return meter*100;
    }
}