# accessingdataoracle

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
