package app.domain.entities;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
@Table(name = "teachers")
public class Teacher extends Person {

    private String degree;

    private Student student;

    public Teacher(){
    }
    public Teacher(String firstName, String lastName, String degree){
        super(firstName,lastName);
        setDegree(degree);
    }


    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }


}




















