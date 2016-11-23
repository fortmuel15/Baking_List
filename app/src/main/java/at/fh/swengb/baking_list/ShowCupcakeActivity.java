package at.fh.swengb.baking_list;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import at.fh.swengb.baking_list.model.Cupcake;

/**
 * Created by 2540p on 23.11.2016.
 */

public class ShowCupcakeActivity extends AppCompatActivity {

    private Cupcake cupcake;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_user);

        Intent intent = getIntent();
        cupcake = (Cupcake) intent.getExtras().get("cupcake");

        TextView viewName = (TextView) findViewById(R.id.textViewName);
        TextView viewTaste = (TextView) findViewById(R.id.textViewTaste);
        TextView viewCalories = (TextView) findViewById(R.id.textViewCalories);
        TextView viewCaseColor = (TextView) findViewById(R.id.textViewCaseColor);

        viewName.setText(cupcake.getName());
        viewTaste.setText(cupcake.getTaste());
        viewCalories.setText(cupcake.getCalories());
        viewCaseColor.setText(cupcake.getCaseColor());

    }

    public void showCal(View view) {
        // Map point based on address
        String calories = "Yes, that are REALLY the Calories!!! ";
        Button buttonCalories = (Button)findViewById(R.id.buttonCalories);
        buttonCalories.setText(calories);

    }

    /*public void call(View view) {
        Uri number = Uri.parse("tel:"+user.getPhoneNumber());
        Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
        startActivity(callIntent);
    }*/
}


