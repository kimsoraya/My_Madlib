package com.example.kimschuiten.my_madlib;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondScreen extends Activity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the layout
        setContentView(R.layout.second_layout);

        // Get the intent that called for this activity to open
        Intent activityThatCalled = getIntent();

        /*// Get the data that was sent
        String previousActivity = activityThatCalled.getExtras().getString("secondActivity");
*/

    }

    public void onSendWords(View view) {
        // get the words that were filled in
        EditText textFirstAdverb = (EditText) findViewById(R.id.firstAdverb);
        EditText textFirstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText textFirstPluralNoun = (EditText) findViewById(R.id.firstPluralNoun);
        EditText textFirstVerb = (EditText) findViewById(R.id.firstVerb);
        EditText textBodyPart = (EditText) findViewById(R.id.bodyPart);
        EditText textSecondVerb = (EditText) findViewById(R.id.secondVerb);
        EditText textSecondAdverb = (EditText) findViewById(R.id.secondAdverb);
        EditText textSecondPluralNoun = (EditText) findViewById(R.id.secondPluralNoun);
        EditText textThirdPluralNoun = (EditText) findViewById(R.id.thirdPluralNoun);
        EditText textFourthPluralNoun = (EditText) findViewById(R.id.fourthPluralNoun);
        EditText textFunnyNoise = (EditText) findViewById(R.id.funnyNoise);
        EditText textThirdVerb = (EditText) findViewById(R.id.thirdVerb);
        EditText textSecondNumber = (EditText) findViewById(R.id.secondNumber);
        EditText textFourthVerb = (EditText) findViewById(R.id.fourthVerb);

        // get the word typed into the EditText
        String adverb1 = String.valueOf(textFirstAdverb.getText());
        String number1 = String.valueOf(textFirstNumber.getText());
        String pluralNoun1 = String.valueOf(textFirstPluralNoun.getText());
        String verb1 = String.valueOf(textFirstVerb.getText());
        String bodyPart1 = String.valueOf(textBodyPart.getText());
        String verb2 = String.valueOf(textSecondVerb.getText());
        String adverb2 = String.valueOf(textSecondAdverb.getText());
        String pluralNoun2 = String.valueOf(textSecondPluralNoun.getText());
        String pluralNoun3 = String.valueOf(textThirdPluralNoun.getText());
        String pluralNoun4 = String.valueOf(textFourthPluralNoun.getText());
        String funnyNoise = String.valueOf(textFunnyNoise.getText());
        String verb3 = String.valueOf(textThirdVerb.getText());
        String number2 = String.valueOf(textSecondNumber.getText());
        String verb4 = String.valueOf(textFourthVerb.getText());

        // define our intention to go to the story screen
        Intent finishStoryIntent = new Intent(this, ThirdScreen.class);

        // Define the string name and the value to assign to it
        // To send data use putExtra with a String name followed by its value
        finishStoryIntent.putExtra("adverb1", adverb1);
        finishStoryIntent.putExtra("number1", number1);
        finishStoryIntent.putExtra("pluralNoun1", pluralNoun1);
        finishStoryIntent.putExtra("verb1", verb1);
        finishStoryIntent.putExtra("bodyPart1", bodyPart1);
        finishStoryIntent.putExtra("verb2", verb2);
        finishStoryIntent.putExtra("adverb2", adverb2);
        finishStoryIntent.putExtra("pluralNoun2", pluralNoun2);
        finishStoryIntent.putExtra("pluralNoun3", pluralNoun3);
        finishStoryIntent.putExtra("pluralNoun4", pluralNoun4);
        finishStoryIntent.putExtra("funnyNoise", funnyNoise);
        finishStoryIntent.putExtra("verb3", verb3);
        finishStoryIntent.putExtra("number2", number2);
        finishStoryIntent.putExtra("verb4", verb4);

        final int result = 1;

        startActivityForResult(finishStoryIntent, result);


    }

}
