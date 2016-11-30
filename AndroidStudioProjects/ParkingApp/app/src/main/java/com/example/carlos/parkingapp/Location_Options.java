package com.example.carlos.parkingapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class Location_Options extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location__options);

        Intent intent = getIntent();
    }

    public void onSelectionClick(View view) {

        if (view.getId() == R.id.oldstruct) {

            Uri gmmIntentUri = Uri.parse("geo:34.060733, -117.816988?z=17");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);

        }
        if (view.getId() == R.id.newstruct) {

            Uri gmmIntentUri = Uri.parse("geo:34.051555, -117.819730?z=17");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);

        }
        if (view.getId() == R.id.b_lot) {

            Uri gmmIntentUri = Uri.parse("geo:34.052500, -117.815501?z=17");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);

        }
        if (view.getId() == R.id.j_lot) {

            Uri gmmIntentUri = Uri.parse("geo:34.057400, -117.828747?z=17");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);

        }
        if (view.getId() == R.id.u_lot) {
            Uri gmmIntentUri = Uri.parse("geo:34.048760, -117.817345?z=17");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }
    }
}
