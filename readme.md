# Examen 2 Gestión de la configuración

> Entonces este examen consistía en 3 partes

1. Subir el código a Azure

2. Hacer dos pipelines que uno fallara y se detuviera, y el otro fallara pero siguiera

3. Hacer el coverage del código

## Subir el código a **Azure**
> Entonces el código de Azure ya está subido y para poder verificar eso, debe de entrar al siguiente enlace que lo llevara a la aplicación web que se subió a Azure

> [Link de la aplicación](https://examen2gestiondelaconfiguracion.azurewebsites.net/)

> Listo, eso era todo lo que tenia esta parte

## Hacer los dos pipelines

> Entonces para poder hacer los dos pipelines toco hacerlos en la rama **main** para evitar que en la rama **maven** no se ejecutara el CI, por los errores de las pruebas unitarias

1. **Fallara y se detendra**
  > Este se encuentra en la rama **main** luego en **.github/workflows**

  > En este enlace te llevara de una a la ruta especificada [Link](https://github.com/Kalichhe/projectGestion/tree/main/.github/workflows)
  
  > Abran 3 **pipelines** 
  
  1. fallaYContinua.yml
  2. main-build.yml
  3. maven-build.yml
  
  > Pero solo usaremos los dos primeros

