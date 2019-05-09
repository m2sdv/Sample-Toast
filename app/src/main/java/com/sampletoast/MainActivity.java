package com.sampletoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.button)
            Sample.makeText(this, "This is Default Toast", Sample.LENGTH_LONG, Sample.DEFAULT, true).show();
        else if (v.getId() == R.id.button2)
            Sample.makeText(this, "Success Toast !", Sample.LENGTH_LONG, Sample.SUCCESS, true).show();
        else if (v.getId() == R.id.button3)
            Sample.makeText(this, "This is an Error Toast", Sample.LENGTH_LONG, Sample.ERROR, true).show();
        else if (v.getId() == R.id.button4)
            Sample.makeText(this, "Beware of dog", Sample.LENGTH_LONG, Sample.WARNING, true).show();
        else if (v.getId() == R.id.button5)
            Sample.makeText(this, "Here is some Info for you", Sample.LENGTH_LONG, Sample.INFO, true).show();
        else if (v.getId() == R.id.button6)
            Sample.makeText(this, "This is Confusing Toast", Sample.LENGTH_LONG, Sample.CONFUSING, false).show();
        else if (v.getId() == R.id.button7)
            Sample.makeText(this, "This is Custom Toast", Sample.LENGTH_LONG, Sample.CONFUSING, R.drawable.ic_android_black_24dp, true).show();
        else if (v.getId() == R.id.button8)
            Sample.makeText(this, "This is Custom Toast with no android icon", Sample.LENGTH_LONG, Sample.CONFUSING, R.drawable.ic_android_black_24dp, false).show();
        else if (v.getId() == R.id.button9)
            Sample.makeText(this, "This is a Success Toast", Sample.LENGTH_LONG, Sample.SUCCESS, false).show();

    }
}
