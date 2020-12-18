package com.example.kotlin_scope_functions

class User(
    var name: String = "Debasish",
    var contactNumber: String = "1237895654",
    var address: String = "xyz"
) {
    fun displayInfo() = print(
        "\n Name: $name\n " +
                "Contact Number: $contactNumber\n " +
                "Address: $address"
    )
}