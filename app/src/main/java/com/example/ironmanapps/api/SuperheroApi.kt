package com.example.ironmanapps.api

//Nama        : Heri ;
//NIM         : 10121914 ;
//Kelas       : IF9K ;
//Mata Kuliah : Pemrograman Android ;
//Dosen       : Rizki Adam Kurniawan S.Kom., M.Kom. ;
//Selesai     : 21 Juli 2024. 15:00 ;

import com.example.ironmanapps.model.Superhero
import retrofit2.Call
import retrofit2.http.GET

interface SuperheroApi {
    @GET("api.php/961f7d6c3bfd4b6fdaeee268235e93cb/346")
    fun getSuperhero(): Call<Superhero>
}