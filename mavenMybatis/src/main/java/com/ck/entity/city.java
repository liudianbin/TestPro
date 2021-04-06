package com.ck.entity;

/**
 * created  on 2021/3/29 10:43
 */
public class city {
    private int cid;
    private String cname;

    @Override
    public String toString() {
        return "city{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                '}';
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public city() {
    }

    public city(int cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }
}
