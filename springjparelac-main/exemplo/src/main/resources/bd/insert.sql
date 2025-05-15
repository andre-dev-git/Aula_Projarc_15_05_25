INSERT INTO editora (codigo,nome) VALUES (210,'Bookman');
INSERT INTO editora (codigo,nome) VALUES (220,'McGraw-Hill');

INSERT INTO autor (codigo, nome, ano_nascimento) VALUES (1, 'Andre Carvalho', 2002);
INSERT INTO autor (codigo, nome, ano_nascimento) VALUES (2, 'Andre Carvalho 2', 2001);
INSERT INTO autor (codigo, nome, ano_nascimento) VALUES (3, 'Andre Carvalho 3', 1999);

INSERT INTO livro (id,editora_codigo,autor_codigo,titulo,ano) VALUES (120,220,1,'Spring-Boot', 2020);
INSERT INTO livro (id,editora_codigo,autor_codigo,titulo,ano) VALUES (130,220,2,'Principios SOL', 2023);
INSERT INTO livro (id,editora_codigo,autor_codigo,titulo,ano) VALUES (140,210,2,'Padroes de Proje', 2023);
INSERT INTO livro (id,editora_codigo,autor_codigo,titulo,ano) VALUES (150,210,3,'Teste Unitario', 2024);



