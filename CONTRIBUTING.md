# Guía de Contribución (CONTRIBUTING.md)

¡Gracias por tu interés en contribuir a este proyecto! Para mantener una colaboración ordenada, eficiente y transparente, te pedimos que sigas las pautas descritas en este documento.

---

## 📋 Índice

1. [Código de Conducta](#-código-de-conducta)
2. [¿Cómo puedo contribuir?](#-cómo-puedo-contribuir)
   - [Reportar Errores (Bugs)](#reportar-errores-bugs)
   - [Sugerir Nuevas Funcionalidades](#sugerir-nuevas-funcionalidades)
   - [Enviar Cambios de Código](#enviar-cambios-de-código)
3. [Flujo de Trabajo Git (Git Workflow)](#-flujo-de-trabajo-git-git-workflow)
   - [1. Clonar y Crear Rama](#1-clonar-y-crear-rama)
   - [2. Convención de Nombres de Ramas](#2-convención-de-nombres-de-ramas)
   - [3. Formato de Commits](#3-formato-de-commits)
   - [4. Crear un Pull Request](#4-crear-un-pull-request)
4. [Estándares y Estilo de Código](#-estándares-y-estilo-de-código)
5. [Revisión de Código (Code Review)](#-revisión-de-código-code-review)

---

## 🤝 Código de Conducta

Este proyecto fomenta un ambiente inclusivo, respetuoso y libre de acoso. Esperamos que todos los colaboradores interactúen de manera profesional y constructiva:

- Sé respetuoso con las opiniones y críticas constructivas.
- Mantén un tono cordial en comentarios, *issues* y *pull requests*.
- Céntrate en lo que sea mejor para la comunidad y el proyecto.

---

## 💡 ¿Cómo puedo contribuir?

### Reportar Errores (Bugs)

Antes de crear una nueva incidencia (*issue*), por favor busca en las existentes para asegurarte de que el problema no ha sido reportado previamente.

Al reportar un error, incluye:

1. **Título claro y descriptivo.**
2. **Pasos para reproducir:** Instrucciones detalladas paso a paso.
3. **Comportamiento esperado vs. comportamiento actual.**
4. **Entorno de ejecución:** Sistema operativo, versión de lenguaje/framework, navegador, etc.
5. **Capturas de pantalla o registros (logs):** Si aplica.

### Sugerir Nuevas Funcionalidades

Las sugerencias y mejoras son bienvenidas. Al proponer una idea:

- Explica **qué problema resuelve** o qué beneficio aporta al proyecto.
- Describe detalladamente **cómo imaginas que debería funcionar**.

### Enviar Cambios de Código

Para enviar cambios de código, crea una rama siguiendo las convenciones descritas
en el flujo de trabajo Git y abre un Pull Request cuando los cambios estén listos.

---

## 🔄 Flujo de Trabajo Git (Git Workflow)

### 1. Clonar y Crear Rama

Para trabajar en una tarea, asegúrate de partir de la versión más reciente de la rama principal (`main`):

```bash
git checkout main
git pull origin main
git checkout -b <nombre-de-tu-rama>
```

### 2. Convención de Nombres de Ramas

Usa prefijos descriptivos para estructurar el nombre de tus ramas:

| Prefijo | Propósito | Ejemplo |
| :--- | :--- | :--- |
| `feature/` | Nueva funcionalidad o módulo | `feature/login-autenticacion` |
| `fix/` | Corrección de errores o *bugs* | `fix/error-navegacion-menu` |
| `docs/` | Cambios en la documentación | `docs/actualizar-readme` |
| `refactor/` | Reestructuración de código sin cambiar lógica | `refactor/optimizar-consultas` |
| `test/` | Adición o corrección de pruebas unitarias | `test/pruebas-servicio-usuario` |

### 3. Formato de Commits

Mantenemos un historial de commits limpio y descriptivo siguiendo el estándar de [Conventional Commits](https://www.conventionalcommits.org/):

- `feat: ...` (Para agregar nuevas funcionalidades)
- `fix: ...` (Para corregir errores)
- `docs: ...` (Para actualizar documentación)
- `style: ...` (Formateo, punto y coma faltantes, etc.; sin cambios de lógica)
- `refactor: ...` (Cambios de código que ni corrigen errores ni añaden funcionalidades)
- `test: ...` (Añadir o corregir tests)

**Ejemplo:**

```bash
git commit -m "feat: agrega validación de correo en formulario de registro"
```

### 4. Crear un Pull Request

Cuando tu código esté listo y probado localmente:

1. Sube tu rama al repositorio remoto:

   ```bash
   git push origin <nombre-de-tu-rama>
   ```

2. Ve al repositorio en GitHub y abre un **Pull Request (PR)** hacia la rama `main`.
3. Completa la plantilla del PR explicando:
   - ¿Qué cambios introduce este PR?
   - Contexto o motivación de los cambios.
   - Instrucciones o checklist para probar los cambios.
4. Asigna al menos a **un compañero del equipo** para que revise tu PR.

---

## 🎨 Estándares y Estilo de Código

- **Consistencia:** Mantén las convenciones de código utilizadas en el proyecto (sigue los linter/formatters configurados).
- **Documentación:** Comenta funciones o módulos complejos cuando la intención del código no sea evidente por sí misma.
- **Pruebas:** Asegúrate de ejecutar la suite de pruebas existente antes de enviar tu PR y añade nuevas pruebas para la lógica introducida.

---

## 🔍 Revisión de Código (Code Review)

- **Sin fusiones directas:** No realices *commits* ni fusiones directas a la rama `main`. Todos los cambios deben pasar por revisión.
- **Aprobaciones necesarias:** Todo Pull Request requiere al menos una revisión y aprobación antes de ser integrado (*merged*).
- **Resolución de sugerencias:** Responde y resuelve los comentarios de los revisores antes de realizar el *merge final*.

---

¡Gracias de nuevo por contribuir y hacer crecer este proyecto! 🚀
