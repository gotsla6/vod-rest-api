DROP TABLE IF EXISTS tbl_package;
DROP TABLE IF EXISTS tbl_chapter;
DROP TABLE IF EXISTS tbl_video;
DROP TABLE IF EXISTS tbl_translation;
DROP SEQUENCE IF EXISTS hibernate_sequence;

CREATE TABLE tbl_package
(
    id INTEGER auto_increment,
    package_name VARCHAR(255) not null,
    package_description VARCHAR(255) not null,
    PRIMARY KEY (id)
);

CREATE TABLE tbl_chapter
(
    id INTEGER auto_increment,
    package_id INTEGER not null,
    name VARCHAR(255) not null,
    description VARCHAR(255) not null,
    tags VARCHAR(100) not null,
    PRIMARY KEY (id)
);

CREATE TABLE tbl_video
(
    id INTEGER auto_increment,
    chapter_id INTEGER not null,
    name VARCHAR(255) not null,
    description VARCHAR(255) not null,
    tags VARCHAR(100) not null,
    identifier VARCHAR(255) not null,
    PRIMARY KEY (id)
);

CREATE TABLE tbl_translation
(
    id INTEGER auto_increment,
    type VARCHAR(100) not null,
    translated_id INTEGER not null,
    key VARCHAR(100) not null,
    value VARCHAR(255) not null,
    lang VARCHAR(100) not null,
    PRIMARY KEY (id)
);