package com.example.matts.lab1b;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    private List<String> plotFragments = new ArrayList<String>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        plotFragments.add("you get knocked out"); plotFragments.add("you go somewhere else"); plotFragments.add("you find a dead man"); plotFragments.add("you find a dead woman"); plotFragments.add("you meet a buxom blonde"); plotFragments.add("someone has searched the place"); plotFragments.add("a crooked cop warns you");
        plotFragments.add("you are arrested"); plotFragments.add("you find a gun"); plotFragments.add("you find a knife"); plotFragments.add("you find a frayed rope"); plotFragments.add("a bullet whizzes past your ear"); plotFragments.add("you are almost run over"); plotFragments.add("you are being followed"); plotFragments.add("you smell familiar perfume"); plotFragments.add("the telephone rings"); plotFragments.add("there is a knock at the door"); plotFragments.add("you hear footsteps behind you"); plotFragments.add("you hear a gunshot!"); plotFragments.add("you hear a scream!"); plotFragments.add("you are not alone"); plotFragments.add("... forget it this story stinks");

    }

    public void bthHelpClicked(View v){
        Random r = new Random();
        int size = plotFragments.size();
        int rnum = r.nextInt(size-1)+1;

        TextView t = (TextView) findViewById(R.id.outputLabel);
        t.setText(plotFragments.get(rnum));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
