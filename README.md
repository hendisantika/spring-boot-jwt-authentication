# spring-boot-jwt-authentication

Run this project by this command :

`mvn clean spring-boot:run`

Check database tables ->

![Database Tables](img/db.png "Database Tables")

– Insert data to roles table ->
```
INSERT INTO roles(name) VALUES('ROLE_USER');
INSERT INTO roles(name) VALUES('ROLE_PM');
INSERT INTO roles(name) VALUES('ROLE_ADMIN');
```

![List Users & Roles](img/users.png "List User & ROles")

SignUp

Sign-Up 3 users:

* Naruto has ROLE_PM & ROLE_USER role
* Sasuke has ROLE_USER roles
* Kakashi has ROLE_ADMIN role

Naruto as User & PM

![Signup As User & PM](img/naruto.png "Signup as User & PM")

Sasuke as User

![Signup as User](img/sasuke.png "Signup as User")

Kakashi as Admin

![Signup as admin](img/kakashi.png "Signup as admin")