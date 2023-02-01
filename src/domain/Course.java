package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Course {
    private String id;
    private String name;
    private int units;
    private List<Course> prerequisites;

    public Course(String id, String name, int units) {
        this.id = id;
        this.name = name;
        this.units = units;
        prerequisites = new ArrayList<Course>();
    }

    public void addPre(Course c) {
        getPrerequisites().add(c);
    }

    public Course withPre(Course... pres) {
        prerequisites.addAll(Arrays.asList(pres));
        return this;
    }

    public List<Course> getPrerequisites() {
        return prerequisites;
    }

    public String getName() {
        return name;
    }

    public int getUnits() {
        return units;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Course course = (Course) other;
        return Objects.equals(id, course.id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" {");
        for (var pre : getPrerequisites()) {
            sb.append(pre.getName());
            sb.append(", ");
        }
        sb.append("}");
        return sb.toString();
    }
}
