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

    private final static int[] pictures = {R.drawable.mainpic2,
            R.drawable.barvinok,
            R.drawable.beresklet,
            R.drawable.bereza,
            R.drawable.bereza2,
            R.drawable.bereza3,
            R.drawable.boyaryshnik,
            R.drawable.brunnera,
            R.drawable.budra,
            R.drawable.buzina,
            R.drawable.buzina2,
            R.drawable.chernogolovka,
            R.drawable.chistotel,
            R.drawable.chubushnik,
            R.drawable.deren,
            R.drawable.deren2,
            R.drawable.deren3,
            R.drawable.dub,
            R.drawable.dub2,
            R.drawable.geran,
            R.drawable.geran2,
            R.drawable.goryanka,
            R.drawable.gravilat,
            R.drawable.hohlatka,
            R.drawable.hohlatka2,
            R.drawable.irga,
            R.drawable.kalina,
            R.drawable.kalina2,
            R.drawable.kalina3,
            R.drawable.klen,
            R.drawable.klen2,
            R.drawable.klen3,
            R.drawable.klen4,
            R.drawable.kolokolchik,
            R.drawable.krushina,
            R.drawable.kupena,
            R.drawable.landysh,
            R.drawable.leshina,
            R.drawable.lipa,
            R.drawable.lipa2,
            R.drawable.lutik,
            R.drawable.medunica,
            R.drawable.medunica2,
            R.drawable.osoka,
            R.drawable.osoka2,
            R.drawable.ozhika,
            R.drawable.pachysandra,
            R.drawable.paporotnik,
            R.drawable.perlovnik,
            R.drawable.perlovnik,
            R.drawable.pervocvet,
            R.drawable.pictureofme,
            R.drawable.pihta,
            R.drawable.puzyr,
            R.drawable.puzyr2,
            R.drawable.ryabina,
            R.drawable.skotnikova,
            R.drawable.snezhnoyagodnik,
            R.drawable.snytpestraya,
            R.drawable.sosna,
            R.drawable.spyreya,
            R.drawable.spyreya2,
            R.drawable.sytnykovie,
            R.drawable.vetrenica,
            R.drawable.vetrenica2,
            R.drawable.volzhankna,
            R.drawable.yasnotka,
            R.drawable.yasnotka2,
            R.drawable.zelenchuk,
            R.drawable.zemlyanika,
            R.drawable.zhimolost,
            R.drawable.zhimolost2,
            R.drawable.zhivuchka,
            R.drawable.zlaki
    };

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
        Intent info = new Intent(this, Info.class);
        startActivity(info);
    }


    public void next(View view) {
        picIndex++;
        picIndex = picIndex % (pictures.length);
        imageButton.setImageResource(pictures[picIndex]);
    }
}