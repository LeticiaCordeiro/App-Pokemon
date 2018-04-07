package com.example.aluno.pokemon;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button evoluir;
    int contador;
    String pathName;
    ImageView background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        evoluir = (Button)findViewById(R.id.evoluir);
        background = (ImageView)findViewById(R.id.imageView);

        evoluir.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                if(contador >= 1){
                    pathName = "/drawable/";
                    background.setImageResource(R.drawable.charizard);
                    contador = contador + 1;
                }
                else{
                    pathName = "/drawable/";
                    background.setImageResource(R.drawable.charmeleon);
                    contador = contador + 1;
                }
            }
        });
    }
}
