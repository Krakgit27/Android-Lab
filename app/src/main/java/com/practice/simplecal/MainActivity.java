package com.practice.simplecal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt_result = findViewById(R.id.id1);
        EditText etxt_num1 = findViewById(R.id.id2);
        EditText etxt_num2 = findViewById(R.id.id3);
        Button btn_sum = findViewById(R.id.button15);
        Button btn_clear = findViewById(R.id.button22);

        btn_sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(etxt_num1.getText().toString());
                double num2 = Double.parseDouble(etxt_num2.getText().toString());
                double sum = num1 + num2;
                txt_result.setText(Double.toString(sum));
            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etxt_num1.setText("");
                etxt_num2.setText("");
                txt_result.setText("");
            }
        });
    }
}
