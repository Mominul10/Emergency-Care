package com.example.bipoderbondhu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class e extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e);
    }

    public void heart(View view) {
        Intent intent = new Intent(this,h2.class);
        startActivity(intent);
    }

    public void head2(View view) {
        Intent intent = new Intent(this,head2.class);
        startActivity(intent);
    }

    public void diabetis_n(View view) {
        Intent intent = new Intent(this,diabetics.class);
        startActivity(intent);

    }

    public void breakbone_n(View view) {
        Intent intent = new Intent(this, bonebreak.class);
        startActivity(intent);
    }

    public void stroke(View view) {
        Intent intent = new Intent(this, brainstroke.class);
        startActivity(intent);
    }

    public void legbroke(View view) {
        Intent intent = new Intent(this,legbroke.class);
        startActivity(intent);
    }

    public void poison(View view) {
        Intent intent = new Intent(this,poison_next.class);
        startActivity(intent);
    }

    public void shock(View view) {
        Intent intent = new Intent(this,shock_next.class);
        startActivity(intent);
    }

    public void pura(View view) {
        Intent intent = new Intent(this, pura.class);
        startActivity(intent);
    }

    public void bleeding(View view) {
        Intent intent = new Intent(this, bleeding_ac.class);
        startActivity(intent);
    }

    public void mrigi(View view) {
        Intent intent = new Intent(this,mrigi.class);
        startActivity(intent);
    }
}
