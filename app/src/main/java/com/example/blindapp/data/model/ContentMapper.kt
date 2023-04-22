package com.example.blindapp.data.model

import com.example.blindapp.data.model.dto.ContentDto
import com.example.blindapp.domain.model.Content

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
}