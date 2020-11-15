package com.ruike.pojo;

/**
 * @author 吴泽胜
 * @FileName Student
 * @date 2020-11-14 5:51 下午
 * @Software: IntelliJ IDEA
 */

public class Student {

    private Integer id;
    private String nickName;
    private String student_id;
    private String password;
    private String gender;
    private String age;
    private String Class;
    private String major;
    private String college;
    private String start_school;
    private String address;
    private String iphone;
    private String student_status;
    private String idCard;
    private String guardian_name;
    private String guardian_iphone;
    private String release_time;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", nickName='" + nickName + '\'' +
                ", student_id='" + student_id + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                ", Class='" + Class + '\'' +
                ", major='" + major + '\'' +
                ", college='" + college + '\'' +
                ", start_school='" + start_school + '\'' +
                ", address='" + address + '\'' +
                ", iphone='" + iphone + '\'' +
                ", student_status='" + student_status + '\'' +
                ", idCard='" + idCard + '\'' +
                ", guardian_name='" + guardian_name + '\'' +
                ", guardian_iphone='" + guardian_iphone + '\'' +
                ", release_time='" + release_time + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getClass_() {
        return Class;
    }

    public void setClass_(String aClass) {
        Class = aClass;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getStart_school() {
        return start_school;
    }

    public void setStart_school(String start_school) {
        this.start_school = start_school;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIphone() {
        return iphone;
    }

    public void setIphone(String iphone) {
        this.iphone = iphone;
    }

    public String getStudent_status() {
        return student_status;
    }

    public void setStudent_status(String student_status) {
        this.student_status = student_status;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getGuardian_name() {
        return guardian_name;
    }

    public void setGuardian_name(String guardian_name) {
        this.guardian_name = guardian_name;
    }

    public String getGuardian_iphone() {
        return guardian_iphone;
    }

    public void setGuardian_iphone(String guardian_iphone) {
        this.guardian_iphone = guardian_iphone;
    }

    public String getRelease_time() {
        return release_time;
    }

    public void setRelease_time(String release_time) {
        this.release_time = release_time;
    }
}
