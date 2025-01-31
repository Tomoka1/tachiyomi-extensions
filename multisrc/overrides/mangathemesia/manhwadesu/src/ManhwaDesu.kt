package eu.kanade.tachiyomi.extension.id.manhwadesu

import eu.kanade.tachiyomi.multisrc.mangathemesia.MangaThemesia
import eu.kanade.tachiyomi.network.interceptor.rateLimit
import okhttp3.OkHttpClient

class ManhwaDesu : MangaThemesia("ManhwaDesu", "https://manhwadesu.org", "id", "/komik") {

    override val client: OkHttpClient = super.client.newBuilder()
        .rateLimit(4)
        .build()
}
