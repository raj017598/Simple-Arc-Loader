package com.example.simplearcloader;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.leo.simplearcloader.ArcConfiguration;
import com.leo.simplearcloader.SimpleArcDialog;
import com.leo.simplearcloader.SimpleArcLoader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showCaseOneDialog(View view) {
        SimpleArcDialog dialog = new SimpleArcDialog(this);
        ArcConfiguration configuration = new ArcConfiguration(this);
        dialog.setConfiguration(configuration);

        configuration.setText("Loading...");

        dialog.show();
    }

    public void showCasetwoDialog(View view) {
        SimpleArcDialog dialog = new SimpleArcDialog(this);
        ArcConfiguration configuration = new ArcConfiguration(this);
        dialog.setConfiguration(configuration);

        configuration.setText("Compleete Arc With Default Configuration");

        configuration.setLoaderStyle(SimpleArcLoader.STYLE.COMPLETE_ARC);

        dialog.show();
    }

    public void showCaseThreeDialog(View view) {

        SimpleArcDialog dialog = new SimpleArcDialog(this);
        ArcConfiguration configuration = new ArcConfiguration(this);
        dialog.setConfiguration(configuration);

        configuration.setText("Loading...");

        configuration.setColors(new int[]{Color.BLUE});

        configuration.setTextColor(Color.GREEN);

        dialog.show();
    }

    public void showCaseFoureDialog(View view) {
        SimpleArcDialog dialog = new SimpleArcDialog(this);
        ArcConfiguration configuration = new ArcConfiguration(this);
        dialog.setConfiguration(configuration);

        configuration.setText("Complete Arc With Custom Configuration");

        configuration.setLoaderStyle(SimpleArcLoader.STYLE.COMPLETE_ARC);

        configuration.setColors(new int[]{Color.WHITE,Color.BLUE,Color.BLACK,Color.GRAY});

        configuration.setTextColor(Color.RED);

        dialog.show();
    }
}