# RedisDemo
1. install redis in mac using below:
brew install redis
2. start redis server using below:
redis-server
3. import project
4. clean
5. run as server
6. post data: http://localhost:8080/redis-demo/add
form-data:
key = 1_s
value = sushil mittal
7. Get keys : http://localhost:8080/redis-demo/keys
8. post: http://localhost:8080/redis-demo/getViaKey
form-data:
key = 1_s
