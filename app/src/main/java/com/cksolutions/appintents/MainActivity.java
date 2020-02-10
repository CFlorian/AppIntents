package com.cksolutions.appintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnBrowser, btnFinish, btnActivity;
    private EditText etUrl;
    private RadioButton rbMen, rbWoman;
    private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        listeners();
    }

    private void initUI() {
        btnBrowser = findViewById(R.id.btnBrowser);
        btnFinish = findViewById(R.id.btnFinish);
        btnActivity = findViewById(R.id.btnActivity);
        etUrl = findViewById(R.id.etUrl);
        rbMen = findViewById(R.id.rbMen);
        rbWoman = findViewById(R.id.rbWoman);
    }

    private void listeners() {

        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnBrowser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                url = "";
                url = etUrl.getText().toString();

                if (url.isEmpty()) Toast.makeText(getApplicationContext(),"Ingrese una Url",Toast.LENGTH_SHORT).show();
                else{
                    if (!url.startsWith("http://") && !url.startsWith("https://"))
                        url = "http://" + url;

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    startActivity(Intent.createChooser(intent, "Browser"));
                }
            }
        });

        btnActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),GenderActivity.class);
                if (rbMen.isChecked()){
                    intent.putExtra("men", true);
                    startActivity(intent);
                }else if (rbWoman.isChecked()){
                    intent.putExtra("men", false);
                    startActivity(intent);
                }else {
                    Toast.makeText(getApplicationContext(),"Selecione un genero",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
