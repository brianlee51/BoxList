package sg.edu.rp.c346.boxlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<ToDoBox> toDoBox;


    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<ToDoBox> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        toDoBox = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        ImageView ivBox = rowView.findViewById(R.id.imageViewBox);

        ToDoBox currentItem = toDoBox.get(position);

        String color = currentItem.getColor();

        if (color.equalsIgnoreCase("blue")){
            ivBox.setImageResource(R.drawable.blue_box);
        } else if (color.equalsIgnoreCase("Orange")){
            ivBox.setImageResource(R.drawable.orange_box);
        } else {
            ivBox.setImageResource(R.drawable.brown_box);
        }

        return rowView;
    }
}

