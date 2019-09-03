package com.example.compartirubica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.github.clans.fab.FloatingActionMenu;

public class MainActivity extends AppCompatActivity {
    FloatingActionMenu actionMenu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         actionMenu = (FloatingActionMenu)findViewById(R.id.menuFlotante);
         actionMenu.setClosedOnTouchOutside(true);
    }
    public void whatsappIntent(View view){

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, "https://maps.app.goo.gl/J4azBBoViQwB6eMX9");
        intent.setPackage("com.whatsapp");
        startActivity(intent);
    }
    public void compartir(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, "https://maps.app.goo.gl/J4azBBoViQwB6eMX9");
        startActivity(Intent.createChooser(intent, "Share with"));
    }
    public void facebookIntent(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, "https://maps.app.goo.gl/J4azBBoViQwB6eMX9");
        intent.setPackage("com.facebook.katana");
        startActivity(intent);
    }
    public void messeger(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, "https://maps.app.goo.gl/J4azBBoViQwB6eMX9");
        intent.setPackage("com.facebook.orca");
        startActivity(intent);
    }
    public void twitter(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, "https://maps.app.goo.gl/J4azBBoViQwB6eMX9");
        intent.setPackage("com.twitter.android");
        startActivity(intent);
    }
}
