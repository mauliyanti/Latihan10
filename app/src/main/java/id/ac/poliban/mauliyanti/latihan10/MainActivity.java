package id.ac.poliban.mauliyanti.latihan10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btPhone = findViewById(R.id.btPhone);
        Button btEmail = findViewById(R.id.btEmail);
        Button btWebsite = findViewById(R.id.btWebsite);
        Button btGeo = findViewById(R.id.btGeo);

        btPhone.setOnClickListener(view -> {
            Uri uri = Uri.parse("tel: 085849938038");
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.setData(uri);
            startActivity(intent);
        });
        btEmail.setOnClickListener(view -> {
            Uri uri = Uri.parse("mailto:mauliyanti29@gmail.com");
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.setData(uri);
            startActivity(intent);
        });

btWebsite.setOnClickListener(view1 ->
    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https:/github.com/mauliyanti"))));

btGeo.setOnClickListener(view1 ->
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("geo:40.7622787, -298739"))));
}
    }