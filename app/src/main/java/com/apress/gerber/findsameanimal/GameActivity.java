package com.apress.gerber.findsameanimal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashSet;
import java.util.Random;

public class GameActivity extends AppCompatActivity {


   int x=1000;
   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        final  ImageView view1=(ImageView)findViewById(R.id.imageView);
        final ImageView view2=(ImageView)findViewById(R.id.imageView2);
        final ImageView view3=(ImageView)findViewById(R.id.imageView3);
        final ImageView view4=(ImageView)findViewById(R.id.imageView4);
        final ImageView view5=(ImageView)findViewById(R.id.imageView5);
        final ImageView view6=(ImageView)findViewById(R.id.imageView6);
        final ImageView view7=(ImageView)findViewById(R.id.imageView7);
        final ImageView view8=(ImageView)findViewById(R.id.imageView8);
        final ImageView view9=(ImageView)findViewById(R.id.imageView9);
        final ImageView view10=(ImageView)findViewById(R.id.imageView10);
        final ImageView view11=(ImageView)findViewById(R.id.imageView11);
        final ImageView view12=(ImageView)findViewById(R.id.imageView12);
        final TextView textView=(TextView)findViewById(R.id.textView2);


        final int[] random=testRandom();
        final int[] image=new int[]{
                R.drawable.bear,R.drawable.bird,R.drawable.elephant,R.drawable.cat,
                R.drawable.leo,R.drawable.tiger,
                R.drawable.bear,R.drawable.flower,R.drawable.elephant,R.drawable.cat,
                R.drawable.leo,R.drawable.tiger
        };

        view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view1.setImageResource(image[random[0]]);
                if(image[random[0]]!=R.drawable.flower){
                    x=x-100;
                    String str=Integer.toString(x);
                   textView.setText(str);
                    if(x==0){
                        Intent intent=new Intent(GameActivity.this,FailActivity.class);
                        startActivity(intent);
                        finish();
                    }

                }
                else{
                    Intent intent=new Intent(GameActivity.this,ResultActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

        view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view2.setImageResource(image[random[1]]);
                if(image[random[1]]!=R.drawable.flower){
                    x=x-100;
                    String str=Integer.toString(x);
                    textView.setText(str);
                    if(x==0){
                        Intent intent=new Intent(GameActivity.this,FailActivity.class);
                        startActivity(intent);
                        finish();
                    }

                }
                else{
                    Intent intent=new Intent(GameActivity.this,ResultActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

        view3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view3.setImageResource(image[random[2]]);
                if(image[random[2]]!=R.drawable.flower){
                    x=x-100;
                    String str=Integer.toString(x);
                    textView.setText(str);
                    if(x==0){
                        Intent intent=new Intent(GameActivity.this,FailActivity.class);
                        startActivity(intent);
                        finish();
                    }

                }
                else{
                    Intent intent=new Intent(GameActivity.this,ResultActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

        view4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view4.setImageResource(image[random[3]]);
                if(image[random[3]]!=R.drawable.flower){
                    x=x-100;
                    String str=Integer.toString(x);
                    textView.setText(str);
                    if(x==0){
                        Intent intent=new Intent(GameActivity.this,FailActivity.class);
                        startActivity(intent);
                        finish();
                    }

                }
                else{
                    Intent intent=new Intent(GameActivity.this,ResultActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

        view5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view5.setImageResource(image[random[4]]);
                if(image[random[4]]!=R.drawable.flower){
                    x=x-100;
                    String str=Integer.toString(x);
                    textView.setText(str);
                    if(x==0){
                        Intent intent=new Intent(GameActivity.this,FailActivity.class);
                        startActivity(intent);
                        finish();
                    }

                }
                else{
                    Intent intent=new Intent(GameActivity.this,ResultActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

        view6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view6.setImageResource(image[random[5]]);
                if(image[random[5]]!=R.drawable.flower){
                    x=x-100;
                    String str=Integer.toString(x);
                    textView.setText(str);
                    if(x==0){
                        Intent intent=new Intent(GameActivity.this,FailActivity.class);
                        startActivity(intent);
                        finish();
                    }

                }
                else{
                    Intent intent=new Intent(GameActivity.this,ResultActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

      view7.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              view7.setImageResource(image[random[6]]);
              if(image[random[6]]!=R.drawable.flower){
                  x=x-100;
                  String str=Integer.toString(x);
                  textView.setText(str);
                  if(x==0){
                      Intent intent=new Intent(GameActivity.this,FailActivity.class);
                      startActivity(intent);
                      finish();
                  }

              }
              else{
                  Intent intent=new Intent(GameActivity.this,ResultActivity.class);
                  startActivity(intent);
                  finish();
              }
          }
      });

      view8.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              view8.setImageResource(image[random[7]]);
              if(image[random[7]]!=R.drawable.flower){
                  x=x-100;
                  String str=Integer.toString(x);
                  textView.setText(str);
                  if(x==0){
                      Intent intent=new Intent(GameActivity.this,FailActivity.class);
                      startActivity(intent);
                      finish();
                  }

              }
              else{
                  Intent intent=new Intent(GameActivity.this,ResultActivity.class);
                  startActivity(intent);
                  finish();
              }
          }
      });

      view9.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              view9.setImageResource(image[random[8]]);
              if(image[random[8]]!=R.drawable.flower){
                  x=x-100;
                  String str=Integer.toString(x);
                  textView.setText(str);
                  if(x==0){
                      Intent intent=new Intent(GameActivity.this,FailActivity.class);
                      startActivity(intent);
                      finish();
                  }

              }
              else{
                  Intent intent=new Intent(GameActivity.this,ResultActivity.class);
                  startActivity(intent);
                  finish();
              }
          }
      });

      view10.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              view10.setImageResource(image[random[9]]);
              if(image[random[9]]!=R.drawable.flower){
                  x=x-100;
                  String str=Integer.toString(x);
                  textView.setText(str);
                  if(x==0){
                      Intent intent=new Intent(GameActivity.this,FailActivity.class);
                      startActivity(intent);
                      finish();
                  }

              }
              else{
                  Intent intent=new Intent(GameActivity.this,ResultActivity.class);
                  startActivity(intent);
                  finish();
              }
          }
      });

      view11.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              view11.setImageResource(image[random[10]]);
              if(image[random[10]]!=R.drawable.flower){
                  x=x-100;
                  String str=Integer.toString(x);
                  textView.setText(str);
                  if(x==0){
                      Intent intent=new Intent(GameActivity.this,FailActivity.class);
                      startActivity(intent);
                      finish();
                  }

              }
              else{
                  Intent intent=new Intent(GameActivity.this,ResultActivity.class);
                  startActivity(intent);
                  finish();
              }
          }
      });

      view12.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              view12.setImageResource(image[random[11]]);
              if(image[random[11]]!=R.drawable.flower){
                  x=x-100;
                  String str=Integer.toString(x);
                  textView.setText(str);
                  if(x==0){
                      Intent intent=new Intent(GameActivity.this,FailActivity.class);
                      startActivity(intent);
                      finish();
                  }

              }
              else{
                  Intent intent=new Intent(GameActivity.this,ResultActivity.class);
                  startActivity(intent);
                  finish();
              }
          }
      });
    }

    private int[] testRandom() {
        Random rand = new Random();
        boolean[] bool = new boolean[12];
        int randInt = 0;
        int[] num = new int[12];
        for (int i = 0; i < 12; i++) {
            do {
                randInt = (int) (Math.random() * 12);
                num[i] = randInt;
            } while (bool[randInt]);
            bool[randInt] = true;

        }
        return num;
    }
}
