package data

import com.google.gson.annotations.SerializedName

data class Language(
    @SerializedName("lang_id")
    val langId: Int,
    @SerializedName("lang_iso")
    val langIso: String,
    @SerializedName("lang_name")
    val langName: String,
)
