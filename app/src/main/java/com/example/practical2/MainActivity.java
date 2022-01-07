package com.example.practical2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
//import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //private Button button;
    private TextView textView;
    private  EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //button = findViewById(R.id.btn);
        textView = findViewById(R.id.textView2);
        editText = findViewById(R.id.editText1);

/*
        button.setOnContextClickListener(new View.OnContextClickListener() {

            @Override
            public boolean onContextClick(View view) {
               //
                String s = editText.getText().toString();
                Toast.makeText(MainActivity.this,"Hello" + s, Toast.LENGTH_SHORT).show();

                int a = Integer.parseInt(s);
                textView.setText("HELLO" +s);
            }
        });

 */
    }
        public void onButtonClick(View view) {
            //
            String s = editText.getText().toString();
            Toast.makeText(MainActivity.this,"Hello" + s, Toast.LENGTH_SHORT).show();

            //int a = Integer.parseInt(s);
            textView.setText("HELLO" +s);
        }

}