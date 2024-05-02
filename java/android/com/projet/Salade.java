package android.com.projet;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Salade extends AppCompatActivity {

    private int personCount = 1;
    private TextView personCountTextView;
    private TextView saladeTextView; // Ajout d'un TextView pour afficher la quantité de chocolat
    private TextView tomateTextView;
    private TextView escalopeTextView;
    private TextView fromageTextView;
    private TextView OeufsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salade);

        personCountTextView = findViewById(R.id.personCountTextView);
        saladeTextView = findViewById(R.id.saladeTextView);
        tomateTextView = findViewById(R.id.tomateTextView);
        escalopeTextView=findViewById(R.id.escalopeTextView);
        fromageTextView = findViewById(R.id.fromageTextView);
        OeufsTextView = findViewById(R.id.OeufsTextView);

        ImageButton buttonBack = findViewById(R.id.btnRetour);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Salade.this, salee.class);
                startActivity(intent);
                finish();
            }
        });
        ImageButton buttonMenu = findViewById(R.id.btnMenu);
        buttonMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Salade.this, MainActivity2.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void decreaseCount(View view) {
        if (personCount > 1) {
            personCount--;
            updatePersonCount();
            updateIngredientsQuantity();

        }
    }

    public void increaseCount(View view) {
        personCount++;
        updatePersonCount();
        updateIngredientsQuantity();

    }

    private void updatePersonCount() {
        personCountTextView.setText(String.valueOf(personCount));
    }

    private void updateIngredientsQuantity() {
        double saladeQuantity =  1 * personCount;
        double tomateQuantity = 2 * personCount;
        double escalopeQuantity= 1 * personCount;
        double fromageQuantity= 100 * personCount;
        double OeufsQuantity= 1 * personCount;

        // Mettre à jour les TextView avec les nouvelles quantités
        saladeTextView.setText("Salade Verte"+saladeQuantity );
        tomateTextView.setText("Tomate(s)"+tomateQuantity);
        escalopeTextView.setText("Escalope de poulet "+escalopeQuantity );
        fromageTextView.setText("Fromage    "+fromageQuantity + "g");
        OeufsTextView.setText("Oeuf(s)     "+OeufsQuantity);
    }
}
