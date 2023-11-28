# Estudos de testes unitarios

- Testar menor unidade de código possível
- Unidade: função, método, classes
- Testar uma aplicação na sua menor parte
- Escrito em tempo de desenvolvimento

## Porque escrever testes unitários?
Situações no desenvolvimento de software que mostram a importância de testes unitários
- Comprender o código fonte
- Corrigir bugs com segurança
- Refatorar código sem introduzir bugs
- Entregar com segurança uma nova feature

Outros pontos importantes:
- Pirâmide de testes
- Testes unitários como métrica de qualidade (confiabilidade)
- Cobertura de testes
- Automação na execução de testes
- Cultura de agilidade

## JUNIT
- Versão 5
- JUnit Platform
- JUnit Jupiter 
- JUnit Vintage

## Assertions
- AssertEquals
- AssertNull
- AssertNotNull
- AssertFalse
- AssertArrayEquals

## Anotações
- Test
- BeforeEach - Execucao para cada teste
- BeforeAll - Execucao unica
- AfterEach - Execucao para cada teste
- AfterAll - Execucao unica

## Assumptions
- AssumeTrue
- AssumeFalse

## Condicionais
- EnabledOnOs
- EnabledIfEnvironmentVariable
- EnabledOnJre
- EnabledForJreRange

## Exceptions
- assertDoesNotThrow
- assertThrows

## Ordem testes
- TestMethodOrder(MethodOrderer.OrderAnnotation.class)
- TestMethodOrder(MethodOrderer.MethodName.class)
- TestMethodOrder(MethodOrderer.Random.class)
- TestMethodOrder(MethodOrderer.DisplayName.class)
- Order
- DisplayName