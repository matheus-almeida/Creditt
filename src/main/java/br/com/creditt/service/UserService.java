package br.com.creditt.service;

import br.com.creditt.models.User;
import br.com.creditt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;


    public void salvar(User usuario){
        repository.save(usuario);
    }

}
