# ProductAndPriceDetailsService

ProductAndPriceDetailsService is a restful service which retrieves product name and product price for a given product based on productID.
It is also used to update the price of a product based on the product ID.

## Usage
* GET '/products/{productId}': Get the product name and price details of the passed product id.
* PUT '/products/{productId}': update the price info of the product id posted.

#### Prerequisites
- Java 8
- Maven > 3.0
- PriceDetailsService should be up and running
https://github.com/keerthikancharla/PriceDetailsApplication
- API Key to consume Target Product details service


### Build and Run

#### From terminal
Go to projects root folder and then type:
```$mvn spring-boot:run```

#### From Eclipse |Spring Tool Suite |IntelliJ
Import as *Existing Maven Project* and run it as *Spring Boot App*

