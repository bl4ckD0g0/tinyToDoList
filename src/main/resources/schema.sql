create table boards (
	id					INT NOT NULL AUTO_INCREMENT,
	name 		VARCHAR(50),

	PRIMARY KEY (id)
);

create table taskLists (
	id					INT NOT NULL AUTO_INCREMENT,
	boardId				INT NOT NULL,
	name 		VARCHAR(50),

	PRIMARY KEY (id),
	FOREIGN KEY (boardId) REFERENCES boards(id)
);

create table tasks (
	id					INT NOT NULL AUTO_INCREMENT,
	taskListId				INT,
	name 		VARCHAR(50),
	description		   TEXT,

	PRIMARY KEY (id),
	FOREIGN KEY (taskListId) REFERENCES taskLists(id)
);
