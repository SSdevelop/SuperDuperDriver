package com.udacity.jwdnd.course1.cloudstorage.model;

public class Note {
    private Integer noteid;
    private String notetitle;
    private String notedescription;
    private Integer userid;

    public Note(Integer noteid, String notetitle, String notedescription, Integer userid) {
        this.noteid = noteid;
        this.notetitle = notetitle;
        this.notedescription = notedescription;
        this.userid = userid;
    }

    public Note(String title, String description) {
        this.notetitle = title;
        this.notedescription = description;
    }

    public Integer getNoteid() { return this.noteid; }

    public void setNoteid(Integer noteid) { this.noteid = noteid; }

    public String getNotetitle() { return this.notetitle; }

    public void setNotetitle(String notetitle) { this.notetitle = notetitle; }

    public String getNotedescription() { return this.notedescription; }

    public void setNotedescription(String notedescription) { this.notedescription = notedescription; }

    public Integer getUserid() { return this.userid; }

    public void setUserid(Integer userid) { this.userid = userid; }
}
