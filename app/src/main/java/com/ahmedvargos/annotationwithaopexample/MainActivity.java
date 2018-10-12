package com.ahmedvargos.annotationwithaopexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.ahmedvargos.annotation_library.MyNetworkManager;
import com.ahmedvargos.annotation_library.annotations.RunWithInternet;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyNetworkManager.init(this);
        showToastInternetIsAvailable();
    }

    @RunWithInternet
    private void showToastInternetIsAvailable() {
        Toast.makeText(this, "Internet is available", Toast.LENGTH_SHORT).show();
    }
}
