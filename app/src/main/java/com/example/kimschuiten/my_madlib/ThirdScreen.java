package com.example.kimschuiten.my_madlib;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class ThirdScreen extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the layout
        setContentView(R.layout.third_layout);

        // Get the intent that called for this activity to open
        Intent storyThatCalled = getIntent();

        String previousActivity1 = storyThatCalled.getExtras().getString("adverb1");
        String previousActivity2 = storyThatCalled.getExtras().getString("number1");
        String previousActivity3 = storyThatCalled.getExtras().getString("pluralNoun1");
        String previousActivity4 = storyThatCalled.getExtras().getString("verb1");
        String previousActivity5 = storyThatCalled.getExtras().getString("bodyPart1");
        String previousActivity6 = storyThatCalled.getExtras().getString("verb2");
        String previousActivity7 = storyThatCalled.getExtras().getString("adverb2");
        String previousActivity8 = storyThatCalled.getExtras().getString("pluralNoun2");
        String previousActivity9 = storyThatCalled.getExtras().getString("pluralNoun3");
        String previousActivity10 = storyThatCalled.getExtras().getString("pluralNoun4");
        String previousActivity11 = storyThatCalled.getExtras().getString("funnyNoise");
        String previousActivity12 = storyThatCalled.getExtras().getString("verb3");
        String previousActivity13 = storyThatCalled.getExtras().getString("number2");
        String previousActivity14 = storyThatCalled.getExtras().getString("verb4");


        TextView textActivityMessage = (TextView) findViewById(R.id.storyTextView);

        textActivityMessage.append("Here's how you dance the Monstrosity. Stand with your feet together Now, move your left foot "
                + previousActivity1 + " to the side. Now stamp your right foot "
                + previousActivity2 + " times and put your hands on your partner's "
                + previousActivity3 + ". Next, you both "
                + previousActivity4 + " slowly to the right and bend your "
                + previousActivity5 + " backward. For the next eight counts, both of you "
                + previousActivity6 + " "
                + previousActivity7 + " to the left. Next, you and your partner stand back to back and wiggle your "
                + previousActivity8 + " and slap your "
                + previousActivity9 + " together. Don't forget to keep stamping your right foot. Now, face your partner again, put your "
                + previousActivity10 + " together and shout, '" + previousActivity11 + "!' Now, "
                + previousActivity12 + " backward and repeat the whole thing "
                + previousActivity13 + " times. If you feel that you can't learn this dance, you can always "
                + previousActivity14 + " the next one out."


        );
    }
}
