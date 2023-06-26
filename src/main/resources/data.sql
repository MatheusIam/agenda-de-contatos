CREATE TABLE IF NOT EXISTS tb_contatos (
    id integer not null serial,
    nome character varying(255),
    telefone character varying(15),
    email character varying(255),

    CONSTRAINT pk_id_contato PRIMARY KEY (id)
)

CREATE TABLE IF NOT EXISTS tb_usuarios (

    id serial,
    nome_usuario character varying(255),
    senha character varying(64),
    agenda_id integer not null,

    CONSTRAINT pk_id_usuario PRIMARY KEY (id)
)

CREATE TABLE IF NOT EXISTS tb_agendas (
    id serial,
    usuario_id INTEGER NOT NULL REFERENCES tb_usuarios(id),
    contato_id INTEGER NOT NULL REFERENCES tb_contatos(id),

    CONSTRAINT pd_id_agenda PRIMARY KEY (id)
)