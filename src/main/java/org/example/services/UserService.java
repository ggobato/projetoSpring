package org.example.services;

import org.example.entities.User;
import org.example.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;


    //retorna todos os users
    public List<User> findAll() {
        return repository.findAll();
    }

    //retorna o user pelo id
    public Optional<User> findById(Long id) {
        return repository.findById(id);
    }

    //inserir user
    public User insert(User user) {
        return repository.save(user);
    }

    //deletar user
    public void delete(Long id) {
        repository.deleteById(id);
    }

    //update user - atualizar user
    public boolean update(Long id, User user) {
        Optional<User> optional = repository.findById(id);
        if (optional.isPresent()) {
            User user1 = optional.get();
            user1.setName(user.getName());
            user1.setAge(user.getAge());
            repository.save(user1);
            return true;
        }
        return false;
    }
}
