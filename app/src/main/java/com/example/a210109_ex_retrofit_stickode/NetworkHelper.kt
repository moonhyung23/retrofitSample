package com.example.a210109_ex_retrofit_stickode

import android.content.Context
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

/* 레트로핏 객체를 싱글턴으로 생성해서 객체의 낭비를 줄임
*  Thread Safe를 하기 위한 코드 보완 필요
*
* */
class NetworkHelper {
    private var retrofit: Retrofit? = null
    private var apis: APIS? = null

    init {
        val gson: Gson = GsonBuilder().setLenient().create();
        retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
        //apis 처음 한번만  객체 초기화
        apis = retrofit?.create(APIS::class.java)
    }

    //처음 NetworkHelper가
    fun getApiService(): APIS? { // API Interface 객체 얻는 용
        return apis
    }

    companion object {
        private const val BASE_URL = "http://3.37.253.243"

        //싱글톤 객체로 선언 (처음 한번만 초기화)
        private var networkHelper = NetworkHelper()

        fun getInstance(): APIS? { //싱글톤으로 선언된 레트로핏 객체 얻는 용
            //Api 인터페이스를 반환
            return networkHelper.getApiService()
        }
    }
}