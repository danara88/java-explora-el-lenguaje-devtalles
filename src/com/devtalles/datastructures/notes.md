# Notas 📝

## ¿Qué es el Framework de Colecciones (JFC)?
Conjunto de clases e interfaces en Java para gestionar **estructuras de datos
dinámicas.**
Nos permite almacenar, manipular y acceder a datos de manera eficiente en la
memoria de trabajo. Nos proporciona metodos para manipular estructuras de datos
facilmente.

### ¿Por qué necesitamos colecciones?
Los arrays son fijos. Tenemos arrays que requiren de gestión más compleja y nos faciliten 
el trabajo al momento de almacenar mucha información en la memoria.
- List: Mantiene el orden de inserción y también permite duplicados.
- ArrayList: Implementa la interfaz List. Este primero crea un arreglo inicial con 10 posiciones. Si nos pasamos de esas 10, se crea otro arreglo con un 50% más grande, copiando los datos al nuevo arreglo.
- LinkedList: Implementa la interfaz List. Se crean nodos, conteniendo el valor y la dirección de memoria del siguiente nodo y del anteriro.
- Set: Interfaz que no acepta duplicados y no garantiza un order.
