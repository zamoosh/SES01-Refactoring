package domain;

import java.util.Date;

public class CSE {
    private Course course;
    private Integer section = 1;
    private Date examDate;

    public CSE(Course course) {
        this.course = course;
    }

    public CSE(Course course, Date examDate) {
        this.course = course;
        this.examDate = examDate;
    }

    public CSE(Course course, Date examDate, Integer section) {
        this.course = course;
        this.section = section;
        this.examDate = examDate;
    }

    public Course getCourse() {
        return course;
    }

    public Date getExamTime() {
        return examDate;
    }

    public Integer getSection() {
        return section;
    }

    @Override
    public String toString() {
        return course.getName() + " - " + section;
    }
}
