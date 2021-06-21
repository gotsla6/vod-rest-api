INSERT INTO tbl_package (package_name, package_description) VALUES
('First package', 'This is the first package description.'),
('New second package', 'This is the second package description.'),
('Third package special', 'This is the third package description.');

INSERT INTO tbl_chapter (package_id, name, description, tags) VALUES
(1, 'First Chapter', 'There are the points we will see in this first chapter.', 'beginner,easy'),
(1, 'Second Chapter', 'This second chapter captures the essential of the journey.', 'beginner'),
(1, 'Third Chapter', 'This is already the last chapter... we are so sad :-(', 'beginner,epilogue'),
(2, 'Only chapter of second package', 'We cover all the things you need to knwow.', 'intermediate'),
(3, 'Special package introduction chapter', 'For your special needs!', 'intermediate,special'),
(3, 'Special vocabulary chapter', 'You can''t be short of words... let''s do it!', 'vocabulary,intermediate,fun'),
(3, 'Christmas special', 'Have you been a good student this year?', ''),
(3, 'Holiday''s special', 'We''ll take a look at all the great things to do in Jeju Island.', 'vocabulary,fun,holidays');

INSERT INTO tbl_video (chapter_id, name, description, tags, identifier) VALUES
(1, 'First video', 'Easy to get lost, follow the guide.', 'listening,writing', 'h8R51NoEVw'),
(2, 'The essentials', 'Would you like to know how to say anything in Korean?', 'essential,speaking', 'h8R51NoEVw'),
(2, 'Essential +', 'There is no ending to the essentials!', 'essential,speaking', 'h8R51NoEVw'),
(3, 'Epilogue video', 'Do you like introductions? Here''s one for you!', '', 'h8R51NoEVw'),
(4, 'The lonely video', 'Because why not?', 'listening', 'h8R51NoEVw'),
(5, 'Special introduction', 'Wow this IS special!', 'reading,listening', 'h8R51NoEVw'),
(6, 'All the words', 'From ㄱ to ㅎ!', 'vocabulary,writing', 'h8R51NoEVw'),
(6, 'Work related words', 'I don''t want to work :-(', 'vocabulary,writing', 'h8R51NoEVw'),
(6, 'Family related words', 'Don''t miss the birthdays~', 'vocabulary,writing', 'h8R51NoEVw'),
(7, 'Christmas eve', 'We cannot wait!', 'fun', 'h8R51NoEVw'),
(7, 'Christmas day', 'What did you got for Christmas ? :-)', 'fun', 'h8R51NoEVw'),
(8, 'North Jeju', 'There is so much to do!', 'travel,fun', 'h8R51NoEVw'),
(8, 'East Jeju', 'Do you know Aquaplanet?', 'travel,fun', 'h8R51NoEVw'),
(8, 'West Jeju', 'Is there something to do there?', 'travel', 'h8R51NoEVw'),
(8, 'South Jeju', 'Waterfalls!', 'travel,fun', 'h8R51NoEVw');

INSERT INTO tbl_translation (type, translated_id, key, value, lang) VALUES
('packages', 1, 'name', 'Premier coffret', 'fr'),
('packages', 1, 'description', 'Ceci est la description du premier coffret', 'fr');

