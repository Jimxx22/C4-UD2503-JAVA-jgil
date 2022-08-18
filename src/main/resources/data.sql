DROP table IF EXISTS Cajas;
DROP table IF EXISTS Almacenes;

create table Almacenes(
    codigo int auto_increment,
    lugar varchar(100),
    capacidad int,
    PRIMARY KEY (codigo)
);

create table Cajas(
    num_Referencia char(5),
    contenido varchar(100),
    valor int,
    codigo_Almacen int,
    PRIMARY KEY (num_Referencia),
    FOREIGN KEY (codigo_Almacen) REFERENCES Almacenes(codigo)
);

insert into Almacenes (lugar, capacidad)values('Barcelona', 1000);
insert into Almacenes (lugar, capacidad)values('Zaragoza', 500);
insert into Almacenes (lugar, capacidad)values('Valencia', 900);

insert into Cajas (num_Referencia, contenido, valor, codigo_Almacen)values('PLF01', 'pelotas de futbol', 1000, 1);
insert into Cajas (num_Referencia, contenido, valor, codigo_Almacen)values('PLB01', 'pelotas de baloncesto', 750, 1);
insert into Cajas (num_Referencia, contenido, valor, codigo_Almacen)values('PLF02', 'pelotas de futbol', 800, 3);