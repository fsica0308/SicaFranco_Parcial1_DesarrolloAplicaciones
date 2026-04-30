# Parcial 1 - Desarrollo de Aplicaciones

Alumno: Franco Sica  
Repositorio: SicaFranco_Parcial1_DesarrolloAplicaciones  

---

## Descripción

El proyecto consiste en una aplicación Android desarrollada en Kotlin con Jetpack Compose, que muestra una lista de Pokémon tipo Pokédex.

Cada elemento de la lista contiene:
- Nombre del Pokémon
- Imagen
- Scroll vertical

---

## Problema inicial

El código original entregado en la consigna presentaba varios problemas:

- Todo el código estaba concentrado en MainActivity
- Mezcla de responsabilidades (UI, lógica y datos)
- Código desordenado
- Imports innecesarios
- Comentarios engañosos que podían inducir a errores
- Dependencias que no se utilizaban

---

## Refactor realizado

Se reorganizó el proyecto aplicando una separación clara de responsabilidades.

Estructura final:

```
ar.edu.parcial1sicafranco/
├── data/
│   └── PokemonRepository.kt
├── model/
│   └── Pokemon.kt
├── presentation/
│   ├── components/
│   │   └── PokemonItem.kt
│   ├── screens/
│   │   └── PokemonListScreen.kt
│   └── viewmodel/
│       └── PokemonViewModel.kt
├── ui/theme/
└── MainActivity.kt
```

---

## Arquitectura

Se utilizó un enfoque tipo MVVM simplificado:

- Model: representa los datos (Pokemon)
- Repository: provee los datos
- ViewModel: maneja el estado
- UI (Compose): muestra la información

---

## Tecnologías utilizadas

- Kotlin
- Jetpack Compose
- ViewModel
- Coil (para carga de imágenes)

---

## Dependencias agregadas

```
implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.8.7")
implementation("io.coil-kt:coil-compose:2.7.0")
```

---

## Problemas encontrados y soluciones

1. La aplicación no mostraba contenido  
   Se corrigió la conexión entre MainActivity y la pantalla principal.

2. Dependencias faltantes  
   Se agregaron las librerías necesarias para ViewModel y carga de imágenes.

3. Error en configuración de Gradle  
   Se eliminó una configuración incorrecta del plugin de Kotlin.

4. Código innecesario y comentarios engañosos  
   Se eliminaron completamente.

5. Archivos de configuración subidos al repositorio  
   Se corrigió el .gitignore y se eliminó la carpeta .idea del repositorio.

---

## Consideraciones

- No se agregaron funcionalidades extra como búsqueda o navegación, ya que no eran requeridas.
- Los datos son simulados, no se utiliza una API externa.
- Se priorizó mantener el código simple, claro y ordenado.

---

## Resultado final

La aplicación muestra correctamente una lista de Pokémon con nombre e imagen, permite hacer scroll y mantiene una estructura organizada y mantenible.

---

## Notas finales

El refactor mejora la legibilidad del código y facilita futuras modificaciones, manteniendo una separación clara entre capas.
