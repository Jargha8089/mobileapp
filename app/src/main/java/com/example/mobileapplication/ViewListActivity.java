package com.example.mobileapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ViewListActivity extends AppCompatActivity {

    private ListView listView;
    private ProductListAdapter adapter;
    private List<Product> productList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_list);
        findViews();
    }

    private void findViews(){
        listView = findViewById(R.id.listview);
        setData();
        adapter = new ProductListAdapter(productList, this);
        listView.setAdapter(adapter);
    }

    private void setData() {
        productList.clear();
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();
        Product p4 = new Product();

        p1.setTitle("26 cm Ring Fill Light With 7 Feet Stand and Mobile Holder");
        p1.setDescription("Product details of 26 cm Ring Fill Light With 7 Feet Stand and Mobile Holder");
        p1.setUnit("Pcs");
        p1.setPrice("899");
        p1.setImage(R.drawable.logo);

        p2.setTitle("YESPLUS 15 Watt Wireless Charger");
        p2.setDescription("Specs:Model:YS809\n" +
                "Input current: DC 5V/3A; 9V / 2.22");
        p2.setUnit("Pcs");
        p2.setPrice("1,299");
        p2.setImage(R.drawable.ic_category);

        p3.setTitle("Apple Earpods With Lightning Connector - EvoStore");
        p3.setDescription("Designed by Apple\n" +
                "Deeper, richer bass tones\n" +
                "Greater protection from sweat and water");
        p3.setUnit("Pcs");
        p3.setPrice("5,000");
        p3.setImage(R.drawable.ic_home);

        p4.setTitle("Apple AirPods Pro with MagSafe Charging Case");
        p4.setDescription("Active Noise Cancellation continuously adapts to the geometry of your ear and the fit of the eartips to keep you isolated from the world around you\n" +
                "Press and hold the force sensor on the stem to switch between Active Noise Cancellation and Transparency Mode, which allows outside sound in to keep you aware of your environment");
        p4.setUnit("Pcs");
        p4.setPrice("37,500");
        p4.setImage(R.drawable.ic_profile);

        productList.add(p1);
        productList.add(p2);
        productList.add(p3);
        productList.add(p4);

    }
}