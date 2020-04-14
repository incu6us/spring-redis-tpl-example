spring-redis-tpl-example
---

Example for [Medium](https://medium.com/p/7b20b01f34ee)

### Create request:
```bash
curl -XPOST http://localhost:9091/api/addModel  -d 'id="1"&data="test"'
```

### Get request:
```bash
curl "http://localhost:9091/api/getModel?id=%221%22"    # response(if previous step was prepared): {"id":"\"1\"","data":"\"test\""}
```

