✨Sports Management System✨




This is a console-based sports management system that allows you to manage teams, players, and matches, and written in Core Java using JDBC and PostgreSQL.

💻 Technologies Used:

Java (JDK 8+)
Maven
Java (JDK 8+)
PostgreSQL
JDBC

❤️❤️ Features
•	Add teams and players.
•	View teams and their players.
•	Schedule and view matches.


Dependancies:

<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-api</artifactId>
    <version>5.7.1</version>
    <scope>test</scope>
</dependency>

Prerequisites:
before running the project, ensure you have the following installed:

1]Java Development Kit (JDK) 17 or higher.

2]PostgreSQL 15 or higher.

3]create PostgreSQL database with the following table:

-- Run in pgAdmin or psql
CREATE TABLE teams (
    team_id SERIAL PRIMARY KEY,
    team_name VARCHAR(100) NOT NULL
);

-- Create the 'players' table
CREATE TABLE players (
    player_id SERIAL PRIMARY KEY,
    player_name VARCHAR(100) NOT NULL,
    player_age INT,
    team_id INT REFERENCES teams(team_id)
);

-- Create the 'matches' table
CREATE TABLE matches (
    match_id SERIAL PRIMARY KEY,
    team1_id INT REFERENCES teams(team_id),
    team2_id INT REFERENCES teams(team_id),
    match_date DATE
);

Contact:

For any questions or feedback, feel free to reach out:

Your Name : Prajkta Prabhakar More

Email: prajktamore63@gmail.com

GitHub: https://github.com/prajkta-more/JavaFullStack.git

Enjoy using the Online Sports Management System ! 🚀
