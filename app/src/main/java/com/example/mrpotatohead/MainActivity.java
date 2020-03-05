package com.example.mrpotatohead;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initListener();
    }

    private void initListener() {
        ((CheckBox)findViewById(R.id.nose_cb)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                setVis((ImageView)findViewById(R.id.nose), (CheckBox)findViewById(R.id.nose_cb));
                //Toast.makeText(MainActivity.this, "checked!", Toast.LENGTH_LONG).show();
            }
        });

        ((CheckBox)findViewById(R.id.eyes_cb)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                setVis((ImageView)findViewById(R.id.eyes), (CheckBox)findViewById(R.id.eyes_cb));
            }
        });

        ((CheckBox)findViewById(R.id.eyebrows_cb)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                setVis((ImageView)findViewById(R.id.eyebrows), (CheckBox)findViewById(R.id.eyebrows_cb));
            }
        });

        ((CheckBox)findViewById(R.id.glasses_cb)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                setVis((ImageView)findViewById(R.id.glasses), (CheckBox)findViewById(R.id.glasses_cb));
            }
        });

        ((CheckBox)findViewById(R.id.hat_cb)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                setVis((ImageView)findViewById(R.id.hat), (CheckBox)findViewById(R.id.hat_cb));
            }
        });

        ((CheckBox)findViewById(R.id.shoes_cb)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                setVis((ImageView)findViewById(R.id.shoes), (CheckBox)findViewById(R.id.shoes_cb));
            }
        });

        ((CheckBox)findViewById(R.id.arms_cb)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                setVis((ImageView)findViewById(R.id.arms), (CheckBox)findViewById(R.id.arms_cb));
            }
        });

        ((CheckBox)findViewById(R.id.mustache_cb)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                setVis((ImageView)findViewById(R.id.mustache), (CheckBox)findViewById(R.id.mustache_cb));
            }
        });

        ((CheckBox)findViewById(R.id.ears_cb)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                setVis((ImageView)findViewById(R.id.ears), (CheckBox)findViewById(R.id.ears_cb));
            }
        });

        ((CheckBox)findViewById(R.id.mouth_cb)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                setVis((ImageView)findViewById(R.id.mouth), (CheckBox)findViewById(R.id.mouth_cb));
            }
        });
    }

    private void setVis(ImageView image, CheckBox cb) {
        if(cb.isChecked())
            image.setVisibility(View.VISIBLE);
        else
            image.setVisibility(View.INVISIBLE);
    }
}
