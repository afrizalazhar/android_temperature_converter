package ac.id.mercubuana.prjkonversisuhu;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText suhuCelcius,suhuFahrenheit,suhuReamur,suhuKelvin;
    Button btnConvert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        suhuCelcius = findViewById(R.id.editTextTextPersonName);
        suhuFahrenheit = findViewById(R.id.editTextTextPersonName2);
        suhuReamur = findViewById(R.id.editTextTextPersonName3);
        suhuKelvin = findViewById(R.id.editTextTextPersonName4);
        btnConvert = findViewById(R.id.button);
    }

    public void btnKonfersi_Click(View v) {
        double dCelcius, dFahrenheit, dReamur, dKelvin;

        dCelcius = Double.parseDouble(suhuCelcius.getText().toString());
        dFahrenheit = hitungKonfersiSuhu(dCelcius);
        dReamur = hitungKonfersiReamur(dCelcius);
        dKelvin = hitungKonfersiKelvin(dCelcius);

        suhuFahrenheit.setText(String.valueOf(dFahrenheit));
        suhuReamur.setText(String.valueOf(dReamur));
        suhuKelvin.setText(String.valueOf(dKelvin));
    }

    private double hitungKonfersiSuhu(double dCelcius) {
        double dSuhu = 0;
        dSuhu = (1.8 * dCelcius) + 32;

        return dSuhu;
    }

    private double hitungKonfersiReamur(double dCelcius) {
        double dSuhu = 0;
        dSuhu = 0.8*dCelcius;
        return dSuhu;
    }

    private double hitungKonfersiKelvin(double dCelcius) {
        double dSuhu = 0;
        dSuhu = dCelcius + 273;
        return dSuhu;
    }

}