package com.apsara.taskmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
    private EditText etFN,etLN,etUsername,etPass,etCP;
    private Button btnSign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        etFN=findViewById(R.id.etFN);
        etLN=findViewById(R.id.etLN);
        etUsername=findViewById(R.id.etUsername);
        etPass=findViewById(R.id.etPass);
        etCP=findViewById(R.id.etCP);
        btnSign=findViewById(R.id.btnSign);

        btnSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
