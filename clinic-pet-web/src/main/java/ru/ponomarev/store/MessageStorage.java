package ru.ponomarev.store;

/**
 * Created by oleg on 26.08.16.
 */

import org.springframework.stereotype.Repository;
import ru.ponomarev.models.Message;
import ru.ponomarev.models.Role;

import java.util.Collection;

/**
 * TODO: comment
 * @author parsentev
 * @since 30.05.2015
 */
@Repository
public class MessageStorage implements Storage<Message> {

    @Override
    public Collection<Message> values() {
        return null;
    }

    @Override
    public int add(Message user) {
        return 0;
    }

    @Override
    public void edit(Message user) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Message get(int id) {
        return null;
    }

    @Override
    public Message findByLogin(String login) {
        return null;
    }

    @Override
    public int generateId() {
        return 0;
    }

    @Override
    public void close() {

    }
}