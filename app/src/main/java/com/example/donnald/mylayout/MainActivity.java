package com.example.donnald.mylayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button btnChange;
    ImageView ivImage1;
    ImageView ivImage2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnChange = (Button) findViewById(R.id.buttonchange);
        ivImage1 = (ImageView) findViewById(R.id.ivImage1);
        ivImage2 = (ImageView) findViewById(R.id.ivImage2);
        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ivImage1.getVisibility() == View.VISIBLE) {
                    ivImage1.setVisibility(View.GONE);
                    ivImage2.setVisibility(View.VISIBLE);
                }else {
                    ivImage1.setVisibility(View.VISIBLE);
                    ivImage2.setVisibility(View.GONE);
                }
            }
        });
    }
}
