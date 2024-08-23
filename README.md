# Lista de Exercícios 04 – Orientação a Objetos Avançada em Java

Este projeto é uma prática de orientação a objetos avançada em Java, envolvendo a criação de interfaces, classes abstratas e concretas para representar animais.

## Objetivos

1. **Criar a Interface `AnimalIF`**
   - Métodos: `comer()`, `moverse()`, `dormir()`

2. **Criar a Classe Abstrata `AnimalAB`**
   - Implementa `AnimalIF`
   - Define métodos abstratos `comer()`, `moverse()`, `dormir()`

3. **Criar Classes Concretas**
   - **`Cachorro`**, **`Gato`**, **`Elefante`**, **`Leão`**
   - Implementam os métodos da `AnimalAB` para alterar o estado interno do objeto.

4. **Criar Classes Abstratas Específicas**
   - **`AnimalMarinhoAB`**, **`AnimalVoadorAB`**, **`AnimalTerrestreAB`**
   - Representam características de animais marinhos, aéreos e terrestres.

5. **Criar Classes Concretas Adicionais**
   - **`Peixe`** (herda de `AnimalMarinhoAB`)
   - **`Pombo`** (herda de `AnimalVoadorAB`)

6. **Atributos Comuns dos Animais**
   - `nome`, `tipoAnimal`, `idade`, `habitat`, `quantidadePatas`, `quantidadeAsas`, `envergaduraAsa`, `altura`, `peso`

## Estrutura

- **Interface `AnimalIF`**
- **Classe Abstrata `AnimalAB`**
- **Classes Concretas:** `Cachorro`, `Gato`, `Elefante`, `Leão`, `Peixe`, `Pombo`
- **Classes Abstratas Específicas:** `AnimalMarinhoAB`, `AnimalVoadorAB`, `AnimalTerrestreAB`

## Como Executar

1. Clone o repositório:
   ```git clone https://github.com/larissacsena/atividade-4-solutis-POO```
   
## Autor

**Maura Larissa Costa Sena**
