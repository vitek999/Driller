package ru.srtdevs.driller;

import android.support.v4.app.Fragment;

/**
 * Created by виктор on 04.11.2017.
 */

public class NewProjectActivity extends SingleFragmentActivity{
    @Override
    protected Fragment createFragment() {
        return new NewProjectFragment();
    }
}
