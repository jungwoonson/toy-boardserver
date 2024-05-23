### TABLE CREATE QUERY
```sql
create table user (
    id int primary key auto_increment,
    userId varchar(50),
    password varchar(2000),
    nickname varchar(50),
    status varchar(50),
    isAdmin tinyint,
    isWithDraw tinyint,
    createTime datetime,
    updateTime datetime
);

create table category (
    id int primary key auto_increment,
    name varchar(50)
);

create table post (
    id int primary key auto_increment,
    name varchar(50),
    isAdmin tinyint,
    contents varchar(500),
    crateTime datetime,
    views int,
    categoryId int,
    userId int,
    FOREIGN KEY(categoryId) REFERENCES category(id),
    FOREIGN KEY(userId) REFERENCES user(id)
);
```
