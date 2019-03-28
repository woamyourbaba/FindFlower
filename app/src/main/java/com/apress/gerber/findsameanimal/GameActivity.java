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

   int count=0;
   int x=0;
   private ImageView view0;
    private ImageView view1;
    private ImageView view2;
    private ImageView view3;
    private ImageView view4;
    private ImageView view5;
    private ImageView view6;
    private ImageView view7;
    private ImageView view8;
    private ImageView view9;
    private ImageView view10;
    private ImageView view11;
    private ImageView[] v=new ImageView[12];
    private int[] ints=new int[]{
            R.drawable.bear,R.drawable.bird,R.drawable.elephant,R.drawable.cat,
            R.drawable.leo,R.drawable.tiger,
            R.drawable.bear,R.drawable.bird,R.drawable.elephant,R.drawable.cat,
            R.drawable.leo,R.drawable.tiger
    };
    private TextView textView;
    private int[] random=testRandom();
    private  ImageView[] ima=new ImageView[2];
    private int[] flag=new int[2];


   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        findview();

    }

    private void findview(){
         v[0]=(ImageView)findViewById(R.id.imageView);
         v[1]=(ImageView)findViewById(R.id.imageView2);
         v[2]=(ImageView)findViewById(R.id.imageView3);
         v[3]=(ImageView)findViewById(R.id.imageView4);
         v[4]=(ImageView)findViewById(R.id.imageView5);
         v[5]=(ImageView)findViewById(R.id.imageView6);
         v[6]=(ImageView)findViewById(R.id.imageView7);
         v[7]=(ImageView)findViewById(R.id.imageView8);
         v[8]=(ImageView)findViewById(R.id.imageView9);
         v[9]=(ImageView)findViewById(R.id.imageView10);
         v[10]=(ImageView)findViewById(R.id.imageView11);
         v[11]=(ImageView)findViewById(R.id.imageView12);
         textView=(TextView)findViewById(R.id.textView2);
    }

    private void setNum(){
         int[] random=testRandom();
         for (int i=0;i<12;i++)
             v[i].setImageResource(ints[random[i]]);
    }

    public  void onClick(View view){
       findview();
        if(view.getId()==v[0].getId()){
            v[0].setImageResource(ints[random[0]]);
            ima[count]=v[0];
            flag[count]=ints[random[0]];
            count++;
            if(count==2)
                remo(ima[0],ima[1],flag[0],flag[1]);
        }else if(view.getId()==v[1].getId()){
            v[1].setImageResource(ints[random[1]]);
            ima[count]=v[1];
            flag[count]=ints[random[1]];
            count++;
            if(count==2)
                remo(ima[0],ima[1],flag[0],flag[1]);
        }else if(view.getId()==v[2].getId()){
            v[2].setImageResource(ints[random[2]]);
            ima[count]=v[2];
            flag[count]=ints[random[2]];
            count++;
            if(count==2)
                remo(ima[0],ima[1],flag[0],flag[1]);
        }else if(view.getId()==v[3].getId()){
            v[3].setImageResource(ints[random[3]]);
            ima[count]=v[3];
            flag[count]=ints[random[3]];
            count++;
            if(count==2)
                remo(ima[0],ima[1],flag[0],flag[1]);
        }
        else if(view.getId()==v[4].getId()){
            v[4].setImageResource(ints[random[4]]);
            ima[count]=v[4];
            flag[count]=ints[random[4]];
            count++;
            if(count==2)
                remo(ima[0],ima[1],flag[0],flag[1]);
        }
        else if(view.getId()==v[5].getId()){
            v[5].setImageResource(ints[random[5]]);
            ima[count]=v[5];
            flag[count]=ints[random[5]];
            count++;
            if(count==2)
                remo(ima[0],ima[1],flag[0],flag[1]);
        }else if(view.getId()==v[6].getId()){
            v[6].setImageResource(ints[random[6]]);
            ima[count]=v[6];
            flag[count]=ints[random[6]];
            count++;
            if(count==2)
                remo(ima[0],ima[1],flag[0],flag[1]);
        }else if(view.getId()==v[7].getId()){
            v[7].setImageResource(ints[random[7]]);
            ima[count]=v[7];
            flag[count]=ints[random[7]];
            count++;
            if(count==2)
                remo(ima[0],ima[1],flag[0],flag[1]);
        }else if(view.getId()==v[8].getId()){
            v[8].setImageResource(ints[random[8]]);
            ima[count]=v[8];
            flag[count]=ints[random[8]];
            count++;
            if(count==2)
                remo(ima[0],ima[1],flag[0],flag[1]);
        }else if(view.getId()==v[9].getId()){
            v[9].setImageResource(ints[random[9]]);
            ima[count]=v[9];
            flag[count]=ints[random[9]];
            count++;
            if(count==2)
                remo(ima[0],ima[1],flag[0],flag[1]);
        }else if(view.getId()==v[10].getId()){
            v[10].setImageResource(ints[random[10]]);
            ima[count]=v[10];
            flag[count]=ints[random[10]];
            count++;
            if(count==2)
                remo(ima[0],ima[1],flag[0],flag[1]);
        }else if(view.getId()==v[11].getId()){
            v[11].setImageResource(ints[random[11]]);
            ima[count]=v[11];
            flag[count]=ints[random[11]];
            count++;
            if(count==2)
            remo(ima[0],ima[1],flag[0],flag[1]);
        }

        if(x==600){
            Intent intent=new Intent(GameActivity.this,ResultActivity.class);
            startActivity(intent);
            finish();
        }
    }

    private void remo(ImageView v1, ImageView v2,int m1,int m2){
        textView=(TextView)findViewById(R.id.textView2);

           if (v1.getId() != v2.getId()) {
               if (m1==m2) {
                   v1.setVisibility(View.GONE);
                   v2.setVisibility(View.GONE);
                   count=0;
                   x+=100;
                   String str=Integer.toString(x);
                   textView.setText(str);
               }
               else {
                   v1.setImageResource(R.drawable.house);
                   v2.setImageResource(R.drawable.house);
                   count=0;
               }
           }else
               count=1;

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
