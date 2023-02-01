package domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private String id;
    private String name;
    private Map<Term, Map<Course, Double>> transcript;
    private List<CourseSection> currentTerm;


    static class CourseSection {
        private Course course;
        private int section;

        CourseSection(Course course, int section) {
            this.course = course;
            this.section = section;
        }

        public Course getCourse() {
            return course;
        }

        public int getSection() {
            return section;
        }
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.transcript = new HashMap<>();
        this.currentTerm = new ArrayList<>();
    }

    public void takeCourse(Course c, int section) {
        currentTerm.add(new CourseSection(c, section));
    }

    public void addTranscriptRecord(Course course, Term term, double grade) {
        if (!transcript.containsKey(term))
            transcript.put(term, new HashMap<>());
        transcript.get(term).put(course, grade);
    }

    public Map<Term, Map<Course, Double>> getTranscript() {
        return transcript;
    }

    public List<CourseSection> getCurrentTerm() {
        return currentTerm;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }
}
