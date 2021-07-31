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
        Suhu objSuhu = new Suhu();
        objSuhu.Celcius = Double.parseDouble(suhuCelcius.getText().toString());
        objSuhu.Fahrenheit = objSuhu.konversiCelciustoFahrenheit(objSuhu.Celcius);
        objSuhu.Reamur = objSuhu.konversiCelciustoReamur(objSuhu.Celcius);
        objSuhu.Kelvin = objSuhu.konversiCelciustoKelvin(objSuhu.Celcius);

        suhuFahrenheit.setText(String.valueOf(objSuhu.Fahrenheit));
        suhuReamur.setText(String.valueOf(objSuhu.Reamur));
        suhuKelvin.setText(String.valueOf(objSuhu.Kelvin));
    }


}