package devmob.pedrogallon.calculadoramvc.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import devmob.pedrogallon.calculadoramvc.R;
import devmob.pedrogallon.calculadoramvc.model.Calculadora;
import devmob.pedrogallon.calculadoramvc.presenter.MainPresenter;
import devmob.pedrogallon.calculadoramvc.presenter.Presenter;


public class MainActivity extends Activity implements MainView {

    EditText valor1, valor2, operador, resultado;
    Calculadora model;
    MainPresenter presenter = new MainPresenter(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valor1 = findViewById(R.id.valor1);
        valor2 = findViewById(R.id.valor2);
        operador = findViewById(R.id.operador);
        resultado = findViewById(R.id.resultado);
        presenter.onCreate();
    }

    public void calculo(View view){
        presenter.calculo();
    }
    @Override
    public String getValor1(){
        return valor1.getText().toString();
    }
    @Override
    public void setValor1(String valor1){
        this.valor1.setText(valor1);
    }
    @Override
    public String getValor2(){
        return valor2.getText().toString();
    }
    @Override
    public void setValor2(String valor2){
        this.valor2.setText(valor2);
    }
    @Override
    public String getOperador(){
        return operador.getText().toString();
    }

    @Override
    public String getResultado() {
        return this.resultado.getText().toString();
    }

    @Override
    public void setResultado(String resultado){
        this.resultado.setText(resultado);
    }
}
