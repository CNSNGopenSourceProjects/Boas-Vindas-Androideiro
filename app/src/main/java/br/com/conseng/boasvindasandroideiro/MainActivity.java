package br.com.conseng.boasvindasandroideiro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView1 = findViewById(R.id.texto_1);
        textView1.setText(R.string.ExemploDeTexto);

        // TODO: implementar o código exemplo

    }
}
