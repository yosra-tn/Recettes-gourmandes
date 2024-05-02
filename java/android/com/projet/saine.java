package android.com.projet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class saine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saine);
        Button b1=(Button) findViewById(R.id.btnSalade);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(saine.this, Salade.class);
                startActivity(i);
            }
        });
        ImageButton buttonBack = findViewById(R.id.btnRetour);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(saine.this, MainActivity2.class);
                startActivity(intent);
                finish();
            }
        });
        ImageButton buttonMenu = findViewById(R.id.btnMenu);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(saine.this, MainActivity2.class);
                startActivity(intent);
                finish();
            }
        });
    }
}