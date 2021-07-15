package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editTextTextPersonName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);

        TestStack st = new TestStack();
        st.push(20);
        st.push(40);
        st.push(60);
        st.push(70);
       // editTextTextPersonName.setText("" + st.isEmpty());

        ListImpInStack lst = new ListImpInStack();
        lst.push(10);
        lst.push(20);
        lst.push(30);
        lst.push(40);

        editTextTextPersonName.setText("" + lst.size());
    }
}