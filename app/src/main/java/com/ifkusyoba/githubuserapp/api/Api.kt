package com.ifkusyoba.githubuserapp.api

import com.ifkusyoba.githubuserapp.model.DetailUserResponse
import com.ifkusyoba.githubuserapp.model.User
import com.ifkusyoba.githubuserapp.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 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")
    fun getSearchUser(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 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")
    fun getUserDetail(
        @Path("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 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")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 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")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}