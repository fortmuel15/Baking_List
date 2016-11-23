package at.fh.swengb.baking_list;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import at.fh.swengb.baking_list.model.Cupcake;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private List<Cupcake> listCupcakes;
    private ListView myListView;
    private CustomAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listCupcakes = new ArrayList<>();
        listCupcakes.add(new Cupcake("Chocolatemuffin","chocolaty","354","red"));
        listCupcakes.add(new Cupcake("Strawberrymuffin","strawberrily","456","pink"));
        listCupcakes.add(new Cupcake("Fitnessmuffin","healthy","250","green"));
        listCupcakes.add(new Cupcake("Christmasmuffin","christmasly","560","red"));
        listCupcakes.add(new Cupcake("Cheesecakemuffin","cheeesily","550","orange"));


        myListView = (ListView) findViewById(R.id.myCupcakeList);

        myAdapter = new CustomAdapter(this, listCupcakes);

        myListView.setAdapter(myAdapter);

        myListView.setOnItemClickListener(this);






    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Cupcake selectedCupcake = listCupcakes.get(i);
        Intent intent = new Intent(view.getContext(),ShowCupcakeActivity.class);
        intent.putExtra("cupcake",selectedCupcake);
        startActivity(intent);

    }
}
