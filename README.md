# springboot-kotlin-article

### Things to do to run locally:
#### Clone repository:
```
git clone https://github.com/hendisantika/springboot-kotlin-article.git
```

#### Go to the folder
```
cd springboot-kotlin-article
```

#### Run the app
```
gradle clean bootRun --info
```

#### Login Username account
|#|Username|Password|
|---|---|---|
|1|naruto|naruto|
|2|sasuke|sasuke|

## Running via Docker

### Package Spring Boot App
```
gradle clean build
```

### To build docker build
```
docker build -t "hendisantika/springboot-kotlin-article" .
```
### Start container
```
docker run -d -p 8080:8080 springboot-kotlin-article
```

### Stop container
```
docker stop {containerId}
```
docker stop springboot-kotlin-article

### Remove container
```
docker rm springboot-kotlin-article
```
### Running MySQL image
```
docker run -p 6603:3306 --name=docker-mysql --env="MYSQL_ROOT_PASSWORD=root" --env="MYSQL_PASSWORD=root" --env="MYSQL_DATABASE=kotlin_demo" mysql
```
### Running spring boot image
```
docker run -d --name springboot-kotlin-article --link docker-mysql:mysql -p 8080:8080 -e DATABASE_HOST=docker-mysql -e DATABASE_PORT=6603 -e DATABASE_NAME=springboot-kotlin-article -e DATABASE_USER=root -e DATABASE_PASSWORD=root hendisantika/springboot-kotlin-article
```

### See running containers docker ps
```
docker ps 
```


### Screen shot

#### Login Page

![Login Page](img/login.png "Login Page")

#### Home Page

![Home Page](img/home.png "Home Page")

#### Add New Article

![Add New Article](img/add.png "Add New Article")

#### List Article

![List Article](img/list.png "List Article")

#### Search Page

![Search Page](img/search.png "Search Page")

#### Find Page 

![Find Page](img/find.png "Fing Page")