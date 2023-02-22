INSERT INTO marcas (id_marca,marca) VALUES (default,"Ferrari")
INSERT INTO marcas (id_marca,marca) VALUES (default,"Tesla")
INSERT INTO marcas (id_marca,marca) VALUES (default,"Peugeot")
INSERT INTO marcas (id_marca,marca) VALUES (default,"Ford")
INSERT INTO provincias (id_provincia, provincia) VALUES (default,"Asturias")
INSERT INTO provincias (id_provincia, provincia) VALUES (default,"Barcelona")
INSERT INTO provincias (id_provincia, provincia) VALUES (default,"Madrid")
INSERT INTO provincias (id_provincia, provincia) VALUES (default,"Valencia")
INSERT INTO provincias (id_provincia, provincia) VALUES (default,"Vizcaya")
INSERT INTO provincias (id_provincia, provincia) VALUES (default,"Sevilla")
INSERT INTO tipos (id_tipo, tipo) VALUES (default,"4x4")
INSERT INTO tipos (id_tipo, tipo) VALUES (default,"Deportivo")
INSERT INTO tipos (id_tipo, tipo) VALUES (default,"Mono Volumen")

INSERT INTO anuncios_coches (id,asientos,autonomia,nombre,precio,tipo_id,marca_id,provincia_id) VALUES (default,2,200,"Paco",50,1,1,1)
INSERT INTO anuncios_coches (id,asientos,autonomia,nombre,precio,tipo_id,marca_id,provincia_id) VALUES (default,4,400,"Victor",100,3,2,1)
INSERT INTO anuncios_coches (id,asientos,autonomia,nombre,precio,tipo_id,marca_id,provincia_id) VALUES (default,4,600,"Lucia",160,2,1,3)




-- UPDATE anuncios_coches SET marca_id = 1

