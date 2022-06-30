CREATE TABLE VEMSER_PEDRO.PAIS (
  id_pais NUMBER(38,0) NOT NULL,
  "NOME" VARCHAR2(50) NOT NULL,
  PRIMARY KEY(id_pais)
);

CREATE SEQUENCE SEQ_PAIS
START WITH 1
INCREMENT BY 1

INSERT INTO VEMSER_PEDRO.PAIS(id_pais, "NOME")
VALUES(SEQ_PAIS.nextVal, 'Brasil');
INSERT INTO VEMSER_PEDRO.PAIS(id_pais, "NOME")
VALUES(SEQ_PAIS.nextVal, 'Ratanaba');


CREATE TABLE VEMSER_PEDRO.ESTADO (
  id_estado NUMBER(38,0) NOT NULL,
  id_pais NUMBER(38,0) NOT NULL,
  nome VARCHAR2(50) NOT NULL, 
  PRIMARY KEY(id_estado),
  CONSTRAINT FK_ID_PAIS FOREIGN KEY (ID_PAIS) REFERENCES VEMSER_PEDRO.PAIS (ID_PAIS)
);

CREATE SEQUENCE SEQ_ESTADO
START WITH 1
INCREMENT BY 1

INSERT INTO VEMSER_PEDRO.ESTADO(id_estado, id_pais, nome)
VALUES(SEQ_ESTADO.nextVal, 1, 'Amazonas');
INSERT INTO VEMSER_PEDRO.ESTADO(id_estado, id_pais, nome)
VALUES(SEQ_ESTADO.nextVal, 1, 'Rio Grande do Sul');
INSERT INTO VEMSER_PEDRO.ESTADO(id_estado, id_pais, nome)
VALUES(SEQ_ESTADO.nextVal, 2, 'Sabre');
INSERT INTO VEMSER_PEDRO.ESTADO(id_estado, id_pais, nome)
VALUES(SEQ_ESTADO.nextVal, 2, 'Luz');

CREATE TABLE VEMSER_PEDRO.CIDADE (
  id_cidade NUMBER(38,0) NOT NULL,
  id_estado NUMBER(38,0) NOT NULL,
  nome VARCHAR2(50) NOT NULL,
  PRIMARY KEY(id_cidade, id_estado),
  CONSTRAINT FK_ID_ESTADO FOREIGN KEY (ID_ESTADO) REFERENCES VEMSER_PEDRO.ESTADO (ID_ESTADO)
);

CREATE SEQUENCE SEQ_CIDADE
START WITH 1
INCREMENT BY 1

INSERT INTO VEMSER_PEDRO.CIDADE(id_cidade, id_estado, nome)
VALUES(SEQ_CIDADE.nextVal, 1,'Manaus');
INSERT INTO VEMSER_PEDRO.CIDADE(id_cidade, id_estado, nome)
VALUES(SEQ_CIDADE.nextVal, 1,'Careiro');

INSERT INTO VEMSER_PEDRO.CIDADE(id_cidade, id_estado, nome)
VALUES(SEQ_CIDADE.nextVal, 2,'Tupiri');
INSERT INTO VEMSER_PEDRO.CIDADE(id_cidade, id_estado, nome)
VALUES(SEQ_CIDADE.nextVal, 2,'Mexerica');

INSERT INTO VEMSER_PEDRO.CIDADE(id_cidade, id_estado, nome)
VALUES(SEQ_CIDADE.nextVal, 3,'Cromatica');
INSERT INTO VEMSER_PEDRO.CIDADE(id_cidade, id_estado, nome)
VALUES(SEQ_CIDADE.nextVal, 3,'Nascimento');

INSERT INTO VEMSER_PEDRO.CIDADE(id_cidade, id_estado, nome)
VALUES(SEQ_CIDADE.nextVal, 4,'Porto Alegre');
INSERT INTO VEMSER_PEDRO.CIDADE(id_cidade, id_estado, nome)
VALUES(SEQ_CIDADE.nextVal, 4,'Sao Leopoldo');

CREATE TABLE VEMSER_PEDRO.BAIRRO (
  id_bairro NUMBER(38,0) NOT NULL,
  id_cidade NUMBER(38,0) NOT NULL,
  id_estado NUMBER(38,0) NOT NULL,
  nome VARCHAR2(50) NOT NULL,
  PRIMARY KEY(id_bairro, id_cidade),
  CONSTRAINT FK_BAIRRO_CIDADE FOREIGN KEY (ID_CIDADE, ID_ESTADO) REFERENCES VEMSER_PEDRO.CIDADE (ID_CIDADE, ID_ESTADO)
);

