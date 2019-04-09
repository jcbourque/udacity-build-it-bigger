package com.example.android.comedyclub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class StageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage);

        Intent intent = getIntent();

        if (intent == null || !intent.hasExtra(ComedyClubIntent.JOKE)) {
            setResult(RESULT_CANCELED);
            finish();
            return;
        }

        TextView jokeText = findViewById(R.id.joke_text_view);
        jokeText.setText(intent.getStringExtra(ComedyClubIntent.JOKE));
    }
}
