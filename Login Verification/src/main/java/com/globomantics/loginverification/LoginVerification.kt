package com.globomantics.loginverification

class LoginVerification {
    fun verify(email: string, password: string): Boolean {
        return (email == "test@globomantics.com" &&
                password == "test123") ||
                (email == "admin@globomantics.com" &&
                        password == "admin123")
    }
}