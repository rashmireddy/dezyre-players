players = LOAD '/user/rashmi/players/runs' USING PigStorage (',') as (player_id:int,year:int,country:chararray,opposition_team:chararray,runs_scored:int,balls_played:int);
player_data = FOREACH players GENERATE player_id,runs_scored,balls_played;
grpd = GROUP player_data BY player_id;
smmd = FOREACH grpd GENERATE group, SUM(player_data.runs_scored), SUM(player_data.balls_played);
DUMP smmd;
STORE smmd INTO '/user/rashmi/players/output';
