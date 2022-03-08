# NULL 처리하기



``` sql
SELECT animal_type, ifnull(name,'No name'), sex_upon_intake from animal_ins  order by animal_id;

# decode(name, null, 'no name',name) name 도 가능
```

