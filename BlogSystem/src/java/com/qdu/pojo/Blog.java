package com.qdu.pojo;
// Generated 2017-7-31 11:30:17 by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.Date;

/**
 * Blog generated by hbm2java
 */
public class Blog  implements java.io.Serializable {


     private int pid;
     private String sid;
     private String majors;
     private String type;
     private Date date;
     private String blogtitle;
     private String blogDesc;

    public Blog() {
    }

	
    public Blog(int pid, String sid, String majors, String type, Date date, String blogtitle) {
        this.pid = pid;
        this.sid = sid;
        this.majors = majors;
        this.type = type;
        this.date = date;
        this.blogtitle = blogtitle;
    }
    public Blog(int pid, String sid, String majors, String type, Date date, String blogtitle,String blogDesc) {
       this.pid = pid;
       this.sid = sid;
       this.majors = majors;
       this.type = type;
       this.date = date;
       this.blogtitle = blogtitle;
       this.blogDesc = blogDesc;
    }
   
    public int getPid() {
        return this.pid;
    }
    
    public void setPid(int pid) {
        this.pid = pid;
    }
    public String getSid() {
        return this.sid;
    }
    
    public void setSid(String sid) {
        this.sid = sid;
    }
    public String getMajors() {
        return this.majors;
    }
    
    public void setMajors(String majors) {
        this.majors = majors;
    }
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    public String getBlogtitle() {
        return this.blogtitle;
    }
    
    public void setBlogtitle(String blogtitle) {
        this.blogtitle = blogtitle;
    }
    public String getBlogDesc() {
        return this.blogDesc;
    }
    
    public void setBlogDesc(String blogDesc) {
        this.blogDesc = blogDesc;
    }




}


