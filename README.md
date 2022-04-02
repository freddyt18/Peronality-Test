# Peronality-Test

THIS PROJECT IS STILL IN PROGRESS

Prerequisites :
  * Basic Understanding of File I/O
  * OOP Concept of Java
  * JavaFX
  * SceneBuilder

## Table of Contents  
1. [Overview](#overview) 
2. [Built Using](#built-using)
3. [Project Features ( Explore, Test, Profiles, Setting, Log out)](#project-features)
4. [Contributors](#contributors)
5. [Installation](#installation)
6. [References](#references)

## Overview 
The program will first show a [<i><b>login page</b></i>](#login-page) for existing users to access their data.
* The login section handles [invalid information*](#invalid-information) given by the users.
  * If the information given is verified, the program will redirect the user to the <b>menu</b> section.
  * Else, An [<b>alert</b>](#alert) will pop up.
* If the user is new, meaning that they will not have any credential on our <i><b>[database](#database)</i></b>, they can [<i><b>register</b></i>](#register) for a new credential.
  * The registration form takes <b><i>4 inputs</b></i>:
    * Email
    * Username
    * Password
    * Retyped Password

  * The registration form also handles [invalid information*](#invalid-information) given by the user.
    * If the input data verifies with the invalid information handling algorithm, an account will be created into our <i><b>[database](#database)</i></b>.
    * The program will then redirect the user back to our login page.

<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img src="Design/Img/login.png">

<hr>

The testing mechanism is really simple.
* You take a test
* The program generates a result from those [<b><i>10 questions</i></b>](#how-are-the-results-generated) you answered
* Meanwhile, the program also writes your information back to the <i><b>[database](#database)</i></b>
* The [<b><i>Back</i></b>](#back) button inside the result page will return the user back to our <i>menu page</i>.

<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img src="Design/Img/test.png">

<hr>

<h3>But Here's a Catch</h3>

 When you answer those [<b><i>10 questions</i></b>](#how-are-the-results-generated), each question contains a specific score depending on which you choose, but ultimately, it comes down to <b>32 results</b>, each result has its own unique id, you guessed it, its <i>number - 1</i>, the program will then suggest up to 4 people whose personality ids are in range of -2 and +2 to your current personality id.

## Built Using

This project is built using the following tools:
    
1. [Figma](https://www.figma.com/): used for prototyping the project.
2. [Screen Builder](https://www.oracle.com/java/technologies/javase/javafxscenebuilder-info.html): used for building the UI of the application.
3. [JavaFX](https://openjfx.io/): along with screen builder, the application is built using JavaFX.  
4. [VS Code](https://code.visualstudio.com/): IDE used while working on the project.
5. [Github](https://github.com/): used to host the project for team collaboration.


## Project Features

### Login Page
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img src="Design/Img/loginPage.png">
<br>
<div id="alert"></div>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img src="Design/Img/loginInvalid.png">

### Register
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img src="Design/Img/signUp.png">


### Explore
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img src="Design/Img/explore.png">

### Test
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img src="Design/Img/testInMenu.png">
<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img src="Design/Img/missing.png">
<br>
<div id="back"></div >
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img src="Design/Img/afterTest.png">
<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img src="Design/Img/reveal.png">

### Profile
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img src="Design/Img/profilePRE.png">
<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img src="Design/Img/profilePOST.png">

### Setting

- Edit Profile
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img src="Design/Img/settingEdit.png">

- Change Password
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img src="Design/Img/settingPassword.png">


### Log Out
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img src="Design/Img/logout.png">


### How are the results generated?


<div id="ocean"></div>

* OCEAN <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img src="Design/Img/ocean.jpg">

## Contributors

* <a href="https://github.com/freddyt18/">Doung Keopitou</a> - Login & Sign Up & Logout
* <a href="https://github.com/whatanakKean">Kean Whatanak</a> - Account Setting
* <a href="https://github.com/sovorteyly">Ly Sovortey</a> - Delete account & Explore
* <a href="https://github.com/OukVathanak">Ouk Vathanak</a> - Testing & Matching 

## Installation


## References 

<div id="invalid-information"></div>

- <h3>Invalid Information</h2>
<blockqoute>When the user inputs a specific data, say a <b>username</b> for the [<b>login page</b>](#login-page), the data will be processed in its <b>java controller file</b> to see if the data is <b>acceptable</b> </blockqoute>

<div id="database"></div>

- <h3>Database</h3>
<blockqoute>We are trying to reduce the complexity of our program as much as possible. So, We decided <b><i>not to use</i></b> any database that requires a third party app (E.g XAMPP) or additional libraries to access the data </blockqoute>
