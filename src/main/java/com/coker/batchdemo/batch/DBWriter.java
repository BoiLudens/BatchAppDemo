package com.coker.batchdemo.batch;

import com.coker.batchdemo.model.User;
import com.coker.batchdemo.repository.UserRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBWriter implements ItemWriter<User> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void write(List<? extends User> users) throws Exception {

        System.out.println("Data save for Users: " + users);
        userRepository.saveAll(users);
    }
}
