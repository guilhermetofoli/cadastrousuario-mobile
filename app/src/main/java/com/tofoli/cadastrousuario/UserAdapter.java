package com.tofoli.cadastrousuario;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

//Classe Adapter: Gerencia a criação e o preenchimento dos itens na RecycleView
public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {
    //Atributo privado que armazena a referência dos dados que serão exibidos
    private List<String> ListaUsuarios;

    //Construtor que permite que a MainActivity "entregue" a lista de dados para este Adapter
    public UserAdapter(List<String> lista){

    }

}
