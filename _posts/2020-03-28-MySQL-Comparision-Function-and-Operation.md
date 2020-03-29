---
layout: post
title: "MySQL 비교함수 및 연산"
date: 2020-03-28 22:50:00 +0900
categories: [mysql, database]
---



## MySQL Comparision Function and Operation

- `like`: 문자열을 비교할 때, 사용하는 명령

  - 비교하는 문자열 둘 중 하나라도 NULL이라면, 결과도 NULL을 반환한다.

  - `wildcard 문자`로 `%` 와 `_`을 사용한다.

  - `%`는 n개의 문자를 의미한다.(0 <= n <= 무한대)

  - `_`는 정확히 1개의 문자를 의미한다.

    ```mysql
    select *
    from user
    where user_name like '이%';
    ```

  - 쿼리 결과: '이'로 시작하는 이름을 가진 user의 정보를 모두 가져온다.

  - `wildcard 문자` 를 포함하는 문자열을 찾는 연산을 하고 싶을 때에는 `이스케이프 문자`를 사용한다.`이스케이프 문자`는 기본으로 `\`으로 사용한다.

  - 즉, `_`를 포함하는 문자열을 찾고 싶을 때에는 다음과 같은 명령어를 사용한다.

    ```mysql
    SELECT 'David!' LIKE 'David\_';
    -> 0
    SELECT 'David_' LIKE 'David\_';
    -> 1
    ```

  - `ESCAPE` 절을 이용하여 이스케이프 문자(1개의 문자)를 바꿀 수도 있다.

    ```mysql
    SELECT 'David_' LIKE 'David|_' ESCAPE '|';
    -> 1
    ```

  - 일반적으로 사용할 때에는 대/소문자를 구분하지 않으나, 연산이 되는 대상이 `case-sensitive collation` 이나 `binary string`을 사용할 때에는 대소문자를 구분한다.

    ```mysql
    SELECT 'abc' LIKE 'ABC';
    -> 1
    SELECT 'abc' LIKE _utf8mb4 'ABC' COLLATE utf8mb4_0900_as_cs;
    -> 0
    SELECT 'abc' LIKE _utf8mb4 'ABC' COLLATE utf8mb4_bin;
    -> 0
    SELECT 'abc' LIKE BINARY 'ABC';
    -> 0
    ```

  - 표준 SQL에서 확장하여 MySQL에서는 문자열이 아닌 숫자에 대해서도 like문을 적용할 수 있다.

    ```mysql
    SELECT 10 LIKE '1%';
    -> 1
    ```

    

- `AND` , `OR` , `NOT` : where와 같은 조건절에서 쓰임

  ```mysql
  select *
  from user
  where user_name like '최%' and user_address like '서울%'
  ```

- `between` : 

- 



`like` 절: [MySQL 8.0 Docs String Comparision Function](https://dev.mysql.com/doc/refman/8.0/en/string-comparison-functions.html)