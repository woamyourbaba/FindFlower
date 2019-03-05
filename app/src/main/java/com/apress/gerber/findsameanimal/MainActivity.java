package com.apress.gerber.findsameanimal;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface fontFace = Typeface.createFromAsset(getAssets(),
                "Fonts/ARBERKLEY.ttf");
        TextView text = (TextView) findViewById(R.id.tv_gamename);
        text.setTypeface(fontFace);

        Typeface fontStart = Typeface.createFromAsset(getAssets(),
                "Fonts/font_one.TTF");
        TextView textStart = (TextView) findViewById(R.id.btn_start);
        textStart.setTypeface(fontFace);

        Typeface fontExit = Typeface.createFromAsset(getAssets(),
                "Fonts/font_one.TTF");
        TextView textExit = (TextView) findViewById(R.id.btn_exit);
        textExit.setTypeface(fontFace);

        Button start=(Button) findViewById(R.id.btn_start);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,GameActivity.class);
                startActivity(intent);
                finish();
            }
        });

        Button exit=(Button) findViewById(R.id.btn_exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
