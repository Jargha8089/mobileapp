package com.example.mobileapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ProductListAdapter extends BaseAdapter {
    List<Product> productList = new ArrayList<>();
    Context mContext;

    ProductListAdapter(List<Product> dataList, Context context) {
        this.productList = dataList;
        this.mContext = context;

    }

    @Override
    public int getCount() {
        return productList.size();
    }

    @Override
    public Object getItem(int position) {
        return productList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View view = layoutInflater.inflate(R.layout.adapte_product_item, null);
        ProductVH holder = new ProductVH(view);
        holder.txtProductTitle.setText(productList.get(position).getTitle());
        holder.txtProductDescription.setText(productList.get(position).getDescription());
        holder.txtProductUnit.setText(productList.get(position).getUnit());
        holder.txtProductPrice.setText(productList.get(position).getPrice());
        holder.imgProduct.setImageDrawable(mContext.getResources().getDrawable(productList.get(position).getImage()));
        return view;
    }

    public class ProductVH {
        private TextView txtProductTitle, txtProductDescription, txtProductUnit, txtProductPrice;
        private ImageView imgProduct;

        ProductVH(View view) {
            txtProductTitle = view.findViewById(R.id.txtProductTitle);
            txtProductDescription = view.findViewById(R.id.txtProductDescription);
            txtProductUnit = view.findViewById(R.id.txtProductUnit);
            txtProductPrice = view.findViewById(R.id.txtProductPrice);
            imgProduct = view.findViewById(R.id.imgProduct);
        }
    }
}
