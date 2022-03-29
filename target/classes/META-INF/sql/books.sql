-- use bookstore;
--
-- INSERT INTO bookstore.Category (name) VALUES ('Adventure');
-- INSERT INTO bookstore.Category (name) VALUES ('Science');
-- INSERT INTO bookstore.Category (name) VALUES ('Java');
-- INSERT INTO bookstore.Category (name) VALUES ('Others');
-- --
-- INSERT INTO bookstore.publishers (name, nip, regon) VALUES ('Wydawca', '', '');
-- INSERT INTO bookstore.publishers (name, nip, regon) VALUES ('PWN', '', '');
-- INSERT INTO bookstore.publishers (name, nip, regon) VALUES ('ZYSKiSka', '', '');
-- --
-- # INSERT INTO bookstore.books (description, rating, title, publisher_id) VALUES ('desc1', 6, 'title1', 2);
-- # INSERT INTO bookstore.books (description, rating, title, publisher_id) VALUES ('desc2', 5, 'title2', 1);
-- # INSERT INTO bookstore.books (description, rating, title, publisher_id) VALUES ('desc3', 3, 'title3', 3);
-- # INSERT INTO bookstore.books (description, rating, title, publisher_id) VALUES ('desc4', 4, 'title4', 3);
-- # INSERT INTO bookstore.books (description, rating, title, publisher_id) VALUES ('desc5', 2, 'title5', 1);
-- # INSERT INTO bookstore.books (description, rating, title, publisher_id) VALUES ('desc6', 6, 'title6', 2);
-- # INSERT INTO bookstore.books (description, rating, title, publisher_id) VALUES ('desc7', 1, 'title7', 1);
--
-- INSERT INTO bookstore.authors (firstName, lastName, pesel, email) VALUES ('first author', 'first','', 'wer@wp.pl');
-- INSERT INTO bookstore.authors (firstName, lastName, pesel, email) VALUES ('drugi', 'second','', 'wer@wp.pl');
-- INSERT INTO bookstore.authors (firstName, lastName, pesel, email) VALUES ('Karol ', 'May','', 'wer@wp.pl');
-- INSERT INTO bookstore.authors (firstName, lastName, pesel, email) VALUES ('Anne ', 'Proloux','', 'wer@wp.pl');
--
-- --
--
-- # INSERT INTO bookstore.books_authors (Book_id, authors_id) VALUES (1, 2);
-- # INSERT INTO bookstore.books_authors (Book_id, authors_id) VALUES (1, 1);
-- # INSERT INTO bookstore.books_authors (Book_id, authors_id) VALUES (2, 2);
-- # INSERT INTO bookstore.books_authors (Book_id, authors_id) VALUES (4, 4);
-- # INSERT INTO bookstore.books_authors (Book_id, authors_id) VALUES (3, 3);
-- # INSERT INTO bookstore.books_authors (Book_id, authors_id) VALUES (5, 4);

INSERT INTO book_workshop.Book (author, isbn, publisher, title, type) VALUES ('Karol May', '1221', 'ZyskiSka', 'title1', 'adventure');
INSERT INTO book_workshop.Book (author, isbn, publisher, title, type) VALUES ('Anne Proloux', '4567', 'PWN', 'Pocztówki', 'literatura piękna');
INSERT INTO book_workshop.Book (author, isbn, publisher, title, type) VALUES ('Issac Singer', '234', 'SK', 'Warszawa', 'dramat');

INSERT INTO book_workshop.Test (content) VALUES ('testContent');
INSERT INTO book_workshop.Test (content) VALUES ('anotherTest');
INSERT INTO book_workshop.Test (content) VALUES ('lastContent');