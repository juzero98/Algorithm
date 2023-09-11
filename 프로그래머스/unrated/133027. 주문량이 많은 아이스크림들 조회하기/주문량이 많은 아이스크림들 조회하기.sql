-- SELECT FLAVOR
-- FROM  (
--         SELECT A.FLAVOR
--             , ROW_NUMBER() OVER(ORDER BY A.TOT + B.TOT DESC) AS RN
--         FROM (
--                 SELECT FLAVOR, SUM(TOTAL_ORDER) AS TOT
--                 FROM FIRST_HALF
--                 GROUP BY FLAVOR
--              ) A
--             , (
--                 SELECT FLAVOR, SUM(TOTAL_ORDER) AS TOT
--                 FROM JULY
--                 GROUP BY FLAVOR
--              ) B
--         WHERE A.FLAVOR = B.FLAVOR
--         )
-- WHERE RN < 4
-- ;

-- UNION 풀이
SELECT FLAVOR
FROM (
    SELECT FLAVOR, ROW_NUMBER() OVER(ORDER BY SUM(TOTAL_ORDER) DESC) AS RN
    FROM (SELECT * FROM FIRST_HALF
        UNION
        SELECT * FROM JULY)
    GROUP BY FLAVOR
    )
WHERE RN < 4
;