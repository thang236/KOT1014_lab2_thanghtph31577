package com.example.lab2_thanghtph31577

fun main () {
    var year = 0;
    var s: String?
    println("Chương trình kiểm tra năm nhuận")
    do {
        println("Nhập 1 năm: ")
        s = readlnOrNull()
        while (s == null || s.toInt()<0){
            println("Nhập sai năm vui lòng nhập lại: ")
            s= readlnOrNull();
        }
        year = s.toInt()
        if (year % 4 == 0 && year % 100 != 0 || year % 400 ==0){
            println("Năm $year là năm nhuận")
        }else{
            println("Năm $year không phải là năm nhuận")

        }
        println("Tiếp không ? (c/k)")
        s = readlnOrNull()
        if (s == "k"){
            break;
        }
    }while (true)
    println("End!")

}