package com.example.eventapplication.ui;

public class Events {
    String EventId;
    String mTitle;
    String mstartdate;
    String menddate;
    String mstarttime;
    String mendtime;
    String mdescription;

    public Events(String eventId, String title, String startdate, String enddate, String starttime, String endtime, String description) {
        EventId = eventId;
        mTitle = title;
        this.mstartdate = startdate;
        this.menddate = enddate;
        this.mstarttime = starttime;
        this.mendtime = endtime;
        this.mdescription = description;
    }

    public Events(){}

    public String getEventId() {
        return EventId;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getStartdate() {
        return mstartdate;
    }

    public String getEnddate() {
        return menddate;
    }

    public String getStarttime() {
        return mstarttime;
    }

    public String getEndtime() {
        return mendtime;
    }

    public String getDescription() {
        return mdescription;
    }
}
