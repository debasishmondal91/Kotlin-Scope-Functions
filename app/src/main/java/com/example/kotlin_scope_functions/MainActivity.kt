package com.example.kotlin_scope_functions

fun main() {
    performScopeLet()
    performScopeRun()
    performScopeWith()
    performScopeApply()
    performScopeAlso()
}

fun performScopeLet() {
    val user = User().let {
        "The name of the user is ${it.name}"
    }
    println(user)
}

fun performScopeRun() {
    User().run {
        name = "Mondal"
        contactNumber = "18883913981"
        return@run "The details of the user is ${displayInfo()}"
    }
}

fun performScopeWith() {
    val user = with(User()) {
        return@with "The name of the Person is: $name"
    }
    println(user)
}

fun performScopeApply() {
    val user = User().apply {
        name = "Debaissh"
        contactNumber = "8782787897"
        address = "adjdkhadjadh"
    }
    println(user.displayInfo())
}
// we use apply where we need the instance of Intent
/*fun createIntent(intentData: String, intentAction: String) =
        Intent().apply {
            action = intentAction
            data = Uri.parse(intentData)
        }*/


fun performScopeAlso() {
    val user = User().also { currentUser ->
        println("The current user name is ${currentUser.name}")
        currentUser.name = "Kotlin Also"
    }.run {
        "The Modified name is $name"
    }

    println(user)
}