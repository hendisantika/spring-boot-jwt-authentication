package com.hendisantika.springbootjwtauthentication.repository;

import com.hendisantika.springbootjwtauthentication.entity.Role;
import com.hendisantika.springbootjwtauthentication.entity.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-jwt-authentication
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 05/10/18
 * Time: 04.59
 * To change this template use File | Settings | File Templates.
 */
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}