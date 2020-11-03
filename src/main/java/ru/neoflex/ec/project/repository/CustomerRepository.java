package ru.neoflex.ec.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import ru.neoflex.ec.project.entity.CustomerEntity;


@Component
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
    @Query(value = "select c.* from public.customer c where c.id = :id", nativeQuery = true)
    CustomerEntity find(@Param("id") Long id);
}
