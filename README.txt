Pre nego sto je pokrenemo aplikaciju treba da podesimo 'application.properties' fajl koji u '\src\main\resources' folderu.
Obratite paznju na sledece redove:
                                                      ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
spring.datasource.url=jdbc:sqlserver://localhost:1433;databaseName=testDB;encrypt=true;trustServerCertificate=true
spring.datasource.username=user1
spring.datasource.password=12345
                           ↑↑↑↑↑

databaseName treba da ogovara imenu baze koju koristimo u sql serveru (sql sever servis treba da je pokrenut i baza napravljena)
kredencijali moraju biti ispravni inace nije moguce buildovanje aplikacije.
bazu mozete napraviti sa prilozenim sql skriptom 'CreateDATABASE.sql'
tabele i podatke ako zelite napravite sa 'CreateTABLES.sql' i 'InsertMockData.sql'


Aplikaciju pokrecemo u IDE okruzenju sa opcijom open project i biranjem 'restapisqldemo' foldera.
Ovaj projekat je izvorno napravljen u Apache NetBeans-u ali i druga okruzenja poput IntelliJ-a mogu da ga pokrenu.
'Run Project' ce pokrenuti aplikaciju ako su sva podesavanja ispravna. 

Takodje mozemo da build-ujemo projekt i da ga pokrenemo direktno iz .jar fajla (iz konzole ili explorer-a)

API endpoint-e mozemo da testiramo preko konzolnih komandi ili npr. postman-om.

Dole je lista konzolnih komandi (windows cmd) sa kojima mozemo da testiramo API (izmeniti Request Parametre i JSON objekte po potrebi):


curl -X GET "localhost:8080/user/get?id=1"

curl -X DELETE "localhost:8080/user/delete?id=1"

curl -X POST "localhost:8080/user/add" -H "Content-Type: application/json" -d "{\"id\": \"0\",\"firstName\": \"Pera\",\"lastName\": \"Peric\",\"email\": \"pera@gmail.com\"}"

curl -X PUT "localhost:8080/user/update" -H "Content-Type: application/json" -d "{\"id\": \"1\",\"firstName\": \"PeraUnapredjen\",\"lastName\": \"Peric\",\"email\": \"pera@gmail.com\"}"

curl -X POST "localhost:8080/account/add" -H "Content-Type: application/json" -d "{\"accountNumber\": \"111122223333\",\"user\": {\"id\": \"1\",\"firstName\": \"Marko\",\"lastName\": \"Petrovic\"}}"

curl -X GET "localhost:8080/account/get?id=1"


Za vise detalja o API dokumentaciji pogledajte APIdocumentation.txt


