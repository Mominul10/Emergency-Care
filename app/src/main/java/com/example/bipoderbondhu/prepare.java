package com.example.bipoderbondhu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class prepare extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prepare);

    }

    public void emegency(View view) {
        Intent intent = new Intent(this,emergancykit.class);
        startActivity(intent);
    }

    public void vumikop(View view) {
        Intent intent = new Intent(this,vumi.class);
        startActivity(intent);
    }

    public void flu(View view) {
        Intent intent = new Intent(this,flu_next.class);
        startActivity(intent);
    }
    public void gurni(View view) {
        Intent intent = new Intent(this,tornado.class);
        startActivity(intent);
    }

    public void food(View view) {
        Intent intent = new Intent(this,food.class);
        startActivity(intent);
    }

    public void hingtem(View view) {
        Intent intent = new Intent(this,tem.class);
        startActivity(intent);
    }

    public void vumidos(View view) {
        Intent intent = new Intent(this,vumidoss.class);
        startActivity(intent);
    }

    public void bonna(View view) {
        Intent intent = new Intent(this,bonna.class);
        startActivity(intent);
    }

    public void jol(View view) {
        Intent intent = new Intent(this,jol.class);
        startActivity(intent);
    }

    public void em(View view) {
        Intent intent = new Intent(this,emer.class);
        startActivity(intent);

    }

    public void fire(View view) {
        Intent intent = new Intent(this,fire.class);
        startActivity(intent);
    }
}
