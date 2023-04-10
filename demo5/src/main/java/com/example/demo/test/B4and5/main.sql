create table KiemTra(
                        username varchar(255),
                        avatar varchar(200),
                        email varchar(100),
                        fullname varchar(100),
                        updated_at timestamp,
                        status tinyint(1),
                        source varchar(15),
                        password varchar(150)
)

select * from kiemtra ;

insert into kiemtra
(username, avatar, email, fullname, updated_at, status, source, password)
values ("dung","images","email","hadung",timestamp,,"status","123");