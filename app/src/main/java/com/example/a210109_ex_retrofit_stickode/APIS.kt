package com.example.a210109_ex_retrofit_stickode

import android.content.Context
import com.example.a210109_ex_retrofit_stickode.MyApp.Example_url
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*

interface APIS {

    @FormUrlEncoded
    @POST(Example_url)
    @Headers(
        "accept: application/json",
        "content-type: application/x-www-form-urlencoded; charset=utf-8"
    )

    //post로 서버에 데이터를 보내는 메서드
    fun post_users(
        // 서버에 Post방식으로 보낼 떄 사용하는  파라미터의 키 값
        //ex)@Field('키') =>  $_POST['키']
        @Field("nick") nick: String,
        @Field("pwd") pwd: String,
        @Field("id") id: String,
    ): Call<PostModel> //반환값

/*    companion object { // static 처럼 공유객체로 사용가능함. 모든 인스턴스가 공유하는 객체로서 동작함.
        private var instance: APIS? = null

        //서버 IP만 입력해주세요~
        private const val BASE_URL = "http://3.37.253.243"
        fun create(): APIS {
            val gson: Gson = GsonBuilder().setLenient().create();
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
                .create(APIS::class.java)
        }
    }*/
}


