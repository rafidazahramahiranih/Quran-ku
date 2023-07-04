package com.RNDRZ.quranku.model.response

import com.google.gson.annotations.SerializedName
import com.RNDRZ.quranku.model.nearby.ModelResults



class ModelResultNearby {
    @SerializedName("results")
    lateinit var modelResults: List<ModelResults>
}