package com.example.randomquotegenerator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView txtQuote, txtAuthor;
    Button btnNewQuote;
    Random random;

    // Quotes with Authors (10)
    String[][] quotes = {
            {"Believe you can and you're halfway there.", "Theodore Roosevelt"},
            {"Dream big and dare to fail.", "Norman Vaughan"},
            {"Success is not final, failure is not fatal.", "Winston Churchill"},
            {"Hard work beats talent when talent doesn’t work hard.", "Tim Notke"},
            {"Stay hungry, stay foolish.", "Steve Jobs"},
            {"Push yourself, because no one else will.", "Unknown"},
            {"Great things take time.", "Unknown"},
            {"Don’t stop when you’re tired. Stop when you’re done.", "Unknown"},
            {"Small progress is still progress.", "Unknown"},
            {"Consistency is the key to success.", "Unknown"}
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtQuote = findViewById(R.id.txtQuote);
        txtAuthor = findViewById(R.id.txtAuthor);
        btnNewQuote = findViewById(R.id.btnNewQuote);

        random = new Random();

        showRandomQuote();

        btnNewQuote.setOnClickListener(v -> showRandomQuote());
    }

    void showRandomQuote() {
        int index = random.nextInt(quotes.length);
        txtQuote.setText("“" + quotes[index][0] + "”");
        txtAuthor.setText("— " + quotes[index][1]);
    }
}
