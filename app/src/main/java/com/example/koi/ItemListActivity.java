package com.example.koi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.example.koi.modelo.CartList;
import com.example.koi.modelo.Item;

import java.util.List;

public class ItemListActivity extends ListActivity {

    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        cargarLista();
    }

    public void cargarLista() {
        lista=getListView();
        List<Item> itemList= CartList.getInstancia().getCartList();
        ArrayAdapter<Item> listaAdapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, itemList);

        lista.setAdapter(listaAdapter);

        };


    @Override
    public void onListItemClick(ListView listView, View view, int posicion, long id){
        Intent intent=new Intent(ItemListActivity.this,DetailsActivity.class);
        intent.putExtra("idItem",(int)id);
        startActivityForResult(intent,1);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1){
            if(resultCode==RESULT_OK){
                cargarLista();
            }
        }
    }

}