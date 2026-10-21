# Práctica: Método de Ordenamiento de Burbuja (Normal y Mejorado)
Alumno:Noe Rios De La Cruz
Carrera : Desarrollo de software multipltaforma
Materia: Estructura de Datos 4to "B"
Docente: MTI. Luis Alberto Mendoza San Juan

## Descripción del Proyecto
Este proyecto implementa y compara dos variantes del algoritmo de ordenamiento por burbuja en lenguaje Java:
1. Burbuja Tradicional (`burbujaNormal`):** Realiza iteraciones y comparaciones adyacentes a lo largo de todo el arreglo.
2. Burbuja Mejorada (`burbujaMejorada`):** Incluye una variable de control booleana (`huboIntercambio`) que detecta si el arreglo ya está ordenado e interrumpe el ciclo anticipadamente con `break`.

---

## Estructura del Código
El código está organizado dentro de la siguiente jerarquía de paquetes:

```text
ESTRUCTURA_DE_DATOS_PRACTICAS/
├── README.md
└── src/
    └── com/
        └── uthh/
            └── edd/
                └── unidad2/
                    └── ordenamiento/
                        ├── OrdenamientoBurbuja.java
                        └── MainOrdenamientoBurbuja.java

run:
burbuja normal:
original: 10 9 8 7 6 5 4 3 2 1 
ordenado: 1 2 3 4 5 6 7 8 9 10 
tiempo normal: 795300 ns

burbuja mejorada:
original: 10 9 8 7 6 5 4 3 2 1 
ordenado: 1 2 3 4 5 6 7 8 9 10 
tiempo mejorado: 8800 ns
BUILD SUCCESSFUL (total time: 0 seconds)