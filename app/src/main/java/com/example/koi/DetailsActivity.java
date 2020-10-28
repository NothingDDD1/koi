package com.example.koi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.koi.modelo.CartList;
import com.example.koi.modelo.Item;

public class DetailsActivity extends AppCompatActivity {
    private Item item;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        intent=getIntent();
        int id=(Integer) intent.getExtras().get("idItem");
        item= CartList.getInstancia().getItem(id);


        TextView txtNombre=(TextView)findViewById(R.id.txtNombre);
        txtNombre.setText(item.getNombre());

        TextView txtPrecio=(TextView)findViewById(R.id.txtPrecio);
        txtPrecio.setText("Precio: "+item.getPrecio() +" "+ item.getPrecio());

        TextView txtCantidad=(TextView)findViewById(R.id.txtCantidad);
        txtCantidad.setText("Cantidad: "+item.getCantidad() +" "+ item.getCantidad());

        TextView txtDisponibilidad=(TextView)findViewById(R.id.txtDisponibilidad);
        Button cambiar=(Button) findViewById(R.id.disponibilidad);
        if(item.isDisponibilidad())
        {
            txtDisponibilidad.setText("Disponible");
            cambiar.setText("Marcar como agotado");
        }
        else {
            txtDisponibilidad.setText("Agotado");
            cambiar.setText("Marcar como disponible");
        }

    }

    public void cambiarDisponibilidad(View view)
    {
        item.setDisponibilidad(!item.isDisponibilidad());
        setResult(RESULT_OK,intent);
        finish();
    }
}
