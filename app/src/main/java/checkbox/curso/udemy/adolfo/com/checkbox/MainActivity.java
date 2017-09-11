package checkbox.curso.udemy.adolfo.com.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox cvTigre, cvPerro, cvDelfin;
    private TextView tvResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cvDelfin = (CheckBox) findViewById(R.id.cvDelfin);
        cvTigre = (CheckBox) findViewById(R.id.cvTigre);
        cvPerro = (CheckBox) findViewById(R.id.cvPerro);
        tvResultado = (TextView) findViewById(R.id.tvResultado);
    }


    public void getAnimal(View view) {
        if (cvDelfin.isChecked())
            tvResultado.setText(cvDelfin.getText());
        if (cvPerro.isChecked())
            tvResultado.setText(cvPerro.getText());
        if (cvTigre.isChecked())
            tvResultado.setText(cvTigre.getText());
    }

    public void delfinChecked(View view) {
        boolean checked = cvDelfin.isChecked();
        if (checked){
            cvTigre.setVisibility(View.INVISIBLE);
            cvPerro.setVisibility(View.INVISIBLE);
        }else{
            cvTigre.setVisibility(View.VISIBLE);
            cvPerro.setVisibility(View.VISIBLE);
        }
    }

    public void perroChecked(View view) {
        boolean checked = cvPerro.isChecked();
        if (checked){
            cvTigre.setVisibility(View.INVISIBLE);
            cvDelfin.setVisibility(View.INVISIBLE);
        }else{
            cvTigre.setVisibility(View.VISIBLE);
            cvDelfin.setVisibility(View.VISIBLE);
        }
    }

    public void tigreChecked(View view) {
        boolean checked = cvTigre.isChecked();
        if (checked){
            cvDelfin.setVisibility(View.INVISIBLE);
            cvPerro.setVisibility(View.INVISIBLE);
        }else{
            cvDelfin.setVisibility(View.VISIBLE);
            cvPerro.setVisibility(View.VISIBLE);
        }
    }
}
