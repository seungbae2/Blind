package com.example.blindapp.domain.repository

import com.example.blindapp.domain.model.Content

interface ContentRepository {

    suspend fun save(item: Content): Boolean
}