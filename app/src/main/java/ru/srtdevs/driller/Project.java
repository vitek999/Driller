package ru.srtdevs.driller;

import java.util.Date;
import java.util.UUID;

/**
 * Created by виктор on 05.11.2017.
 */

public class Project {
    private UUID mId;
    private String mShortTitle;
    private String mFullTitle;
    private String mArchiveNumber;
    private String mNote;
    private Date mStartDate;
    private int mRegion;

    public Project(){
        mId = UUID.randomUUID();
    }
}
