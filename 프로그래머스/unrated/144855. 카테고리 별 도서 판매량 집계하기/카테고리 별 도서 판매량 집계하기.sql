SELECT A.CATEGORY, SUM(B.TOTAL_SALES) AS TOTAL_SALES
FROM BOOK A,
    (
        SELECT BOOK_ID, SUM(SALES) AS TOTAL_SALES
        FROM BOOK_SALES
        WHERE TO_CHAR(SALES_DATE, 'YYYYMM') = '202201'
        GROUP BY BOOK_ID
    ) B
WHERE A.BOOK_ID = B.BOOK_ID
GROUP BY A.CATEGORY
ORDER BY A.CATEGORY
;