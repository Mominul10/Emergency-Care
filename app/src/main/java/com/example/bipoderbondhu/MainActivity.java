package com.example.bipoderbondhu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.Fragment;


import android.Manifest;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.bipoderbondhu.My_Fragments.Blood_Fragment;
import com.example.bipoderbondhu.My_Fragments.Call_Fragment;
import com.example.bipoderbondhu.My_Fragments.FristAid_Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.navigation);

        //User_Permission_Method
        user_permission();

        //Navigation View
        bottomNavigationView.setOnNavigationItemSelectedListener(buttomnavigation);
        bottomNavigationView.setItemIconTintList(null);
        getSupportFragmentManager().beginTransaction().replace(R.id.c, new FristAid_Fragment()).commit();

    }

    private void user_permission() {
        Dexter.withActivity(this)
                .withPermissions(
                        Manifest.permission.READ_EXTERNAL_STORAGE,
                        Manifest.permission.CALL_PHONE)
                .withListener(new MultiplePermissionsListener() {
                    @Override
                    public void onPermissionsChecked(MultiplePermissionsReport report) {
                        // check if all permissions are granted
                        if (report.areAllPermissionsGranted()) {
                            // do you work now
                        }

                        // check for permanent denial of any permission
                        if (report.isAnyPermissionPermanentlyDenied()) {
                            // permission is denied permenantly, navigate user to app settings
                        }
                    }

                    @Override
                    public void onPermissionRationaleShouldBeShown(List<PermissionRequest> permissions, PermissionToken token) {
                        token.continuePermissionRequest();
                    }
                })
                .onSameThread()
                .check();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener buttomnavigation = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment = null;

            switch (item.getItemId()) {

                case R.id.contact:

                    fragment = new Call_Fragment();
                    break;
                case R.id.frist_Aid:
                    fragment = new FristAid_Fragment();
                    break;
                case R.id.blood:
                    fragment = new Blood_Fragment();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.c,fragment).commit();
            return true;
        }
    };

}
