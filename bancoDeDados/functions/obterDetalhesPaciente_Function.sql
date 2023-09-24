CREATE OR REPLACE FUNCTION OBTERDETALHESPACIENTE(id_paciente IN INT) 
RETURN VARCHAR2
IS
    nome_paciente VARCHAR2(100);
    idade INT;
BEGIN
    SELECT NOME_PACIENTE, IDADE
    INTO nome_paciente, idade
    FROM PACIENTE
    WHERE ID_PACIENTE = id_paciente;

    RETURN 'Nome do Paciente: ' || nome_paciente || ', Idade: ' || idade;
END;

-- Exemplo:
-- SELECT OBTERDETALHESPACIENTE(1) FROM DUAL;