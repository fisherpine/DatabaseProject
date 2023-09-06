package com.ggbz.pojo;

public class Student {
    private String sno;
    private String sname;
    private String sex;
    private Integer age;
    private String dept;


    public Student() {
    }

    public Student(String sno, String sname, String sex, Integer age, String dept) {
        this.sno = sno;
        this.sname = sname;
        this.sex = sex;
        this.age = age;
        this.dept = dept;

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
     * @return sname
     */
    public String getSname() {
        return sname;
    }

    /**
     * 设置
     * @param sname
     */
    public void setSname(String sname) {
        this.sname = sname;
    }

    /**
     * 获取
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取
     * @return dept
     */
    public String getDept() {
        return dept;
    }

    /**
     * 设置
     * @param dept
     */
    public void setDept(String dept) {
        this.dept = dept;
    }




    public String toString() {
        return "Student{sno = " + sno + ", sname = " + sname + ", sex = " + sex + ", age = " + age + ", dept = " + dept + "}";
    }
}
