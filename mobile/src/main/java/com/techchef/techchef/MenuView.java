package com.techchef.techchef;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Outline;
import android.os.Build;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.Button;
import android.widget.Toast;


public class MenuView extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void showOrderView(View v)
    {
        CardView cardView = (CardView)findViewById(R.id.order_content);
        cardView.setVisibility(View.VISIBLE);
    }

    public void hideOrderContentView(View v)
    {
        CardView cardView = (CardView)findViewById(R.id.order_content);
        cardView.setVisibility(View.GONE);
    }

    public void customerPlaceOrder(View v)
    {
        Intent intent = new Intent(this,CustomerOrderView.class);
        startActivity(intent);

    }
}
