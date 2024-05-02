package android.com.projet;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Fondant extends AppCompatActivity {

    private int personCount = 1;
    private TextView personCountTextView;
    private TextView chocolateTextView;
    private TextView butterTextView;
    private TextView SucreTextView;
    private TextView FarineTextView;
    private TextView OeufsTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fondant);

        personCountTextView = findViewById(R.id.personCountTextView);
        chocolateTextView = findViewById(R.id.chocolateTextView);
        butterTextView = findViewById(R.id.butterTextView);
        SucreTextView=findViewById(R.id.SucreTextView);
        FarineTextView = findViewById(R.id.FarineTextView);
        OeufsTextView = findViewById(R.id.OeufsTextView);
        ImageButton buttonBack = findViewById(R.id.btnRetour);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fondant.this, sucree.class);
                startActivity(intent);
                finish();
            }
        });
        ImageButton buttonMenu = findViewById(R.id.btnMenu);
        buttonMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fondant.this, MainActivity2.class);
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
        double chocolateQuantity = 50 * personCount;
        double butterQuantity = 17.5 * personCount;
        double SucreQuantity= 12.5 * personCount;
        double FarineQuantity= 12.5 * personCount;
        double OeufsQuantity= 1 * personCount;


        chocolateTextView.setText("Chocolat     "+chocolateQuantity + "g");
        butterTextView.setText("Beurre     " +butterQuantity + "g");
        SucreTextView.setText("Sucre     "+SucreQuantity + "g");
        FarineTextView.setText("Farine     "+FarineQuantity + "g");
        OeufsTextView.setText("Oeuf(s)     "+OeufsQuantity);

    }
}
