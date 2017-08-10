CREATE TABLE apartment_classes(
    class NVARCHAR2(25),
    room_quantity NUMBER(10) NOT NULL,
    cost NUMBER(10,2) NOT NULL,
    PRIMARY KEY (class)
);

CREATE TABLE apartments (
    id NVARCHAR2(10),
    class NVARCHAR2(25) NOT NULL,
    status NVARCHAR2(25) NOT NULL CHECK (status IN ('free', 'booked')),
    PRIMARY KEY (id),
    FOREIGN KEY (class) REFERENCES apartment_classes (class)
);