SELECT FLAVOR
FROM  (
        SELECT A.FLAVOR
            , ROW_NUMBER() OVER(ORDER BY A.TOT + B.TOT DESC) AS RN
        FROM (
                SELECT FLAVOR, SUM(TOTAL_ORDER) AS TOT
                FROM FIRST_HALF
                GROUP BY FLAVOR
             ) A
            , (
                SELECT FLAVOR, SUM(TOTAL_ORDER) AS TOT
                FROM JULY
                GROUP BY FLAVOR
             ) B
        WHERE A.FLAVOR = B.FLAVOR
        )
WHERE RN < 4
;