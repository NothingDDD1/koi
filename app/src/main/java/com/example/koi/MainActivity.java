package com.example.koi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.koi.modelo.CartList;
import com.example.koi.modelo.Item;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private CartList lista = CartList.getInstancia();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void verLista (View view)
    {
        ArrayList<Item> items=lista.getCartList();
        if(items.size()>0){
            Intent intent = new Intent(this, ItemListActivity.class);
            startActivity(intent);
        }

        else{
            Toast.makeText(this, "La lista de productos está vacía", Toast.LENGTH_SHORT).show();
        }
    }

    public void ingresarItem(View view){
        Intent intent = new Intent(this, NewItemActivity.class);
        startActivity(intent);
    }

    public void eliminarItem(View viwe){
        lista.eliminarItem();
        Toast.makeText(this, "La lista de productos está vacía", Toast.LENGTH_SHORT).show();
    }
}