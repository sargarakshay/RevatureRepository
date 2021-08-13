use movies;

-- Tasks
-- =====
-- 1. Create a table named favorite_movie that will contains the list of movies that you like. Include additional columns as appropriate that represents more information about a movie.
-- 2. Create a linked table with favorite_movie.
-- 3. Insert data into favorite_movie and linked table, then demonstrate inner join and outer join.
-- 4. Create a table with data to demonstrate group by and having.


# 1. Create a table named favorite_movie that will contains the list of movies that you like. Include additional columns as appropriate that represents more information about a movie.
-- create table favorite_movies (
-- 	Rank int primary key auto_increment,
--     Film varchar(10),
-- 	   Year int,
--     Director varchar(30)
-- );

# 2. Create a linked table with favorite_movie.
-- create table genres (
-- 	genres_id int primary key auto_increment,
--     genres_type varchar(10),
--     constraint fk_genres_id foreign key (genres_id)
--     references favorite_movies(`Rank`)
-- );

#  3. Insert data into favorite_movie and linked table, then demonstrate inner join and outer join.
-- select `Rank`, Film, g.genres_type, `Year`, Director 
-- from favorite_movies fm
-- inner join genres g on fm.genres_id = g.genres_id;


-- SELECT Film, Director FROM favorite_movies
-- UNION
-- SELECT * FROM genres;

-- SELECT fm.Film, g.genres_type
-- FROM favorite_movies fm
-- RIGHT JOIN genres g ON fm.genres_id = g.genres_id
-- ORDER BY fm.Rank;

# 4. Create a table with data to demonstrate group by and having.
-- SELECT `Rank`, Film, `Year`, Director 
-- FROM favorite_movies
-- GROUP BY `Year`;