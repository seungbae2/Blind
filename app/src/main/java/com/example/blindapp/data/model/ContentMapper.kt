package com.example.blindapp.data.model

import com.example.blindapp.data.model.dto.ContentDto
import com.example.blindapp.data.model.entity.ContentEntity
import com.example.blindapp.domain.model.Content
import java.util.*

object ContentMapper {

    fun Content.toRequest() = ContentDto(
        id = id,
        title = title,
        content = content,
        category = category,
        likeCount = likeCount,
        commentCount = commentCount,
        viewCount = viewCount
    )

    fun Content.toEntity() = ContentEntity(
        id = id ?: 1,
        title = title,
        content = content,
        category = category,
        likeCount = likeCount,
        commentCount = commentCount,
        viewCount = viewCount,
        createdDate = createdDate
    )
}