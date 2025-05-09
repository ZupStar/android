package gsc.ZupStar.NetWork.Response

import com.google.gson.annotations.SerializedName

data class DefaultResponse<T>(
    val success: Boolean,
    val message: String,
    val code: Int,
    val data: T
)