CREATE SEQUENCE SEQ_BAIRRO
START WITH 1
INCREMENT BY 1
SELECT * FROM VEMSER_PEDRO.BAIRRO;
DELETE FROM VEMSER_PEDRO.BAIRRO WHERE ID_BAIRRO = 18;

INSERT INTO VEMSER_PEDRO.BAIRRO(id_bairro, id_cidade, id_estado, nome)
VALUES(SEQ_BAIRRO.nextVal, 1, 1, 'Tancredo Neves');
INSERT INTO VEMSER_PEDRO.BAIRRO(id_bairro, id_cidade, id_estado, nome)
VALUES(SEQ_BAIRRO.nextVal, 1, 1, 'Walcir Carrasco');
INSERT INTO VEMSER_PEDRO.BAIRRO(id_bairro, id_cidade, id_estado, nome)
VALUES(SEQ_BAIRRO.nextVal, 3, 1, 'Brincadeira');
INSERT INTO VEMSER_PEDRO.BAIRRO(id_bairro, id_cidade, id_estado, nome)
VALUES(SEQ_BAIRRO.nextVal, 3, 1, 'Jokes');

INSERT INTO VEMSER_PEDRO.BAIRRO(id_bairro, id_cidade, id_estado, nome)
VALUES(SEQ_BAIRRO.nextVal, 2, 2, 'Bobo');
INSERT INTO VEMSER_PEDRO.BAIRRO(id_bairro, id_cidade, id_estado, nome)
VALUES(SEQ_BAIRRO.nextVal, 2, 2, 'Bobocas');
INSERT INTO VEMSER_PEDRO.BAIRRO(id_bairro, id_cidade, id_estado, nome)
VALUES(SEQ_BAIRRO.nextVal, 4, 2, 'Vezes');
INSERT INTO VEMSER_PEDRO.BAIRRO(id_bairro, id_cidade, id_estado, nome)
VALUES(SEQ_BAIRRO.nextVal, 4, 2, 'Muitas Vezes');

INSERT INTO VEMSER_PEDRO.BAIRRO(id_bairro, id_cidade, id_estado, nome)
VALUES(SEQ_BAIRRO.nextVal, 5, 3, 'Invencao');
INSERT INTO VEMSER_PEDRO.BAIRRO(id_bairro, id_cidade, id_estado, nome)
VALUES(SEQ_BAIRRO.nextVal, 5, 3, 'ReInvencao');
INSERT INTO VEMSER_PEDRO.BAIRRO(id_bairro, id_cidade, id_estado, nome)
VALUES(SEQ_BAIRRO.nextVal, 6, 3, 'Face');
INSERT INTO VEMSER_PEDRO.BAIRRO(id_bairro, id_cidade, id_estado, nome)
VALUES(SEQ_BAIRRO.nextVal, 6, 3, 'Facetas');

INSERT INTO VEMSER_PEDRO.BAIRRO(id_bairro, id_cidade, id_estado, nome)
VALUES(SEQ_BAIRRO.nextVal, 7, 4, 'Lacos');
INSERT INTO VEMSER_PEDRO.BAIRRO(id_bairro, id_cidade, id_estado, nome)
VALUES(SEQ_BAIRRO.nextVal, 7, 4, 'Lacos de Seda');

INSERT INTO VEMSER_PEDRO.BAIRRO(id_bairro, id_cidade, id_estado, nome)
VALUES(SEQ_BAIRRO.nextVal, 8, 4, 'Gosh');
INSERT INTO VEMSER_PEDRO.BAIRRO(id_bairro, id_cidade, id_estado, nome)
VALUES(SEQ_BAIRRO.nextVal, 8, 4, 'Goshes');


CREATE TABLE VEMSER_PEDRO.ENDERECO (
  id_endereco NUMBER(38,0) NOT NULL,
  id_bairro NUMBER(38,0) NOT NULL,
  id_cidade NUMBER(38, 0) NOT NULL,
  logradouro VARCHAR(255) NOT NULL,
  numero NUMBER(38,0) NOT NULL,
  complemento VARCHAR2(100),
  cep CHAR(9),
  PRIMARY KEY(id_endereco),
  CONSTRAINT FK_ENDERECO_BAIRRO FOREIGN KEY (ID_BAIRRO, ID_CIDADE) REFERENCES VEMSER_PEDRO.BAIRRO (ID_BAIRRO, ID_CIDADE)
);


SELECT * FROM VEMSER_PEDRO.CIDADE;
SELECT * FROM VEMSER_PEDRO.BAIRRO;

CREATE SEQUENCE SEQ_ENDERECO
START WITH 1
INCREMENT BY 1

INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 1, 1, 'Rua Meu Deus', 9, 'Proximo a rua 1' , '2177-303');
INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 1, 1,'Rua Meu Deus', 89, 'Fabrica',  '2177-303');

INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 6, 1,  'Rua Mds',11, 'Escolinha', '2277-303');
INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 6, 1,  'Rua Jesus',69,'Supermercado', '3453-303');

INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 10, 5,  'Rua Jeova',12,'Zoo', '9117-303');
INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 10, 5,  'Rua Alah',9,'Igreja', '4577-303');

INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 11, 6,  'Rua Luz da Manha',13,'Escola', '6667-303');
INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 11, 6,  'Rua Bismuto',12,'Trilha', '7777-303');

INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 12, 7,  'Rua Steven',14,'Delegacia', '0177-303');
INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 12, 7,  'Rua Diamante Branco',22,'Mar', '317-303');

INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 13, 8,  'Rua Rosa', 55,'Praia','1117-303');
INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 13, 8,  'Rua Blue Diamond', 56,'Farmacia','3147-303');

INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 14, 8,  'Rua White',66,'Arquibancada', '1117-303');
INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 14, 8,  'Rua Ametista',77,'Bar', '37890-303');

INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 15, 7,  'Rua Perola',77,'Loja', '2217-303');
INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 15, 7,  'Rua Garnet',112,'Shopping', '0047-303');

INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 16, 5,  'Rua Bob', 134,'Bosque','2227-303');
INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 16, 5,  'Rua Patrick',090,'Mata', '6666-303');

INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 17, 6,  'Rua Lula Molusco',3333,'Escadao', '9922-303');
INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 17, 6,  'Rua Seu Sirigueijo',322222,'Rodovia', '4222-303');

INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 18, 2,  'Rua Perola Filha',151115, 'Avenida','4002-300');
INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 18, 2, 'Rua Professora Peixe', 176666,'Viela', '1111-300');

DELETE FROM VEMSER_PEDRO.ENDERECO WHERE id_bairro = 18;
INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 19, 4,  'Rua Winx',555,'Base', '0987-303');
INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 19, 4,  'Rua Bloom',756,'Campo', '6547-303');

INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 22, 3,  'Rua Palmito',55,'Arena', '1117-303');
INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 22, 3,  'Rua Digital',56,'Quadra', '3147-303');

INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 23, 3, 'Rua Company',575,'Milharal',  '1897-303');
INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 23, 3,  'Rua Brazilian',456,'Horta', '3109-303');

INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 24, 2,  'Rua Pai',4555,'Balneario', '8717-303');
INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 24, 2,  'Rua Mae',5326,'Cachoeira', '4347-303');

INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 25, 2, 'Rua Mario',3255,'Rodoviaria',  '4517-303');
INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, logradouro, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 25, 2,  'Rua Bowser',3256,'Terminal de onibus', '3122-303');

--SELECIONAR TODOS OS PAISES ORDENADOS POR NOME DECRESCENTE
SELECT * FROM VEMSER_PEDRO.PAIS ORDER BY NOME DESC
--SELECIONAR LOGRADOURO E CEP DOS ENDERECOS, SOMENTE OS QUE COMECEM COM "A"
SELECT logradouro, cep FROM VEMSER_PEDRO.ENDERECO WHERE logradouro LIKE UPPER ('a%')
--SELECIONAR TODOS OS ENDERECOS QUE TEM CEP QUE TERMINEM COM 0
SELECT * FROM VEMSER_PEDRO.ENDERECO WHERE cep LIKE '%0';
--SELECIONAR TODOS OS ENDERECOS QUE TENHAM NUMEROS DE 1 A 100
SELECT * FROM VEMSER_PEDRO.ENDERECO WHERE numero BETWEEN 1 AND 100
--SELECIONAR TODOS OS ENDERECOS QUE COMECEM COM "RUA" E ORDENAR PELO CEP DE FORMA DECRESCENTE
SELECT * FROM VEMSER_PEDRO.ENDERECO WHERE logradouro LIKE 'Rua%' ORDER BY cep DESC
--SELECIONA A QUANTIDADE DE ENDERECOS CADASTRADOS NA TABELA
SELECT COUNT (id_endereco) FROM VEMSER_PEDRO.ENDERECO
--SELECIONA A QUANTIDADE DE ENDERECOS CADASTRADOS AGRUPADOS PELO ID DA CIDADE
SELECT COUNT(ID_ENDERECO) FROM VEMSER_PEDRO.ENDERECO GROUP BY ID_CIDADE

