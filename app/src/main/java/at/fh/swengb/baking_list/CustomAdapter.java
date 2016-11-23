package at.fh.swengb.baking_list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import at.fh.swengb.baking_list.model.Cupcake;

/**
 * Created by 2540p on 23.11.2016.
 */

public class CustomAdapter extends BaseAdapter {

    List<Cupcake> listCupcakes;
    Context context;
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, List<Cupcake> listUsers) {
        this.context = applicationContext;
        this.listCupcakes= listUsers;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return listCupcakes.size();
    }

    @Override
    public Object getItem(int i) {
        return listCupcakes.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null) {
            view = inflter.inflate(R.layout.row_item, null);//set layout for displaying items
        }
        TextView viewName=(TextView)view.findViewById(R.id.textViewName);
        TextView viewTaste=(TextView)view.findViewById(R.id.textViewTaste);
        TextView viewCalories=(TextView)view.findViewById(R.id.textViewCalories);
        TextView viewCaseColor=(TextView)view.findViewById(R.id.textViewCaseColor);

        Cupcake cupcake = listCupcakes.get(i);
        viewName.setText(cupcake.getName());
        viewTaste.setText(cupcake.getTaste());
        viewCalories.setText(cupcake.getCalories());
        viewCaseColor.setText(cupcake.getCaseColor());

        return view;
    }
}
