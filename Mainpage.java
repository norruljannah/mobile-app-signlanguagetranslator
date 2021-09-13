package in.notyouraveragedev.tensor_image_classification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Mainpage extends AppCompatActivity {

    public TextView appname,desc;
    public ImageView logo;
    public Button Btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);

        appname = findViewById(R.id.tv1);
        desc = findViewById(R.id.tv2);
        logo = findViewById(R.id.logo);
        Btn1 = findViewById(R.id.btn1);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent MainIntent = new Intent(Mainpage.this, Homepage.class);
                startActivity(MainIntent);
            }
        });
    }
}