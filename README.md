# Primeiro projeto Java Web com Spring Boot
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/GuilhermeHSP/projeto-Java-Spring/blob/master/Licence) 

# Sobre o projeto

Esse é um projeto simples de Java Web no Spring Boot + Gerenciador de dependências Maven desenvolvido para fins estudantis.

Esse projeto consiste criação das entidades "Categoria" e "Produto", adição de parâmetros, relacionamento entre as entidades e injeção no banco de dados de teste H2.

# Resultado Final

## Tabela "Categoria" rodando no Banco de dados H2.
![Tabela Categoria](https://github.com/GuilhermeHSP/projects-assets/blob/master/Java%20Web%20com%20Springboot/1%20-%20Rodando%20a%20tabela%20CATEGORIA%20no%20banco%20de%20dados%20de%20teste%20(H2).png)

## Tabela "Produto" rodando no Banco de dados H2.
![Tabela Produto](https://github.com/GuilhermeHSP/projects-assets/blob/master/Java%20Web%20com%20Springboot/2%20-%20Rodando%20a%20tabela%20PRODUTO%20no%20banco%20de%20dados%20de%20teste%20(H2).png)

## Procurando um Produto de ID específico (Postman).
![Procurando ID específico no Postman](https://github.com/GuilhermeHSP/projects-assets/blob/master/Java%20Web%20com%20Springboot/5%20-%20Procurando%20apenas%20o%20PRODUTO%203.png)

# Diagramas

## Modelo Conceitual

![Modelo Conceitual](https://github.com/GuilhermeHSP/projects-assets/blob/master/Java%20Web%20com%20Springboot/Diagramas/Modelo%20Conceitual.png)

## Modelo Conceitual

![Instância](https://github.com/GuilhermeHSP/projects-assets/blob/master/Java%20Web%20com%20Springboot/Diagramas/Inst%C3%A2ncia.png)


# Tecnologias utilizadas
## Back end
- API Rest
- Web Services
- Spring Data JPA
- Banco de Dados H2

# Como executar o projeto

```bash
# clonar repositório
git clone https://github.com/GuilhermeHSP/projeto-Java-Spring.git

# executar o projeto
Abra o projeto com SpringTool.

Caminho: src/main/java > com.guilhermehsp.PrimeiroProjetoSpring

Rode o "PrimeiroProjetoSpringApplication.java" como SprigBootApp

No navegador, digite: http://localhost:8080/h2-console

Na interface do H2, digite "jdbc:h2:mem:testdb" (sem aspas) no campo JDBC URL, e depois clique em "Connect".
```

Projeto desenvolvido com base no "Aulão #005" @devsuperior
