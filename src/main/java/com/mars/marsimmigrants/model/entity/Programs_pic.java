package com.mars.marsimmigrants.model.entity;

public class Programs_pic {
    private int programs_pic_id;
    private int programs_id;
    private  String programs_pic_address;

    public Programs_pic() {
    }

    public int getPrograms_pic_id() {
        return programs_pic_id;
    }

    public void setPrograms_pic_id(int programs_pic_id) {
        this.programs_pic_id = programs_pic_id;
    }

    public int getPrograms_id() {
        return programs_id;
    }

    public void setPrograms_id(int programs_id) {
        this.programs_id = programs_id;
    }

    public String getPrograms_pic_address() {
        return programs_pic_address;
    }

    public void setPrograms_pic_address(String programs_pic_address) {
        this.programs_pic_address = programs_pic_address;
    }

    public Programs_pic(int programs_pic_id, int programs_id, String programs_pic_address) {
        this.programs_pic_id = programs_pic_id;
        this.programs_id = programs_id;
        this.programs_pic_address = programs_pic_address;


    }
}
