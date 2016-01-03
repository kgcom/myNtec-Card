package com.keenan.mynteccard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void signIn(View v){
        Intent intent = new Intent (this,MainActivity.class);
        startActivity(intent);
    }

   public void registerUser(View v) {
        Intent intent = new Intent(this,RegisterActivity.class);
        startActivity(intent);

    }


}
