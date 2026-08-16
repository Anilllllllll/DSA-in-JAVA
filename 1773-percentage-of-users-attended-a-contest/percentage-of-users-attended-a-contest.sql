SELECT 
    r.contest_id,
    ROUND(COUNT(r.user_id) * 100.0 / t.total_users, 2) AS percentage
FROM Register r
CROSS JOIN (
    SELECT COUNT(*) AS total_users
    FROM Users
) t
GROUP BY r.contest_id, t.total_users
ORDER BY percentage DESC, r.contest_id ASC;