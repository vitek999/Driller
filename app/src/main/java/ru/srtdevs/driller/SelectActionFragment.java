package ru.srtdevs.driller;

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
        mOpenProjectButton = (Button) v.findViewById(R.id.open_project_btn);
        mLoadProjectButton = (Button) v.findViewById(R.id.load_project_btn);
        mAppSettingsButton = (Button) v.findViewById(R.id.app_settings_btn);

        return v;
    }
}
