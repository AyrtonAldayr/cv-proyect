# **Docker Compose**

Se crearan un docker compose.
Con el siguiente comando:
```sh
docker-compose down
```
docker-compose up --build -d
```

Esto creará la imagen de **mysql-desarrollo:1.0.0** y atraerá las estructura de la base de datos necesaria. Ademas se creara una contenedor con el nombre **mysql-desarrollo-busness**

Para verificar la correcta carga de las tables, por favor de ejecutar las siguientes lineas de comando.
```sh
docker exec -it mysql-desarrollo-busness /bin/bash
mysql -u root -p123456
show databases;
use ResumeCreator;
show tables;
```
-------------------------------------------------------------------------------------------



