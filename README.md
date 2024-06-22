<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Projeto Av2Igor</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
            line-height: 1.6;
        }
        h1, h2, h3 {
            color: #333;
        }
        ul {
            list-style-type: none;
            padding: 0;
        }
        ul li {
            margin-bottom: 10px;
        }
        code {
            background-color: #f4f4f4;
            padding: 2px 4px;
            border-radius: 4px;
        }
    </style>
</head>
<body>
    <h1>Projeto Av2Igor</h1>
    
    <h2>Descrição do Microserviço</h2>
    <p>Este projeto é uma aplicação Spring Boot que implementa um sistema de autenticação e controle de acesso baseado em JWT (JSON Web Token). A aplicação permite o registro de novos usuários, autenticação segura através de login e controle de acesso a diferentes endpoints baseado no tipo de usuário (administrador, gerente de produtos, vendedor ou cliente).</p>
    
    <h2>Funcionalidades</h2>
    
    <h3>Parte 1: Autenticação de Usuários</h3>
    <ul>
        <li><strong>Registro de Usuário:</strong> Permite que novos usuários se cadastrem com nome de usuário, senha e e-mail. Cada usuário é identificado como administrador, gerente de produtos, vendedor ou cliente.</li>
        <li><strong>Login Seguro:</strong> Sistema de login onde os usuários podem se autenticar utilizando suas credenciais (nome de usuário e senha). As credenciais são verificadas em relação aos dados armazenados no banco de dados.</li>
        <li><strong>Geração de Token JWT:</strong> Após um login bem-sucedido, gera um token JWT que inclui informações como ID do usuário, tipo de conta e e-mail.</li>
    </ul>
    
    <h3>Parte 2: Controle de Acesso com JWT</h3>
    <ul>
        <li><strong>Administradores:</strong> Endpoint para gerenciamento de usuários (criação, atualização e exclusão). Exemplo: <code>POST /admin/users</code></li>
        <li><strong>Gerentes de Produtos:</strong> Endpoint para gerenciamento de produtos e categorias. Exemplo: <code>POST /manager/products</code></li>
        <li><strong>Vendedores:</strong> Endpoint para gerenciamento de pedidos e devoluções. Exemplo: <code>POST /seller/orders</code></li>
        <li><strong>Clientes:</strong> Endpoint para acesso ao catálogo de produtos e histórico de pedidos. Exemplo: <code>GET /customer/products</code></li>
    </ul>
    
    <h2>Endpoints</h2>
    
    <h3>Registro e Login</h3>
    <ul>
        <li><code>POST /cadastrar</code>: Registro de novo usuário.</li>
        <li><code>POST /login</code>: Autenticação do usuário e geração de token JWT.</li>
    </ul>
    
    <h3>Controle de Acesso</h3>
    <ul>
        <li><code>GET /username/{token}</code>: Extrai o nome de usuário a partir do token JWT.</li>
        <li><code>GET /manager/{token}</code>: Acesso para gerentes de produtos.</li>
        <li><code>GET /admin/{token}</code>: Acesso para administradores.</li>
        <li><code>GET /user/{token}</code>: Acesso para clientes.</li>
    </ul>
    
    <h2>Diagrama de Arquitetura</h2>
    <p><img src="diagrama-microservicos.png" alt="Diagrama de Microsserviços"></p>
</body>
</html>


![diagrama1](https://github.com/Lestiam/Av2_Arquitetura/assets/108492529/28e41da3-9ac0-4442-a1e7-08facf32691e)


![diagrama2](https://github.com/Lestiam/Av2_Arquitetura/assets/108492529/218f7ad5-4089-40b5-9d79-65867a7905b7)


Descrição do Diagrama
O diagrama representa a arquitetura do serviço, detalhando os componentes, endpoints, fluxo de solicitações e dependências. Inclui:

Av2IgorApplication: Classe principal que inicia a aplicação Spring Boot.
SecurityConfig: Configurações de segurança, incluindo o filtro de segurança HTTP e a configuração de usuários em memória.
UserController: Controlador REST que gerencia os endpoints de login e acesso baseado em tokens JWT.
UserEntity: Modelo de entidade que representa um usuário.
JwtUtil: Utilitário para geração e extração de informações de tokens JWT.
UserService: Serviço que encapsula a lógica de negócios relacionada aos usuários, incluindo a geração e extração de tokens JWT.

Requisitos
JDK 17 ou superior
Maven 3.6.3 ou superior

Prints do Funcionamento:

![image](https://github.com/Lestiam/Av2_Arquitetura/assets/108492529/02cd5e63-d6b1-4dfc-98dd-923641e106b3)

![image](https://github.com/Lestiam/Av2_Arquitetura/assets/108492529/346c19bd-ca72-4186-af83-5f9625b417be)

![image](https://github.com/Lestiam/Av2_Arquitetura/assets/108492529/c06ebc53-ec6b-4b59-b876-ac6932de7a4b)

![image](https://github.com/Lestiam/Av2_Arquitetura/assets/108492529/084ac460-696f-4d9f-8dfa-314daa932813)

![image](https://github.com/Lestiam/Av2_Arquitetura/assets/108492529/882b34b0-035d-44dc-83f3-ac8fe4d9bc05)

![image](https://github.com/Lestiam/Av2_Arquitetura/assets/108492529/5f07b4f6-8bf5-4315-9225-4eac2b50f2f8)




