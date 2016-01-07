package com.keenan.mynteccard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class BusinessCardActivity extends AppCompatActivity {
TextView name , position , phone , email;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_card);
        name = (TextView)findViewById(R.id.tv_tutorName);
        position = (TextView)findViewById(R.id.tv_position);
        phone = (TextView)findViewById(R.id.etEditPhone);
        email = (TextView)findViewById(R.id.tv_email);

    }
}
