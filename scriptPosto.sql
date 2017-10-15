   create database Posto
use Posto

create table Produto(
	IDProd int NOT NULL AUTO_INCREMENT,
	nome varchar(100),
	descricao varchar(200),
	fornecedor varchar(100),
	qtdArmazenada float,
    valor float,
	unique(IDProd)
);

create table Funcionario(
	IDFunc int NOT NULL AUTO_INCREMENT,
	nome varchar(100),
    endereco varchar(100),
    cargo varchar(100),
    salario float,
    rg varchar(12),
    cpf varchar(15),
    inss double,
  /*  data date, */
    login varchar(100),
    Senha varchar(100),
    unique(IDFunc)
    );
    
    drop table Funcionario
