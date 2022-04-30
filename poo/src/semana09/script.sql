create database java
use java
create table departamentos (
codigo int primary key,
nome varchar(50)
)
create table funcionarios(
codigo int primary key,
nome varchar(50),
salario money,
departamento int foreign key references departamentos(codigo)
)

insert departamentos values(1,'RH')
insert departamentos values(2,'Compras')
insert departamentos values(3,'Vendas')
insert funcionarios values(1,'Ana', 1000, 1)
insert funcionarios values(2,'Bia', 1000, 2)
insert funcionarios values(3,'Carlos', 1000, 3)
insert funcionarios values(4,'Denise', 1000, 3)
insert funcionarios values(5,'Euder', 1000, 3)

select * from funcionarios
select * from departamentos