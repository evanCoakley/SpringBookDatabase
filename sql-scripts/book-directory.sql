CREATE DATABASE  IF NOT EXISTS `book_directory`;

DROP TABLE IF EXISTS `book`;

CREATE TABLE `book` (
    `id` int NOT NULL AUTO_INCREMENT,
    `title` varchar(75) DEFAULT NULL,
    `author_name` varchar(45) DEFAULT NULL,
    `publish_year` int,
    `genre` varchar(75),
    PRIMARY KEY(`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `book` VALUES
    (1,'The Town and the City','Jack Kerouac', 1950,'Semi-autobiographical Novel'),
    (2,'On The Road','Jack Kerouac',1957,'Beat, Stream of Consciousness'),
    (3,'The Subterraneans', 'Jack Kerouac',1958,'Semi-autobiographical Novella'),
    (4,'The Dharma Bums','Jack Kerouac',1958,'Beat Literature'),
    (5,'Doctor Sax','Jack Kerouac',1959,'Autobiographical Novel')
