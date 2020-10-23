package com.example.bipoderbondhu;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

public class CustomAdaptar extends BaseExpandableListAdapter {

    private Context context;
    List<String> list_data_header;
    HashMap<String,List<String>> list_data_chid;

    public CustomAdaptar(Context context, List<String> list_data_header, HashMap<String, List<String>> list_data_chid) {
        this.context = context;
        this.list_data_header = list_data_header;
        this.list_data_chid = list_data_chid;
    }

    @Override
    public int getGroupCount() {

        return list_data_header.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return list_data_chid.get(list_data_header.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return list_data_header.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return list_data_chid.get(list_data_header.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {

        String header = (String) getGroup(groupPosition);

        if (convertView==null){

            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.group_layout,null);

        }
        TextView textView = convertView.findViewById(R.id.my_ex_header);
        textView.setText(header);

        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {

        String child = (String) getChild(groupPosition, childPosition);

        if (convertView==null){

            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.child_layout,null);

        }
        TextView textView = convertView.findViewById(R.id.my_ex_child);
        textView.setText(child);

        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}
