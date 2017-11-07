   create database Posto
use posto

create table Produto(
	idProd int NOT NULL AUTO_INCREMENT,
	nome varchar(100),
	descricao varchar(200),
	fornecedor varchar(100),
	qtdArmazenada float,
    valor float,
	compra varchar(10),
    validade varchar(10),
	unique(IDProd)
);

create table Funcionario(
	idFunc int NOT NULL AUTO_INCREMENT,
	nome varchar(100),
    endereco varchar(100),
    cargo varchar(100),
    salario float,
    rg varchar(12),
    cpf varchar(15),
    inss double,
  /*  data date, */
    login varchar(100),
    senha varchar(100),
    unique(IDFunc)
    );
    
create table Venda(
	idVenda int NOT NULL AUTO_INCREMENT,
    quantidade int,
    itens int,
    subtotal float,
	/*  data date, */
    idProd int,
    primary key (idVenda),
    foreign key (idProd) references Produto(idProd)
);
    
    
    drop table Funcionario
    drop table produto
select * from produto
