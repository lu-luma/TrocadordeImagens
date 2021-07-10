package com.example.trocadordeimagens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
//Tarefa feita pelas alunas Laura Neri Thomaz da Silva e Luiza Maria da Silva
//Testamos no celular e tá tudo certin :) 
public class MainActivity extends AppCompatActivity {
    Button btnLindinha;
    Button btnFlorzinha;
    Button btnDocinho;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLindinha=findViewById(R.id.btnLindinha);
        btnFlorzinha=findViewById(R.id.btnFlorzinha);
        btnDocinho=findViewById(R.id.btnDocinho);
        img=findViewById(R.id.img);
        EscutadorBotao EscutadorBotao = new EscutadorBotao();
        btnLindinha.setOnClickListener(EscutadorBotao);
        btnFlorzinha.setOnClickListener(EscutadorBotao);
        btnDocinho.setOnClickListener(EscutadorBotao);

    }
    private class EscutadorBotao implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Button b = (Button) v;
            switch (b.getId()){
                case R.id.btnLindinha:
                    img.setImageResource(R.drawable.lindinha);
                    break;
                case R.id.btnFlorzinha:
                    img.setImageResource(R.drawable.florzinha);
                    break;
                case R.id.btnDocinho:
                    img.setImageResource(R.drawable.docinho);
                    break;
            }
        }
    }

}