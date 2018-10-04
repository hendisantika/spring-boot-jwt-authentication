package com.hendisantika.springbootjwtauthentication.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-jwt-authentication
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 05/10/18
 * Time: 04.56
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "roles")
@Data
@ToString
@EqualsAndHashCode
//@NoArgsConstructor
//@AllArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @NaturalId
    @Column(length = 60)
    private RoleName name;


    public Role(RoleName name) {
        this.name = name;
    }
}