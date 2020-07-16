package app.domain.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "students")
public class Student extends Person {

    private int grade;

    private Set<Project> projects;

    public Student(){

    }
    public Student(String firstName, String lastName, int grade){
       super(firstName,lastName);
       setGrade(grade);
    }

    @Column
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    // Make a new table
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "students_projects",
            joinColumns = @JoinColumn(name = "student_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "project_id", referencedColumnName = "id"))

    public Set<Project> getProjects(){
        return this.projects;
    }
    public void setProjects(Set<Project> projects){
        this.projects = projects;
    }
}






/*
@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "students_projects",
            joinColumns = @JoinColumn(name = "student_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "project_id",referencedColumnName = "id"))
    public Set<Project> getProjects(){
        return this.projects;
    }
 */