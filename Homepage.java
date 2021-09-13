package in.notyouraveragedev.tensor_image_classification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Homepage extends AppCompatActivity {

    public ImageButton back, camera;
    public Button button;
    public TextView translate,learnv;
    public ImageView hello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        back = findViewById(R.id.bckbut);
        camera = findViewById(R.id.camerabut);
        button = findViewById(R.id.button);
        translate = findViewById(R.id.translate);
        learnv = findViewById(R.id.tvor);
        hello = findViewById(R.id.helimg);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent BackIntent = new Intent(Homepage.this, Mainpage.class);
                startActivity(BackIntent);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent LearnIntent = new Intent(Homepage.this, Learnpage.class);
                startActivity(LearnIntent);
            }
        });
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent LearnIntent = new Intent(Homepage.this, MainActivity.class);
                startActivity(LearnIntent);
            }
        });
    }
}