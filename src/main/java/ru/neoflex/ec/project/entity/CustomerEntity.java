package ru.neoflex.ec.project.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "customer", schema = "public")
@Getter
@Setter
@NoArgsConstructor
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String surname;

    @Column
    private String name;

    @Column
    private String patronymic;
}
