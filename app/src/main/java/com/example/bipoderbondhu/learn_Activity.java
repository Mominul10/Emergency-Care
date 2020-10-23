package com.example.bipoderbondhu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class learn_Activity extends AppCompatActivity {

    ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_);


        int[] img = {R.drawable.pic1, R.drawable.pic2, R.drawable.pic3};
        viewFlipper = findViewById(R.id.my_view_filpper);
        for (int i = 0; i < img.length; i++) {
            // This will create dynamic image views and add them to the ViewFlipper.
            setFlipperImage(img[i]);
        }
        
    }


    private void setFlipperImage(int i) {
        Log.i("Set Filpper Called", i + "");
        ImageView image = new ImageView(learn_Activity.this);
        image.setBackgroundResource(i);
        viewFlipper.addView(image);
        viewFlipper.setFlipInterval(4000);
        viewFlipper.setAutoStart(true);
    }

    public void heart(View view) {
        Intent intent = new Intent(this,heart.class);
        startActivity(intent);
    }


    public void heart_n(View view) {
        Intent intent = new Intent(this, head_injury.class);
        startActivity(intent);

    }

    public void diabetis_n(View view) {
        Intent intent = new Intent(this, diabetics.class);
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
