package ru.srtdevs.driller;

import android.support.v4.app.Fragment;

/**
 * Created by виктор on 05.11.2017.
 */

public class ProjectListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new ProjectListFragment();
    }
}
