package ru.srtdevs.driller;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.util.Date;

/**
 * Created by виктор on 04.11.2017.
 */

public class NewProjectFragment extends Fragment {
    private Button mEnterButton;
    private Button mBackButton;
    private Button mStartDateButton;
    private EditText mShortTitleEditText;
    private EditText mFullTitleEditText;
    private EditText mArchiveNumberEditText;
    private EditText mRegionEditText;
    private EditText mNoteEditText;

    private static final String DIALOG_DATE = "DialogDate";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.new_project_fragment, container, false);

        mEnterButton = (Button) v.findViewById(R.id.enter_btn);

        mBackButton = (Button) v.findViewById(R.id.back_btn);
        mBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().onBackPressed();
            }
        });

        mStartDateButton = (Button) v.findViewById(R.id.start_date_btn);
        //temporarily
        Date dt = new Date();
        mStartDateButton.setText(dt.toString());
        //end temporarily

        mStartDateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager manager = getFragmentManager();
                DatePickerFragment dialog = new DatePickerFragment();
                dialog.show(manager,DIALOG_DATE);
            }
        });

        mShortTitleEditText = (EditText) v.findViewById(R.id.short_title_et);
        mFullTitleEditText = (EditText) v.findViewById(R.id.full_title_et);
        mArchiveNumberEditText = (EditText) v.findViewById(R.id.archive_number_et);
        mRegionEditText = (EditText) v.findViewById(R.id.region_et);
        mNoteEditText = (EditText) v.findViewById(R.id.note_et);

        return v;
    }
}
