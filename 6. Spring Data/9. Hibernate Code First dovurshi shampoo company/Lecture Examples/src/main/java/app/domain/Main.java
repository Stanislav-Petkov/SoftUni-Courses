package app.domain;

import app.domain.entities.Project;
import app.domain.entities.Student;
import app.domain.entities.Teacher;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence
                .createEntityManagerFactory("codeFirst");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Student student = new Student("Gosho", "Georgiev", 8);


//        Set<Project> projects = new HashSet<>();
//
//        Project project = new Project("Math");
//        Project project1 = new Project("Science");
//        Project project2 = new Project("Biology");
//        Project project3 = new Project("Chemistry");
//
//        projects.add(project);
//        projects.add(project1);
//        projects.add(project2);
//        projects.add(project3);
//
//        student.setProjects(projects);
//
//        entityManager.getTransaction().begin();
//        entityManager.persist(student);
//        entityManager.getTransaction().commit();

        Project project12 = entityManager.find(Project.class, 1);
        entityManager.close();

    }
}

















