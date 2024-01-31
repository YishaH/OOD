package org.example;

import java.util.Date;

public class Student {
    private final String studentId;
    private final String pwd;
    private final String studentName;
    private final String email;
    private final String phone;
    private final String address;
    private final Date birthDay;
    private final Enum gender;

    private Student(Builder builder) {
        this.studentId = builder.studentId;
        this.pwd = builder.pwd;
        this.studentName = builder.studentName;
        this.email = builder.email;
        this.phone = builder.phone;
        this.address = builder.address;
        this.birthDay = builder.birthDay;
        this.gender = builder.gender;
    }
    
    public static class Builder {
        private String studentId;
        private String pwd;
        private String studentName;
        private String email;
        private String phone;
        private String address;
        private Date birthDay;
        private Enum gender;
        public Builder(String studentId, String pwd) {
            this.studentId = studentId;
            this.pwd = pwd;
        }

        public Builder setStudentName(String studentName) {
            this.studentName = studentName;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setBirthDay(Date birthDay) {
            this.birthDay = birthDay;
            return this;
        }

        public Builder setGender(Enum gender) {
            this.gender = gender;
            return this;
        }
        public Student build() {
            return new Student(this);
        }
    }

    public Builder toBuilder() {
        return new Builder(studentId, pwd).setStudentName(studentName)
                .setEmail(email).setAddress(address).setGender(gender).setPhone(phone)
                .setBirthDay(birthDay);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", pwd='" + pwd + '\'' +
                ", studentName='" + studentName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", birthDay=" + birthDay +
                ", gender=" + gender +
                '}';
    }
}
