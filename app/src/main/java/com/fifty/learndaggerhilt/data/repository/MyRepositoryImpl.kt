package com.fifty.learndaggerhilt.data.repository

import android.app.Application
import com.fifty.learndaggerhilt.R
import com.fifty.learndaggerhilt.data.remote.MyApi
import com.fifty.learndaggerhilt.domain.repository.MyRepository
import javax.inject.Inject

class MyRepositoryImpl @Inject constructor(
    private val api: MyApi,
    private val appContext: Application
) : MyRepository {

    init {
        val appName = appContext.getString(R.string.app_name)
        println("Hello form the repository. The app name is $appName")
    }

    override suspend fun doNetworkCall() {

    }
}