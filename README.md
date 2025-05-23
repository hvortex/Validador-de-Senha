# 🔐 Validador de Senha

Este projeto é um **validador de senhas** desenvolvido em **Java**, com foco em boas práticas de programação e **Test-Driven Development (TDD)** utilizando JUnit 5.

## 🧪 Requisitos de Validação

Uma senha válida deve atender aos seguintes critérios:

- Ter pelo menos **8 caracteres**
- Conter no mínimo **2 dígitos**
- Conter pelo menos **1 letra maiúscula**
- Conter pelo menos **1 caractere especial** (`!@#$%^&*()-_=+[]{}|;:'",.<>?/\\\`~`)

## ✅ Exemplo de uso

```java
ResultadoValidacao resultado = ValidadorSenha.validar("Exemplo123!");
if (resultado.isValida()) {
    System.out.println("Senha válida!");
} else {
    resultado.getMensagensErro().forEach(System.out::println);
}