package com.keenan.mynteccard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
EditText email , password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email=(EditText)findViewById(R.id.etLoginEmail);
        password=(EditText)findViewById(R.id.etRegisterPassword);
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
