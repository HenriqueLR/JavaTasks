'''
 File too simple for creating test tables, postgresql.
'''

CREATE TABLE cidade
(
  sigla_uf character varying(10) NOT NULL,
  nome_cidade character varying(50) NOT NULL,
  CONSTRAINT cidade_pkey PRIMARY KEY (sigla_uf)
);

CREATE TABLE cliente
(
  cod_cidade serial NOT NULL,
  nome_cliente character varying(100) NOT NULL,
  tel_cliente character varying(100) NOT NULL,
  CONSTRAINT cliente_pkey PRIMARY KEY (cod_cidade)
);

CREATE TABLE funcionario
(
  cod_cidade serial NOT NULL,
  nome_funcionario character varying(100),
  salario character varying(100),
  CONSTRAINT funcionario_pkey PRIMARY KEY (cod_cidade)
);

CREATE TABLE grupo
(
  nome_grupo character varying(100) NOT NULL,
  CONSTRAINT grupo_pkey PRIMARY KEY (nome_grupo)
);

CREATE TABLE produto
(
  cod_produto serial NOT NULL,
  nome_produto character varying(100) NOT NULL,
  valor_compra character varying(100) NOT NULL,
  CONSTRAINT produto_pkey PRIMARY KEY (cod_produto)
);
