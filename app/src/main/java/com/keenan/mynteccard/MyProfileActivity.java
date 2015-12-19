package com.keenan.mynteccard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MyProfileActivity extends AppCompatActivity {
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);
        toolbar =(Toolbar)findViewById(R.id.app_bar_edit);
        toolbar.setTitleTextColor(getResources().getColor(R.color.colorLight));

        setSupportActionBar(toolbar);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.edit, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if ( id == R.id.action_edit){

            Toast.makeText(this,"Edit",Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }

}
