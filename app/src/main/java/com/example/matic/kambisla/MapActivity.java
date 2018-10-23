package com.example.matic.kambisla;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        String eventName = getIntent().getStringExtra("eventName");

        ImageView map = findViewById(R.id.map);
        switch (eventName) {
            case "Kavarna Kapital":
                map.setImageResource(R.drawable.ef_kavarna);
                break;
            case "Badminton":
                map.setImageResource(R.drawable.ef_badminton_nogomet_kosarka);
                break;
            case "Nogomet, košarka":
                map.setImageResource(R.drawable.ef_badminton_nogomet_kosarka);
                break;
            case "Subway":
                map.setImageResource(R.drawable.ef_subway);
                break;
            case "Pot po žici okupirane Ljubljane":
                map.setImageResource(R.drawable.ef_zica);
                break;
            case "Bistro Šumi":
                map.setImageResource(R.drawable.ef_sumi);
                break;
            case "Sejem namiznih iger":
                map.setImageResource(R.drawable.ef_gospodarc);
                break;
            case "Dirka miniaturnih čolnov":
                map.setImageResource(R.drawable.ef_tivoli_dirka);
                break;
            case "Večer romantičnih komedij":
                map.setImageResource(R.drawable.ef_kino_bezigrad);
                break;
            case "Parada pustnih mask":
                map.setImageResource(R.drawable.ef_parada);
                break;
            case "Javni piknik":
                map.setImageResource(R.drawable.ef_tivoli_piknik);
                break;
            default:
                Toast.makeText(this, "NO SUCH EVENT", Toast.LENGTH_SHORT).show();
        }
        map.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }
}
