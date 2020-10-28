package com.example.koi.modelo;

import java.util.ArrayList;

public class CartList {
    private static CartList instancia=new CartList();
    private ArrayList<Item> cartList;

    private CartList()
    {
        cartList=new ArrayList<>();

    }
    public static CartList getInstancia()
    {
        return instancia;
    }
    public void agregarItem(Item item)
    {
        cartList.add(item);
    }
    public Item getItem(int id)
    {
        return cartList.get(id);
    }
    public ArrayList<Item> getCartList()
    {
        return cartList;
    }
    public void eliminarItem()
    {
        for(int i=0; i<cartList.size(); i++)
        {
            if(cartList.get(i).isDisponibilidad()==false)
            {
                cartList.remove(i);
                i--;
            }
        }
    }
}
