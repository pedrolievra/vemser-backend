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
DELETE FROM VEMSER_PEDRO.BAIRRO WHERE ID_BAIRRO =21;

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

INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 1, 1, 9, 'Rua Meu Deus', '2177-303');
INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 1, 1, 9, 'Rua Meu Deus', '2177-303');

INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 6, 1, 11, 'Rua Mds', '2277-303');
INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 6, 1, 69, 'Rua Jesus', '3453-303');

INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 10, 5, 12, 'Rua Jeova', '9117-303');
INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 10, 5, 9, 'Rua Alah', '4577-303');

INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 11, 6, 13, 'Rua Luz da Manha', '6667-303');
INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 11, 6, 12, 'Rua Bismuto', '7777-303');

INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 12, 7, 14, 'Rua Steven', '0177-303');
INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 12, 7, 22, 'Rua Diamante Branco', '317-303');

INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 13, 8, 55, 'Rua Rosa', '1117-303');
INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 13, 8, 56, 'Rua Blue Diamond', '3147-303');

INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 14, 8, 66, 'Rua White', '1117-303');
INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 14, 8, 77, 'Rua Ametista', '37890-303');

INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 15, 7, 77, 'Rua Perola', '2217-303');
INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 15, 7, 112, 'Rua Garnet', '0047-303');

INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 16, 5, 134, 'Rua Bob', '2227-303');
INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 16, 5, 090, 'Rua Patrick', '6666-303');

INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 17, 6, 3333, 'Rua Lula Molusco', '9922-303');
INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 17, 6, 322222, 'Rua Seu Sirigueijo Porco Capitalista', '4222-303');

INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 18, 2, 151115, 'Rua Perola Filha', '4002-303');
INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 18, 2, 176666, 'Rua Professora Peixe', '1111-303');

INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 18, 2, 155, 'Rua Plankton', '0017-303');
INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 18, 2, 156, 'Rua Balde de Lixo', '9847-303');

INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 19, 4, 555, 'Rua Winx', '0987-303');
INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 19, 4, 756, 'Rua Bloom', '6547-303');

INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 22, 3, 55, 'Rua Palmito', '1117-303');
INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 22, 3, 56, 'Rua Digital', '3147-303');

INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 23, 3, 575, 'Rua Company', '1897-303');
INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 23, 3, 456, 'Rua Brazilian', '3109-303');

INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 24, 2, 4555, 'Rua Pai', '8717-303');
INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 24, 2, 5326, 'Rua Mae', '4347-303');

INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 25, 2, 3255, 'Rua Mario', '4517-303');
INSERT INTO VEMSER_PEDRO.ENDERECO(id_endereco, id_bairro, id_cidade, numero, complemento, cep)
VALUES(SEQ_ENDERECO.nextVal, 25, 2, 3256, 'Rua Bowser', '3122-303');

SELECT VEMSER_PEDRO.PAIS, NOME FROM VEMSER_PEDRO.PAIS
ORDER BY NOME
