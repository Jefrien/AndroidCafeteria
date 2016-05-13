package com.jefrienalvizures.org.cafeteria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnPedido;
    EditText txtPedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtPedido = (EditText) findViewById(R.id.txtTazas);
        btnPedido = (Button) findViewById(R.id.btnPedido);

        btnPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Factura.class);
                intent.putExtra("pedido",txtPedido.getText().toString());
                startActivity(intent);
            }
        });
    }
}
