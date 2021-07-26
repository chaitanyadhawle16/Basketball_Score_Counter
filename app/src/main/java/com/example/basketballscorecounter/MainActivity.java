package com.example.basketballscorecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int a_score = 0;
    int b_score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayA(int score){
        TextView scoreView = (TextView) findViewById(R.id.a_txt);
        scoreView.setText(String.valueOf(score));
    }

    public void displayB(int score){
        TextView scoreView = (TextView) findViewById(R.id.b_txt);
        scoreView.setText(String.valueOf(score));
    }

    public void a_3points(View view){
        a_score = a_score + 3;
        displayA(a_score);
    }
    public void a_2points(View view){
        a_score = a_score + 2;
        displayA(a_score);
    }
    public void a_free(View view){
        a_score = a_score + 1;
        displayA(a_score);
    }

    public void b_3points(View view){
        b_score = b_score + 3;
        displayB(b_score);
    }
    public void b_2points(View view){
        b_score = b_score + 2;
        displayB(b_score);
    }
    public void b_free(View view){
        b_score = b_score + 1;
        displayB(b_score);
    }

    public void reset(View view){
        a_score = 0;
        b_score = 0;
        displayA(a_score);
        displayB(b_score);
    }
}