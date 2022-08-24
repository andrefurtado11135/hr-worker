CREATE TABLE sch_worker.worker(
    id BIGSERIAL NOT NULL PRIMARY KEY,
    name VARCHAR(150) NOT NULL,
    daily_income NUMERIC(10, 2)
);