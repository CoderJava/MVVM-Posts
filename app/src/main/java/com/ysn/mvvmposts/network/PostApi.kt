package com.ysn.mvvmposts.network

import com.ysn.mvvmposts.model.Post
import io.reactivex.Observable
import retrofit2.http.GET

interface PostApi {

    @GET("/posts")
    fun getPosts(): Observable<List<Post>>

}