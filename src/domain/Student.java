package domain;

import java.util.*;

public class Student {
    private String id;
    private String name;
    private Map<Term, Map<Course, Float>> transcript;
    private List<CourseSection> currentTerm;


    static class CourseSection {
        private Course course;
        private Integer section;

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

    public void takeCourse(Course course, Integer section) {
        for (var cs : currentTerm) {
            if (cs.course.equals(course) && cs.section.equals(section)) {
                System.out.println("Course already taken!");
                return;
            }
        }
        currentTerm.add(new CourseSection(course, section));
    }

    public void addTranscriptRecord(Course course, Term term, Float grade) {
        if (!transcript.containsKey(term))
            transcript.put(term, new HashMap<>());
        transcript.get(term).put(course, grade);
    }

    public Map<Term, Map<Course, Float>> getTranscript() {
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

    @Override
    public String toString() {
        return name;
    }
}
