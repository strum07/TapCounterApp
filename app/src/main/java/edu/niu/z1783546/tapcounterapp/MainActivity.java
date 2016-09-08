package edu.niu.z1783546.tapcounterapp;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;
import android.graphics.Color;

public class MainActivity extends Activity implements OnClickListener {

    Button btn1;
    Button btn2;
    Button btn3;
    TextView textTitle;
    EditText scoreText;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.add);
        btn2 = (Button)findViewById(R.id.sub);
        btn3 = (Button)findViewById(R.id.reset);
        scoreText = (EditText)findViewById(R.id.countText);
        textTitle = (TextView)findViewById(R.id.count);

//—set on click listeners on the buttons—–
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);

// change font size of the text
        textTitle.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
    }

    @Override
    public void onClick(View v) {
        if (v == btn1){
            counter++;
            scoreText.setText(Integer.toString(counter));
            scoreText.setBackgroundColor(Color.CYAN);
        }
        if (v == btn2){
            counter = counter-1;
            scoreText.setText(Integer.toString(counter));
            scoreText.setBackgroundColor(Color.GREEN);
        }

        if (v == btn3){
            counter = 0;
            scoreText.setText(Integer.toString(counter));
            scoreText.setBackgroundColor(Color.RED);
        }
    }


}
