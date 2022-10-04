package com.codeKonnects.libraryapi.models.users;

import com.codeKonnects.libraryapi.models.users.enums.ERole;
import lombok.*;

import javax.persistence.*;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ERole")
    @Enumerated(EnumType.STRING)
    private ERole name;
}
