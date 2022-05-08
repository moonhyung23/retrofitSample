package com.example.a210109_ex_retrofit_stickode

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

// * SerializedName: 서버(PHP)에서 안드로이드에 응답할 때 보내는 배열(객체)의 키
//ex) array("id" => "$id" , "pwd" => "$pwd", "nick" => "$nick")
// * 위의 PHP 코드에서 "id"  부분이 serializedName('파라미터값')의 파라미터 값 입니다.

data class PostModel(
    @Expose
    @SerializedName("id")
    var id: String? = null,
    @Expose
    @SerializedName("pwd")
    var pwd: String? = null,
    @Expose
    @SerializedName("nick")
    var nick: String? = null,
)
