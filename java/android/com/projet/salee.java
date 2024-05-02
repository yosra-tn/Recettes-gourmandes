package android.com.projet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class salee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salee);
        Button b1=(Button) findViewById(R.id.btnPizza);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(salee.this, Spaghetti.class);
                startActivity(i);
            }
        });
        ImageButton buttonBack = findViewById(R.id.btnRetour);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(salee.this, MainActivity2.class);
                startActivity(intent);
                finish();
            }
        });

    }
}