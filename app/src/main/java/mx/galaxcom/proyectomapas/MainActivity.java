package mx.galaxcom.proyectomapas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import mx.galaxcom.proyectomapas.mapas.GranTerrazaMapActivity;
import mx.galaxcom.proyectomapas.mapas.LaCuspideMapActivity;
import mx.galaxcom.proyectomapas.mapas.PalacioMunicipalMapActivity;
import mx.galaxcom.proyectomapas.mapas.TorresSateliteMapActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irGranTerrazaMapa(View v){
        Intent i = new Intent(this, GranTerrazaMapActivity.class);
        startActivity(i);
    }

    public void irTorresSatelite(View v){
        Intent i = new Intent(this, TorresSateliteMapActivity.class);
        startActivity(i);
    }

    public void irLaCuspideMapa(View v){
        Intent i = new Intent(this, LaCuspideMapActivity.class);
        startActivity(i);
    }

    public void irPalacioMunicipalMapa(View v){
        Intent i = new Intent(this, PalacioMunicipalMapActivity.class);
        startActivity(i);
    }
}
