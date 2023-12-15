package com.example.lab3_4;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;
public class MainActivity extends AppCompatActivity {
    LinearLayout lay;
    Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lay = (LinearLayout) findViewById(R.id.baseLayout);
        bt1 = (Button) findViewById(R.id.button1);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu, menu);
        return true;
    }

    @SuppressLint("NonConstantResourceId")
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        switch (item.getItemId()) {
            case R.id.menu_red:
                lay.setBackgroundColor(Color.RED);
                return true;
            case R.id.menu_green:
                lay.setBackgroundColor(Color.GREEN);
                return true;
            case R.id.menu_blue:
                lay.setBackgroundColor(Color.BLUE);
                return true;
        }
        return false;
    }
}