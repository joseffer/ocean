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
    
    create table Vendas(
    idVenda int NOT NULL AUTO_INCREMENT,
    itensVenda varchar(500),
    dataVenda varchar(30),
    valor float,
    unique(idVenda)
    );
    
    create table VendaCombustivel(
    idVendaComb int NOT NULL AUTO_INCREMENT,
    idCombustivel int,
    qtdLitros float,
    valorTotal float,
    unique( idVendaComb)
    );
    
    

select * from produto
select * from Funcionario
