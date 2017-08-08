CREATE TABLE apartment_classes (
    class VARCHAR(25) NOT NULL,
    room_quantity INT NOT NULL,
    cost DECIMAL(7,2) UNSIGNED NOT NULL,
    PRIMARY KEY (class)
);

CREATE TABLE apartments (
    id VARCHAR(10),
    class VARCHAR(25) NOT NULL,
    status ENUM('free', 'booked') NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (class) REFERENCES apartment_classes (class) 
    ON DELETE CASCADE 
    ON UPDATE CASCADE
);