package com.pragma.powerup.plazoletamicroservice.domain.usecase;

import com.pragma.powerup.plazoletamicroservice.domain.api.IUserServicePort;
import com.pragma.powerup.plazoletamicroservice.domain.model.User;
import com.pragma.powerup.plazoletamicroservice.domain.spi.IUserPersistencePort;

import java.util.List;

public class UserUseCase implements IUserServicePort {
    private final IUserPersistencePort userPersistencePort;

    public UserUseCase(IUserPersistencePort userPersistencePort) {
        this.userPersistencePort = userPersistencePort;
    }


    @Override
    public void saveUser(User user) {
        userPersistencePort.saveUser(user);
    }

    @Override
    public void deleteUser(User user) {
        userPersistencePort.deleteUser(user);
    }

    @Override
    public List<User> getAllOwners(int page) {
        return userPersistencePort.getAllOwners(page);
    }

    @Override
    public List<User> getAllEmployees(int page) {
        return userPersistencePort.getAllEmployees(page);
    }

    @Override
    public List<User> getAllClients(int page) {
        return userPersistencePort.getAllClients(page);
    }

    @Override
    public User getOwner(Long id) {
        return userPersistencePort.getOwner(id);
    }

    @Override
    public User getEmployee(Long id) {
        return userPersistencePort.getEmployee(id);
    }

    @Override
    public User getClient(Long id) {
        return userPersistencePort.getClient(id);
    }

    @Override
    public User getUser(Long id) {
        return userPersistencePort.getUser(id);
    }
}
