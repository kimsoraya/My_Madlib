package com.example.kimschuiten.my_madlib;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

/*
    Button newButton;
*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}


       /* newButton = (Button)findViewById(R.id.firstButton);
        newButton.setOnClickListener(new View.OnClickListener(){*/
           /* @Override
            public void onClick(View v){
                // State intention to open another Activity by passing a Context and the Activity that we
                // want to open
                Intent startStoryIntent = new Intent(MainActivity.this, SecondScreen.class);

                // Ask for the Activity to start and don't expect a result to be sent back
                // startActivity(startStoryIntent);

                final int result = 1;

                startActivity(startStoryIntent);


            }
        });*/


    public void onSecondActivity(View view) {
        // State intention to open another Activity by passing a Context and the Activity that we
        // want to open
        Intent startStoryIntent = new Intent(this, SecondScreen.class);

        // Ask for the Activity to start and don't expect a result to be sent back
        // startActivity(startStoryIntent);
        // Use startActivityForResult when we expect a result to be sent back

        final int result = 1;

        // To send data use putExtra with a String name followed by its value
        startActivity(startStoryIntent);
    }
}


