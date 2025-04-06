# Write your MySQL query statement below
Select
    tweet_id
FROM  Tweets
 where
    char_length(content) > 15