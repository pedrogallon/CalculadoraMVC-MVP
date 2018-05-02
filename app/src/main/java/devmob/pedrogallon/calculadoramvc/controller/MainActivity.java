package devmob.pedrogallon.calculadoramvc.controller;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import devmob.pedrogallon.calculadoramvc.R;
import devmob.pedrogallon.calculadoramvc.model.Calculadora;


public class MainActivity extends Activity {
    EditText valor1, valor2, operador, resultado;
    Calculadora model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valor1 = findViewById(R.id.valor1);
        valor2 = findViewById(R.id.valor2);
        operador = findViewById(R.id.operador);
        resultado = findViewById(R.id.resultado);
        model = new Calculadora();
    }

    public void calcular(View view){
        model.setValor1(valor1.getText().toString());
        model.setValor2(valor2.getText().toString());
        model.setOperador(operador.getText().toString());
        model.calculo();
        resultado.setText(model.getResultado());
    }
}
