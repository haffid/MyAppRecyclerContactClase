package com.haffid.myapprecyclerfoodclase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<DatosVO> listaVO = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerId);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        this.insertarDatos();

        AdaptadorRecycler adaptadorRecycler = new AdaptadorRecycler(listaVO);
        recyclerView.setAdapter(adaptadorRecycler);

    }

    public void insertarDatos(){

        listaVO.add(new DatosVO("Abigail Espina", 57458912, R.drawable.ic_contactom));
        listaVO.add(new DatosVO("Heydy Martinez", 57126347, R.drawable.ic_contactom));
        listaVO.add(new DatosVO("Omar Espina", 54789678, R.drawable.ic_contacto));
        listaVO.add(new DatosVO("Edy Espina", 55879641, R.drawable.ic_contacto));
        listaVO.add(new DatosVO("Grace Martinez", 53414578, R.drawable.ic_contactom));

        listaVO.add(new DatosVO("Intecap", 1565, R.drawable.ic_contactoi));
        listaVO.add(new DatosVO("Trabajo", 247896341, R.drawable.ic_contacto));
        listaVO.add(new DatosVO("Hamburguesas", 24789634, R.drawable.ic_contacto));
        listaVO.add(new DatosVO("Pollo", 47586932, R.drawable.ic_contacto));
        listaVO.add(new DatosVO("Pizza", 46478963, R.drawable.ic_contacto));

    }
}