package com.csi.dao;

import com.csi.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDaoImpl implements  UserDao{

    private static SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();

    @Override
    public void signUp(User user) {

        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();

        session.save(user);

        transaction.commit();
    }

    @Override
    public boolean signIn(String userEmailId, String userPassword) {

        boolean status= false;

        Session session = factory.openSession();

        List<User> userList = session.createQuery("from User").list();

        for(User user: userList){
            if (user.getUserEmailId().equals(userEmailId) && user.getUserPassword().equals(userPassword)) {

                status=true;
            }
        }
        return status;
    }
}
