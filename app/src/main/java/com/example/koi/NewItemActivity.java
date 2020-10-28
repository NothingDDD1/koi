package com.example.koi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.koi.modelo.CartList;
import com.example.koi.modelo.Item;

public class NewItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_item);
    }

    public void ingresarItem(View view) {
        String nombre = ((TextView) findViewById(R.id.ingresarNombre)).getText().toString();

        String precioStr = ((TextView) findViewById(R.id.ingresarPrecio)).getText().toString();

        String cantidadStr =
                ((TextView) findViewById(R.id.ingresarCantidad)).getText().toString();


        int cantidad = 0;
        int precio = 0;

        try {
            cantidad = Integer.parseInt(cantidadStr);
            precio = Integer.parseInt(precioStr);

        } catch (NumberFormatException ex) {
            Toast.makeText(this, "Ingrese un número en la cantidad",
                    Toast.LENGTH_SHORT).show();
        }
        if (cantidad > 0) {
            Item item = new Item(nombre, precio, cantidad);
            CartList cartList = CartList.getInstancia();
            cartList.agregarItem(item);
            finish();
        } else {
            Toast.makeText(this, "La cantidad debe ser mayor a cero",
                    Toast.LENGTH_SHORT).show();
        }
    }}

