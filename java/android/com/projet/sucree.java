package android.com.projet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class sucree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sucree);
        Button b1=(Button) findViewById(R.id.btnFondant);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(sucree.this, Fondant.class);
                startActivity(i);
            }
        });
        Button b2=(Button) findViewById(R.id.btnTiramisu);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(sucree.this, Tiramisu.class);
                startActivity(i);
            }
        });
        Button b3=(Button) findViewById(R.id.btnCakeCitron);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(sucree.this, CakeCitron.class);
                startActivity(i);
            }
        });

        ImageButton buttonBack = findViewById(R.id.btnRetour);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sucree.this, MainActivity2.class);
                startActivity(intent);
                finish();
            }
        });

    }
}