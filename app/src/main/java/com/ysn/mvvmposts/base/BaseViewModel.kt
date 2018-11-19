package com.ysn.mvvmposts.base

import android.arch.lifecycle.ViewModel
import com.ysn.mvvmposts.injection.component.DaggerViewModelInjector
import com.ysn.mvvmposts.injection.component.ViewModelInjector
import com.ysn.mvvmposts.injection.module.NetworkModule
import com.ysn.mvvmposts.ui.post.PostListViewModel

abstract class BaseViewModel : ViewModel() {

    private val injector: ViewModelInjector = DaggerViewModelInjector.builder()
        .networkModule(NetworkModule)
        .build()

    init {
        inject()
    }

    private fun inject() {
        when (this) {
            is PostListViewModel -> injector.inject(this)
        }
    }

}