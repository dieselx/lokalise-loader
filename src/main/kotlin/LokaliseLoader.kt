interface LokaliseLoader {

    fun load()

    data class Config(
        var apiToken: String? = null,
        var projectId: String? = null,
        var outputDirPath: String? = null,
        var platforms: List<String> = listOf("android"),
    )

    companion object {
        fun create(block: Config.() -> Unit): LokaliseLoader {
            val config = Config().apply(block)
            return LokaliseLoaderImpl(
                config.apiToken ?: throw IllegalStateException("API token must be specified"),
                config.projectId ?: throw IllegalStateException("Project ID must be specified"),
                config.outputDirPath ?: throw IllegalStateException("Output directory must be specified"),
                config.platforms,
            )
        }
    }
}