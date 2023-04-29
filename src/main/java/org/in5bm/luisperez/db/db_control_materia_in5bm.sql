drop database if exists db_control_materia_in5bm;
create database db_control_materia_in5bm;
use db_control_materia_in5bm;

-- Instrucciones DDL

drop table if exists materias;
create table materias (
	id_materia int auto_increment not null,
    nombre_materia varchar(45) not null,
    ciclo_escolar year,
    horario_inicio time,
    horario_final time,
    catedratico varchar(45) not null,
    salon varchar(45) not null,
    cupo_maximo int,
    cupo_minimo int not null,
    nota int not null,
    primary key (id_materia)
);

-- Instrucciones DML

insert into materias (nombre_materia, ciclo_escolar, horario_inicio, horario_final, catedratico, salon, cupo_maximo, cupo_minimo, nota) 
values ("Matemática", 2022, "07:05:00", "12:05:00", "Oto Carreon", "c-12", 12, 10, 60);
insert into materias (nombre_materia, ciclo_escolar, horario_inicio, horario_final, catedratico, salon, cupo_maximo, cupo_minimo, nota) 
values ("Física fundamental", 2022, "07:05:00", "12:05:00", "Luis Guillen", "c-12", 12, 10, 60);
insert into materias (nombre_materia, ciclo_escolar, horario_inicio, horario_final, catedratico, salon, cupo_maximo, cupo_minimo, nota) 
values ("Ciencias Sociales", 2022, "07:05:00", "12:05:00", "Juan Asturia", "c-12", 12, 10, 70);
insert into materias (nombre_materia, ciclo_escolar, horario_inicio, horario_final, catedratico, salon, cupo_maximo, cupo_minimo, nota) 
values ("Ética profesional", 2022, "07:05:00", "12:05:00", "Miguel Grazioso", "c-12", 12, 10, 60);
insert into materias (nombre_materia, ciclo_escolar, horario_inicio, horario_final, catedratico, salon, cupo_maximo, cupo_minimo, nota) 
values ("Estadística", 2022, "07:05:00", "12:05:00", "Ramón Valdez", "c-12", 12, 10, 75);
insert into materias (nombre_materia, ciclo_escolar, horario_inicio, horario_final, catedratico, salon, cupo_maximo, cupo_minimo, nota) 
values ("Biología", 2022, "07:05:00", "12:05:00", "Rosario Orozco", "c-12", 12, 10, 70);
insert into materias (nombre_materia, ciclo_escolar, horario_inicio, horario_final, catedratico, salon, cupo_maximo, cupo_minimo, nota) 
values ("Química", 2022, "07:05:00", "12:05:00", "Isidoro Esquite", "c-12", 12, 10, 70);
insert into materias (nombre_materia, ciclo_escolar, horario_inicio, horario_final, catedratico, salon, cupo_maximo, cupo_minimo, nota) 
values ("Inglés", 2022, "07:05:00", "12:05:00", "Carlos Cabrera", "c-12", 12, 10, 70);
insert into materias (nombre_materia, ciclo_escolar, horario_inicio, horario_final, catedratico, salon, cupo_maximo, cupo_minimo, nota) 
values ("Contabilidad", 2022, "07:05:00", "12:05:00", "Mynor Delgado", "c-12", 12, 10, 60);
insert into materias (nombre_materia, ciclo_escolar, horario_inicio, horario_final, catedratico, salon, cupo_maximo, cupo_minimo, nota) 
values ("Literatura", 2022, "07:05:00", "12:05:00", "Mynor Matias", "c-12", 12, 10, 60);

