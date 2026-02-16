-- liquibase formatted sql

-- changeset Seungwon-Choi:1
CREATE TABLE tests
(
    test_id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '테스트 PK',
    name    VARCHAR(50) NOT NULL COMMENT '테스트 이름'
)
