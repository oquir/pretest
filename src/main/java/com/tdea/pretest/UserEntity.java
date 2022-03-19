package com.tdea.pretest;

import lombok.*;

import javax.persistence.*;


@Entity
@Table(name = "users")
@Data
@Generated
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;
    private String password;

}
