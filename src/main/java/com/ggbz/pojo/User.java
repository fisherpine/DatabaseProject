package com.ggbz.pojo;

public class User {
    private String hm;
    private String pwd;
    private Integer role;

    public User() {
    }

    public User(String hm, String pwd, Integer role) {
        this.hm = hm;
        this.pwd = pwd;
        this.role = role;
    }

    /**
     * 获取
     * @return hm
     */
    public String getHm() {
        return hm;
    }

    /**
     * 设置
     * @param hm
     */
    public void setHm(String hm) {
        this.hm = hm;
    }

    /**
     * 获取
     * @return pwd
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * 设置
     * @param pwd
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * 获取
     * @return role
     */
    public Integer getRole() {
        return role;
    }

    /**
     * 设置
     * @param role
     */
    public void setRole(Integer role) {
        this.role = role;
    }

    public String toString() {
        return "User{hm = " + hm + ", pwd = " + pwd + ", role = " + role + "}";
    }
}
