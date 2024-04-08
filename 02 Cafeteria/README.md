# Introducción al Sistema de Gestión de Bebidas para Cafeterías

Este programa forma parte de un módulo más amplio dentro de un sistema de software diseñado para cafeterías, con el objetivo específico de facilitar la incorporación de nuevas bebidas al menú. El foco principal de esta implementación se centra en la lógica de backend, especialmente en la validación del formato de entrada de datos para asegurar la consistencia y fiabilidad de la información proporcionada.

## Propósito del Programa

El propósito de este módulo es permitir a los administradores y empleados de la cafetería añadir nuevas opciones de bebidas al sistema de manera eficiente y sin errores. Para lograrlo, el programa valida cuidadosamente la entrada de datos según las siguientes especificaciones:

### Especificaciones de Entrada:

- **Nombre de la Bebida**:
  - Debe contener únicamente caracteres alfabéticos.
  - La longitud debe estar entre 2 y 15 caracteres.

- **Tamaño de la Bebida**:
  - Los usuarios pueden especificar hasta cinco tamaños diferentes para cada bebida.
  - Cada tamaño debe ser un valor entero dentro del rango de 1 a 48.
  - Los tamaños deben ingresarse en orden ascendente, empezando por el más pequeño.

- **Formato de la Entrada**:
  - El nombre de la bebida debe ingresarse primero, seguido de una coma.
  - Posteriormente, se debe proporcionar una lista de tamaños, separados cada uno por una coma.
  - Los espacios en blanco en la entrada serán ignorados.

### Criterios de Aceptación:

- El nombre de la bebida es alfabético y tiene una longitud adecuada.
- Los tamaños especificados caen dentro del rango permitido y se presentan en orden ascendente.
- Se aceptan de uno a cinco valores de tamaño para cada bebida.
- La entrada sigue el formato especificado, incluyendo el uso correcto de las comas.

Este módulo no se preocupa por la interfaz de usuario (UI), enfocándose exclusivamente en asegurar que la lógica de backend procese y valide la entrada de datos de manera correcta.

## Uso del Programa

El programa se ha diseñado para ser integrado dentro de un sistema de gestión más amplio para cafeterías, proporcionando una herramienta confiable y eficiente para la expansión y actualización del menú de bebidas disponible para los clientes.


# Escenarios de Prueba para la Validación de Entradas

A continuación se presentan los escenarios de prueba diseñados para validar la lógica de ingreso de nuevas bebidas al sistema de la cafetería. Cada escenario detalla una condición específica que el sistema debe ser capaz de manejar.

## Pruebas para Nombre de la Bebida

- **Válido**: El nombre de la bebida es alfabético.
- **Inválido**: El nombre de la bebida no es alfabético.
- **Inválido**: El nombre de la bebida tiene menos de 2 caracteres de longitud.
- **Válido**: El nombre de la bebida tiene de 2 a 15 caracteres de longitud.
- **Válido**: El nombre de la bebida tiene exactamente 2 caracteres de longitud.
- **Válido**: El nombre de la bebida tiene exactamente 15 caracteres de longitud.
- **Inválido**: El nombre de la bebida tiene solo 1 carácter de longitud.
- **Inválido**: El nombre de la bebida tiene más de 15 caracteres de longitud.

## Pruebas para Tamaño de la Bebida

- **Inválido**: El valor del tamaño es menor que 1.
- **Válido**: El valor del tamaño está en el rango de 1 a 48.
- **Inválido**: El valor del tamaño es mayor que 48.
- **Válido**: El valor del tamaño es un número entero.
- **Inválido**: El valor del tamaño es un decimal.
- **Válido**: El valor del tamaño es numérico.
- **Inválido**: El valor del tamaño incluye caracteres no numéricos.
- **Válido**: Los valores del tamaño se ingresan en orden ascendente.
- **Inválido**: Los valores del tamaño no están en orden ascendente.
- **Inválido**: No se ingresan valores de tamaño.
- **Válido**: Se ingresan de uno a cinco valores de tamaño.
- **Inválido**: Se ingresan más de cinco tamaños.

## Pruebas para Formato de Entrada

- **Válido**: El nombre del artículo es el primero en la entrada.
- **Inválido**: El nombre del artículo no es el primero en la entrada.
- **Válido**: Una sola coma separa cada entrada en la lista.
- **Inválido**: Una coma no separa dos o más entradas en la lista.
- **???**: La entrada no contiene espacios en blanco (se requiere más información).
- **????**: La entrada contiene espacios en blanco (se requiere más información).

> Nota: Para las pruebas marcadas con "???" y "????", se necesita aclarar si los espacios en blanco afectan la validez de la entrada, según las reglas de negocio del sistema.




## Sobre el archivo Bebida.java y sus pruebas usando excepciones en lugar de mensajes

Enviar excepciones en lugar de simplemente mostrar mensajes en la pantalla es una práctica común en la programación por varias razones importantes:

- Separación de responsabilidades: El código que detecta un error no siempre es el mismo que sabe cómo manejarlo adecuadamente. Las excepciones permiten que un método indique que ocurrió algo inesperado sin tener que preocuparse por cómo se manejará este problema. Así, el código que llama a este método puede elegir cómo responder a la excepción, lo que podría incluir mostrar un mensaje al usuario, intentar recuperarse del error o tal vez registrar el problema en un archivo de registro para futuras investigaciones.

- Propagación de errores: Las excepciones se propagan automáticamente hacia arriba en la pila de llamadas hasta que se encuentran con un bloque de captura (`catch`) que puede manejarlas. Esto significa que si una función `A` llama a `B` que a su vez llama a `C`, y `C` encuentra un error, `C` puede lanzar una excepción que será capturada por `A` o `B`, si así lo deciden, sin necesidad de que `B` sepa específicamente cómo manejar el error de `C`.

- Tipificación de errores: Las excepciones en muchos lenguajes de programación son objetos que pueden llevar consigo no solo un mensaje de error, sino también información adicional sobre el error. Además, al definir diferentes tipos de excepciones para diferentes tipos de errores, el código que maneja las excepciones puede tomar decisiones basadas en el tipo de error sin tener que analizar cadenas de texto.

- Control de flujo*: Utilizar excepciones para el manejo de errores permite a los desarrolladores controlar el flujo del programa de manera más clara. En lugar de verificar constantemente si ocurrió un error después de cada llamada a función (lo que a menudo requiere muchos `if` o estructuras de control similares), el código puede seguir un camino "normal" sin interrupciones, hasta que algo sale mal.

- **Mantenimiento y claridad**: El manejo de excepciones ayuda a mantener el código limpio y claro. En lugar de mezclar la lógica de manejo de errores con la lógica empresarial principal, las excepciones permiten separarlas. Esto hace que el código sea más fácil de leer y mantener.

- Consistencia: Utilizar un sistema de manejo de excepciones proporciona una manera consistente de tratar con condiciones de error en todo el código, lo que facilita para otros desarrolladores entender y prever cómo se manejarán los errores.

- Transacciones y revertir operaciones: En ciertas aplicaciones, especialmente aquellas que involucran bases de datos o manipulación de archivos, un error en medio de una serie de operaciones puede requerir que todo el proceso se "deshaga" o revierta a su estado original. Las excepciones facilitan este tipo de manejo, permitiendo que los manejadores de excepciones realicen las operaciones de limpieza necesarias.

Por todas estas razones, el uso de excepciones es generalmente considerado una buena práctica en el diseño de software robusto y fácil de mantener.


