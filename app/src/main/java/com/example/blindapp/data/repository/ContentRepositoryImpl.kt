package com.example.blindapp.data.repository

import com.example.blindapp.data.model.ContentMapper.toEntity
import com.example.blindapp.data.model.ContentMapper.toRequest
import com.example.blindapp.data.source.local.dao.ContentDao
import com.example.blindapp.data.source.remote.api.ContentService
import com.example.blindapp.domain.model.Content
import com.example.blindapp.domain.repository.ContentRepository
import java.io.IOException
import javax.inject.Inject

class ContentRepositoryImpl @Inject constructor(
    private val contentService: ContentService,
    private val contentDao: ContentDao,
) : ContentRepository {

    override suspend fun save(item: Content): Boolean {
        return try {
            contentService.saveItem(item.toRequest())
            contentDao.insert(item.toEntity())
            true
        } catch (e: IOException) {
            false
        }
    }

    override suspend fun update(item: Content): Boolean {
        return try {
            contentService.updateItem(item.toRequest())
            contentDao.insert(item.toEntity())
            true
        } catch (e: IOException) {
            false
        }
    }
}