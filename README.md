# MS-Gerente

SQL para criação do banco de dados:
CREATE DATABASE Gerente;

SQL para criação da tabela:
CREATE TABLE gerente (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    cpf VARCHAR(11) NOT NULL,
    telefone VARCHAR(20) NOT NULL
);

SQL para inserir valores ficticios para simulação:
INSERT INTO gerente (nome, email, cpf, telefone)
VALUES ('João Silva', 'joao.silva@example.com', '12345678901', '123-456-7890'),
       ('Maria Oliveira', 'maria.oliveira@example.com', '23456789012', '234-567-8901'),
       ('Carlos Santos', 'carlos.santos@example.com', '34567890123', '345-678-9012'),
       ('Ana Souza', 'ana.souza@example.com', '45678901234', '456-789-0123'),
       ('Roberto Lima', 'roberto.lima@example.com', '56789012345', '567-890-1234');
