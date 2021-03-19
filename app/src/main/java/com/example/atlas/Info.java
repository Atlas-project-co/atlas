package com.example.atlas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.home_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();
        if(id == R.id.home)
        {
            Intent home = new Intent(this, MainActivity.class);
            startActivity(home);
        }
        if(id == R.id.contacts)
        {
            Intent contacts = new Intent(this, Contacts.class);
            startActivity(contacts);
        }
        return super.onOptionsItemSelected(item);
    }

    public void prev(View view) {
        //TODO
        // Switch Images and text
    }

    public void next(View view) {
        //TODO
        // Switch Images and text
    }
}