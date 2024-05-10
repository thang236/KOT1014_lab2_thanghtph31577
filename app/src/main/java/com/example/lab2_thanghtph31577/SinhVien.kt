package com.example.lab2_thanghtph31577

class SinhVien {
    private var tenSv: String? = null;
    private var MSSV: String? = null;
    private var diemTB: Float?= null;
    private var daTotNghiep : Boolean? = null;
    private var tuoi : Int? =null;

    constructor(tenSv: String?, MSSV: String?, diemTB: Float?, daTotNghiep: Boolean?, tuoi: Int?) {
        this.tenSv = tenSv
        this.MSSV = MSSV
        this.diemTB = diemTB
        this.daTotNghiep = daTotNghiep
        this.tuoi = tuoi
    }

    public fun getTenSV() : String? {
        return tenSv;
    }
    public fun getMSSV() : String? {
        return MSSV;
    }




    override fun toString(): String {
        return "SinhVien(tenSv=$tenSv, MSSV=$MSSV, diemTB=$diemTB, daTotNghiep=$daTotNghiep, tuoi=$tuoi)"
    }



}