package accessingAnnotations;

import java.lang.annotation.Annotation;

@Author(name = "Gosho")
public class AuthoredClass {
    public static void main(String[] args) {
        Class cl = AuthoredClass.class;
        Annotation[] annotations = cl.getAnnotations();
        for (Annotation annotation : annotations) {
            if (annotation.annotationType().equals(Author.class)) {
                Author author = (Author) annotation;
                System.out.println(author.name());
            }
        }
    }
}




/*
package accessingAnnotations;

@Author(name = "Gosho")
public class AuthorClass {
    public static void main(String[] args) {
        Class cl = AuthorClass.class;
        Author author = (Author) cl.getAnnotation(Author.class);
        System.out.println(author.name());
    }
}


 */