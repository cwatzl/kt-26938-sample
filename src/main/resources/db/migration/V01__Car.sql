CREATE TABLE car (
    id IDENTITY PRIMARY KEY,
    brand NVARCHAR(255) NOT NULL
);

CREATE TABLE feature (
    car_id BIGINT NOT NULL,
    name NVARCHAR(255) NOT NULL,
    description_en NVARCHAR(255),
    description_de NVARCHAR(255),
    PRIMARY KEY (car_id, name),
    CONSTRAINT fk_car_feature FOREIGN KEY (car_id) REFERENCES car (id)
);