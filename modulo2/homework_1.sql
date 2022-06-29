CREATE TABLE VEMSER_PEDRO.ESTUDANTE(
id_aluno NUMBER NOT NULL,
nome VARCHAR(200) NOT NULL,
data_nascimento DATE NOT NULL,
nr_matricula CHAR(10) UNIQUE NOT NULL,
ativo CHAR NOT NULL,
PRIMARY KEY(id_aluno)
);

CREATE SEQUENCE SEQ_LISTA
START WITH 1
INCREMENT BY 1

INSERT INTO VEMSER_PEDRO.ESTUDANTE (id_aluno, NOME, DATA_NASCIMENTO, NR_MATRICULA, ATIVO)
VALUES(SEQ_LISTA.nextval, 'Pedro', TO_DATE('26-10-2001', 'dd-mm-yyyy'), '3467765423', 'S');

INSERT INTO VEMSER_PEDRO.ESTUDANTE (ID_ALUNO, NOME, DATA_NASCIMENTO, NR_MATRICULA, ATIVO)
VALUES(SEQ_LISTA.nextval, 'Matheus', TO_DATE('03-09-2001', 'dd-mm-yyyy'), '3467765411', 'N');

INSERT INTO VEMSER_PEDRO.ESTUDANTE (ID_ALUNO, NOME, DATA_NASCIMENTO, NR_MATRICULA, ATIVO)
VALUES(SEQ_LISTA.nextval, 'Cesar', TO_DATE('1-10-2001', 'dd-mm-yyyy'), '3467765422', 'S');

INSERT INTO VEMSER_PEDRO.ESTUDANTE (ID_ALUNO, NOME, DATA_NASCIMENTO, NR_MATRICULA, ATIVO)
VALUES(SEQ_LISTA.nextval, 'Maria', TO_DATE('17-12-2001', 'dd-mm-yyyy'), '3467765433', 'N');

INSERT INTO VEMSER_PEDRO.ESTUDANTE (ID_ALUNO, NOME, DATA_NASCIMENTO, NR_MATRICULA, ATIVO)
VALUES(SEQ_LISTA.nextval, 'Ricardo', TO_DATE('08-06-2001', 'dd-mm-yyyy'), '3467765444', 'N');

INSERT INTO VEMSER_PEDRO.ESTUDANTE (ID_ALUNO, NOME, DATA_NASCIMENTO, NR_MATRICULA, ATIVO)
VALUES(SEQ_LISTA.nextval, 'Poliana', TO_DATE('14-02-2001', 'dd-mm-yyyy'), '3467765455', 'N');

INSERT INTO VEMSER_PEDRO.ESTUDANTE (ID_ALUNO, NOME, DATA_NASCIMENTO, NR_MATRICULA, ATIVO)
VALUES(SEQ_LISTA.nextval, 'Francisco', TO_DATE('31-10-2001', 'dd-mm-yyyy'), '3467765466', 'S');

INSERT INTO VEMSER_PEDRO.ESTUDANTE (ID_ALUNO, NOME, DATA_NASCIMENTO, NR_MATRICULA, ATIVO)
VALUES(SEQ_LISTA.nextval, 'Rita', TO_DATE('31-12-2001', 'dd-mm-yyyy'), '3467765477', 'S');

INSERT INTO VEMSER_PEDRO.ESTUDANTE (ID_ALUNO, NOME, DATA_NASCIMENTO, NR_MATRICULA, ATIVO)
VALUES(SEQ_LISTA.nextval, 'Joao', TO_DATE('24-06-2001', 'dd-mm-yyyy'), '3467765488', 'S');

INSERT INTO VEMSER_PEDRO.ESTUDANTE (ID_ALUNO, NOME, DATA_NASCIMENTO, NR_MATRICULA, ATIVO)
VALUES(SEQ_LISTA.nextval, 'Marilda', TO_DATE('06-01-2001', 'dd-mm-yyyy'), '3467765499', 'N');

SELECT * FROM VEMSER_PEDRO.ESTUDANTE;




