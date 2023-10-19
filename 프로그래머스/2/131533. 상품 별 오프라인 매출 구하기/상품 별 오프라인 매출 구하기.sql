SELECT C.PRODUCT_CODE, C.PRICE * C.SA AS SALES
FROM (SELECT A.PRODUCT_ID , A.PRODUCT_CODE, A.PRICE, SUM(B.SALES_AMOUNT) AS SA
FROM PRODUCT A
INNER JOIN OFFLINE_SALE B ON A.PRODUCT_ID = B.PRODUCT_ID
GROUP BY A.PRODUCT_ID , A.PRODUCT_CODE, A.PRICE) C
ORDER BY SALES DESC, C.PRODUCT_CODE;