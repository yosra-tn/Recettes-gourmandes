package android.com.projet;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Spaghetti extends AppCompatActivity {

    private int personCount = 1;
    private TextView personCountTextView;
    private TextView spaghettiTextView; // Ajout d'un TextView pour afficher la quantité de chocolat
    private TextView tomateTextView;

    private TextView aileminceTextView;
    private TextView oignonTextView;
    private TextView boeufhacheTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spaghetti);

        personCountTextView = findViewById(R.id.personCountTextView);
        spaghettiTextView = findViewById(R.id.spaghettiTextView);
        tomateTextView = findViewById(R.id.tomateTextView);
        aileminceTextView=findViewById(R.id.aileminceTextView);
        oignonTextView = findViewById(R.id.oignonTextView);
        boeufhacheTextView = findViewById(R.id.boeufhacheTextView);
        ImageButton buttonBack = findViewById(R.id.btnRetour);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Spaghetti.this, salee.class);
                startActivity(intent);
                finish();
            }
        });
        ImageButton buttonMenu = findViewById(R.id.btnMenu);
        buttonMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Spaghetti.this, MainActivity2.class);
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
        double spaghettiQuantity = 100 * personCount;
        double tomateQuantity = 0.5 * personCount;
        double aileminceQuantity= 0.5 * personCount;
        double oignonQuantity= 0.5 * personCount;
        double boeufhacheQuantity= 62.5 * personCount;


        // Mettre à jour les TextView avec les nouvelles quantités
        spaghettiTextView.setText("Spaghetti     "+spaghettiQuantity+"g");
        tomateTextView.setText("Tomate    " +tomateQuantity+"pot(s)");
        aileminceTextView.setText("Ail émincé  "+aileminceQuantity + "gousse(s)");
        oignonTextView.setText("Oignon(s)   "+oignonQuantity);
        boeufhacheTextView.setText("Boeuf haché    "+boeufhacheQuantity+"g");

    }

}
