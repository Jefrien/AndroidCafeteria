package com.jefrienalvizures.org.cafeteria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Factura extends AppCompatActivity {

    Button btnRegresar;
    TextView txtPedido,txtTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factura);
        Bundle bunde = getIntent().getExtras();

        txtPedido = (TextView) findViewById(R.id.txtPedido);
        txtTotal = (TextView) findViewById(R.id.txtTotal);
        txtPedido.setText(bunde.getString("pedido").toString());
        Double total = Double.parseDouble(bunde.getString("pedido"))*7.5;
        txtTotal.setText(total.toString());
        btnRegresar = (Button) findViewById(R.id.btnRegresar);
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Factura.this,MainActivity.class));
            }
        });

    }
}
