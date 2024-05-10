package com.example.lab2_thanghtph31577

fun main () {
    var a = 0.0
    var b = 0.0
    println("Nhập a :")
    var s = readlnOrNull()
    if (s !=null) a = s.toDouble()
    println("Nhập b : ")
    s = readlnOrNull();
    if (s != null) b = s.toDouble();
    if (a == 0.0 && b == 0.0) {
        println("Phương trình có vô số nghiệm");
    } else {
        if (a == 0.0 && b != 0.0) {
            println("Pt vô nghiệm");
        }else{
            val x = -b/a;
            println("Pt có nghiệm X= $x")
        }
    }


}