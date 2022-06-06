package com.moringa.footballfanatix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends AppCompatActivity {

    @BindView(R.id.players)
    ListView players;

    @BindView(R.id.welcome)
    TextView welcome;

    String[] footballers={"Mo.Salah","Rudiger","Dias","Saka","Mount","Silver","Messi","Kante","Mbappe","Neymar","Balogun"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ButterKnife.bind(this);
        ArrayAdapter adapter=new ArrayAdapter<String>(this,R.layout.activity_item,footballers);
        players.setAdapter(adapter);

        Intent intent=getIntent();
        String usr=intent.getStringExtra("user");

        welcome.setText("Welcome" + " " + usr);

    }
}