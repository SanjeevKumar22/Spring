package com.springcore;

import lombok.*;

public class Student {
    private int studentId;
    private String studentName;
    private String studentAddress;

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "Student(studentId=" + this.getStudentId() + ", studentName=" + this.getStudentName() + ", studentAddress=" + this.getStudentAddress() + ")";
    }

    @SuppressWarnings("all")
    public Student(final int studentId, final String studentName, final String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    @SuppressWarnings("all")
    public Student() {
    }

    @SuppressWarnings("all")
    public int getStudentId() {
        return this.studentId;
    }

    @SuppressWarnings("all")
    public String getStudentName() {
        return this.studentName;
    }

    @SuppressWarnings("all")
    public String getStudentAddress() {
        return this.studentAddress;
    }

    @SuppressWarnings("all")
    public void setStudentId(final int studentId) {
        this.studentId = studentId;
    }

    @SuppressWarnings("all")
    public void setStudentName(final String studentName) {
        this.studentName = studentName;
    }

    @SuppressWarnings("all")
    public void setStudentAddress(final String studentAddress) {
        this.studentAddress = studentAddress;
    }
}
