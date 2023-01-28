package com.example.calculator;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startService(new Intent(getApplicationContext(), MyService.class));

        getSupportActionBar().setIcon(R.drawable.calculator2);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        SecondActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_USER_ACTION);
                startActivity(intent);
            }
        });

        Button btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        ThirdActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();

        inflater.inflate(R.menu.menu1, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item)
    {
        Toast toast = Toast.makeText(getApplicationContext(),"", Toast.LENGTH_LONG);

        switch(item.getItemId())
        {
            case R.id.information:
                toast.setText("경성대학교 소프트웨어학과 2019663053 백고은");
                break;
        }

        toast.show();

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onDestroy() {
        stopService(new Intent(getApplicationContext(), MyService.class));
        super.onDestroy();
    }

    @Override
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        stopService(new Intent(getApplicationContext(), MyService.class));
    }
}