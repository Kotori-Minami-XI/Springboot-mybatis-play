# SpringBoot-Mybatis
SpringBoot-Mybatis

### 1. 数据库

```
USE ssm_db

CREATE TABLE `person` (
  `personId` int NOT NULL AUTO_INCREMENT,
  `personName` varchar(10) DEFAULT NULL,
  `personAge` int DEFAULT NULL,
  PRIMARY KEY (`personId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `person` values (1,"Kotori",16)
```

