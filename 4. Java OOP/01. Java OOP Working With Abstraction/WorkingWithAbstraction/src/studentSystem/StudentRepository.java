package studentSystem;

public interface StudentRepository {
    /**
     * Check whether repo contains student with given name
     *
     * @param name of the student to look for
     * @return true is student is found, false otherwise
     */
    boolean containsStudentWith(String name);

    /**
     * Given a student name, return the student from teh repository.
     *
     * @param name of the student to fetch.
     * @return the student with the given name if found.
     * null if not present.
     */
    Student fetchBy(String name);

    /**
     * Add student to the repository.
     *
     * @param student to be persisted.
     */
    void save(Student student);
}
