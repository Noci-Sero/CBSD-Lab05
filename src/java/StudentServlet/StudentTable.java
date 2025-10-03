/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentServlet;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Noci-Sero
 */
public class StudentTable {
    public static void insertStudent(Student pupil) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("StudentAppServletPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(pupil);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    public static void updateStudent(Student pupil) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("StudentAppServletPU");
        EntityManager em = emf.createEntityManager();
        Student fromDb = em.find(Student.class, pupil.getStudentid());
        fromDb.setStudentname(pupil.getStudentname());
        fromDb.setGpa(pupil.getGpa());
        em.getTransaction().begin();
        try {
            em.persist(fromDb);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    public static Student findStudentById(Integer id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("StudentAppServletPU");
        EntityManager em = emf.createEntityManager();
        Student pupil = em.find(Student.class, id);
        em.close();
        return pupil;
    }

    public static List<Student> findAllStudent() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("StudentAppServletPU");
        EntityManager em = emf.createEntityManager();
        List<Student> pupilList = (List<Student>) em.createNamedQuery("Student.findAll").getResultList();
        em.close();
        return pupilList;
    }

    public static List<Student> findStudentByName(String name) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("StudentAppServletPU");
        EntityManager em = emf.createEntityManager();
        Query query = em.createNamedQuery("Student.findByName");
        query.setParameter("name", name);
        List<Student> pupilList = (List<Student>) query.getResultList();
        em.close();
        return pupilList;
    }

    public static void removeStudent(Student pupil) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("StudentAppServletPU");
        EntityManager em = emf.createEntityManager();
        Student fromDb = em.find(Student.class, pupil.getStudentid());
        em.getTransaction().begin();
        try {
            em.remove(fromDb);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
}
