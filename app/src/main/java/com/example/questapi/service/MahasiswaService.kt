package com.example.questapi.service

import com.example.questapi.model.Mahasiswa
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Query

interface MahasiswaService{
    @Headers(
        "Accept: application/json",
        "Context-Type : application/json",
    )
    @POST("insertmahasiswa.php")
    suspend fun insertMahasiswa(@Body mahasiswa: Mahasiswa)

    @GET("bacamahasiswa.php")
    suspend fun getAllMahasiswa(): List<Mahasiswa>

    @GET("bacamahasiswa.php/{nim}")
    suspend fun getMahasiswabyNim(@Query("nim") nim: String):Mahasiswa

    @PUT("editmahasiswa.php/{nim}")
    suspend fun updateMahasiswa(@Query("nim") nim: String, @Body mahasiswa: Mahasiswa)

    @DELETE("deletemahasiswa.php/{nim}")
    suspend fun deleteMahasiswa(@Query("nim")nim: String): Response<Void>
}