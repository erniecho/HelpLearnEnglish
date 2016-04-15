package com.ernshu.android.helplearnenglish;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.util.Log;

public class helplearneng extends AppCompatActivity {

    private Button mPlayWord;
    private Button mRecWord;
    private Button mNext;
    private static final String TAG = "ButtonEventTest";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helplearneng);
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

        //Buttons events.
        mPlayWord = (Button) findViewById(R.id.btn_play_word);
        mPlayWord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.d(TAG, "button play word was pressed");
            }
        });
        
    mRecWord = (Button) findViewById(R.id.btn_rec_word);
    mRecWord.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v)
        {

            Log.d(TAG, "button record word was pressed.");
        }
    });

    mNext = (Button) findViewById(R.id.btn_next);
    mNext.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v)
        {
            Log.d(TAG, "button next word was pressed");
        }
    });
        //button events end.
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_helplearneng, menu);
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
