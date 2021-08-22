CREATE DATABASE springcloudstreamrabbitmq;

USE springcloudstreamrabbitmq;

CREATE TABLE IF NOT EXISTS domain(
domain VARCHAR(255),
create_date VARCHAR(255),
update_date VARCHAR(255),
country VARCHAR(255),
is_dead boolean,
A VARCHAR(255),
NS VARCHAR(255),
CNAME VARCHAR(255),
MX VARCHAR(255),
TXT VARCHAR(255),
PRIMARY KEY(domain)
);

SELECT * FROM domain ;