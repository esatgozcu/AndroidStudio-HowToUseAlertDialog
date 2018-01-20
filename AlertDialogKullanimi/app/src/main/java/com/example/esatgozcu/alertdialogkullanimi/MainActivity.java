package com.example.esatgozcu.alertdialogkullanimi;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;

public class MainActivity extends AppCompatActivity {

    Button gitbuton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gitbuton=(Button)findViewById(R.id.button);

        gitbuton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                function();
            }
        });
    }
    public void function() {

        //AlertDialog'u nesnesi türetiyoruz
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        //Başlık
        builder.setTitle("www.esatgozcu.com");
        //Mesaj
        builder.setMessage("Siteyi Ziyaret Et");
        //Herhangi bir boşluğa basınca kapanmaması için true olursa kapanır
        //Geri tuşununu da pasif hale getiriyoruz
        builder.setCancelable(false);
        //AlertDialog'un iconunu belirliyoruz
        builder.setIcon(R.drawable.resim);


        builder.setNegativeButton("HAYIR", new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog, int id) {

                //Hayır butonuna basılınca yapılacaklar.
                //Sadece kapanması istenirse boş bırakılır
            }
        });

        builder.setPositiveButton("EVET", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {

                //Tamam butonuna basılınca yapılacaklar
                //Websitesine gidiyoruz
                Uri link = Uri.parse("http://www.esatgozcu.com/android-studio/android-studio-alertdialog-kullanimi");
                Intent tara = new Intent(Intent.ACTION_DEFAULT, link);
                startActivity(tara);
            }
        });

        //AlertDiolag Gösteriliyor
        builder.show();
    }
}
