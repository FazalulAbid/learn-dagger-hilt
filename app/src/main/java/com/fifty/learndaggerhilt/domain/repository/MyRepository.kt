package com.fifty.learndaggerhilt.domain.repository

interface MyRepository {
    suspend fun doNetworkCall()
}