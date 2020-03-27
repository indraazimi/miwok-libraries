package com.example.android.miwok;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class MainAdapter extends ArrayAdapter<Main> {

    public MainAdapter(@NonNull Context context, @NonNull List<Main> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_main, parent, false);
        }

        Main currentCategory = getItem(position);

        TextView textView = listItemView.findViewById(R.id.category_text_view);
        textView.setText(currentCategory.getCategory());
        textView.setBackgroundColor(currentCategory.getBackground());

        return listItemView;
    }
}