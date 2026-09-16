# Planificador de tareas - Backend

API REST del proyecto individual de Estefania Mancipe. Fue realizada con Java 17, Spring Boot, Spring Data JPA, Validation y PostgreSQL.

## Estructura

- `model/Task.java`: entidad de la tarea.
- `repository/TaskRepository.java`: acceso a PostgreSQL.
- `controller/TaskController.java`: operaciones de la API.
- `database/create_database.sql`: instruccion para crear la base de datos.

## Endpoints

| Metodo | Ruta | Accion |
| --- | --- | --- |
| GET | `/api/tasks` | Consultar todas las tareas |
| POST | `/api/tasks` | Crear una tarea |
| PUT | `/api/tasks/{id}` | Actualizar una tarea |
| DELETE | `/api/tasks/{id}` | Eliminar una tarea |

## Base de datos y ejecucion

La aplicacion utiliza una base llamada `tasks_db`. En PowerShell, dentro de esta carpeta:

```powershell
$env:DB_PASSWORD="TU_CONTRASENA_DE_POSTGRES"
.\mvnw.cmd spring-boot:run
```

Spring crea o actualiza automaticamente la tabla `tasks`. La API queda disponible en `http://localhost:8080/api/tasks`.

La contrasena no se escribe en el repositorio. Se entrega mediante la variable `DB_PASSWORD` para protegerla.
