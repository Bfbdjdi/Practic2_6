package com.mirea.kt.Belin_hw8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CalcActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        EditText editTextFirst = findViewById(R.id.etFirst);
        EditText editTextSecond = findViewById(R.id.etSecond);
        EditText editTextThird = findViewById(R.id.etThird);
        Button btnCalc = findViewById(R.id.btnStart);

        btnCalc.setOnClickListener(v ->
                {
                    String firstTermStr = editTextFirst.getText().toString();
                    String secondTermStr = editTextSecond.getText().toString();
                    String thirdTermStr = editTextThird.getText().toString();

                    if (!firstTermStr.isEmpty() && !secondTermStr.isEmpty() && !thirdTermStr.isEmpty())
                    {
                        float result = Float.parseFloat(firstTermStr) * Float.parseFloat(secondTermStr) * Float.parseFloat(thirdTermStr);
                        Log.d("actionCalc", "Ready to return the answer");
                        Intent intent = new Intent();
                        intent.putExtra("data", result);
                        setResult(RESULT_OK, intent);
                        Log.d("actionCalc", "Finished");
                        finish();
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "Не во все требуемые поля введены числа.", Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
}