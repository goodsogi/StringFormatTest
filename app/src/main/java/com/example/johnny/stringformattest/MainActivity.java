package com.example.johnny.stringformattest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showStringFormatText();
    }

    private void showStringFormatText() {
        TextView textView = (TextView) findViewById(R.id.text);
        textView.setText(getFormattedString());
    }

    private String getFormattedString() {

              return  String.format("The start point of route is %.2fkm away from current location", 6000/1000f);
    }


}
