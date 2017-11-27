create database Posto;
use posto;

create table Produto(
	idProd int NOT NULL AUTO_INCREMENT,
	nome varchar(100),
	descricao varchar(200),
	fornecedor varchar(100),
	qtdArmazenada float,
    valor decimal(10,2),
	compra varchar(10),
    validade varchar (10),
    qtd_vendida float,
    maximo int,
	unique(IDProd)
);

insert into Produto(nome,descricao,fornecedor,qtdArmazenada,valor,compra,validade,maximo,qtd_vendida ) values ('Gasolina Comum','Gasolina tipo 1','Petrobras','900',2.99,'14/11/2017','14/11/2020','1000',0);
insert into Produto(nome,descricao,fornecedor,qtdArmazenada,valor,compra,validade,maximo,qtd_vendida ) values ('Gasolina Aditivada','Gasolina tipo 2','Petrobras','850',3.19,'14/11/2017','14/11/2020','1000',0);
insert into Produto(nome,descricao,fornecedor,qtdArmazenada,valor,compra,validade,maximo,qtd_vendida ) values ('Etanol','Alcool','Petrobras','900',1.89,'14/11/2017','14/11/2020','1000',0);
insert into Produto(nome,descricao,fornecedor,qtdArmazenada,valor,compra,validade,maximo,qtd_vendida ) values ('Diesel','Combustivel caminhão','Petrobras','900',2.89,'14/11/2017','14/11/2020','1000',0);
insert into Produto(nome,descricao,fornecedor,qtdArmazenada,valor,compra,validade,maximo,qtd_vendida ) values ('Diesel','Combustivel caminhão','Petrobras','900',2.89,'14/11/2017','14/11/2020','1000',0);

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
    
	create table Vendas(
    idVenda int NOT NULL AUTO_INCREMENT,
    itensVenda varchar(1000),
    dataVenda varchar(100),
	valor float,
    unique(idVenda)
    );
    
    create table VendaCombustivel(
    idVendaComb int NOT NULL AUTO_INCREMENT,
    nomeCombustivel varchar(100),
    qtdLitros float,
    valorTotal float,
    totalVendido float,
    dataVenda varchar(100),
    unique( idVendaComb)
    );
    
select * from produto;
select *from vendas;
select * from VendaCombustivel;