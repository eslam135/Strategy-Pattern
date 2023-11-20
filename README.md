# <span style = "color:cyan" > Strategy-Pattern </span>

## <span style = "color:pink" >What is Strategy Patterns? </span>

### <span style="color:lightgrey">The strategy patter is a behavioral design pattern that defines a family of algorithms, encapsulate them making them interchangeable within a context object and varying them from the client.</span>

## <span style = "color:pink" >Why is it used?</span> 

### <span style="color:lightgrey"> It is usually used in Java and other OOP based languages to byPass a problem with the inheritance hierarchy where behaviours can only be shared vertically not horizontally, so if a child wants to have the same behaviour as another parent which is different from the parent's base behaviour code will have to be copied and pasted multiple times to allow this to happen

## <span style = "color:pink" > How does it work?

### <span style="color:lightgrey"> 1- Identify the varying behavior:
Determine the parts of your code that have interchangeable behaviors. These are the behaviors that you want to encapsulate and make interchangeable.

### <span style="color:lightgrey"> 2- Define the Strategy interface:
Once you've identified the varying behavior, create an interface or abstract class that defines the common methods for the interchangeable behaviors. This interface will be implemented by the concrete strategy classes. In the example code, the Strategy interface would define a method like "pay(int amount)" .

### <span style="color:lightgrey"> 3- Implement the concrete strategy classes:
Create separate classes for each behavior, implementing the Strategy interface. Each concrete strategy class will provide its own implementation of the behavior. For example, you could have concrete strategy classes for paying by credit card, PayPal, or any other payment method, for the sake of simplicity we will only use PayPal and credit card only in our example.

### <span style="color:lightgrey"> 4- Create the context class : 
The context class is the class that contains the object whose behavior needs to be changed dynamically. In this class, define a field to hold a reference to the current strategy object. The context class should have methods to set and get the strategy object. In the given code, the context class is the ShoppingCart class, which has a setPaymentStrategy() method to set the payment strategy dynamically.

### <span style="color:lightgrey"> 5- Delegate behavior to the strategy object: 
In the methods of the context class where the interchangeable behavior needs to be executed, delegate the execution to the strategy object. The strategy object will handle the specific implementation of the behavior. In the ShoppingCart class, the checkout() method delegates the payment logic to the current payment strategy.

              +----------------+                 +-----------------+
              |  ShoppingCart  |                 | PaymentStrategy |
              |----------------|<>---------------|-----------------|
              |-paymentStrategy|                 |    +pay()       |
              |                |                 +-----------------+
              |+setPaymentStrategy()|                 /_\
              |+checkout()     |                       |
              +-----------------+                      |
                                                       |
                                                       |
       +----------------------+             +------------------------+
       |   PayByCreditCard    |             |     PayByPayPal         |
       +----------------------+             +------------------------+
       | -cardNumber: String  |             | -email: String          |
       | -expirationDate: String |          | -password: String       |
       | -cvv: String         |             +------------------------+
       +----------------------+             | +pay()                  |
       | +pay()               |             +------------------------+
       +----------------------+
# <span style = "color:pink" > Next Patter: 
https://github.com/eslam135/Observer-Pattern
