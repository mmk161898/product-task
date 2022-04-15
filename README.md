# product-task

Hi, Thanks for accessing the Product Task codebase.

Kindly follow the below steps to start the product-task codebase on your local Machine
 
 Step-1 :- Take a clone of codebase using github.
 Step-2 :- Open any IDE to import the codebase.For Example, Eclipse, Spring Tool Suite, etc.
 Step-3 :- Go to File -> Import -> Existing Maven Projects -> Click on Next -> Browse project on your local Machine -> Click on Finish button.
 Step-4 :- Run application as "mvn clean" and "mvn install" to download all the required jars.
 Step-5 :- Run application as "Java Application" and select main class as "TaskApplication".
 
You are good to go with testing the functionality.

Find the below url and json for your reference to test application functionality. 

**Creating New Product 
  URL :- http://localhost:8080/v1/product/createProduct
  Request JSON :- {
    "name" : "Meet",
    "description" : "My description",
    "brand" : "Nike",
    "category" : "shoes"
}
  Response JSON :- {
    "id": "c45675a1-b831-46dc-8b30-dc38036f312d",
    "name": "Meet",
    "description": "My description",
    "brand": "Nike",
    "category": "shoes",
    "createdAt": "2022-04-15T16:03:48Z"
}

**Getting list of all the products based on Category
   URL :- http://localhost:8080/v1/product/apparel
   Response JSON :- [
        {
        "id": "6e366164-6163-3137-2d63-7936612d3566",
        "name": "Jeans",
        "description": "Slim fit Jeans",
        "brand": "Highlander",
        "category": "apparel",
        "createdAt": "2022-01-24T12:00:28Z"
        },
        {
        "id": "67366176-6163-3737-2d63-6632612d3566",
        "name": "Shorts",
        "description": "Denim Short",
        "brand": "Denim",
        "category": "apparel",
        "createdAt": "2022-04-04T12:00:28Z"
        },
        {
        "id": "61366164-6163-3137-2d63-6636612d3566",
        "name": "Black T-shirt",
        "description": "Adidas Black T-shirt",
        "brand": "Adidas",
        "category": "apparel",
        "createdAt": "2022-04-14T11:00:28Z"
        },
        {
        "id": "62366166-6163-3337-2d63-6639612d3466",
        "name": "Red Shirt",
        "description": "Red Hugo boss Shirt",
        "brand": "Hugo boss",
        "category": "apparel",
        "createdAt": "2022-04-14T12:00:28Z"
        }
     ]
     
     
 Thanks for using Task Application.
   
