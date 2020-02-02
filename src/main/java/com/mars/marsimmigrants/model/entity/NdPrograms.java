package com.mars.marsimmigrants.model.entity;

/**
 * @version V1.0
 * @Project: mars_immigrants
 * @Package com.mars.marsimmigrants.model.entity
 * @author杨帆
 * @date 2020/1/28 11:58 星期二
 */
public class NdPrograms {
    //项目ID
    private int program_id;
    //项目标题
    private String program_title;
    //项目内容
    private String program_content;
    //项目备注
    private String program_comment;

    public int getProgram_id() {
        return program_id;
    }

    public void setProgram_id(int program_id) {
        this.program_id = program_id;
    }

    public String getProgram_title() {
        return program_title;
    }

    public void setProgram_title(String program_title) {
        this.program_title = program_title;
    }

    public String getProgram_content() {
        return program_content;
    }

    public void setProgram_content(String program_content) {
        this.program_content = program_content;
    }

    public String getProgram_comment() {
        return program_comment;
    }

    public void setProgram_comment(String program_comment) {
        this.program_comment = program_comment;
    }
}
