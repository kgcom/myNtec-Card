package com.keenan.mynteccard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class EditProfileActivity extends AppCompatActivity {
Toolbar toolbar;
EditText name , position , phone,email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
        toolbar =(Toolbar)findViewById(R.id.app_bar);
        toolbar.setTitleTextColor(getResources().getColor(R.color.colorLight));
        setSupportActionBar(toolbar);
        name = (EditText)findViewById(R.id.etEditName);
        position = (EditText)findViewById(R.id.etEditPosition);
        phone = (EditText)findViewById(R.id.etEditPhone);
        email = (EditText)findViewById(R.id.etLoginEmail);

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.save, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if ( id == R.id.action_save){

            Toast.makeText(this," Profile successfully saved",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent (this,MyProfileActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

}
