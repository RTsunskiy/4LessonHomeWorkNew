package com.example.a4lessonhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    private Button mButton;
    private TextView textResult;

    private TestModel testModel;

    private RandomGenerator generator;

    private String string1;
    private String string2;
    private List<Integer> list1;
    private List<Integer> list2;

    private static final String SAVED_PARCEL = "PARCEL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle(R.string.map_activity_title_string);

        mButton = findViewById(R.id.second_activity_button);
        textResult = findViewById(R.id.second_activity_textView);

        generator = new RandomGenerator();

        mButton.setOnClickListener(this::onClick);

        string1 = generator.generateRandomString(8);
        string2 = generator.generateRandomString(9);
        list1 = generator.generateRandomArray(50);
        list2 = generator.generateRandomArray(70);

        textResult.setText(string1 + " " + string2);

        testModel = new TestModel(string1,string2, list1, list2);
    }

    private void onClick(View view) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelable(SAVED_PARCEL, testModel);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        testModel = savedInstanceState.getParcelable(SAVED_PARCEL);
        textResult.setText(testModel.getString1() + " " + testModel.getString2());
        super.onRestoreInstanceState(savedInstanceState);
    }
}
