package ru.ponomarev.tools;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.ponomarev.models.Role;
import ru.ponomarev.store.RoleDAO;
import ru.ponomarev.store.RoleStorage;
import ru.ponomarev.store.Storages;
import ru.ponomarev.store.UserStorage;
import ru.ponomarev.store.Storage;

import javax.transaction.Transactional;

/**
 * TODO: comment
 * @author parsentev
 * @since 30.05.2015
 */
public class DbTool {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        Storages storage = context.getBean(Storages.class);
        System.out.println(storage.roleStorage.values());
        storage.roleStorage.add(new Role());
    }
}