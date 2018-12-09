create database Gym_Zarate;
use Gym_Zarate;

create table Fotos 
	(
		Id_Huella int primary key auto_increment not null,
		Huella varchar(50),
		Foto varchar(50)
		);

create table Clientes
	(
		Id_Huella int,
		foreign key (Id_Huella) references Fotos(Id_Huella),
		Nombre varchar(20),
		Apellido_Pa varchar (15),
		Apellido_Ma varchar (15),
		Sexo varchar(1),
		Direccion varchar(50),
		Telefono varchar (10)
		);

create table Roles 
		(
			Id_Rol int primary key not null auto_increment,
			Descripcion varchar (30)
			);

create table Empleados 
			(
				Id_Empleado int primary key not null auto_increment,
				Id_Huella int,
				foreign key (Id_Huella) references Fotos(Id_Huella),
				Nombre varchar(20),
				Apellido_Pa varchar (15),
				Apellido_Ma varchar (15),
				Sexo varchar(1),
				Direccion varchar(50),
				Telefono varchar (10),
				Id_Rol int,
				foreign key (Id_Rol) references Roles(Id_Rol),
				Sueldo double(10,2),
				Dia_Pago varchar(9)
				);

create table Asistencia_Personal
				(
					Id_Asistencia int primary key not null auto_increment,
					Id_Empleado int,
					foreign key (Id_Empleado) references Empleados(Id_Empleado),
					Fecha_Entrada date,
					Hora_Entrada time,
					Fecha_Salida date,
					Hora_Salida time,
					Tiempo_retardo varchar(10)
					);

create table Tipo_Periodo
	(
		Id_Tipo_Periodo int primary key not null auto_increment,
		Descripcion varchar(20)
		);

create table Servicios 
	(
		Id_Servicio int not null primary key auto_increment,
		Descripcion varchar(50),
		costo double(10,2),
		Tipo_Servicio int(1)
		);

create table Suscripcion 
	(
		Id_Suscripcion int primary key not null auto_increment,
		Id_Huella int,
		foreign key (Id_Huella) references Fotos(Id_Huella),
		Id_Tipo_Periodo int,
		foreign key (Id_Tipo_Periodo) references Tipo_Periodo(Id_Tipo_Periodo),
		Id_Servicio int,
		foreign key (Id_Servicio) references Servicios(Id_Servicio),
		Fecha_Inicio date,
		Fecha_Final date,
		Estatus varchar(1)
		);

create table Miembros_Por_Suscripcion 
	(
		Id_Suscripcion int,
		foreign key (Id_Suscripcion) references Suscripcion(Id_Suscripcion),
		Id_Huella int,
		foreign key (Id_Huella) references Fotos(Id_Huella)
		);

create table Usuarios 
	(
		Id_Usuario int primary key not null auto_increment,
		Id_Empleado int,
		foreign key (Id_Empleado) references Empleados(Id_Empleado),
		contraseña varchar(15)
		);

create table  Marcas
	(
		Id_Marca int primary key not null auto_increment,
		Descripcion varchar(20)
		);
insert into marcas (Descripcion) values ('');
create table Pagos_Suscripcion 
	(
		Id_Pago int primary key not null auto_increment,
		Id_Suscripcion int,
		foreign key(Id_Suscripcion) references Suscripcion(Id_Suscripcion),
		Pago double(10,2),
		Fecha_Pago date
		);

create table Asistencia_Miembros 
    (
	Id_Asistencia int primary key not null auto_increment,
	Id_Suscripcion int,
	foreign key (Id_Suscripcion) references Suscripcion(Id_Suscripcion),
	Fecha_Entrada date,
	Hora_Entrada time
    );

create table Jornadas 
	(
		Id_Jornada int primary key auto_increment,
		Id_Empleado int,
		foreign key(Id_Empleado) references Empleados(Id_Empleado),
		Lunes_Entrada time,
		Lunes_Salida time,
		Martes_Entrada time,
		Martes_Salida time,
		Miercoles_Entrada time,
		Miercoles_Salida time,
		Jueves_Entrada time,
		Jueves_Salida time,
		Viernes_Entrada time,
		Viernes_Salida time,
		Sabado_Entrada time,
		Sabado_Salida time,
		Domingo_Entrada time,
		Domingo_Salida time,
		Inicio_Contrato date,
		Fin_Contrato varchar(11)
		);

create table Productos 
	(
		Id_Producto bigint not null primary key,
		Descripcion varchar(30),
		Id_Marca int,
		foreign key(Id_Marca) references Marcas(Id_Marca),
		Talla varchar(3),
		Existencia int,
		Tipo_Producto varchar(1),
		Costo_Cliente double (10,2),
		Costo_Compra double (10,2)
		);

create table Ventas 
	(
		Id_Ticket int not null,
		Id_Venta int not null primary key auto_increment,
		Id_Huella int,
		foreign key(Id_Huella) references Fotos(Id_Huella),
		Id_Producto bigint,
		foreign key(Id_Producto) references Productos(Id_Producto),
		Cantidad double(10,2),
		Cosot_Subtotal double(10,2),
		Fecha_Venta date,
		Hora_Venta time,
		Estatus varchar(1)
		);

create table Pagos_Productos 
	(
		Id_Pago_Producto int primary key not null auto_increment,
		Id_Venta int,
		foreign key(Id_Venta) references Ventas(Id_Venta),
		Num_Pagos int,
		Id_Tipo_Periodo int,
		foreign key(Id_Tipo_Periodo) references Tipo_Periodo(Id_Tipo_Periodo),
		Importe double(10,2),
		Restante double(10,2),
		Fecha_Pago_Producto date,
		Hora_Pago_Producto time
		);

create table caja
	(
		Id_Ticket_caja int primary key not null auto_increment,
		Medio_Ingreso varchar(20),
		Total_Ingreso double(10,2),
		Fecha date,
		Hora time
		); 
        
        
        ----procedimientos
        
        --alta Marcas
        
        delimiter //
	create  procedure AddMarcas (in marca text)
		BEGIN
			INSERT INTO Marcas(Descripcion)
SELECT marca
FROM Marcas
WHERE NOT EXISTS (SELECT Descripcion FROM Marcas WHERE Descripcion = marca)LIMIT 1;
		end//

delimiter ;

call DeleteProvider(1,@x);

INSERT INTO Marcas(Descripcion) SELECT ‘pepsi’ FROM Marcas WHERE NOT EXISTS (SELECT Descripcion FROM Marcas WHERE Descripcion = ‘pepsi’)LIMIT 1;

