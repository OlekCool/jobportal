package com.sasha.jobportal.services;

import com.sasha.jobportal.entity.UsersType;
import com.sasha.jobportal.repository.UsersTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersTypeService {

    private final UsersTypeRepository usersTypeRepository;

    @Autowired
    public UsersTypeService(UsersTypeRepository usersTypeRepository) {
        this.usersTypeRepository = usersTypeRepository;
    }

    public List<UsersType> getAll() {
        return usersTypeRepository.findAll();
    }

}
