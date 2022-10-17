package com.rect.usermanagement.models;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author Mohamed ouokki on 10/17/22
 * @project user-management
 */


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private ERole name;

}
