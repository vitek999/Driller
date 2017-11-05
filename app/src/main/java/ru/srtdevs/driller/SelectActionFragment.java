package ru.srtdevs.driller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by виктор on 04.11.2017.
 */

public class SelectActionFragment extends Fragment {
    private Button mNewProjectButton;
    private Button mOpenProjectButton;
    private Button mLoadProjectButton;
    private Button mAppSettingsButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.select_action_fragment, container, false);

        mNewProjectButton = (Button) v.findViewById(R.id.new_project_btn);
        mNewProjectButton.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), NewProjectActivity.class);
                startActivity(intent);
            }
        });

        mOpenProjectButton = (Button) v.findViewById(R.id.open_project_btn);
        mOpenProjectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), ProjectListActivity.class);
                startActivity(intent);
            }
        });

        mLoadProjectButton = (Button) v.findViewById(R.id.load_project_btn);
        mLoadProjectButton.setEnabled(false); //TODO: сделать активным при наличии открытого проекта

        mAppSettingsButton = (Button) v.findViewById(R.id.app_settings_btn);

        return v;
    }
}
