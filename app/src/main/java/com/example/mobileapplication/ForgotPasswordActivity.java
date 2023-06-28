package com.example.mobileapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class ForgotPasswordActivity extends AppCompatActivity {

    private Toolbar toolbar;

    private AppCompatButton btnCreatePassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_forgotpassword);
        initToolbar();
        findViews();
    }

    private void initToolbar(){
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setTitle("Forgot Password");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==android.R.id.home){
            finish();
        } else if (item.getItemId()==R.id.search) {
            Toast.makeText(this, "Searched button is clicked", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId()==R.id.settings) {
            Toast.makeText(this, "Settings button is clicked", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId()==R.id.location) {
            Toast.makeText(this, "Location button is clicked", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

    private void findViews(){
        btnCreatePassword=findViewById(R.id.btnCreatePassword);

        btnCreatePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ForgotPasswordActivity.this,CreatePasswordActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

}