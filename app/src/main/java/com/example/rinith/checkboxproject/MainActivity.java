package com.example.rinith.checkboxproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clicked(View view) {
        CheckBox cb = (CheckBox) view;  //CONVERT PARAMETER TO CHECK BOX TYPE
        boolean isSelected = cb.isChecked(); //TELLS IF A BOX IS CHECKED - TRUE/FALSE
        switch (view.getId())
        {

            case R.id.checkBox1:
                if (isSelected==true) {
                    Toast.makeText(this, "btech selected", Toast.LENGTH_SHORT).show();
                    CheckBox cb2 =  findViewById(R.id.checkBox2);
                    cb2.setChecked(false);
                }
                break;

            case R.id.checkBox2:
                if (isSelected==true) {
                    Toast.makeText(this, "mca selected", Toast.LENGTH_SHORT).show();
                    CheckBox cb1 =  findViewById(R.id.checkBox1);
                    cb1.setChecked(false);
                }
                    break;

            case R.id.checkBox3:
                if (isSelected==true)
                    Toast.makeText(this, "mba selected", Toast.LENGTH_SHORT).show();
                break;

            case R.id.checkBox4:
                if (isSelected==true)
                    Toast.makeText(this, "others selected", Toast.LENGTH_SHORT).show();
                break;



        }


    }
}
