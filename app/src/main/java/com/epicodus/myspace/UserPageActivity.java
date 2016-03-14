package com.epicodus.myspace;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserPageActivity extends AppCompatActivity {

    private Button mMorePicsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_page);

        mMorePicsButton = (Button) findViewById(R.id.morePicsButton);
            mMorePicsButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(UserPageActivity.this, ImageActivity.class);
                    startActivity(intent);
                }
            });
    }
}
