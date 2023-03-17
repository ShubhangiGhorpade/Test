1.Explain Java componets?
-->jdk,jre,jvm
jdk:java development Kit.
    it is platform dependent.
    it is combination of development tool+jre
jre:java runtime environment.
    it is platform dependent.
    it is combination of jvm and set of libraries.
    it is specifically used.
    atleast jre must be present to execute.
    it provides the run time environment
jvm:java virtual machine.
    it is used to load,verify and execute the program.
    in jvm the bit code is plantform independent.
    whereas,jvm is platform dependent.


2.Explain java Features?
-->1.simple:It is easy to learn java without having the knowledge compared to c/c++.Because in c/c++ we have pointers which is not easy to learn and it is                   also high level language.

2.platform independent:java is platform independent because it works on WORA principle i.e write once and run anyWhere principle For example:we can write code 
in windows and we can run that on any platform like linux,mac etc..

3.portable:It is portable because we can take the bit code and run the code on which ever system.Ex:if we have the airtel sim then we can port to other sim like jio,idea etc...

4.secure:Java is Secure because the bit code is verified and it checks the code line by line and also it checks the syntax error if tere is any error the compiler will may sure we correct the code.

5.robust:In robust we can two functionalities ie.1.Carrabage collector  2.Exception Handling
              1.Carrabage Collector:It helps in Memory Management where the unused variables are deleted from the system.
              2.Exception Handling:Where the abnormal flow of execution stops.

6.Architectural Neutral:The bit code can be excuted anyWhere which is not dependent on the system.It can be run on any Platform.

3.Explain Constructor and it's types?
-->Constructor:It is special Method where it has same name as MethodName which doesnot ave return type.
               Constructor are basically used to intialize the instance variable.
               It will provide default constructor ie. compiler will provide default constructor if we dont give also.
               Constructor are used in constructor chaining where we use this and super Keyword.
               Constructor chaining using this is only in the same class.
               Constructor chaining using super is used in parent class(inherited class).
          constructor OverLoading:It is calling one constructor into another constructor.
Types:1:Default Constructor:The compiler will provide the default constructor which donot have parameters.
      2:Parameterized Constructor:It is user/custom constructor where we need to provide the parameter variable in the constructor.

4.Explain Variable and i's type?
-->Variables:Variables are those which stores the references in the memory Location.
Variables are 2 types:1.ClassLevel Variables  2.MethodLevel Varibles
1.ClassLevel Variale:Declared within the class and outside the method.
        2 types:1.Static variable:Variable those use static as a Keyword.
                                  We can access static variables by className so, they are called as classLevel variables.And also we can access by      reference.
                2.Instance variable:Variable those donot use static as a Keyword.
                                    We can access only by reference
2.MethodLevel Variable:Declared within the Method only.
        2 types:1.Local variable:Variable those are declared in the method and needs to be intialized.
                2.parameter variable:Variable those are declared int method parantises..


5.Why java is not pure oop language?
-->Because it has primitive data types like int,double,long,float,short,byte etc...

6.Explain dynamic and static binding?
-->Static binding:It is nothing but OverLoading that is compile time Polymorphism.
   Dynamic binding: It is nothing but OverRiding that is RunTime Polymorphism.

7.Explain OOp's Concept?
-->In java we have 4 principles/concepts.
1.Encapsulation:Binding of data into single entity.
                It can be achieved by Making the properties private which is used to hide the property.
                And to access/Modify we use Setter and Getter Method where setter is used to intialize the value and getter is used to access the reference.
We can Achieve Encapsulation by Access Specifiers.
             EX:Wrapper class,Gmail and Capsule.


2.Inheritance:Acciquring the assets from the parents class.
              We use Extend as the Keyword.
              It is IS-Relationship.
              EX:HumanBeing.
In inheritance we have 5type:
1.single Inheritance:One super class is inherited by one parent class.
2.Multi-Level Inheritance:one super inherited by chid class and then extended by sub classes.
3.Hiearicial Inheritance:one super class inherited by multiple sub classes.
4.Multiple Inheritance:mmultiple super class have multiple sub class
5.Hybrid Inheritance :It is combination of single and multiple Inheritance.
    whereas,Multiple and Hybrid Inheritance is not supported in java.Because it creates the diamond problem ie..It creates the ambiqute.

3.Polymorphism:poly:Many Morphism:form
     One thing that have many form.//It is thing which behaves differently in different forms.
          EX:Class
     we can achieve by 2 ways:1.OverLoading:It is same methodName but different parameters.
                                            It is also Compile time polymorphism
                            OverLoading can be achieved by:Method and Constructor.

                             2.OverRiding:It is same MethodName with same Parameters.
                                          It is achieved by runtime Polymorphism because jvm will decide which class needs to be called.
                            OverRiding can be achieved  only by Methods.

4.Abstraction:Hiding the Implementation and showing the information to the end user.
             We can Achieve by 2 ways:1.Abstract Class:We use abstract as a Keyword.
                                                       WE have concrete method and also abstract method. 

                                      2.Interface:We use implements as the keyword.
                                                  We have abstract Method only.

11.Explain Interface?
-->Interface is connecting two systems
In interface we achieve 100% abstraction.
In interface we have only abstract method.
we have static final variable.
We have default and static method.

12.Explain Exception?
-->It is unexceptional event.
It is extended by Throwable.	
It is abnormal condition occured during the the flow of exceution.
Ex:RuntimeException	

13.Explain AccesSpecifier?
-->4 types:
1.public:we can access within and outside the package
2.package default:we can access only within the same package.
3.private:we can access only within the class
4.protected	:we can access within the same package and inherited by the sub class.

14.difference between abstraction and interface?
-->	1.Abstract Class:We use abstract as a Keyword.
                     WE have concrete method and also abstract method.
                     It is not 100% abstraction.					 

    2.Interface:We use implements as the keyword.
                We have abstract Method only.
                In interface we achieve 100% abstraction.				