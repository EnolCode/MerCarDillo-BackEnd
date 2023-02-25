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

INSERT INTO anuncios_coches (id,asientos,autonomia,nombre_cliente,precio) VALUES (default,2,200,"Paco",50)
INSERT INTO anuncios_coches (id,asientos,autonomia,nombre_cliente,precio) VALUES (default,4,400,"Victor",100)
INSERT INTO anuncios_coches (id,asientos,autonomia,nombre_cliente,precio) VALUES (default,4,600,"Lucia",160)



UPDATE anuncios_coches SET tipo_id = 2
UPDATE anuncios_coches SET marca_id = 1
UPDATE anuncios_coches SET provincia_id = 2




