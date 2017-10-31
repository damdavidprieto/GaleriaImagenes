package com.example.kike.galeriaimagenes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private int[] obraId={
        R.drawable.boti,
                R.drawable.cara,
                R.drawable.dega,
                R.drawable.gaug,
                R.drawable.goya,
                R.drawable.klim,
                R.drawable.leon,
                R.drawable.mane,
                R.drawable.remb,
                R.drawable.reno
    };

    private String []descipcion={
            "Boticelli: no me acuerdo de nada",
            "Caravaggio: no quiero mirar nada",
            "Degas: nneenenenenennenenenenenegaaaa",
            "Gaugaling o algo asi",
            "Go ya', boy",
            "Klint, noice",
            "Leonardo da (di Caprio) Vinci",
            "Manet como en 13 razones",
            "Rembradnd o algo pareceido",
            "Renoir ya sudo del tema"
    };

    private int i=0;
    private int totalObras=obraId.length;
    private Button btnSiguiente, btnPrevio;
    private TextView tvDescripcion;
    private ImageView ivCuadro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPrevio = (Button) findViewById(R.id.btnPrevio);
        btnSiguiente = (Button) findViewById(R.id.btnSiguiente);
        ivCuadro = (ImageView) findViewById(R.id.ivCuadro);
        tvDescripcion = (TextView) findViewById(R.id.tvDescripcion);

        //Este implementa lo de arriba equisdé
        btnPrevio.setOnClickListener(this);
        btnSiguiente.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id=view.getId();
        if(id==R.id.btnSiguiente){
            i++;
            if(i==totalObras){
                i=0;
            }
        }else{
            i--;
            if(i<0){
                i=totalObras-1;
            }
        }

        ivCuadro.setImageResource(obraId[i]);
        tvDescripcion.setText(descipcion[i]);
    }
}
