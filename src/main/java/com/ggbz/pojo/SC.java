package com.ggbz.pojo;

public class SC {
    private String sno;
    private String cno;
    private Integer grade;

    public SC() {
    }

    public SC(String sno, String cno, Integer grade) {
        this.sno = sno;
        this.cno = cno;
        this.grade = grade;
    }

    /**
     * 获取
     * @return sno
     */
    public String getSno() {
        return sno;
    }

    /**
     * 设置
     * @param sno
     */
    public void setSno(String sno) {
        this.sno = sno;
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
     * @return grade
     */
    public Integer getGrade() {
        return grade;
    }

    /**
     * 设置
     * @param grade
     */
    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String toString() {
        return "SC{sno = " + sno + ", cno = " + cno + ", grade = " + grade + "}";
    }
}
