> I make new repo in the same name because it have some problems. if you want to view old repo, you can view in NotebookShopSpringBoot2

# NotebookShop by SpringBoot
The Springboot web can connect Mysql as database.

## Config DB
You must have schema of database that I specified.

**name** : notebook

| Column Name | Datatype |
| ------ | ------ |
| id | INT(11) PK |
| brand | VARCHAR(45) |
| model | VARCHAR(45) |
| price | DOUBLE(10,2) |

**port** : Go to **application.propperties** in resource and add port of your Database in **spring.datasource.url**

**username** : Go to **application.propperties** in resource and add your username in **spring.datasource.username**

**password** : Go to **application.propperties** in resource add add you password in **spring.datasource.password**

and run Database.

## My Springboot web can do?

**Home Page**

```sh
localhost:8080
```

result on screen : Welcome from controller

______

**Show emply notebook**

**GET** method
```sh
localhost:8080/notebook
```

result on screen : []

_______

**Add new Notebook**

**POST** method
```sh
localhost:8080/add
```

```
  {
	  "brand":"Dell",
	  "model":"XPS-13",
	  "price":12900.00
  }
```    

result on screen : notebook id 0 Saved
_______
**Show all Notebook**

**GET** method
```sh
localhost:8080/notebook
```
result on screen : array of notebook
```
  {
	  "brand":"Dell",
	  "model":"XPS-13",
	  "price":12900.00
  }
```    
_______
**Update exist Notebook**

**UPDATE** method
```sh
localhost:8080/notebook/update/0
```
```
  {
	  "brand":"HP",
	  "model":"Omen-15",
	  "price":39900.00
  }
```
result on screen : Update Done!
if id not exist : id not found
_____

**Show all Notebook**

**GET** method
```sh
localhost:8080/notebook
```
result on screen : array of updated notebook
```
  {
	  "brand":"HP",
	  "model":"Omen-15",
	  "price":39900.00
  }
```    
_______

**Delete exist Notebook**

**Delete** method

```sh
localhost:8080/notebook/delete/0
```

result on screen : Notebook 0 has been Delete
_____

**Delete All Notebook**

**Delete** method

```sh
localhost:8080/notebook/delete/0
```
result on screen : Notebook catalog has been reset
