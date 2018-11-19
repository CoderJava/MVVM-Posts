package com.ysn.mvvmposts.injection.component

import com.ysn.mvvmposts.injection.module.NetworkModule
import com.ysn.mvvmposts.ui.post.PostListViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [(NetworkModule::class)])
interface ViewModelInjector {

    fun inject(postListViewModel: PostListViewModel)

    @Component.Builder
    interface Builder {
        fun networkModule(networkModule: NetworkModule): Builder

        fun build(): ViewModelInjector
    }

}