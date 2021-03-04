package com.melisavierarivas.listviewusuarios;

import android.app.Activity;
import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptadorUsuario  extends BaseAdapter {
    private Context context;
    private ArrayList<ClaseUsuario> listaClaseUsuarios;
    private LayoutInflater inflater;

    public AdaptadorUsuario(Activity context, ArrayList<ClaseUsuario> listaClaseUsuarios) {
        this.context = context;
        this.listaClaseUsuarios = listaClaseUsuarios;
        inflater = LayoutInflater.from(context);
    }
    static class ViewHolder {
        TextView nombre;
        TextView apellido;
        TextView numero;
        TextView email;
        ImageView imageView;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;

        if (convertView == null) {

            convertView = inflater.inflate(R.layout.usuario, null);
            holder = new ViewHolder();
            holder.nombre = (TextView)convertView.findViewById(R.id.tvNombre);
            holder.apellido = (TextView)convertView.findViewById(R.id.tvApellido);
            holder.numero = (TextView)convertView.findViewById(R.id.tvNumero);
            holder.email = (TextView) convertView.findViewById(R.id.tvEmail);
            holder.imageView = (ImageView) convertView.findViewById(R.id.imageView);
            convertView.setTag(holder);
        }

        else {
            holder = (ViewHolder) convertView.getTag();
        }
        ClaseUsuario claseUsuario = listaClaseUsuarios.get(position);
        holder.nombre.setText(claseUsuario.getNombre());
        holder.apellido.setText(claseUsuario.getApellido());
        holder.numero.setText(claseUsuario.getNumero());
        holder.email.setText(claseUsuario.getEmail());
        holder.imageView.setImageResource(claseUsuario.getImagen());

        return convertView;
    }
    @Override
    public int getCount() {
        return listaClaseUsuarios.size();
    }
    @Override
    public Object getItem(int posicion) {
        return listaClaseUsuarios.get(posicion);
    }
    @Override
    public long getItemId(int posicion) {
        return posicion;
    }
}
