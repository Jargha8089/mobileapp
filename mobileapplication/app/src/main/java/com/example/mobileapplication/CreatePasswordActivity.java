package com.example.mobileapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class CreatePasswordActivity extends AppCompatActivity {

    private Toolbar toolbar;

    private AppCompatButton btnSavePassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_createpassword);
        initToolbar();
        findViews();
    }

    private void initToolbar(){
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setTitle("Create Password Page");
    }

    private void findViews(){
        btnSavePassword=findViewById(R.id.btnSavePassword);

        btnSavePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CreatePasswordActivity.this, "New Password is Saved", Toast.LENGTH_SHORT).show();
            }
        });
    }

}