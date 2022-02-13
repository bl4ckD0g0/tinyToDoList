insert into BOARDS (NAME) values
('personal'),('proyectoX');

insert into TASK_LISTS (NAME, BOARD_ID) values
('TODO', 1), ('DONE', 1),
('Historias de usuario',2), ('Bugs', 2);


insert into TASKS (TASK_LIST_ID, NAME, DESCRIPTION)
values (1,'Innovative', 'semper sapien a libero nam dui proin leo odio porttitor id consequat in consequat ut nulla sed accumsan felis'),
(1,'optimizing', 'eget massa tempor convallis nulla neque libero convallis eget eleifend luctus ultricies eu nibh'),
(1,'heuristic', 'ante vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae duis faucibus accumsan odio curabitur convallis'),
(1,'hardware', 'pulvinar sed nisl nunc rhoncus dui vel sem sed sagittis nam congue risus semper porta'),
(1,'uniform', 'volutpat sapien arcu sed augue aliquam erat volutpat in congue etiam justo etiam pretium iaculis justo'),
(1,'adapter', 'eget massa tempor convallis nulla neque libero convallis eget eleifend luctus ultricies eu nibh quisque id justo sit'),
(2,'Automated', 'viverra eget congue eget semper rutrum nulla nunc purus phasellus in felis donec semper sapien a libero nam dui'),
(2,'Versatile', 'nonummy integer non velit donec diam neque vestibulum eget vulputate ut ultrices vel augue vestibulum ante ipsum'),
(2,'bi-directional', 'consectetuer adipiscing elit proin interdum mauris non ligula pellentesque ultrices phasellus id sapien in sapien iaculis congue vivamus metus'),
(2,'application', 'vitae ipsum aliquam non mauris morbi non lectus aliquam sit amet'),
(2,'impactful', 'cubilia curae donec pharetra magna vestibulum aliquet ultrices erat tortor sollicitudin'),
(3,'discrete', 'potenti cras in purus eu magna vulputate luctus cum sociis natoque penatibus'),
(3,'4th generation', 'aliquam lacus morbi quis tortor id nulla ultrices aliquet maecenas leo odio condimentum id luctus nec molestie'),
(3,'Profound', 'ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae duis faucibus accumsan'),
(3,'Extended', 'penatibus et magnis dis parturient montes nascetur ridiculus mus vivamus vestibulum sagittis sapien cum sociis natoque penatibus'),
(3,'value-added', null),
(3,'Triple-buffered', 'congue etiam justo etiam pretium iaculis justo in hac habitasse'),
(1,'Persistent', 'faucibus cursus urna ut tellus nulla ut erat id mauris vulputate elementum nullam varius nulla facilisi cras non velit nec'),
(4,'zero defect', 'ultrices libero non mattis pulvinar nulla pede ullamcorper augue a suscipit nulla'),
(4,'Devolved', 'aliquet pulvinar sed nisl nunc rhoncus dui vel sem sed sagittis'),
(4,'multimedia', 'sapien sapien non mi integer ac neque duis bibendum morbi non quam nec dui luctus rutrum'),
(4,'systematic', 'morbi vestibulum velit id pretium iaculis diam erat fermentum justo nec'),
(4,'extranet', null),
(4,'object-oriented', 'suscipit nulla elit ac nulla sed vel enim sit amet nunc viverra'),
(4,'4th generation', null),
(4,'attitude', null),
(4,'static', 'eu massa donec dapibus duis at velit eu est congue elementum in hac habitasse platea dictumst morbi vestibulum velit'),
(4,'human-resource', 'justo etiam pretium iaculis justo in hac habitasse platea dictumst etiam faucibus cursus urna ut tellus nulla'),
(4,'project', 'in faucibus orci luctus et ultrices posuere cubilia curae nulla dapibus dolor vel est donec odio justo sollicitudin ut suscipit'),
(4,'standardization', null);
