package ru.neoflex.ec.project.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.neoflex.ec.project.entity.CustomerEntity;
import ru.neoflex.ec.project.repository.CustomerRepository;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerEntity find(Long id){
        return customerRepository.find(id);
    }
}
