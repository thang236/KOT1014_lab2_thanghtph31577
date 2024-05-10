package com.example.lab2_thanghtph31577

fun main() {
    var list: ArrayList<SinhVien> = ArrayList();
    var sv1: SinhVien = SinhVien("thang", "PH31577", 9.5F, true, 18);
    var sv2: SinhVien = SinhVien(tenSv = "minh", diemTB = 9.9F, daTotNghiep = false, tuoi = 19, MSSV = "PH31566")

    list.add(sv1);
    list.add(sv2);
    //them
    do {
        println("Quản lý sinh viên")
        println("1. Thêm Sinh Viên")
        println("2. Thêm Sinh Viên")
        println("3. Sửa Sinh Viên")
        println("4. Xóa Sinh Viên")
        println("0. Thoát chương trình")

        println("Vui lòng chọn chức năng")
        var s = readlnOrNull()
        while (s == null || s.toInt() < 0) {
            println("Hãy chọn chức năng bằng số 1 ,2 ,3 ... ")
            s = readlnOrNull();
        }
        when (s.toInt()) {
            1 -> {
                if (list.size == 0) {
                    println("Chưa có sv nào");
                } else {
                    for (i in 0 until list.size) {
                        println(list[i].toString())
                    }
                }


            }

            2 -> {
                println("Nhập tên sinh viên");
                s = readlnOrNull();
                while (s == null) {
                    println("Tên sinh viên không được để trống!")
                    s = readlnOrNull();
                }
                var name = s

                println("Nhập tuổi sinh viên");
                s = readlnOrNull();
                while (s == null || s.toInt() < 18) {
                    println(" Nhập sai vui lòng nhập lại(Tuổi sv phải trên 18)")
                    s = readlnOrNull();
                }
                var age = s.toInt()


                println("Nhập MSSV sinh viên");
                s = readlnOrNull();
                while (s == null) {
                    println("Vui lòng nhập MSSV")
                    s = readlnOrNull();
                }
                var MSV = s;

                println("Nhập điểm sinh viên");
                s = readlnOrNull();
                while (s == null || s.toInt() !in 0..10) {
                    println(" Nhập sai vui lòng nhập lại(điểm phải lơn hơn 0 và nhỏ hơn 10)")
                    s = readlnOrNull();
                }
                var pointTB = s.toFloat()

                println("Sinh viên đã tốt nghiệp hay chưa(c/r) ?");
                s = readlnOrNull();
                while (s == null) {
                    println(" Nhập sai vui lòng nhập lại(Tuổi sv phải trên 18)")
                    s = readlnOrNull();
                }
                val tn: Boolean = s.equals("r", ignoreCase = true)

                list.add(SinhVien(name, MSV, pointTB, tn, age))
                println("Thêm sv thành công")


            }

            3 -> {
                println("Vui lòng nhập số thứ tự sinh viên (hoặc MSSV) cần sửa:")
                s = readlnOrNull();
                if (s != null) {
                    val check: Int? = s.toIntOrNull();
                    if (check != null) {
                        if (check < list.size) {
                            println("Nhập tên sinh viên");
                            s = readlnOrNull();
                            while (s == null) {
                                println("Tên sinh viên không được để trống!")
                                s = readlnOrNull();
                            }
                            var name = s

                            println("Nhập tuổi sinh viên");
                            s = readlnOrNull();
                            while (s == null || s.toInt() < 18) {
                                println(" Nhập sai vui lòng nhập lại(Tuổi sv phải trên 18)")
                                s = readlnOrNull();
                            }
                            var age = s.toInt()


                            println("Nhập MSSV sinh viên");
                            s = readlnOrNull();
                            while (s == null) {
                                println("Vui lòng nhập MSSV")
                                s = readlnOrNull();
                            }
                            var MSV = s;

                            println("Nhập điểm sinh viên");
                            s = readlnOrNull();
                            while (s == null || s.toInt() !in 0..10) {
                                println(" Nhập sai vui lòng nhập lại(điểm phải lơn hơn 0 và nhỏ hơn 10)")
                                s = readlnOrNull();
                            }
                            var pointTB = s.toFloat()

                            println("Sinh viên đã tốt nghiệp hay chưa(c/r) ?");
                            s = readlnOrNull();
                            while (s == null) {
                                println(" Nhập sai vui lòng nhập lại(Tuổi sv phải trên 18)")
                                s = readlnOrNull();
                            }
                            val tn: Boolean = s.equals("r", ignoreCase = true)

                            list[check] = SinhVien(name, MSV, pointTB, tn, age)

                        }
                    } else {
                        var index = -1;
                        for (i in 0 until list.size) {
                            if (s == list[i].getMSSV()) {
                                index = i
                            }
                        }
                        if (index == -1) {
                            println("Không tìm thấy sv")
                        } else {
                            println("Nhập tên sinh viên");
                            s = readlnOrNull();
                            while (s == null) {
                                println("Tên sinh viên không được để trống!")
                                s = readlnOrNull();
                            }
                            var name = s

                            println("Nhập tuổi sinh viên");
                            s = readlnOrNull();
                            while (s == null || s.toInt() < 18) {
                                println(" Nhập sai vui lòng nhập lại(Tuổi sv phải trên 18)")
                                s = readlnOrNull();
                            }
                            var age = s.toInt()


                            println("Nhập MSSV sinh viên");
                            s = readlnOrNull();
                            while (s == null) {
                                println("Vui lòng nhập MSSV")
                                s = readlnOrNull();
                            }
                            var MSV = s;

                            println("Nhập điểm sinh viên");
                            s = readlnOrNull();
                            while (s == null || s.toInt() !in 0..10) {
                                println(" Nhập sai vui lòng nhập lại(điểm phải lơn hơn 0 và nhỏ hơn 10)")
                                s = readlnOrNull();
                            }
                            var pointTB = s.toFloat()

                            println("Sinh viên đã tốt nghiệp hay chưa(c/r) ?");
                            s = readlnOrNull();
                            while (s == null) {
                                println(" Nhập sai vui lòng nhập lại(Tuổi sv phải trên 18)")
                                s = readlnOrNull();
                            }
                            val tn: Boolean = s.equals("r", ignoreCase = true)

                            list[index] = SinhVien(name, MSV, pointTB, tn, age)
                            println("Sửa sv thành công")

                        }
                    }
                }
            }

            4 -> {
                println("Vui lòng nhập số thứ tự sinh viên (hoặc MSSV) cần Xoa:")
                s = readlnOrNull();
                if (s != null) {
                    val check: Int? = s.toIntOrNull();
                    if (check != null) {
                        if (check < list.size) {
                            list.removeAt(check)

                        }
                    } else {
                        var index = -1;
                        for (i in 0 until list.size) {
                            if (s.equals(list[i].getMSSV(), ignoreCase = true)) {
                                index = i
                            }
                        }
                        if (index == -1) {
                            println("Không tìm thấy sv")
                        } else {
                            list.removeAt(index)
                            println("Xóa sv thành công")

                        }
                    }
                }
            }

            0 -> {
                println("Bye Bye")
                break
            }

        }


    } while (true);


    //sua


    //0<= i <list.size


}