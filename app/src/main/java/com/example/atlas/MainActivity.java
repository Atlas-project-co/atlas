package com.example.atlas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private final static int[] pictures = {R.drawable.forest1, R.drawable.forest2, R.drawable.forest3};

    Button button;
    ImageButton imageButton;

    int picIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        imageButton = findViewById(R.id.imageButton);

        imageButton.setImageResource(pictures[0]);

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

    public void point(View view) {

    }

    public void next(View view) {
        picIndex++;
        picIndex = picIndex % (pictures.length);
        imageButton.setImageResource(pictures[picIndex]);
    }




}