# Online Shopping System
![Version](https://img.shields.io/static/v1?label=java-version&message=%3E=11&color=blue) ![documentation](https://img.shields.io/static/v1?label=documentation&message=yes&color=green) ![maintanined?](https://img.shields.io/static/v1?label=maintained?&message=yes&color=green) ![License](https://img.shields.io/static/v1?label=license&message=ZAHID&color=orange)

README file forOnline Shopping System
## 🏠  [Homepage](https://github.com/ZahidFarooqDar/fs-10-Weekly-tests/tree/main/OnlineShoppingSystem)
## Prerequisities
* java >=11.0
* Spring Boot
* MySQL database

## Author

* 🙍‍♂️ Zahid Farooq Dar
  * LinkedIn: [@Zahid Farooq](https://www.linkedin.com/in/zahid-farooq-dar/)
  * Github: [@ZahidFarooqDar](https://github.com/ZahidFarooqDar)

## DATA FLOW
* Application is based on MVC architecture where we have
---
### MODEL
* It contains models namely User, Address, Product and OrderEntity
* In models especially in OrderEntity we have @ManyToOne mappins with every other model
---
### CONTROLLER
* This package contains different API end points of both Address and Employee model with two different controllers
* Main important api in here apart from CRUD api's we have an API by which we can place an order
---
### SERVICE
* Service package contain models logic for the API's
---
### REPOSITORY 
* It is the repository layer where we extend JPA repository.
* We also have some methods as well.
---
### DATA BASE DESIGN
* Here we are using database viz MySQL which is controlled by using:
* MYSQL WORKBENCH and
* SWAGGER
---

## PROJECT SUMMARY
* The application is designed to perform very basic CRUD operations on every Model, and to achieve mapping and It enables us to place an Order
---
## 📝 License

 Copyright @ 2019 [@ZahidFarooqDar](https://github.com/ZahidFarooqDar)


# 

This README was generated with ❤️ by [@ZahidFarooqDar](https://github.com/ZahidFarooqDar)
