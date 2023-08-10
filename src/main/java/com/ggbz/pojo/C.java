package com.ggbz.pojo;

public class C {
    private String cno;
    private String cname;
    private String teacher;
    private Integer credit;

    public C() {
    }

    public C(String cno, String cname, String teacher, Integer credit) {
        this.cno = cno;
        this.cname = cname;
        this.teacher = teacher;
        this.credit = credit;
    }

    /**
     * 获取
     * @return cno
     */
    public String getCno() {
        return cno;
    }

    /**
     * 设置
     * @param cno
     */
    public void setCno(String cno) {
        this.cno = cno;
    }

    /**
     * 获取
     * @return cname
     */
    public String getCname() {
        return cname;
    }

    /**
     * 设置
     * @param cname
     */
    public void setCname(String cname) {
        this.cname = cname;
    }

    /**
     * 获取
     * @return teacher
     */
    public String getTeacher() {
        return teacher;
    }

    /**
     * 设置
     * @param teacher
     */
    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    /**
     * 获取
     * @return credit
     */
    public Integer getCredit() {
        return credit;
    }

    /**
     * 设置
     * @param credit
     */
    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public String toString() {
        return "C{cno = " + cno + ", cname = " + cname + ", teacher = " + teacher + ", credit = " + credit + "}";
    }
}
