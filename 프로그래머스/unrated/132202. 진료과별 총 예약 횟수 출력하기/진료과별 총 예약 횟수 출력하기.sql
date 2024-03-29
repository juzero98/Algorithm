-- 코드를 입력하세요
SELECT MC AS "진료과 코드", CNT AS "5월예약건수"
FROM (
    SELECT MCDP_CD AS MC,
        COUNT(*) AS CNT
    FROM APPOINTMENT
    WHERE TO_CHAR(APNT_YMD, 'YYYYMM') = '202205'
    -- AND APNT_CNCL_YN = 'N'
    GROUP BY MCDP_CD
    )
ORDER BY 2,1
;