# Sección C: Patrón Singleton con AOP

Este proyecto contiene la implementación del patrón de diseño **Singleton** utilizando el paradigma de **Programación Orientada a Aspectos (AOP)**.

## Descripción
A diferencia de la implementación tradicional (OOP), aquí la lógica de instancia única se desacopla totalmente de la clase de negocio.
- **Clase de Negocio (`GestorConfiguracion.java`):** Es un POJO (Plain Old Java Object) con un constructor público. No contiene lógica de control de instancias.
- **Aspecto (`SingletonAspect.java`):** Intercepta todas las llamadas al constructor `new GestorConfiguracion()` y gestiona la unicidad del objeto utilizando un mapa de instancias.

## Estructura de Archivos
- `src/singleton_aop/GestorConfiguracion.java`: Clase que simula la conexión a base de datos.
- `src/singleton_aop/SingletonAspect.java`: Aspecto que aplica la restricción Singleton.
- `src/singleton_aop/MainSingletonAOP.java`: Clase principal para probar que dos instancias son idénticas en memoria.
