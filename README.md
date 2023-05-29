# ATM Machine Project System



# project-documentation


<h3 align="center">ATM Machine Project</h3>

<p align="center"> Few lines describing your project.


## 📝 Table of Contents
- [About](#about)
- [Getting Started](#getting_started)
- [Deployment](#deployment)
- [Usage](#usage)
- [Flow Chart](#flowchart)
- [TODO](../TODO.md)
- [Contributing](../CONTRIBUTING.md)
- [Authors](#authors)
- [Acknowledgments](#acknowledgement)
    
    ## 🧐 About <a name = "about"></a>
    
We can construct an ATM program in Java to display ATM transactions. An automated teller machine (ATM) or cash machine (In British English) is an electronic telecommunications system that allows customers of banking firms to conduct financial transactions. The user must choose a choice from the options shown on the screen in the ATM application. For example, withdraw money, deposit money, check your balance, and exit the available options.
    
    

## 🏁 Getting Started <a name = "getting_started"></a>
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites
What things you need to install the software and how to install them. i) Java ii) Mysql

Installing
A step by step series of examples that tell you how to get a development env running.

Java Installation:

Go to Chrome and type Oracle java.
Go to Official website click on it.
It will take to the Official website on top of right side you will get Download Java click on it.
Click on the JDK download link according to your operating system.
Check the box to accept the License Agreement. It activates the download button.
Click on install buuton to install.
After successful installation go to the command prompt.
type java --version.
It ensures that Java is successfully installed in your system.
 ### Working of ATM Program in Java
    To withdraw your funds, deposit your funds and check your account balance before exiting, the following operations are needed to perform in the ATM program:

Withdraw: For withdrawing the funds, gets the withdrawal amount from the user, deduct it from the total balance, and display the message.
Deposit: For depositing the funds, gets the deposit amount from the user to add, add it to the total balance, and display the message.
Check the balance: For checking the balance, display the user’s total balance.
Exit: Return the user to the home page or initial screen by exiting the current Transaction mode.
    
    Given below is the example of the ATM Program in Java:

Example for ATM program in Java to withdraw amount, deposit amount and check the balance.
    
    An output of the above code for the withdrawal operation is:
     <img width=500px height=200px src="./images/img1.jgp" alt="Project logo"></a>
     
     
     An output of the above code for the deposit operation is:
        <img width=500px height=200px src="./images/img2.jgp" alt="Project logo"></a>
        
     Finally, an output of the above code for the deposit operation is:
        <img width=500px height=200px src="./images/img3.jgp" alt="Project logo"></a>
        
        
        
        As in the above program, the ATM class is created which contains withdraw(), deposit() and printbalance() functions. The withdraw() function is used to perform the withdraw operation; this function accepts the balance and the withdrawn amount. Inside the withdraw() function, first check whether the balance is greater than the withdraw amount or not; when it is true, then update the balance by subtracting the withdraw amount from the balance. Next, the function deposit() is used to performs the deposit operation; this function accepts the balance and the deposit amount.

Inside the deposit() function, it updates the balance by adding the deposit amount to the balance. Next, the printbalance() function is used to print the balance; it accepts the balance. Then, in the main function, a balance variable of an integer is created. Next, printing the selecting pitons for withdrawing, deposit, balance, and exit operations, depending on the specific option selection the case gets to execute, as we can see in the above output.

###conclusion

An automated teller machine (ATM) is an electronic telecommunications system that allows customers of banking firms to conduct financial transactions. We can create an ATM program in Java to display ATM transactions, and the user can withdraw money, deposit money, check the balance, and exit from the ATM.
     


🚀 Deployment
Add additional notes about how to deploy this on a live system.

i) Click on the Project. ii) go to default package. iii) Go to the project file . iv) Right Click on the project file v) Click on the Run file to run the project file.

⛏️ Flow Chart
flow chart

Java - Java

✍️ Authors
@SkillLymc - FSD
See also the list of contributors who participated in this project.

🎉 Acknowledgements
Hat tip to anyone whose code was used

Inspiration I took the inspiration from the junie Denny solomon madam and Bhupendra pharihar sir from the Skill-lync
To complete the project they helped me alot.

References I refered the some youtube lectures videos and read some documentation about java and Mysql languages.
