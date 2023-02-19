# accessingdataoracle

## STARTUP Oracle Database.
https://github.com/oracle/docker-images/blob/main/OracleDatabase/SingleInstance/README.md
```
docker run --name oracle_si_21c -p 1521:1521 -p 5500:5500 -e ORACLE_SID=orcl -e ORACLE_PDB=pdb_orcl -e ORACLE_PWD=oracle21c -e INIT_CPU_COUNT=2 -v /var/lib/containers/disk03/oradata:/opt/oracle/oradata oracle/database:21.3.0-ee

```
## Create Database User.
```
create user springuser identified by "ThePassword" default tablespace users quota unlimited on users;
grant connect,resource to springuser;
```

## Add Data
```
curl http://localhost:8081/demo/add -d name=First -d email=someemail@someemailprovider.com
```

## Show Data
```
curl http://localhost:8081/demo/all
```
