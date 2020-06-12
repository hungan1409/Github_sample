package com.example.github.data.model

import com.example.github.data.base.EntityMapper
import com.example.github.data.base.ModelEntity
import com.example.github.domain.model.Repo
import com.google.gson.annotations.SerializedName
import javax.inject.Inject

data class RepoEntity(
    @SerializedName("description")
    val description: String? = null,

    @SerializedName("forks_count")
    val forksCount: Int? = null,

    @SerializedName("full_name")
    val fullName: String? = null,

    @SerializedName("id")
    val id: Int,

    @SerializedName("language")
    val language: Any? = null,

    @SerializedName("stargazers_count")
    val stargazersCount: Int? = null,

    @SerializedName("updated_at")
    val updatedAt: String? = null,

    @SerializedName("watchers_count")
    val watchersCount: Int? = null
) : ModelEntity()

class RepoEntityMapper @Inject constructor() : EntityMapper<Repo, RepoEntity> {
    override fun mapToDomain(entity: RepoEntity) = Repo(
        description = entity.description,
        forksCount = entity.forksCount,
        fullName = entity.fullName,
        id = entity.id,
        language = entity.language,
        stargazersCount = entity.stargazersCount,
        updatedAt = entity.updatedAt,
        watchersCount = entity.watchersCount
    )

    override fun mapToEntity(model: Repo) = RepoEntity(
        description = model.description,
        forksCount = model.forksCount,
        fullName = model.fullName,
        id = model.id,
        language = model.language,
        stargazersCount = model.stargazersCount,
        updatedAt = model.updatedAt,
        watchersCount = model.watchersCount
    )
}