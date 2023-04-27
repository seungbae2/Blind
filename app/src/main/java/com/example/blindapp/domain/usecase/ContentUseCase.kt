package com.example.blindapp.domain.usecase

import com.example.blindapp.domain.model.Content
import com.example.blindapp.domain.repository.ContentRepository
import javax.inject.Inject

class ContentUseCase @Inject constructor(
    private val contentRepository: ContentRepository
) {

    fun loadList() = contentRepository.loadList()

    suspend fun save(item: Content) = contentRepository.save(item)

    suspend fun delete(item: Content) = contentRepository.delete(item)
}