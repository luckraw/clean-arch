# Clean Arch

Este é um projeto de exemplo que demonstra a implementação de uma arquitetura limpa (clean architecture) em um aplicativo de gerenciamento de usuários.

## Propósito

O objetivo deste projeto é exemplificar a aplicação dos princípios da arquitetura limpa em um contexto de desenvolvimento de software. A arquitetura limpa visa separar as preocupações e tornar o código mais modular, testável e flexível.

## Tecnologias Utilizadas

- Java 11
- Spring Boot
- Spring Data JPA
- H2 Database
- Lombok

## Como Utilizar

1. Clone este repositório para a sua máquina local:

` git clone https://github.com/luckraw/clean-arch.git `

2. Navegue até o diretório do projeto:

` cd clean-arch `

3. Compile e execute o aplicativo:

` ./mvnw spring-boot:run `


4. Acesse o aplicativo em `http://localhost:8080` no seu navegador.

## Estrutura do Projeto

O projeto segue a estrutura de uma arquitetura limpa, com as seguintes camadas:

- `core`: Contém as entidades de domínio e as regras de negócio.
- `usecases`: Implementa os casos de uso (use cases) da aplicação.
- `interfaces`: Implementa as interfaces de entrada e saída, como controladores REST e repositórios.
- `infra`: Implementa as classes de infraestrutura, como o acesso ao banco de dados.

## Contribuição

Se você quiser contribuir para este projeto, fique à vontade para abrir uma issue ou enviar um pull request. Será um prazer receber contribuições e feedbacks construtivos.
   
